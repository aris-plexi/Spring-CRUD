<%-- 
    Document   : firstJspTrainer
    Created on : Jun 25, 2020, 4:42:12 PM
    Author     : arisp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="springform" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
    <script src="https://code.jquery.com/jquery-3.5.1.js" integrity="sha256-QWo7LDvxbWT2tbbQ97B53yJnYU3WhH/C8ycbRAkjPDc=" crossorigin="anonymous"></script>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Create Trainer</title>
    <style>
        .error {
            color: #ff0000;
            font-weight: bold;
        }
    </style>
</head>
<body>
<h1>Welcome to my Web App</h1>
<springform:form action="docreatetrainer" method = "post" modelAttribute="newtrainer">
    Name: <springform:input path="name"/><springform:errors path="name" cssClass="error" />
    <%--            <springform:errors path="name"/> <br>--%>
    Surname: <springform:input path="surname"/><springform:errors path="surname" cssClass="error" /> <br>
    Age: <springform:input type="number" path="age"/><springform:errors path="age" cssClass="error" /> <br> <br>
    <input type="submit">
</springform:form>
<hr>
Click <a href="/readtrainers">here</a> to view all trainers


</body>
</html>
