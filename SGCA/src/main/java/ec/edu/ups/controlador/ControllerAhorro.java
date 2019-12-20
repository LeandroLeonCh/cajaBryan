/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Ahorro;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author Starman
 */
public class ControllerAhorro {

    private Set<Ahorro> ListaAhorro;

    public void crear(Ahorro ahorro) {
        ahorro.setCodigo(ListaAhorro.size() + 1);
        ListaAhorro.add(ahorro);
    }

    public Ahorro buscar(int codigo) {
        for (Ahorro ahorro : ListaAhorro) {
            if (ahorro.getCodigo() == codigo) {
                return ahorro;
            }
        }
        return null;
    }

    public boolean eliminar(int codigo) {
        Ahorro ahorro = buscar(codigo);
        if (ahorro != null) {
            return ListaAhorro.remove(ahorro);
        }
        return false;
    }

    public void actualizar(Ahorro ahorro) {
        for (Iterator<Ahorro> iterator = ListaAhorro.iterator(); iterator.hasNext();) {
            Ahorro a = iterator.next();
            if (ahorro.getCodigo() == a.getCodigo()) {
                ListaAhorro.remove(ahorro);
                ListaAhorro.add(a);
            }
        }

    }

    public Set<Ahorro> getListaAhorro() {
        return ListaAhorro;
    }

    public void setListaAhorro(Set<Ahorro> ListaAhorro) {
        this.ListaAhorro = ListaAhorro;
    }
}
