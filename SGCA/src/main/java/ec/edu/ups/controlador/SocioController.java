/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Socio;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USER
 */
public class SocioController {

    private List<Socio> socioList;

    public SocioController() {
        socioList = new ArrayList<>();
    }

    public List<Socio> getSocioList() {
        return socioList;
    }

    public void setSocioList(List<Socio> socioList) {
        this.socioList = socioList;
    }

    public void crearSocio(Socio socio) {
        socioList.add(socio);
    }

    public Socio buscarSocio(String cedula) {
        for (Socio socio : socioList) {
            if (socio.getpCedula().equals(cedula)) {
                return socio;
            }
        }
        return null;
    }

    public boolean eliminarSocio(String cedula) {
        for (int i = 0; i < socioList.size(); i++) {
            Socio s = socioList.get(i);
            if (s.getpCedula().equals(cedula)) {
                socioList.remove(i);
                return true;
            }
        }
        return false;
    }

    public boolean actualizarSocio(String cedula, Socio socio) {
        for (int i = 0; i < socioList.size(); i++) {
            Socio s = socioList.get(i);
            if (s.getpCedula().equals(cedula)) {
                socioList.set(i, socio);
                return true;
            }
        }
        return false;
    }
    
}
