<%@ page isELIgnored ="false" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Spring MVC internationalization</title>
</head>
<body>
Language :
<a href="?language=en">English</a>|
<a href="?language=vi_VN">Viet Nam</a>|
<a href="?language=fr_FR">France</a>
<a href="?language=ja_JP">Japanese</a>
<h2>hello :  <spring:message code="hello"  text="default text" /></h2>

Current Locale : ${pageContext.response.locale}
</body>
</html>
