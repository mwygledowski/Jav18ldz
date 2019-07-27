<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
</head>
<body>

<form method="POST" action="${pageContext.request.contextPath}/addCookie">
    <p>Login <input type="text" name="login" required/></p>
    <input type="submit" value="Enter!">
</form>

</body>
</html>
