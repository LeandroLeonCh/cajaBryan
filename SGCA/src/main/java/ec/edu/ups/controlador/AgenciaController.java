/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Agencia;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author Starman
 */
public class AgenciaController {

    private Set<Agencia> ListaAgencia;

    public void crear(Agencia agencia) {
        agencia.setCodigo(ListaAgencia.size() + 1);
        ListaAgencia.add(agencia);
    }

    public Agencia buscar(int codigo) {
        for (Agencia agencia : ListaAgencia) {
            if (agencia.getCodigo() == codigo) {
                return agencia;
            }
        }
        return null;
    }

    public boolean eliminar(int codigo) {
        Agencia agencia = buscar(codigo);
        if (agencia != null) {
            return ListaAgencia.remove(agencia);
        }
        return false;
    }

    public void actualizar(Agencia agencia) {
        for (Iterator<Agencia> iterator = ListaAgencia.iterator(); iterator.hasNext();) {
            Agencia a = iterator.next();
            if (agencia.getCodigo() == a.getCodigo()) {
                ListaAgencia.remove(agencia);
                ListaAgencia.add(a);
            }
        }

    }

    public Set<Agencia> getListaAgencia() {
        return ListaAgencia;
    }

    public void setListaAgencia(Set<Agencia> ListaAgencia) {
        this.ListaAgencia = ListaAgencia;
    }
}
