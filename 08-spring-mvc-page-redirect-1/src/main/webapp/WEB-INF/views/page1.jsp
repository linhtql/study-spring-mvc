<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Page1</title>
</head>
<body>
<h2>this is page 1</h2>
<form:form method="post" action="redirect">
    <input type="submit" value="Redirect">
</form:form>
</body>
</html>
