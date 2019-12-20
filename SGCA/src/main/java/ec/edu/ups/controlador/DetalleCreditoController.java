/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.DetalleCredito;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ISMAEL
 */
public class DetalleCreditoController {
    
    private List<DetalleCredito> listDetalleCredito;
    
    public DetalleCreditoController(){
        listDetalleCredito = new ArrayList<>();
    }

    public List<DetalleCredito> getListDetalleCredito() {
        return listDetalleCredito;
    }

    public void setListDetalleCredito(List<DetalleCredito> listDetalleCredito) {
        this.listDetalleCredito = listDetalleCredito;
    }
    
    public void crear(DetalleCredito detalleCredito) {
        listDetalleCredito.add(detalleCredito);
    }
    
    public DetalleCredito buscar(int codigo) {
        for (DetalleCredito detalleCredito : listDetalleCredito) {
            if (detalleCredito.getCodigo() == codigo) {
                return detalleCredito;
            }
        }
        return null;
    }
    
    public boolean eliminar(int codigo) {
        for (int i = 0; i < listDetalleCredito.size(); i++) {
            DetalleCredito detcre = listDetalleCredito.get(i);
            if (detcre.getCodigo() == codigo) {
                listDetalleCredito.remove(i);
                return true;
            }
        }
        return false;
    }
    
     public boolean actualizar(int codigo, DetalleCredito detalleCredito) {
       for (int i = 0; i < listDetalleCredito.size(); i++) {
            DetalleCredito detcre = listDetalleCredito.get(i);
            if (detcre.getCodigo() == detalleCredito.getCodigo()) {
                listDetalleCredito.set(i, detalleCredito);
                return true;
            }
        }
        return false;
    }
}
