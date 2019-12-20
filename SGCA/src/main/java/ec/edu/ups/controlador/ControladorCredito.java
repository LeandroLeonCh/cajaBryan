/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Credito;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author ISMAEL
 */
public class ControladorCredito {

    private Set<Credito> listCredito;

    public void crear(Credito credito) {
        credito.setCodigo(listCredito.size() + 1);
        listCredito.add(credito);
    }

    public Credito buscar(int codigo) {
        for (Credito credito : listCredito) {
            if (credito.getCodigo() == codigo) {
                return credito;
            }
        }
        return null;
    }

    public boolean eliminar(int codigo) {
        Credito credito = buscar(codigo);
        if (credito != null) {
            return listCredito.remove(credito);
        }
        return false;
    }

    public void actualizar(Credito credito) {
        for (Iterator<Credito> iterator = listCredito.iterator(); iterator.hasNext();) {
            Credito nuevoCredito = iterator.next();
            if (credito.getCodigo() == nuevoCredito.getCodigo()) {
                listCredito.remove(credito);
                listCredito.add(nuevoCredito);
            }
        }
    }

    public Set<Credito> getListCredito() {
        return listCredito;
    }

    public void setListCredito(Set<Credito> listCredito) {
        this.listCredito = listCredito;
    }

}
