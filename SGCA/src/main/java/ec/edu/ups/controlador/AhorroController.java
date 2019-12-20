/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Ahorro;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Starman
 */
public class AhorroController {

    private List<Ahorro> ahorroList;

    public AhorroController() {
        ahorroList = new ArrayList<>();
    }

    public void crear(Ahorro ahorro) {
        ahorroList.add(ahorro);
    }

    public Ahorro buscar(int codigo) {
        for (Ahorro ahorro : ahorroList) {
            if (ahorro.getCodigo() == codigo) {
                return ahorro;
            }
        }
        return null;
    }

    public boolean eliminar(int codigo) {
        Ahorro ahorro = buscar(codigo);
        if (ahorro != null) {
            return ahorroList.remove(ahorro);
        }
        return false;
    }

    public boolean actualizar(Ahorro ahorro) {
        for (int i = 0; i < ahorroList.size(); i++) {
            Ahorro a = ahorroList.get(i);
            if (ahorro.getCodigo() == a.getCodigo()) {
                ahorroList.set(i, a);
                return true;
            }
        }
        return false;
    }

    public List<Ahorro> getAhorroList() {
        return ahorroList;
    }

    public void setAhorroList(List<Ahorro> ahorroList) {
        this.ahorroList = ahorroList;
    }
}
