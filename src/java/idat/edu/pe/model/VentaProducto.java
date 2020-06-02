/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idat.edu.pe.model;

/**
 *
 * @author luis_
 */
public class VentaProducto {
    
    private String codProducto;
    private String nomProducto;
    private Double cantidadTotal;

    public Double getCantidadTotal() {
        return cantidadTotal;
    }

    public void setCantidadTotal(Double cantidadTotal) {
        this.cantidadTotal = cantidadTotal;
    }
    private Double precioTotal;

    public VentaProducto(String codProducto, String nomProducto, Double precioTotal, Double cantidadTotal) {
        this.codProducto = codProducto;
        this.nomProducto = nomProducto;
        this.precioTotal = precioTotal;
        this.cantidadTotal = cantidadTotal;
    }
    
    public String getCodProducto() {
        return codProducto;
    }

    public void setCodProducto(String codProducto) {
        this.codProducto = codProducto;
    }

    public String getNomProducto() {
        return nomProducto;
    }

    public void setNomProducto(String nomProducto) {
        this.nomProducto = nomProducto;
    }

    public Double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(Double precioTotal) {
        this.precioTotal = precioTotal;
    }
    
    
}
