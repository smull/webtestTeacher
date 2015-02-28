<%--
  Created by IntelliJ IDEA.
  User: SMULL
  Date: 26.02.2015
  Time: 23:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Create Student</title>
</head>
<body>
<div>
    Create Student:
    <form action="student" method="post">
    <div>Name: </div>
    <div><input type="text" id="name" name="name"/></div>
    <div>Group: </div>
    <div><input type="text" id="group" name="group"/></div>
    Create Teacher:
    <div>First Name: </div>
    <div><input type="text" id="firstName" name="firstName"/></div>
    <div>Last Name: </div>
    <div><input type="text" id="lastName" name="lastName"/></div>

    <div><input type="submit"></div>
    </form>
</div>
</body>
</html>
