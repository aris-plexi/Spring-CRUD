<%-- 
    Document   : readtrainers
    Created on : Jun 26, 2020, 2:34:24 PM
    Author     : arisp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Trainers View</title>
</head>
<body>
<h1>Trainers Table</h1>
<table border="1">
    <tr>
        <th>Name</th>
        <th>Surname</th>
        <th>Age</th>
        <th>Actions</th>
    </tr>
    <c:forEach items="${trainers}" var="t">
        <tr>
            <td>${t.name}</td>
            <td>${t.surname}</td>
            <td>${t.age}</td>
            <td>
                <a href="readtrainers/update=${t.id}">Update </a>/
                <a href="readtrainers/delete=${t.id}">Delete</a>
            </td>
        </tr>

    </c:forEach>




</table>
<hr>
<br>

<a href="/createtrainer"> Home </a>
</body>
</html>
