<%@ page import="org.springframework.web.bind.annotation.ModelAttribute" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<set var="contextPath" value="${pageContext.request.contextPath}"/>
<html>
<head>
    <title>New person details</title>
</head>
<body>
${data}
<h1>Id: ${person.iD}</h1>
<h3>
name: ${person.name}<br>surname: ${person.surname}
</h3>

</body>
</html>