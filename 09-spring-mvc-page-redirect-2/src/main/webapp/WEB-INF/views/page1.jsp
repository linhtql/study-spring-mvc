<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Spring Redirect 2</title>
</head>
<body>
<form:form action="redirect" method="get">
    Name <input type="text" name="name" id="name">
    <br/>
    <input type="submit" value="Redirect">
</form:form>
</body>
</html>
