<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page pageEncoding="UTF-8" contentType="text/html;charset=UTF-8" %>
<!doctype html>
<html lang="en">
<head></head>

<body>
    <form method="post" action="${pageContext.request.contextPath}/param/param6">
        <input type="checkbox" name="ids" value="1">
        <input type="checkbox" name="ids" value="2">
        <input type="checkbox" name="ids" value="3">
        <input type="checkbox" name="ids" value="4">
        <input type="checkbox" name="ids" value="5">
        <input type="submit" value="reg">
    </form>
</body>
</html>
