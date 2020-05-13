<%-- 
    Document   : tipocambio
    Created on : 13-may-2020, 18:21:42
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
        <div class="card">
            <div class="card-body">
                <h5 class="card-title">Tipo de Cambio</h5>
                <form method="post" action="TipoCambioController">
                    <div class="form-group">
                        <div class="form-group">
                            <label for="txtmonto">Ingrese el monto:</label>
                            <input type="text" class="form-control" name="txtmonto" id="txtmonto">
                        </div>                        
                        <label for="cbomoneda">Convertir a:</label>
                        <select class="form-control" id="cbomoneda" name="cbomoneda">
                            <option value="S" >Soles</option>
                            <option value="D" >Dolares</option>
                        </select>                        
                    </div>

                    <button type="submit" class="btn btn-danger">Calcular</button>
                </form>
                <%
                    if (request.getAttribute("respuesta") != null) {
                %>
                <div class="alert alert-danger" role="alert">
                    <%=request.getAttribute("respuesta").toString() %>
                </div>
                <%}%>
            </div>
        </div>        
    </body>
</html>
