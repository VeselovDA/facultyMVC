<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: veselov.da
  Date: 26.10.2021
  Time: 16:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Добавление личности</title>
</head>
<body>
    <form:form method="POST" action="/addPerson" modelAttribute="person">
        Почта<form:input path="email"/><br/>
        ФИО<form:input path="fio"/><br/>
        <input type="submit"><br/>
    </form:form>
<a href="/">Назад</a>
</body>
</html>
