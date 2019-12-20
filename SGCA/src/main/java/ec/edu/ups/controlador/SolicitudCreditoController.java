/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;
import ec.edu.ups.modelo.Credito;
import ec.edu.ups.modelo.SolicitudCredito;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author ISMAEL
 */
public class SolicitudCreditoController {
    
    private Set<SolicitudCredito> listSolicitudCredito;

    public void crear(SolicitudCredito solicitudCredito) {
        solicitudCredito.setCodigo(listSolicitudCredito.size() + 1);
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
        SolicitudCredito solicitudCredito = buscar(codigo);
        if (solicitudCredito != null) {
            return listSolicitudCredito.remove(solicitudCredito);
        }
        return false;
    }
    
     public void actualizar(SolicitudCredito solicitudCredito) {
        for (Iterator<SolicitudCredito> iterator = listSolicitudCredito.iterator(); iterator.hasNext();) {
            SolicitudCredito nuevaSolicitudCredito = iterator.next();
            if (solicitudCredito.getCodigo() == nuevaSolicitudCredito.getCodigo()) {
                listSolicitudCredito.remove(solicitudCredito);
                listSolicitudCredito.add(nuevaSolicitudCredito);
            }
        }
    }

    public Set<SolicitudCredito> getListSolicitudCredito() {
        return listSolicitudCredito;
    }

    public void setListSolicitudCredito(Set<SolicitudCredito> listSolicitudCredito) {
        this.listSolicitudCredito = listSolicitudCredito;
    }
     
     
    
}
