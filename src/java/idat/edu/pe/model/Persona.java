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
public class Persona {
    private String NomPersona;
    private String ApePaternoPersona;
    private String ApeMaternoPersona;
    private String TipoDocPersona;        
    private String DNIPersona;
    private String SexoPersona;
    private String EstadoCivilPersona;        
    private String AceptaTermCondicPersona;

    public Persona(String NomPersona, String ApePaternoPersona, String ApeMaternoPersona, String TipoDocPersona, String DNIPersona, String SexoPersona, String EstadoCivilPersona, String AceptaTermCondicPersona) {
        this.NomPersona = NomPersona;
        this.ApePaternoPersona = ApePaternoPersona;
        this.ApeMaternoPersona = ApeMaternoPersona;
        this.TipoDocPersona = TipoDocPersona;
        this.DNIPersona = DNIPersona;
        this.SexoPersona = SexoPersona;
        this.EstadoCivilPersona = EstadoCivilPersona;
        this.AceptaTermCondicPersona = AceptaTermCondicPersona;
    }
    
    

    public String getNomPersona() {
        return NomPersona;
    }

    public void setNomPersona(String NomPersona) {
        this.NomPersona = NomPersona;
    }

    public String getApePaternoPersona() {
        return ApePaternoPersona;
    }

    public void setApePaternoPersona(String ApePaternoPersona) {
        this.ApePaternoPersona = ApePaternoPersona;
    }

    public String getApeMaternoPersona() {
        return ApeMaternoPersona;
    }

    public void setApeMaternoPersona(String ApeMaternoPersona) {
        this.ApeMaternoPersona = ApeMaternoPersona;
    }

    public String getTipoDocPersona() {
        return TipoDocPersona;
    }

    public void setTipoDocPersona(String TipoDocPersona) {
        this.TipoDocPersona = TipoDocPersona;
    }

    public String getDNIPersona() {
        return DNIPersona;
    }

    public void setDNIPersona(String DNIPersona) {
        this.DNIPersona = DNIPersona;
    }

    public String getSexoPersona() {
        return SexoPersona;
    }

    public void setSexoPersona(String SexoPersona) {
        this.SexoPersona = SexoPersona;
    }

    public String getEstadoCivilPersona() {
        return EstadoCivilPersona;
    }

    public void setEstadoCivilPersona(String EstadoCivilPersona) {
        this.EstadoCivilPersona = EstadoCivilPersona;
    }

    public String getAceptaTermCondicPersona() {
        return AceptaTermCondicPersona;
    }

    public void setAceptaTermCondicPersona(String AceptaTermCondicPersona) {
        this.AceptaTermCondicPersona = AceptaTermCondicPersona;
    }
    
    
    
}
