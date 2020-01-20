/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;
import ec.edu.ups.modelo.SolicitudCredito;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ISMAEL
 */
public class SolicitudCreditoController {
    
    private List<SolicitudCredito> listSolicitudCredito;
    
    public SolicitudCreditoController(){
        listSolicitudCredito = new ArrayList<>();
    }

    public List<SolicitudCredito> getListSolicitudCredito() {
        return listSolicitudCredito;
    }

    public void setListSolicitudCredito(List<SolicitudCredito> listSolicitudCredito) {
        this.listSolicitudCredito = listSolicitudCredito;
    }
    

    public void crear(SolicitudCredito solicitudCredito) {
       listSolicitudCredito.add(solicitudCredito);
    }

    public SolicitudCredito buscar(int codigo) {
        for (SolicitudCredito solicitudCredito : listSolicitudCredito) {
            if (solicitudCredito.getCodigo() == codigo) {
                return solicitudCredito;
            }
        }
        return null;
    }

    public boolean eliminar(int codigo) {
         for (int i = 0; i < listSolicitudCredito.size(); i++) {
            SolicitudCredito solcre = listSolicitudCredito.get(i);
            if (solcre.getCodigo() == codigo) {
                listSolicitudCredito.remove(i);
                return true;
            }
        }
        return false;
    }
    
     public boolean actualizar(int codigo, SolicitudCredito solicitudCredito) {
        for (int i = 0; i < listSolicitudCredito.size(); i++) {
            SolicitudCredito solcre = listSolicitudCredito.get(i);
            if (solcre.getCodigo() == codigo) {
                listSolicitudCredito.set(i, solicitudCredito);
                return true;
            }
        }
        return false;
    }

    
     
     
    
}
