<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Products dashboard</title>
</head>
<body>

<form action="${pageContext.request.contextPath}/invalidate-session">
    <input type="submit" value="invalidate session" style="float: right;">
</form>

<form method="POST" action="${pageContext.request.contextPath}/addProduct">
    <p>Product: <input type="text" name="productName" required/></p>
    <input type="submit" value="Add">
</form>

<ol>
<c:forEach items="${productList}" var="product">
    <li>${product.name}</li>
</c:forEach>
</ol>
</body>
</html>
