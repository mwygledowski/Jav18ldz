<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="pl.sda.model.Student" %>
<%@ page import="java.util.List" %>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Students list</title>
</head>
<body>

<h1>First student from result</h1>
<h3>Student id = ${students[0].id} first name = ${students[0].firstName} last name = ${students[0].lastName}</h3>

<h1>All students from result</h1>
<c:forEach items="${students}" var="student">
    <h3>Student id = ${student.id} first name = ${student.firstName}; last name = ${student.lastName}</h3>
</c:forEach>
</body>
</html>
