<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Dmitriy
  Date: 26.10.2021
  Time: 19:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Список поступивших</title>
</head>
<body>
<form:form method="GET" action="/showListOnFaculty" modelAttribute="faculty">
    Факультет<form:select path="facultyId" items="${facultyList}"/><br/>
    <input type="submit"><br/>
</form:form>
<table border="1">
    <caption>Рейтинг на факультете ${faculty.name}</caption>
    <tr>
        <th>ФИО</th>
        <th>Набранные баллы</th>
    </tr>
    <c:forEach items="${entrantList}" var="entrant" >
        <tr>
            <td>${entrant.fio}</td>
            <td>${entrant.points}</td>
        </tr>
        <br/>
    </c:forEach>
</table>
<a href="/">Назад</a>
</body>
</html>
