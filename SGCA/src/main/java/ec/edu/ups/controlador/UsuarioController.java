/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Usuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Starman
 */
public class UsuarioController {

    private List<Usuario> usuarioList;

    public UsuarioController() {
        usuarioList = new ArrayList<>();
    }

    public void crear(Usuario usuario) {
        usuarioList.add(usuario);
    }

    public Usuario buscar(int codigo) {
        for (Usuario usuario : usuarioList) {
            if (usuario.getCodigo() == codigo) {
                return usuario;
            }
        }
        return null;
    }

    public boolean eliminar(int codigo) {
        Usuario usuario = buscar(codigo);
        if (usuario != null) {
            return usuarioList.remove(usuario);
        }
        return false;
    }

    public void actualizar(int codigo, Usuario usuario) {
        for (int i = 0; i < usuarioList.size(); i++) {
            Usuario a = usuarioList.get(i);
            if (usuario.getCodigo() == a.getCodigo()) {
                usuarioList.set(i, usuario);
            }
        }
    }

    public List<Usuario> getListaUsuario() {
        return usuarioList;
    }

    public void setListaUsuario(List<Usuario> ListaUsuario) {
        this.usuarioList = ListaUsuario;
    }
}
