/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.DetalleAhorro;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Starman
 */
public class DetalleAhorroController {

    private List<DetalleAhorro> detalleAhorroList;

    public DetalleAhorroController() {
        detalleAhorroList = new ArrayList<>();
    }

    public void crear(DetalleAhorro detalleAhorro) {
        detalleAhorroList.add(detalleAhorro);
    }

    public DetalleAhorro buscar(int codigo) {
        for (DetalleAhorro detalleAhorro : detalleAhorroList) {
            if (detalleAhorro.getCodigo() == codigo) {
                return detalleAhorro;
            }
        }
        return null;
    }

    public boolean eliminar(int codigo) {
        DetalleAhorro detalleAhorro = buscar(codigo);
        if (detalleAhorro != null) {
            detalleAhorroList.remove(detalleAhorro);
            return true;
        }
        return false;
    }

    public void actualizar(int codigo, DetalleAhorro detalleAhorro) {
        for (int i = 0; i < detalleAhorroList.size(); i++) {
            DetalleAhorro a = detalleAhorroList.get(i);
            if (codigo == a.getCodigo()) {
                detalleAhorroList.set(i, detalleAhorro);
            }
        }
    }

    public List<DetalleAhorro> getDetalleAhorroList() {
        return detalleAhorroList;
    }

    public void setDetalleAhorroList(List<DetalleAhorro> detalleAhorroList) {
        this.detalleAhorroList = detalleAhorroList;
    }
}
