<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>

<html>
<head>
    <link href="webjars/bootstrap/3.4.0/css/bootstrap.min-jsf.css" rel="stylesheet">
    <title>Title</title>
</head>
<body>

<%@ include file="/WEB-INF/view/components/header.jsp" %>

<div class="col-md-12 content" align="center">
    <div class="row">
        <div class="col-md-4" id="image">
            <img src="${product.imagePath}" alt="${product.brand} ${product.model} picture" width="134"
                 height="192">
        </div>
        <div class="col-md-5" id="info">
            <h3><a style="color:#989a9c " href="/produkt?id=${product.id}">${product.brand} ${product.model}</a></h3>
            <h6>System operacyjny:${product.operatingSystem}</h6>
            <h6>Przednia kamera:${product.primaryCameraMp}</h6>
            <h6>Tylna kamera:${product.secondaryCameraMp}</h6>
        </div>
        <div class="col-md-3" id="price">
            <fmt:setLocale value="pl_PL"/>
            <h5><fmt:formatNumber value="${product.price}" type="currency" minFractionDigits="2"/></h5>

            <form action="/dodaj-do-koszyka" method="POST">
                <button type="submit" class="btn btn-default" name="productId" value="${product.id}">Do koszyka</button>
            </form>
            <form action="/kup" method="POST">
                <button type="submit" class="btn btn-default" name="productId" value="${product.id}">Kup teraz</button>
            </form>
        </div>
    </div>
</div>

<script src="webjars/jquery/3.4.1/jquery.min.js"/>
<script src="webjars/bootstrap/3.4.0/js/bootstrap.min.js"/>
</body>
</html>
