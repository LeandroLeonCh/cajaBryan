/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Entidad;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Starman
 */
public class EntidadController {

    private List<Entidad> entidadList;

    public EntidadController() {
        entidadList = new ArrayList<>();
    }

    public void crear(Entidad entidad) {
        entidadList.add(entidad);
    }

    public Entidad buscar(int codigo) {
        for (Entidad entidad : entidadList) {
            if (entidad.getCodigo() == codigo) {
                return entidad;
            }
        }
        return null;
    }

    public boolean eliminar(int codigo) {
        Entidad entidad = buscar(codigo);
        if (entidad != null) {
            return entidadList.remove(entidad);
        }
        return false;
    }

    public boolean actualizar(Entidad entidad) {
        for (int i = 0; i < entidadList.size(); i++) {
            Entidad a = entidadList.get(i);
            if (entidad.getCodigo() == a.getCodigo()) {
                entidadList.set(i, entidad);
                return true;
            }
        }
        return false;
    }

    public List<Entidad> getEntidadList() {
        return entidadList;
    }

    public void setEntidadList(List<Entidad> entidadList) {
        this.entidadList = entidadList;
    }
}
