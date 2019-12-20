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

    public void crearAhorro(Ahorro ahorro) {
        ahorroList.add(ahorro);
    }

    public Ahorro buscarAhorro(int codigo) {
        for (Ahorro ahorro : ahorroList) {
            if (ahorro.getCodigo() == codigo) {
                return ahorro;
            }
        }
        return null;
    }

    public boolean eliminarAhorro(int codigo) {
        Ahorro ahorro = buscarAhorro(codigo);
        if (ahorro != null) {
            ahorroList.remove(ahorro);
            return true;
        }
        return false;
    }

    public boolean actualizarAhorro(int codigo, Ahorro ahorro) {
        for (int i = 0; i < ahorroList.size(); i++) {
            Ahorro a = ahorroList.get(i);
            if (codigo == a.getCodigo()) {
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
