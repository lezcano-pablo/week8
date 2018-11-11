<%-- 
    Document   : showVariables
    Created on : Nov 8, 2018, 11:30:55 PM
    Author     : FamiliaLezcano
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Variable Deployment</title>
    </head>
    <body>
        <h1>Variable Deployment</h1>
        Variable in scope request:
        ${message}
        <br>
        <br>
        Variable in session request:
        
        <br>
        <br>
        
        Rectangle:
        Base:${rectangle.base}
        High:${rectangle.high}
        Area:${rectangle.area}
        
        <br>
        <br>
        
        <a href="${pageContext.request.contextPath}/index.jsp">
            Back to the Home Page
        </a>
        
    </body>
</html>
