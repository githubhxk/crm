<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype>
<html lang="en">
<head></head>
<body>
    <form action="${pageContext.request.contextPath}/encoding/encoding1" method="post">
        UserName<input type="text" name="name" id="name"/><br/>
        Password<input type="text" name="password" id="password"/><br/>
        <input type="submit" value="login">
    </form>
</body>
</html>
