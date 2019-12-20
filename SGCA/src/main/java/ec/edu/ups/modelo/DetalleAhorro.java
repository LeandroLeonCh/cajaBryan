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
public class DetalleAhorro {

    private int codigo;
    private Date fechaPago;
    private double interes;
    private double saldo;

    public DetalleAhorro() {
    }

    public DetalleAhorro(int codigo, Date fechaPago, double interes, double saldo) {
        this.codigo = codigo;
        this.fechaPago = fechaPago;
        this.interes = interes;
        this.saldo = saldo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "DetalleAhorro{" + "codigo=" + codigo + ", fechaPago=" + fechaPago + ", interes=" + interes + ", saldo=" + saldo + '}';
    }

}
