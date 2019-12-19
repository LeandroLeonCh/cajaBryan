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
 * @author Starman
 */
public class ControladorCuenta {
    private Set<Cuenta> ListaCuenta;

    
    public void crear(Cuenta cuenta) {
        cuenta.setCodigo(ListaCuenta.size() + 1);
        ListaCuenta.add(cuenta);
    }

    public Cuenta buscar(int codigo) {
        for (Cuenta cuenta : ListaCuenta) {
            if (cuenta.getCodigo() == codigo) {
                return cuenta;
            }
        }
        return null;
    }

    public boolean eliminar(int codigo) {
        Cuenta cuenta = buscar(codigo);
        if (cuenta != null) {
            return ListaCuenta.remove(cuenta);
        }
        return false;
    }

    public void actualizar(Cuenta cuenta) {
        for (Iterator<Cuenta> iterator = ListaCuenta.iterator(); iterator.hasNext();) {
            Cuenta a = iterator.next();
            if (cuenta.getCodigo() == a.getCodigo()) {
                ListaCuenta.remove(cuenta);
                ListaCuenta.add(a);
            }
        }

    }

    
    public Set<Cuenta> getListaCuenta() {
        return ListaCuenta;
    }

    public void setListaCuenta(Set<Cuenta> ListaCuenta) {
        this.ListaCuenta = ListaCuenta;
    }
}
