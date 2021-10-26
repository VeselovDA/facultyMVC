<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: veselov.da
  Date: 26.10.2021
  Time: 17:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Добавление факультета</title>
</head>
<body>
<form:form method="POST" action="/addFaculty" modelAttribute="faculty">
    Название факультета <form:input path="name"/><br/>
    Необходимый минимум баллов<form:input path="minimumPoints"/><br/>
    Количество мест <form:input path="countPlace"/><br/>
    <input type="submit"><br/>
</form:form>
<a href="/">Назад</a>
</body>
</html>
