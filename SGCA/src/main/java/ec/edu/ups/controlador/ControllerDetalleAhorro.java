/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.DetalleAhorro;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author Starman
 */
public class ControllerDetalleAhorro {
    private Set<DetalleAhorro> ListaDetalleAhorro;

    public void crear(DetalleAhorro detalleAhorro) {
        detalleAhorro.setCodigo(ListaDetalleAhorro.size() + 1);
        ListaDetalleAhorro.add(detalleAhorro);
    }

    public DetalleAhorro buscar(int codigo) {
        for (DetalleAhorro detalleAhorro : ListaDetalleAhorro) {
            if (detalleAhorro.getCodigo() == codigo) {
                return detalleAhorro;
            }
        }
        return null;
    }

    public boolean eliminar(int codigo) {
        DetalleAhorro detalleAhorro = buscar(codigo);
        if (detalleAhorro != null) {
            return ListaDetalleAhorro.remove(detalleAhorro);
        }
        return false;
    }

    public void actualizar(DetalleAhorro detalleAhorro) {
        for (Iterator<DetalleAhorro> iterator = ListaDetalleAhorro.iterator(); iterator.hasNext();) {
            DetalleAhorro a = iterator.next();
            if (detalleAhorro.getCodigo() == a.getCodigo()) {
                ListaDetalleAhorro.remove(detalleAhorro);
                ListaDetalleAhorro.add(a);
            }
        }

    }

    public Set<DetalleAhorro> getListaDetalleAhorro() {
        return ListaDetalleAhorro;
    }

    public void setListaDetalleAhorro(Set<DetalleAhorro> ListaDetalleAhorro) {
        this.ListaDetalleAhorro = ListaDetalleAhorro;
    }
}
