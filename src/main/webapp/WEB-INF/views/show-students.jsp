<%--
  Created by IntelliJ IDEA.
  User: 30056685(03)
  Date: 04.03.2023
  Time: 16:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<style>
    .jv {
        color: lightpink;
    }
</style>
<body>
<h1 class="jv">My List</h1>
<table>
    <thead>
    <tr>
        <th>id</th>
        <th>name</th>
        <th>age</th>
        <th>delete</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${all}" var="student">
        <tr>
            <td>${student.id}</td>
            <td>
                <a href="/get/by/${student.id}">${student.name}</a>
            </td>
            <td>${student.age}</td>
            <td>
                <form action="/deleteStudent/${student.id}" method="get">
                    <button type="submit">DELETE</button>
                </form>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<a href="/studentForm">add-student</a>
</body>
</html>
