<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>jstl functions demo</title>
</head>
<body>

    <c:set var="exampleString" value="This is example text" />

    <%--You can find all functions on web page https://docs.oracle.com/javaee/5/jstl/1.1/docs/tlddocs/--%>

    <%--    Tests if an input string contains the specified substring.--%>
    <h3>Example text contains word 'text': ${fn:contains(exampleString, "text")}</h3>















<%--    &lt;%&ndash;    Converts all of the characters of a string to upper case.&ndash;%&gt;--%>
<%--    <h3>To upper case: ${fn:toUpperCase(exampleString)}</h3>--%>

<%--    &lt;%&ndash;    Removes white spaces from both ends of a string.&ndash;%&gt;--%>
<%--    <h3>Example of trim||||${fn:trim("   trim example   ")}||||</h3>--%>

<%--    &lt;%&ndash;    Returns the index withing a string of the first occurrence of a specified substring.&ndash;%&gt;--%>
<%--    <h3>Word 'text' starts from index: ${fn:indexOf(exampleString, "text")}</h3>--%>
</body>
</html>
