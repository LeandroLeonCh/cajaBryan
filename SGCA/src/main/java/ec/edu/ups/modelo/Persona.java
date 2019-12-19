/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.util.Date;

/**
 *
 * @author Jordan
 */
public class Persona {

    private int pCodigo;
    private String pCedula;
    private String pNombre;
    private String pApellido;
    private Date pFechaNacimiento;
    private String pTelefono;
    private String pDireccion;

    public Persona() {
    }

    public Persona(int pCodigo, String pCedula, String pNombre, String pApellido, Date pFechaNacimiento, String pTelefono, String pDireccion) {
        this.pCodigo = pCodigo;
        this.pCedula = pCedula;
        this.pNombre = pNombre;
        this.pApellido = pApellido;
        this.pFechaNacimiento = pFechaNacimiento;
        this.pTelefono = pTelefono;
        this.pDireccion = pDireccion;
    }

    public int getpCodigo() {
        return pCodigo;
    }

    public void setpCodigo(int pCodigo) {
        this.pCodigo = pCodigo;
    }

    public String getpCedula() {
        return pCedula;
    }

    public void setpCedula(String pCedula) {
        this.pCedula = pCedula;
    }

    public String getpNombre() {
        return pNombre;
    }

    public void setpNombre(String pNombre) {
        this.pNombre = pNombre;
    }

    public String getpApellido() {
        return pApellido;
    }

    public void setpApellido(String pApellido) {
        this.pApellido = pApellido;
    }

    public Date getpFechaNacimiento() {
        return pFechaNacimiento;
    }

    public void setpFechaNacimiento(Date pFechaNacimiento) {
        this.pFechaNacimiento = pFechaNacimiento;
    }

    public String getpTelefono() {
        return pTelefono;
    }

    public void setpTelefono(String pTelefono) {
        this.pTelefono = pTelefono;
    }

    public String getpDireccion() {
        return pDireccion;
    }

    public void setpDireccion(String pDireccion) {
        this.pDireccion = pDireccion;
    }

    @Override
    public String toString() {
        return "Persona{" + "pCodigo=" + pCodigo + ", pCedula=" + pCedula + ", pNombre=" + pNombre + ", pApellido=" + pApellido + ", pFechaNacimiento=" + pFechaNacimiento + ", pTelefono=" + pTelefono + ", pDireccion=" + pDireccion + '}';
    }

}
