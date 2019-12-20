/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Usuario;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jordan
 */
public class UsuarioControllerTest {
    
    public UsuarioControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of crear method, of class UsuarioController.
     */
    @Test
    public void testCrear() {
        System.out.println("crear");
        Usuario usuario = null;
        UsuarioController instance = new UsuarioController();
        instance.crear(usuario);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of buscar method, of class UsuarioController.
     */
    @Test
    public void testBuscar() {
        System.out.println("buscar");
        int codigo = 0;
        UsuarioController instance = new UsuarioController();
        Usuario expResult = null;
        Usuario result = instance.buscar(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of eliminar method, of class UsuarioController.
     */
    @Test
    public void testEliminar() {
        System.out.println("eliminar");
        int codigo = 0;
        UsuarioController instance = new UsuarioController();
        boolean expResult = false;
        boolean result = instance.eliminar(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of actualizar method, of class UsuarioController.
     */
    @Test
    public void testActualizar() {
        System.out.println("actualizar");
        int codigo = 0;
        Usuario usuario = null;
        UsuarioController instance = new UsuarioController();
        instance.actualizar(codigo, usuario);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getListaUsuario method, of class UsuarioController.
     */
    @Test
    public void testGetListaUsuario() {
        System.out.println("getListaUsuario");
        UsuarioController instance = new UsuarioController();
        List<Usuario> expResult = new ArrayList<>();
        List<Usuario> result = instance.getListaUsuario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setListaUsuario method, of class UsuarioController.
     */
    @Test
    public void testSetListaUsuario() {
        System.out.println("setListaUsuario");
        List<Usuario> ListaUsuario = null;
        UsuarioController instance = new UsuarioController();
        instance.setListaUsuario(ListaUsuario);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
