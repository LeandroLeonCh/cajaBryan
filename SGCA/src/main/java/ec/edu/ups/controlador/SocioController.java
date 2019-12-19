/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Socio;
import ec.edu.ups.modelo.Usuario;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author USER
 */
public class SocioController {
    private Set<Socio> ListaSocios;
    
    public void crear (Socio socio){
        socio.setpCodigo(ListaSocios.size()+1);
        ListaSocios.add(socio);
    }
    
    public Socio buscar(int codigo){
        for(Socio socio : ListaSocios){
            if(socio.getpCodigo()== codigo){
                return socio;
            }
        }
        return null;
    }
    
    public boolean eliminar(int codigo){
        Socio socio = buscar(codigo);
        if (socio != null){
            return ListaSocios.remove(socio);
        }
        return false;
    }
    
    public void actualizar(Socio socio){
        for (Iterator<Socio> iterator = ListaSocios.iterator(); iterator.hasNext();){
            Socio s = iterator.next();
            if(socio.getpCodigo() == s.getpCodigo()){
                ListaSocios.remove(socio);
                ListaSocios.add(s);
            }
        }
    }

    public Set<Socio> getListaSocios() {
        return ListaSocios;
    }

    public void setListaSocios(Set<Socio> ListaSocios) {
        this.ListaSocios = ListaSocios;
    }
}
