<%-- 
    Document   : listadoproductos
    Created on : 01-jun-2020, 18:29:12
    Author     : luis_
--%>

<%@page import="java.util.List"%>
<%@page import="idat.edu.pe.model.VentaProducto"%>
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
                <h5 class="card-title">Resumen de compra</h5>
                <a  class="btn btn-success" href="CalcularVentaController">Continuar comprando</a>                
                <%
                    if (session.getAttribute("sesionventa") != null) {
                        List<VentaProducto> listventaprod = (List<VentaProducto>) session.getAttribute("sesionventa");
                %> 
                <table class="table">
                    <thead>
                        <tr>
                            <th scope="col">Código</th>
                            <th scope="col">Producto</th>
                            <th scope="col">Cantidad Total</th>
                            <th scope="col">Precio total</th>
                        </tr>
                    </thead>
                    <tbody>
                        <%
                            for (VentaProducto objVenta : listventaprod) {
                        %>
                        <tr>
                            <th ><%=objVenta.getCodProducto()%></th>
                            <td><%=objVenta.getNomProducto()%></td>
                            <td><%=objVenta.getCantidadTotal()%></td>
                            <td scope="row"><%=objVenta.getPrecioTotal()%></td>
                        </tr>                    
                        <%  }
                        %>

                    </tbody>
                </table>   
                <%  }

                %>
            </div>
        </div>





    </body>
</html>
