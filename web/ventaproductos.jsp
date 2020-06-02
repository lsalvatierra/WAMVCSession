<%-- 
    Document   : ventaproductos
    Created on : 01-jun-2020, 13:10:19
    Author     : luis_
--%>

<%@page import="java.util.List"%>
<%@page import="idat.edu.pe.model.Producto"%>
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
                <h5 class="card-title">Venta de productos</h5>
                <form method="post" action="CalcularVentaController">
                    <div class="form-group">
                        <label for="cboproducto">Seleccione un productos:</label>
                        <select class="form-control" id="cboproducto" name="cboproducto">
                            <%
                                List<Producto> lstproductos = (List<Producto>) request.getAttribute("lstproductos");
                                for (Producto objprod : lstproductos) {
                            %>
                            <option value="<%=objprod.getCodProducto()%>" ><%=objprod.getNomProducto()%></option>                                
                            <%    }
                            %>
                        </select>  
                    </div>                        
                    <div class="form-group">
                        <label for="txtcantidad">Ingrese cantidad</label>
                        <input type="text" class="form-control" name="txtcantidad" id="txtcantidad">
                    </div> 
                    <button type="submit" class="btn btn-danger">Calcular</button>
                    <a  class="btn btn-success" href="listadoproductos.jsp">Ver Compra</a>
                </form>
                <%
                    if (request.getAttribute("respuesta") != null) {
                %>
                <div class="alert alert-info" role="alert">
                    <%=request.getAttribute("respuesta").toString()%>
                </div>
                <%}%>
            </div>
        </div>        
    </body>
</html>
