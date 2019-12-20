/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

/**
 *
 * @author ISMAEL
 */
public class TasaInteres {
    
     private int codigo;
    private String nombre;
    private String periodo;
    private Double porcentaje;

    public TasaInteres(int codigo, String nombre, String periodo, Double porcentaje) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.periodo = periodo;
        this.porcentaje = porcentaje;
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

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public Double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(Double porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public String toString() {
        return "TasaInteres{" + "codigo=" + codigo + ", nombre=" + nombre + ", periodo=" + periodo + ", porcentaje=" + porcentaje + '}';
    }
    
    
    
}
