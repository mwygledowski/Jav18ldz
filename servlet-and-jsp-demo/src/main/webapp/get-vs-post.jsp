<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>GET vs. POST</title>
</head>
<%--
Tę stronę znajdziesz pod adresem get-vs-post.jsp ponieważ nie została ona zmapowana w web.xml
--%>
<body>
<h1>Get example</h1>
<%--Jeśli nie poda się metody to formularz zostanie wysłany metodą GET--%>
<form action="process-example-form" method="GET">
    First name:<input type="text" name="firstName"/><br/>
    Last name:<input type="text" name="lastName"><br/>
    <input type="submit" value="Send by GET">
</form>

<h1>Post example</h1>
<form action="process-example-form" method="POST">
    First name: <input type="text" name="firstName"/><br/>
    Last name: <input type="text" name="lastName"/><br/>
    <input type="submit" value="Send by POST">
</form>
</body>
</html>
