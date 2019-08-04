<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Home</title>
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
Kto jest chętny?
<div class="table-responsive">
    <table class="table">
        <tr>
            <th>#</th>
            <th>Title</th>
            <th>Category</th>
            <th>Creation Date</th>
            <th>Deadline</th>
            <th>Description</th>
        <tr>
            <c:forEach items="${TasksList}" var="todo">
        <tr <c:if test="${todo.done == true}">style="background: greenyellow" </c:if>>
                <%--        <tr ${todo.done == true ? style="background: greenyellow": ""}>--%>
            <td><h6>${todo.id}</h6></td>
            <td><h6>${todo.title}</h6></td>
            <td><h6>${todo.category}</h6></td>
            <td><h6>${todo.creationDate}</h6></td>
            <td><h6>${todo.deadlineDate}</h6></td>
            <td><h6>${todo.description}</h6></td>
            <td>
                <form action="/markAsDone" method="GET">
                    <input type="hidden" name="id" value="${todo.id}">
                    <c:if test="${todo.done == false}">
                        <button type="submit" class="btn btn-success" name="doneButton">Done
                        </button>
                    </c:if>
                </form>
            </td>
            <td>
                <form action="/edit" method="POST">
                    <button type="submit" class="btn btn-info" name="editButton">Edit
                    </button>
                </form>
            </td>
            <td>
                <form action="/remove" method="GET">
                    <input type="hidden" name="id" value="${todo.id}">
                    <button type="submit" class="btn btn-danger" name="removeButton">Remove
                    </button>
                </form>
            </td>

        </tr>
        </c:forEach>
    </table>



    <form action="/save" method="POST">
        <div class="form-group">
            <label for="title">Title</label>
            <input type="text" id="title" name="title" required/>
        </div>
        <div class="form-group">
            <label>Categories</label>
            <select>
            <c:forEach items="${categories}" var="category">

                    <option value="${category}">${category}</option>
            </c:forEach>
            </select>
        </div>
        <div class="form-group">
            <label for="deadline">Deadline</label>
            <input type="datetime-local" id="deadline" name="deadline" required>
        </div>
        <div class="form-group">
            <label for="description">Description</label>
            <input type="text" id="description" name="description" required>
        </div>
        <button type="submit" class="btn btn-success" name="saveButton">Save
        </button>
    </form>
</div>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/jquery.min.js"/>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"/>
</body>
</html>
