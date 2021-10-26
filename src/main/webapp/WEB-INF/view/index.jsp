<%@ page import="com.example.lab14_16.services.impl.FacultyServiceImpl" %>
<%@ page import="org.springframework.beans.factory.annotation.Autowired" %>
<%@ page import="com.example.lab14_16.persistanse.model.Faculty" %>
<%@ page import="java.util.List" %>
<%--
  Created by IntelliJ IDEA.
  User: veselov.da
  Date: 26.10.2021
  Time: 12:15
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Start</title>
</head>
<body>
    <a href="/addPerson">Добавить человека</a><br/>
    <a href="/addEntrant">Добавить абитуриента</a><br/>
    <a href="/addFaculty">Добавить факультет</a><br/>
    <a href="/showListOnFaculty">Список поступивших на факультет</a><br/>
    <table border="1">
        <caption>Доступные факультеты</caption>
        <tr>
            <th>Название</th>
            <th>UID</th>
            <th>Количество мест</th>
            <th>Минимальный балл</th>
        </tr>
        <c:forEach items="${facultyList}" var="faculty" >
        <tr>
            <td>${faculty.name}</td>
            <td>${faculty.facultyId}</td>
            <td>${faculty.countPlace}</td>
            <td>${faculty.minimumPoints}</td>
        </tr>
        </c:forEach>
    </table>
    <table border="1">
        <caption>Абитуриенты</caption>
        <tr>
            <th>ФИО</th>
            <th>Факультет</th>
            <th>Набранные баллы</th>
        </tr>
        <c:forEach items="${entrantList}" var="entrant" >
            <tr>
                <td>${entrant.fio}</td>
                <td>${entrant.faculty}</td>
                <td>${entrant.points}</td>
            </tr>
        </c:forEach>
    </table>

</body>
</html>
