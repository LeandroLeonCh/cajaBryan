/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Empleado;
import ec.edu.ups.modelo.Persona;
import ec.edu.ups.modelo.Socio;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author Starman
 */
public class ControladorPersona {

    private Set<Persona> ListaPersona;

    public void crear(Persona persona) {
        persona.setpCodigo(ListaPersona.size() + 1);
        ListaPersona.add(persona);
    }

    public Persona buscar(int codigo) {
        for (Persona persona : ListaPersona) {
            if (persona.getpCodigo() == codigo) {
                return persona;
            }
        }
        return null;
    }

    public boolean eliminar(int codigo) {
        Persona persona = buscar(codigo);
        if (persona != null) {
            return ListaPersona.remove(persona);
        }
        return false;
    }

    public void actualizar(Persona persona) {
        for (Iterator<Persona> iterator = ListaPersona.iterator(); iterator.hasNext();) {
            Persona a = iterator.next();
            if (persona.getpCodigo() == a.getpCodigo()) {
                ListaPersona.remove(persona);
                ListaPersona.add(a);
            }
        }

    }

    public Set<Socio> getSocio() {
        Set<Socio> listaSocio = new HashSet<>();
        for (Persona persona : ListaPersona) {
            if (persona instanceof Socio) {
                listaSocio.add((Socio) persona);
            }
        }
        return listaSocio;
    }

    public Set<Empleado> getEmpleado() {
        Set<Empleado> listaEmpleado = new HashSet<>();
        for (Persona persona : ListaPersona) {
            if (persona instanceof Empleado) {
                listaEmpleado.add((Empleado) persona);
            }
        }
        return listaEmpleado;
    }

    public Set<Persona> getListaPersona() {
        return ListaPersona;
    }

    public void setListaPersona(Set<Persona> ListaPersona) {
        this.ListaPersona = ListaPersona;
    }
}
