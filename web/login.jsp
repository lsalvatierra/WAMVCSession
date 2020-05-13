<%-- 
    Document   : login
    Created on : 13-may-2020, 17:56:07
    Author     : luis_
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="Content/bootstrap/bootstrap.css" rel="stylesheet" type="text/css"/>
        <script src="Scripts/jquery/jquery-3-5-1.js" type="text/javascript"></script>
        <script src="Scripts/bootstrap/bootstrap.js" type="text/javascript"></script>
    </head>
    <body>
      <div class="card">
          <div class="card-header badge-danger">
            LOGIN
          </div>
          <div class="card-body">
            <form method="post" action="AutenticacionController">
              <div class="form-group">
                <label for="txtusuario">Email address</label>
                <input type="text" class="form-control" name="txtusuario" id="txtusuario">                
              </div>
              <div class="form-group">
                <label for="txtpassword">Password</label>
                <input type="password" class="form-control" name="txtpassword" id="txtpassword">
              </div>
              <button type="submit" class="btn btn-danger">Ingresar</button>
            </form>
          </div>
        </div> 
            <%
                if(session.getAttribute("usuario") != null){
                    %>
                <div class="alert alert-danger" role="alert">
                  Usuario o password incorrecto
                </div>
            <%}%>
    </body>
</html>
