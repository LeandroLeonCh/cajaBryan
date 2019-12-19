/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Credito;
import ec.edu.ups.modelo.TasaInteres;
import java.util.Set;

/**
 *
 * @author ISMAEL
 */
public class ControladorInteres {
    
    private Set<TasaInteres> listTasaInteres;

    public void crear(TasaInteres tasaInteres) {
        tasaInteres.setCodigo(listTasaInteres.size() + 1);
        listTasaInteres.add(tasaInteres);
    }
    
}
