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
public class Empleado extends Persona {

    private String cargo;
    private String estado;
    private Date fechaIngreso;
    private double sueldo;

    public Empleado() {
    }

    public Empleado(String cargo, String estado, Date fechaIngreso, double sueldo, int pCodigo, String pCedula, String pNombre, String pApellido, Date pFechaNacimiento, String pTelefono, String pDireccion) {
        super(pCodigo, pCedula, pNombre, pApellido, pFechaNacimiento, pTelefono, pDireccion);
        this.cargo = cargo;
        this.estado = estado;
        this.fechaIngreso = fechaIngreso;
        this.sueldo = sueldo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
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

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    

    @Override
    public String toString() {
        return "Empleado{" + "cargo=" + cargo + ", estado=" + estado + ", fechaIngreso=" + fechaIngreso + ", sueldo=" + sueldo + '}';
    }

}
