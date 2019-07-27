<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student information</title>
</head>
<body>

<c:choose>
    <c:when test="${enoughStudentsToOpenGroup}">
        <h1 style="color:green;">It's enough students to open new group</h1>
    </c:when>
    <c:otherwise>
        <h1 style="color:red;">It's not enough students to open new group</h1>
    </c:otherwise>
</c:choose>

<table border="1">
    <tr>
        <th>id</th>
        <th>name</th>
        <th>surname</th>
        <th>date of birth</th>
    </tr>
    <c:forEach items="${students}" var="student">
       <tr>
           <td>${student.id}</td>
           <td>${student.firstName}</td>
           <td>${student.lastName}</td>
           <td>${student.dateOfBirth}</td>
       </tr>
    </c:forEach>
</table>
</body>
</html>
