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
public class Credito {
    
    private int codigo;
    private String detalle;
    private Date fechaInicio;
    private Date fechaFin;
    private Double monto;
    private int tiempo;
    private Double tipoEntrega;
    private Socio socio;
    private TasaInteres tasaInteres;

    public Credito() {
    }

    public Credito(int codigo, String detalle, Date fechaInicio, Date fechaFin, Double monto, int tiempo, Double tipoEntrega, Socio socio, TasaInteres tasaInteres) {
        this.codigo = codigo;
        this.detalle = detalle;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.monto = monto;
        this.tiempo = tiempo;
        this.tipoEntrega = tipoEntrega;
        this.socio = socio;
        this.tasaInteres = tasaInteres;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public Double getTipoEntrega() {
        return tipoEntrega;
    }

    public void setTipoEntrega(Double tipoEntrega) {
        this.tipoEntrega = tipoEntrega;
    }

    public Socio getSocio() {
        return socio;
    }

    public void setSocio(Socio socio) {
        this.socio = socio;
    }

    public TasaInteres getTasaInteres() {
        return tasaInteres;
    }

    public void setTasaInteres(TasaInteres tasaInteres) {
        this.tasaInteres = tasaInteres;
    }

    @Override
    public String toString() {
        return "Credito{" + "codigo=" + codigo + ", detalle=" + detalle + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", monto=" + monto + ", tiempo=" + tiempo + ", tipoEntrega=" + tipoEntrega + ", socio=" + socio + ", tasaInteres=" + tasaInteres + '}';
    }
   

    
    
    
    
}
