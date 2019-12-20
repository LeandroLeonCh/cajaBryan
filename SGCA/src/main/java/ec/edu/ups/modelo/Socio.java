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
public class Socio extends Persona {

    private String estado;
    private Date fechaIngreso;
    private double monto;

    public Socio() {
    }

    public Socio(int pCodigo, String pCedula, String pNombre, String pApellido, Date pFechaNacimiento, String pTelefono, String pDireccion, String estado, Date fechaIngreso, double monto) {
        super(pCodigo, pCedula, pNombre, pApellido, pFechaNacimiento, pTelefono, pDireccion);
        this.estado = estado;
        this.fechaIngreso = fechaIngreso;
        this.monto = monto;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    @Override
    public String toString() {
        return "Socio{" + "estado=" + estado + ", fechaIngreso=" + fechaIngreso + ", monto=" + monto + '}';
    }

}
