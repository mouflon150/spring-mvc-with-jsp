<%--
  Created by IntelliJ IDEA.
  User: 30056685(03)
  Date: 04.03.2023
  Time: 16:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1px">
    <thead>
    <tr>
        <th>id</th>
        <th>name</th>
        <th>age</th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <td>${student.id}</td>
        <td>${student.name}</td>
        <td>${student.age}</td>
    </tr>
    </tbody>
</table>
<a href="/">roll-back</a>
</body>
</html>
