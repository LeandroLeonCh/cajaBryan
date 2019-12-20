/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Cuenta;
import java.util.Set;

/**
 *
 * @author USER
 */
public class CuentaController {
    private Set<Cuenta> ListaCuentas;
    
    public void crear(Cuenta cuenta){
        cuenta.setCodigo(ListaCuentas.size());
        ListaCuentas.add(cuenta);
    }
    
    public Cuenta buscar(int codigo){
        for (Cuenta cuenta : ListaCuentas) {
            if (cuenta.getCodigo()==codigo){
                return cuenta;
            }            
        }
        return null;
    }
}
