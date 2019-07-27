<html>
<body>


<form action="${pageContext.request.contextPath}/search-by-id" method="POST">
    Enter student id:
    <input type="text" name="studentId"/>
    <input type="submit" value="Search">
</form>

<form action="${pageContext.request.contextPath}/search-by-name" method="POST">
    Enter student name:
    <input type="text" name="studentName"/>
    <input type="submit" value="Search">
</form>

<form action="${pageContext.request.contextPath}/add-student" method="POST">
    Enter student data:<br>
    Id: <input type="text" name="studentId"/><br>
    Name: <input type="text" name="firstName"/><br>
    Surname: <input type="text" name="lastName"/><br>
    <input type="submit" value="Enter">
</form>

</body>
</html>
