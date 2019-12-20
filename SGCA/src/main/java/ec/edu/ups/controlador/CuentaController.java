/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Cuenta;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 *
 * @author USER
 */
public class CuentaController {

    private List<Cuenta> cuentaList;

    public CuentaController() {
        cuentaList = new ArrayList<>();
    }

    public List<Cuenta> getCuentaList() {
        return cuentaList;
    }

    public void setCuentaList(List<Cuenta> cuentaList) {
        this.cuentaList = cuentaList;
    }

    public void crearCuenta(Cuenta cuenta) {
        cuentaList.add(cuenta);
    }

    public Cuenta buscarCuenta(int codigo) {
        for (Cuenta cuenta : cuentaList) {
            if (cuenta.getCodigo() == codigo) {
                return cuenta;
            }
        }
        return null;
    }
    
    public boolean eliminarCuenta(int codigo) {
        for(int i = 0; i < cuentaList.size(); i++){
            Cuenta c = cuentaList.get(i);
            if(c.getCodigo() == codigo){
                cuentaList.remove(i);
                return true;
            }
        }
        return false;
    }

    public void actualizarCuenta(int codigo, Cuenta cuenta) {
        for(int i = 0; i < cuentaList.size(); i++){
            Cuenta c = cuentaList.get(i);
            if(c.getCodigo() == codigo){
                cuentaList.set(i, cuenta);
                return;
            }
        }
        return;
    }  
}
