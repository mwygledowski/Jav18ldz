<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>jstl core demo</title>
</head>
<body>

<%--You can find all functions on web page https://docs.oracle.com/javaee/5/jstl/1.1/docs/tlddocs/--%>

<%--Like <%= ... >, but for expressions.--%>
<h3>Name without default <c:out value="${name1}"/></h3><br>
<h3>Name with default: <c:out value="${name2}" default="Tomek"/><h3/><br>


    <%--Sets the result of an expression evaluation in a 'scope'--%>
    <c:set var="yourSalary" scope="application" value="${20000}"/>
    <h3> Your salary after set: ${yourSalary}</h3><br>

    <%--Removes a scoped variable (from a particular scope, if specified).--%>
    <c:remove var="salary" scope="application"/>
    <h3>Salary after remove: ${yourSalary}</h3><br>

    <c:set var="averageSalary" scope="application" value="${5100}"/>
    <c:set var="salary" scope="application" value="${20000}"/>

    <%--    &lt;%&ndash;    Simple conditional tag, which evalutes its body if the supplied condition is true &ndash;%&gt;--%>
    <c:if test="${yourSalary != averageSalary}">
    <h3>Yor salary is different than average</h3>
    </c:if>

    <%--    &lt;%&ndash;    Simple conditional tag that establishes a context for mutually exclusive conditional operations, marked by <when> and <otherwise>&ndash;%&gt;--%>
    <c:choose>
    <c:when test="${salary < averageSalary}">
    <h3>Your salary is lower than average salary</h3>
    </c:when>
    <c:when test="${salary == averageSalary}">
    <h3>Your salary is equals to average salary</h3>
    </c:when>
    <c:otherwise>
    <h3>Your salary is higher than average salary</h3>
    </c:otherwise>
    </c:choose>

    <%--    &lt;%&ndash;    The basic iteration tag, accepting many different collection types &ndash;%&gt;--%>
    <c:forEach var="i" begin="0" end="5">
    <h5>Counter ${i} </h5>
    </c:forEach>

    <c:forEach items="${countries}" var="country">
    <h5> ${country} </h5>
    </c:forEach>

    <%--        Redirects to a new URL.--%>
    <c:redirect url="http://www.google.com"/>

</body>
</html>
