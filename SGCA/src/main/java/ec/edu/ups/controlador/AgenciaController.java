/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Agencia;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Starman
 */
public class AgenciaController {

    private List<Agencia> agenciaList;

    public AgenciaController() {
        agenciaList = new ArrayList<>();
    }

    public List<Agencia> getAgenciaList() {
        return agenciaList;
    }

    public void setAgenciaList(List<Agencia> agenciaList) {
        this.agenciaList = agenciaList;
    }

    public void crearAgencia(Agencia agencia) {
        agenciaList.add(agencia);
    }

    public Agencia buscarAgencia(int codigo) {
        for (Agencia agencia : agenciaList) {
            if (agencia.getCodigo() == codigo) {
                return agencia;
            }
        }
        return null;
    }

    public boolean eliminarAgencia(int codigo) {
        for (int i = 0; i < agenciaList.size(); i++) {
            Agencia s = agenciaList.get(i);
            if (s.getCodigo() == codigo) {
                agenciaList.remove(i);
                return true;
            }
        }
        return false;
    }

    public boolean actualizarAgencia(int codigo, Agencia agencia) {
        for (int i = 0; i < agenciaList.size(); i++) {
            Agencia s = agenciaList.get(i);
            if (s.getCodigo() == codigo) {
                agenciaList.set(i, agencia);
                return true;
            }
        }
        return false;
    }
}
