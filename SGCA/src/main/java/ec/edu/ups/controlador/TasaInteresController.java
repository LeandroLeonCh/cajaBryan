/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.TasaInteres;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ISMAEL
 */
public class TasaInteresController {

    private List<TasaInteres> listTasaInteres;
    
    public TasaInteresController(){
        listTasaInteres = new ArrayList<>();
    }

    public List<TasaInteres> getListTasaInteres() {
        return listTasaInteres;
    }

    public void setListTasaInteres(List<TasaInteres> listTasaInteres) {
        this.listTasaInteres = listTasaInteres;
    }

    public void crear(TasaInteres tasaInteres) {
        listTasaInteres.add(tasaInteres);
    }

    public TasaInteres buscar(int codigo) {
        for (TasaInteres tasaInteres : listTasaInteres) {
            if (tasaInteres.getCodigo() == codigo) {
                return tasaInteres;
            }
        }
        return null;
    }

    public boolean eliminar(int codigo) {
        for (int i = 0; i < listTasaInteres.size(); i++) {
            TasaInteres tasa = listTasaInteres.get(i);
            if (tasa.getCodigo() == codigo) {
                listTasaInteres.remove(i);
                return true;
            }
        }
        return false;
    }

    public boolean actualizar(int codigo, TasaInteres tasaInteres) {
         for (int i = 0; i < listTasaInteres.size(); i++) {
            TasaInteres tasa = listTasaInteres.get(i);
            if (tasa.getCodigo() == codigo) {
                listTasaInteres.set(i, tasaInteres);
                return true;
            }
        }
        return false;
    }
}
