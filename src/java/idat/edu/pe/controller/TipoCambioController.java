/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idat.edu.pe.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
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
@WebServlet(name = "TipoCambioController", urlPatterns = {"/TipoCambioController"})
public class TipoCambioController extends HttpServlet {

    
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
        //processRequest(request, response);
        
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
        //processRequest(request, response);               
        String moneda = request.getParameter("cbomoneda");
        Double monto = Double.parseDouble(request.getParameter("txtmonto"));
        Double tipocambio;
        String cambio;
        if(moneda.equals("S")){
            tipocambio = monto * 3.45;
            cambio ="Soles";
        }else{
            tipocambio = monto / 3.45;
            cambio ="Dólares";
        }
        DecimalFormat formato = new DecimalFormat("##.00");
        String resultado = "La conversión del monto a "+cambio+" es : "+formato.format(tipocambio);
        request.setAttribute("respuesta", resultado);
        //hacemos la instancia a RequestDispatcher para invocar a la vista a utilizar
        RequestDispatcher transferir = request.getRequestDispatcher("/tipocambio.jsp");
        //ejecutamos la transferencia
        transferir.forward(request, response);        
        
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
