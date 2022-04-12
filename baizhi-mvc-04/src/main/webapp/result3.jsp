
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

</head>
<body>
<%--    <h1>This is request scope ${requestScope.name}</h1>--%>
<%--    <h1>this is model request scope ${requestScope.name}</h1>--%>

    <h1>${requestScope.name}</h1>
    <h1>${requestScope.u.name}</h1>
    <h1>${requestScope.u.password}</h1>
</body>
</html>
