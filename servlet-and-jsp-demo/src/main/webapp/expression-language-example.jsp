<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<html>
<head>
    <title>Expression language example</title>
</head>
<body>


<h1>Expression language example</h1>
<h1>Hello ${param.get("firstName")}</h1>
<h1>2 + 2 = ${2 + 2}</h1>
<h1>${8 > 6 ? "Bigger" : "Smaller"}</h1>
</body>
</html>

