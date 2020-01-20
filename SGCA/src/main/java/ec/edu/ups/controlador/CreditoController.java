/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Credito;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ISMAEL
 */
public class CreditoController {

    private List<Credito> listCredito;

    public List<Credito> getListCredito() {
        return listCredito;
    }

    public void setListCredito(List<Credito> listCredito) {
        this.listCredito = listCredito;
    }

    public CreditoController() {
        listCredito = new ArrayList<>();
    }

    public void crear(Credito credito) {
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
        for (int i = 0; i < listCredito.size(); i++) {
            Credito cre = listCredito.get(i);
            if (cre.getCodigo() == codigo) {
                listCredito.remove(i);
                return true;
            }
        }
        return false;
    }

    public boolean actualizar(int codigo, Credito credito) {
       for (int i = 0; i < listCredito.size(); i++) {
            Credito cre = listCredito.get(i);
            if (cre.getCodigo() == codigo) {
                listCredito.set(i, credito);
                return true;
            }
        }
        return false;
    }
}
