<%-- 
    Document   : idoutofbounds
    Created on : Jun 26, 2020, 4:32:01 PM
    Author     : arisp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <p>
            The trainer id you attempted to update/delete: <b>${id}</b> does not exist.
            Please head back to <a href="/readtrainers">Trainers Table</a> and try again.
        </p>
    </body>
</html>
