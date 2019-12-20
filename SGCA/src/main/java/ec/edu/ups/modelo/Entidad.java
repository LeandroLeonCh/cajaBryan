/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.util.List;

/**
 *
 * @author Starman
 */
public class Entidad {

    private int codigo;
    private String nombreComercial;
    private String razonSocial;
    private String ruc;
    private List<Agencia> agenciaList;

    public Entidad() {
    }

    public Entidad(int codigo, String nombreComercial, String razonSocial, String ruc, List<Agencia> agenciaList) {
        this.codigo = codigo;
        this.nombreComercial = nombreComercial;
        this.razonSocial = razonSocial;
        this.ruc = ruc;
        this.agenciaList = agenciaList;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombreComercial() {
        return nombreComercial;
    }

    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public List<Agencia> getAgenciaList() {
        return agenciaList;
    }

    public void setAgenciaList(List<Agencia> agenciaList) {
        this.agenciaList = agenciaList;
    }

    @Override
    public String toString() {
        return "Entidad{" + "codigo=" + codigo + ", nombreComercial=" + nombreComercial + ", razonSocial=" + razonSocial + ", ruc=" + ruc + ", agenciaList=" + agenciaList + '}';
    }
    
    
}
