<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>

<html>
<head>
    <title>Login</title>
    <link href="webjars/bootstrap/3.4.0/css/bootstrap.min-jsf.css" rel="stylesheet">
</head>
<body>
<%@ include file="components/header.jsp" %>

<%--<c:if test="${invalidCredentials}">--%>
<%--    <h5 style="color: red">Nieprawidłowy login i/lub hasło!</h5>--%>
<%--</c:if>--%>

<form method="POST" action="/uwierzytelnianie">
    Login: <input type="text" name="login" />
    Hasło: <input type="password" name="password" />
    <button type="submit" class="btn btn-primary">Zaloguj się!</button>
</form>

<%--<form method="GET" action="/rejestracja">--%>
<%--    <button type="submit" class="btn btn-primary">Zarejestruj się!</button>--%>
<%--</form>--%>

<script src="webjars/jquery/3.4.1/jquery.min.js"/>
<script src="webjars/bootstrap/3.4.0/js/bootstrap.min.js"/>
</body>
</html>
