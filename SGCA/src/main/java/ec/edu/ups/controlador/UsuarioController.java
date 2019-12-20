/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Usuario;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author Starman
 */
public class UsuarioController {

    private Set<Usuario> ListaUsuario;

    public void crear(Usuario usuario) {
        usuario.setCodigo(ListaUsuario.size() + 1);
        ListaUsuario.add(usuario);
    }

    public Usuario buscar(int codigo) {
        for (Usuario usuario : ListaUsuario) {
            if (usuario.getCodigo() == codigo) {
                return usuario;
            }
        }
        return null;
    }

    public boolean eliminar(int codigo) {
        Usuario usuario = buscar(codigo);
        if (usuario != null) {
            return ListaUsuario.remove(usuario);
        }
        return false;
    }

    public void actualizar(Usuario usuario) {
        for (Iterator<Usuario> iterator = ListaUsuario.iterator(); iterator.hasNext();) {
            Usuario a = iterator.next();
            if (usuario.getCodigo() == a.getCodigo()) {
                ListaUsuario.remove(usuario);
                ListaUsuario.add(a);
            }
        }

    }

    public Set<Usuario> getListaUsuario() {
        return ListaUsuario;
    }

    public void setListaUsuario(Set<Usuario> ListaUsuario) {
        this.ListaUsuario = ListaUsuario;
    }
}
