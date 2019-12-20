/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.util.Date;

/**
 *
 * @author ISMAEL
 */
public class SolicitudCredito {

    private int codigo;
    private Double egresos;
    private String estado;
    private Date fechaRegistro;
    private String garantia;
    private Double ingresos;
    private String proposito;
    private String tipo;

    public SolicitudCredito() {
    }

    public SolicitudCredito(int codigo, Double egresos, String estado, Date fechaRegistro, String garantia, Double ingresos, String proposito, String tipo) {
        this.codigo = codigo;
        this.egresos = egresos;
        this.estado = estado;
        this.fechaRegistro = fechaRegistro;
        this.garantia = garantia;
        this.ingresos = ingresos;
        this.proposito = proposito;
        this.tipo = tipo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Double getEgresos() {
        return egresos;
    }

    public void setEgresos(Double egresos) {
        this.egresos = egresos;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getGarantia() {
        return garantia;
    }

    public void setGarantia(String garantia) {
        this.garantia = garantia;
    }

    public Double getIngresos() {
        return ingresos;
    }

    public void setIngresos(Double ingresos) {
        this.ingresos = ingresos;
    }

    public String getProposito() {
        return proposito;
    }

    public void setProposito(String proposito) {
        this.proposito = proposito;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "SolicitudCredito{" + "codigo=" + codigo + ", egresos=" + egresos + ", estado=" + estado + ", fechaRegistro=" + fechaRegistro + ", garantia=" + garantia + ", ingresos=" + ingresos + ", proposito=" + proposito + ", tipo=" + tipo + '}';
    }

}
