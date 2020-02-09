<%@ page import="org.springframework.web.bind.annotation.ModelAttribute" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<set var="contextPath" value="${pageContext.request.contextPath}"/>
<html>
<head>
    <title>NewPerson</title>
</head>
<body>
<h1>New person</h1>
<form action="/JEE_war_exploded/mvc/create" method="post">
    Imię: <input type="text" name="name"><br>
    Nazwisko: <input type="text" name="surname"><br>
    iD: <input type="text" name="iD"><br>
    <input type="submit">
</form>
</body>
</html>