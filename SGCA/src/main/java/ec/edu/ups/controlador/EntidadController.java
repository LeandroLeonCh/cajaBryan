/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Entidad;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author Starman
 */
public class EntidadController {

    private Set<Entidad> ListaEntidad;

    public void crear(Entidad entidad) {
        entidad.setCodigo(ListaEntidad.size() + 1);
        ListaEntidad.add(entidad);
    }

    public Entidad buscar(int codigo) {
        for (Entidad entidad : ListaEntidad) {
            if (entidad.getCodigo() == codigo) {
                return entidad;
            }
        }
        return null;
    }

    public boolean eliminar(int codigo) {
        Entidad entidad = buscar(codigo);
        if (entidad != null) {
            return ListaEntidad.remove(entidad);
        }
        return false;
    }

    public void actualizar(Entidad entidad) {
        for (Iterator<Entidad> iterator = ListaEntidad.iterator(); iterator.hasNext();) {
            Entidad a = iterator.next();
            if (entidad.getCodigo() == a.getCodigo()) {
                ListaEntidad.remove(entidad);
                ListaEntidad.add(a);
            }
        }

    }

    public Set<Entidad> getListaEntidad() {
        return ListaEntidad;
    }

    public void setListaEntidad(Set<Entidad> ListaEntidad) {
        this.ListaEntidad = ListaEntidad;
    }
}
