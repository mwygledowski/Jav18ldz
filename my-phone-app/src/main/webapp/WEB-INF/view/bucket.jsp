<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <link href="webjars/bootstrap/3.4.0/css/bootstrap.min-jsf.css" rel="stylesheet">
    <title>Koszyk</title>
</head>
<body>
<%@ include file="components/header.jsp" %>
<div class="col-md-12 content" align="center">
    <c:forEach items="${products}" var="product">
        <div class="row">
            <div class="col-md-4" id="image">
                <img src="${product.imagePath}" alt="${product.brand} ${product.model} picture" width="134"
                     height="192">
            </div>
            <div class="col-md-5" id="info">
                <h3><a style="color:#989a9c " href="/produkt?id=${product.id}">${product.brand} ${product.model}</a></h3>
            </div>
            <div class="col-md-3" id="price">
                <h5><fmt:formatNumber value="${product.price}" type="currency"  minFractionDigits="2"/></h5>

                <form action="/usun-z-koszyka" method="POST">
                    <button type="submit" class="btn btn-default" name="productId" value="${product.id}">Usuń</button>
                </form>
            </div>
        </div>
    </c:forEach>
    <div class="row">
        <div class="col-md-3">
            <h4>Razem do zapłaty: <fmt:formatNumber value="${toPay}" type="currency"  minFractionDigits="2"/></h4>
        </div>
    </div>
    <div class="row">
        <div class="col-md-4">
            <c:choose>
                <c:when test="${isLogin}">
                    <form action="/kup-i-zaplac" method="POST">
                        <button type="submit" class="btn btn-default" value="${product.id}">Kup i Zapłać</button>
                    </form>
                </c:when>
                <c:otherwise>
                    <form action="/login" method="POST">
                        Aby przejść dalej musisz być zalogowany <button type="submit" class="btn btn-primary" name="productId">Zaloguj się!</button>
                    </form>
                </c:otherwise>
            </c:choose>
        </div>
    </div>

</div>


<script src="webjars/jquery/3.4.1/jquery.min.js"/>
<script src="webjars/bootstrap/3.4.0/js/bootstrap.min.js"/>
</body>
</html>
