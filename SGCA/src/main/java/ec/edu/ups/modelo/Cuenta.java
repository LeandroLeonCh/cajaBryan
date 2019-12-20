/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.util.Date;

/**
 *
 * @author Starman
 */
public class Cuenta {
    
    private int codigo;
    private String numeroCuenta;
    private Date fechaRegistro;
    private String estado;
    private Socio socio;

    public Cuenta() {
    }

    public Cuenta(int codigo, String numeroCuenta, Date fechaRegistro, String estado, Socio socio) {
        this.codigo = codigo;
        this.numeroCuenta = numeroCuenta;
        this.fechaRegistro = fechaRegistro;
        this.estado = estado;
        this.socio = socio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Socio getSocio() {
        return socio;
    }

    public void setSocio(Socio socio) {
        this.socio = socio;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "codigo=" + codigo + ", numeroCuenta=" + numeroCuenta + ", fechaRegistro=" + fechaRegistro + ", estado=" + estado + ", socio=" + socio + '}';
    }
}
