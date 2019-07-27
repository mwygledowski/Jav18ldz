<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>jstl formatting demo</title>
</head>
<body>
<h3>Date Format:</h3>

<p>Formatted Date (1):
    <fmt:formatDate type="time" value="${currentDate}"/></p>

<p>Formatted Date (2):
    <fmt:formatDate type="date" value="${currentDate}"/></p>

<p>Formatted Date (3):
    <fmt:formatDate type="both" value="${currentDate}"/></p>

<p>Formatted Date (4):<fmt:formatDate
        type="both" dateStyle="short" timeStyle="short" value="${currentDate}"/></p>

<p>Formatted Date (5):
    <fmt:formatDate type="both"
                    dateStyle="medium" timeStyle="medium" value="${currentDate}"/></p>

<p>Formatted Date (6):
    <fmt:formatDate type="both"
                    dateStyle="long" timeStyle="long" value="${currentDate}"/></p>

<p>Formatted Date (7):
    <fmt:formatDate type="date"
                    dateStyle="long"  value="${currentDate}"/></p>

<p>Formatted Date (8):
    <fmt:formatDate pattern="yyyy-MM-dd" value="${currentDate}"/></p>


</body>
</html>
