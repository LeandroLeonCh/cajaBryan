/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Jordan
 */
public class Ahorro {

    private int codigo;
    private String estado;
    private Date fechaRegistro;
    private double monto;
    private Socio socio;
    private TasaInteres tasaInteres;
    private List<DetalleAhorro> detalleAhorro;

    public Ahorro() {
    }

    public Ahorro(int codigo, String estado, Date fechaRegistro, double monto, Socio socio, TasaInteres tasaInteres, List<DetalleAhorro> detalleAhorro) {
        this.codigo = codigo;
        this.estado = estado;
        this.fechaRegistro = fechaRegistro;
        this.monto = monto;
        this.socio = socio;
        this.tasaInteres = tasaInteres;
        this.detalleAhorro = detalleAhorro;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
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

    public List<DetalleAhorro> getDetalleAhorro() {
        return detalleAhorro;
    }

    public void setDetalleAhorro(List<DetalleAhorro> detalleAhorro) {
        this.detalleAhorro = detalleAhorro;
    }

    @Override
    public String toString() {
        return "Ahorro{" + "codigo=" + codigo + ", estado=" + estado + ", fechaRegistro=" + fechaRegistro + ", monto=" + monto + ", socio=" + socio + ", tasaInteres=" + tasaInteres + ", detalleAhorro=" + detalleAhorro + '}';
    }

}
