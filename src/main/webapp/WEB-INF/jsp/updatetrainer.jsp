<%--
    Document   : updatetrainer
    Created on : Jun 27, 2020, 3:11:16 PM
    Author     : arisp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="springform" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Trainer Update</title>
</head>
<body>
<h1>Update Trainer:</h1>
<springform:form action="doupdatetrainer" method="post"
                 modelAttribute="trainertoupdate">
    <springform:input type="hidden" path="id"/>
    Name: <springform:input path="name"/>
    Surname: <springform:input path="surname"/>
    Age: <springform:input type="number" path="age"/>
    <input type="submit">
</springform:form>

</body>
</html>
