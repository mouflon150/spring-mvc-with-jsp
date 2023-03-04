<%--
  Created by IntelliJ IDEA.
  User: 30056685(03)
  Date: 04.03.2023
  Time: 16:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1 class=""jv>Save Student</h1>
<form action="/saveStudent" method="post">
  <label>Name:</label> <input type="text" name="name">
  <label>Age:</label> <input type="text" name="age">
  <input type="submit" value="save-student">
</form>
</body>
</html>
