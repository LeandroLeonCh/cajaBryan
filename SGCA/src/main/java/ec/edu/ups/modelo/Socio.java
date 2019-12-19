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
public class Socio extends Persona{
    private String estado;
    private Date fechaIngreso;
    private double monto;

    public Socio() {
    }

    public Socio(String estado, double monto, int codigo, String nombre, String apellido, Date fechaNacimiento, String telefono, String correo) {
        super(codigo, nombre, apellido, fechaNacimiento, telefono, correo);
        this.estado = estado;
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
    
    
    
}
