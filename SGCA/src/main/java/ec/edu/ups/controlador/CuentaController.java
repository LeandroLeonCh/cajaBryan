/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Cuenta;
import java.util.Iterator;
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
    
    public void actualizar(Cuenta cuenta){
        for(Iterator<Cuenta> iterator = ListaCuentas.iterator(); iterator.hasNext();){
            Cuenta c = iterator.next();
            if(cuenta.getCodigo()== c.getCodigo()){
                ListaCuentas.remove(cuenta);
                ListaCuentas.add(c);
            }
        }
    }
    
    public boolean eliminar (int codigo){
        Cuenta cuenta = buscar(codigo);
        if(cuenta != null){
            return ListaCuentas.remove(cuenta);
        }
        return false;
    }

    public Set<Cuenta> getListaCuentas() {
        return ListaCuentas;
    }

    public void setListaCuentas(Set<Cuenta> ListaCuentas) {
        this.ListaCuentas = ListaCuentas;
    }
}
