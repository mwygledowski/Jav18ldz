<%@ page import="org.apache.commons.lang3.StringUtils" %>
<%@ page import="static org.apache.commons.lang3.StringUtils.defaultString" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSP scriptlet tag</title>
</head>
<body>
<%--
- Skryptlety mogą zawierać dowolną ilość kodu Javy
- oferują dostęp do zmiennych zdefiniowanych dla stron JSP
- mogą służyć np. do ustawiania nagłówków odpowiedzi oraz kodów stanu, komunikacji z bazą danych i innych złożonych instrukcji
- nie można w nich definiować metod
UWAGA: Używanie scriptletów oraz wyrażeń JSP jest złą praktyką.
--%>
<h2>Hello
    <%
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");

        if(StringUtils.isNotBlank(firstName) || StringUtils.isNotBlank(lastName)){
            out.print(getFullName(firstName, lastName));
        }else{
            out.print("Stranger");
        }
    %>
</h2>
</body>
</html>
<%--
JSP Declaration Tag jest używany w celu deklarowania pól oraz metod
--%>
<%!
    private String getFullName(String firstName, String lastName) {
        return StringUtils.defaultString(firstName, "") + " " + StringUtils.defaultString(lastName, "");
    }
%>
