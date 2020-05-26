<%-- 
    Document   : cookie
    Created on : 25-may-2020, 19:03:19
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
            String contador = request.getAttribute("contadorvisitas").toString();
        %>
        <div class="alert alert-info" role="alert">
            <h1>Haz visitado esta pagina <%=contador%></h1>
        </div>
    </body>
</html>
