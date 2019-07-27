<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello user</title>
</head>
<body>

<form method="GET" action="${pageContext.request.contextPath}/delete-cookie">
    <input type="submit" value="Remove cookie" style="float: right;">
</form>

<h1>Hello ${login}</h1>
</body>
</html>
