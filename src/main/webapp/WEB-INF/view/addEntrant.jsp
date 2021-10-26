<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Dmitriy
  Date: 26.10.2021
  Time: 19:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Добавить абитуриента</title>
</head>
<body>
<form:form method="POST" action="/addEntrant" modelAttribute="entrant">
    Личность <form:select path="person" items="${personList}" /><br/>
    Факультет<form:select path="faculty" items="${facultyList}"/><br/>
    Баллы <form:input path="points"/><br/>
    <input type="submit"><br/>
</form:form>
<a href="/">Назад</a>
</body>
</html>
