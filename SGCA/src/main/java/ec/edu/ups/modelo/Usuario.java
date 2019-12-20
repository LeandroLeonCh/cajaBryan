/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

/**
 *
 * @author Starman
 */
public class Usuario {

    private int codigo;
    private String nombre;
    private String clave;
    private String estado;
    private String rol;
    private Empleado empleado;

    public Usuario() {
    }

    public Usuario(int codigo, String nombre, String clase, String estado, String rol, Empleado empleado) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.clave = clase;
        this.estado = estado;
        this.rol = rol;
        this.empleado = empleado;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClase() {
        return clave;
    }

    public void setClase(String clase) {
        this.clave = clase;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

}
