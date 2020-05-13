<%-- 
    Document   : home
    Created on : 13-may-2020, 18:14:21
    Author     : luis_
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="layout.jsp" %>
        <%
            String nomusuario = session.getAttribute("usuario").toString();
        %>
        <div class="alert alert-info" role="alert">
            <h1>Bienvenido <%=nomusuario%></h1>
        </div>
    </body>
</html>
