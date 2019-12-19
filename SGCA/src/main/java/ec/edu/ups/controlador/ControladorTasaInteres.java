/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.TasaInteres;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author ISMAEL
 */
public class ControladorTasaInteres {
    
    private Set<TasaInteres> listTasaInteres;

    public void crear(TasaInteres tasaInteres) {
        tasaInteres.setCodigo(listTasaInteres.size() + 1);
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
        TasaInteres tasaInteres = buscar(codigo);
        if (tasaInteres != null) {
            return listTasaInteres.remove(tasaInteres);
        }
        return false;
    }

    public void actualizar(TasaInteres tasaInteres) {
        for (Iterator<TasaInteres> iterator = listTasaInteres.iterator(); iterator.hasNext();) {
            TasaInteres nuevaTasaInteres = iterator.next();
            if (tasaInteres.getCodigo() == nuevaTasaInteres.getCodigo()) {
                listTasaInteres.remove(tasaInteres);
                listTasaInteres.add(nuevaTasaInteres);
            }
        }
    }

    public Set<TasaInteres> getListTasaInteres() {
        return listTasaInteres;
    }

    public void setListTasaInteres(Set<TasaInteres> listTasaInteres) {
        this.listTasaInteres = listTasaInteres;
    }
    
    
    
}
