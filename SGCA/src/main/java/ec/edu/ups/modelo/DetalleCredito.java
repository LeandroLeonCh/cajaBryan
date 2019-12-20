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
public class DetalleCredito {

    private int codigo;
    private Double capital;
    private Date fechaPago;
    private Double interes;
    private Double cuota;
    private Date fechaCaducidad;
    private Double montoMora;
    private int numeroCuota;
    private int numeroDiasMora;
    private Double saldoCapital;

    public DetalleCredito() {
    }

    public DetalleCredito(int codigo, Double capital, Date fechaPago, Double interes, Double cuota, Date fechaCaducidad, Double montoMora, int numeroCuota, int numeroDiasMora, Double saldoCapital) {
        this.codigo = codigo;
        this.capital = capital;
        this.fechaPago = fechaPago;
        this.interes = interes;
        this.cuota = cuota;
        this.fechaCaducidad = fechaCaducidad;
        this.montoMora = montoMora;
        this.numeroCuota = numeroCuota;
        this.numeroDiasMora = numeroDiasMora;
        this.saldoCapital = saldoCapital;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Double getCapital() {
        return capital;
    }

    public void setCapital(Double capital) {
        this.capital = capital;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    public Double getInteres() {
        return interes;
    }

    public void setInteres(Double interes) {
        this.interes = interes;
    }

    public Double getCuota() {
        return cuota;
    }

    public void setCuota(Double cuota) {
        this.cuota = cuota;
    }

    public Date getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(Date fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public Double getMontoMora() {
        return montoMora;
    }

    public void setMontoMora(Double montoMora) {
        this.montoMora = montoMora;
    }

    public int getNumeroCuota() {
        return numeroCuota;
    }

    public void setNumeroCuota(int numeroCuota) {
        this.numeroCuota = numeroCuota;
    }

    public int getNumeroDiasMora() {
        return numeroDiasMora;
    }

    public void setNumeroDiasMora(int numeroDiasMora) {
        this.numeroDiasMora = numeroDiasMora;
    }

    public Double getSaldoCapital() {
        return saldoCapital;
    }

    public void setSaldoCapital(Double saldoCapital) {
        this.saldoCapital = saldoCapital;
    }

    @Override
    public String toString() {
        return "DetalleCredito{" + "codigo=" + codigo + ", capital=" + capital + ", fechaPago=" + fechaPago + ", interes=" + interes + ", cuota=" + cuota + ", fechaCaducidad=" + fechaCaducidad + ", montoMora=" + montoMora + ", numeroCuota=" + numeroCuota + ", numeroDiasMora=" + numeroDiasMora + ", saldoCapital=" + saldoCapital + '}';
    }
    
    

}
