/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idat.edu.pe.controller;

import idat.edu.pe.model.Producto;
import idat.edu.pe.model.VentaProducto;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author luis_
 */
@WebServlet(name = "CalcularVentaController", urlPatterns = {"/CalcularVentaController"})
public class CalcularVentaController extends HttpServlet {

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Producto> lstproductos = CargarProducto();
        request.setAttribute("lstproductos", lstproductos);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/ventaproductos.jsp");
        dispatcher.forward(request, response);
    }

    private List<Producto> CargarProducto() {
        List<Producto> lstproductos = new ArrayList<>();
        lstproductos.add(new Producto("P001", "Arroz", 3.5));
        lstproductos.add(new Producto("P002", "Azucar", 3.4));
        lstproductos.add(new Producto("P003", "Mantequilla", 2.0));
        lstproductos.add(new Producto("P004", "Yogurt", 5.5));
        lstproductos.add(new Producto("P005", "Leche", 3.2));
        return lstproductos;
    }

    private Producto BuscarProducto(List<Producto> lstproducto, String codproducto) {
        Producto objproducto = null;
        for (Producto objprod : lstproducto) {
            if (objprod.getCodProducto().equals(codproducto)) {
                objproducto = objprod;
            }
        }
        return objproducto;
    }

    private List<VentaProducto> AgregarProducto(VentaProducto objVentaProd,
            List<VentaProducto> listventaproductos) {
        boolean nuevoactualizado = false;
        boolean agregarnuevo = false;
        List<VentaProducto> listaventa = new ArrayList<>();;
        if (listventaproductos == null) {
            listaventa.add(new VentaProducto(objVentaProd.getCodProducto(),
                    objVentaProd.getNomProducto(),
                    objVentaProd.getPrecioTotal(),
                    objVentaProd.getCantidadTotal()));
        } else {
            for (VentaProducto obj : listventaproductos) {
                if (obj.getCodProducto().equals(objVentaProd.getCodProducto())) {
                    listaventa.add(new VentaProducto(obj.getCodProducto(),
                            obj.getNomProducto(),
                            obj.getPrecioTotal() + objVentaProd.getPrecioTotal(),
                            obj.getCantidadTotal()+ objVentaProd.getCantidadTotal()));
                    nuevoactualizado = true;
                    agregarnuevo = false;
                } else {
                    listaventa.add(obj);
                    if (nuevoactualizado) {
                        agregarnuevo = false;
                    } else {
                        agregarnuevo = true;
                    }
                }
            }
            if (agregarnuevo) {
                listaventa.add(objVentaProd);
            }
        }
        return listaventa;
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String codproducto = request.getParameter("cboproducto");
        Double cantidad = Double.parseDouble(request.getParameter("txtcantidad"));
        List<Producto> lstproductos = CargarProducto();
        Producto objProducto = BuscarProducto(lstproductos, codproducto);
        Double preciototal = cantidad * objProducto.getPrecioProducto();
        String resultado = "El precio unitario del producto " + objProducto.getNomProducto()
                + " es: " + objProducto.getPrecioProducto() + " y el valor total de la venta es: "
                + preciototal;
        VentaProducto objVentaProd = new VentaProducto(objProducto.getCodProducto(),
                objProducto.getNomProducto(), preciototal, cantidad);
        HttpSession sesion = request.getSession();
        List<VentaProducto> listventaproductos = AgregarProducto(objVentaProd,
                (List<VentaProducto>) sesion.getAttribute("sesionventa"));
        sesion.setAttribute("sesionventa", listventaproductos);
        request.setAttribute("lstproductos", lstproductos);
        request.setAttribute("respuesta", resultado);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/ventaproductos.jsp");
        dispatcher.forward(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
