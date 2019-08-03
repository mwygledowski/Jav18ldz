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
        <tr>
            <td><h6>${todo.id}</h6></td>
            <td><h6>${todo.title}</h6></td>
            <td><h6>${todo.category}</h6></td>
            <td><h6>${todo.creationDate}</h6></td>
            <td><h6>${todo.deadlineDate}</h6></td>
            <td><h6>${todo.description}</h6></td>
            <td>
                <form action="/markAsDone" method="POST">
                    <button type="submit" class="btn btn-success" name="doneButton">Done
                    </button>
                </form>
            </td>
            <td>
                <form action="/edit" method="POST">
                    <button type="submit" class="btn btn-info" name="editButton">Edit
                    </button>
                </form>
            </td>
            <td>
                <form action="/remove" method="POST">
                    <button type="submit" class="btn btn-danger" name="removeButton">Remove
                    </button>
                </form>
            </td>

        </tr>
        </c:forEach>
    </table>
</div>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/jquery.min.js"/>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"/>
</body>
</html>
