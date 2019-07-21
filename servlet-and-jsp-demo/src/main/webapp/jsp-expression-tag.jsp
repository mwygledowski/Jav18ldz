<%@ page import="static org.apache.commons.lang3.StringUtils.*" %>
<%@ page import="static java.time.LocalDateTime.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSP expression tag</title>
</head>
<body>

<%--
Zawartosć JSP expression tags zostaje obliczona i wstawiona do danych wyjściowych servletu
Kontener pobiera zawartość pomiędzy <%= expression %> i umieszcza jako argument metody print() klasy JspWriter (PrintWriter): out.print()
wyrażenie nie może kończyć się średnikiem
UWAGA: Używanie scriptletów oraz wyrażeń JSP jest złą praktyką.
--%>
<h1>Hello
    <%=defaultString(request.getParameter("firstName"), "")%>
    <%=defaultString(request.getParameter("lastName"), "")%>
</h1>

<p>Current Time: <%=now()%></p>

</body>
</html>
