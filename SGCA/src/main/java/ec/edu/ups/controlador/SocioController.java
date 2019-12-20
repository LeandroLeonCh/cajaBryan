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

    public void crear(Socio socio) {
        socioList.add(socio);
    }

    public Socio buscar(int codigo) {
        for (Socio socio : socioList) {
            if (socio.getpCodigo() == codigo) {
                return socio;
            }
        }
        return null;
    }

    public boolean eliminar(int codigo) {
        Socio socio = buscar(codigo);
        if (socio != null) {
            return socioList.remove(socio);
        }
        return false;
    }

    public void actualizar(Socio socio) {
        for (int i = 0; i < socioList.size(); i++) {
            Socio s = socioList.get(i);
            if (socio.getpCodigo() == s.getpCodigo()) {
                socioList.set(i, s);
            }
        }
    }
}
