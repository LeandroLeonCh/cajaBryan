/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Persona;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jordan
 */
public class PersonaController {

    private List<Persona> personaList;

    public PersonaController() {
        personaList = new ArrayList<>();
    }

    public List<Persona> getPersonaList() {
        return personaList;
    }

    public void setPersonaList(List<Persona> personaList) {
        this.personaList = personaList;
    }

    public void crearPersona(Persona persona) {
        personaList.add(persona);
    }

    public Persona buscarPersona(String cedula) {
        for (Persona persona : personaList) {
            if (persona.getpCedula().equals(cedula)) {
                return persona;
            }
        }
        return null;
    }

    public boolean actualizarPersona(String cedula, Persona persona) {
        for (int i = 0; i < personaList.size(); i++) {
            Persona p = personaList.get(i);
            if (p.getpCedula().equals(cedula)) {
                personaList.set(i, persona);
                return true;
            }
        }
        return false;
    }

    public boolean borrarPersona(String cedula) {
        for (int i = 0; i < personaList.size(); i++) {
            Persona p = personaList.get(i);
            if (p.getpCedula().equals(cedula)) {
                personaList.remove(i);
                return true;
            }
        }
        return false;
    }
}