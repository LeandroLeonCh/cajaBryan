/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Empleado;
import ec.edu.ups.modelo.Usuario;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Starman
 */
public class UsuarioControllerTest {

    private Usuario usuario1;
    private Usuario usuario2;
    private Empleado empleado1;
    private Empleado empleado2;

    private UsuarioController usuarioController;

    public UsuarioControllerTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() throws ParseException {

        usuarioController = new UsuarioController();
        DateFormat format = new SimpleDateFormat("dd/mm/yyyy");
        Date fecha = format.parse("25/03/1995");
        Date fechaIngreso = format.parse("15/10/2019");
        empleado1 = new Empleado(1, "0104796230", "Xavier", "Jarro", fecha, "0983037178", "El Cebollar", "cajero", "activo", fechaIngreso, 650.44);
        usuario1 = new Usuario(1, "Xavier", "Patito123", "activo", "cajero", empleado1);

        empleado2 = new Empleado(2, "0104796230", "Jordan", "Murillo", fecha, "0983037178", "El Cebollar", "cajero", "activo", fechaIngreso, 650.44);
        usuario2 = new Usuario(2, "Xavier", "Patito123", "activo", "cajero", empleado2);

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
        usuarioController.crear(usuario1);
        usuarioController.crear(usuario2);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of buscar method, of class UsuarioController.
     */
    @Test
    public void testBuscar() {
        System.out.println("buscar");
        usuarioController.crear(usuario1);
        int codigo = 1;
        Usuario expResult = usuario1;
        Usuario result = usuarioController.buscar(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of buscar method, of class UsuarioController.
     */
    @Test
    public void testBuscar2() {
        System.out.println("buscar");
        usuarioController.crear(usuario1);
        int codigo = 0;
        Usuario expResult = null;
        Usuario result = usuarioController.buscar(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of buscar method, of class UsuarioController.
     */
    @Test
    public void testBuscar3() {
        System.out.println("buscar");
        int codigo = 0;
        Usuario expResult = null;
        Usuario result = usuarioController.buscar(codigo);
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
        usuarioController.crear(usuario1);
        int codigo = 1;
        boolean expResult = true;
        boolean result = usuarioController.eliminar(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of eliminar method, of class UsuarioController.
     */
    @Test
    public void testEliminar2() {
        System.out.println("eliminar");
        int codigo = 1;
        boolean expResult = false;
        boolean result = usuarioController.eliminar(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of eliminar method, of class UsuarioController.
     */
    @Test
    public void testEliminar3() {
        System.out.println("eliminar");
        usuarioController.crear(usuario1);
        int codigo = 0;
        boolean expResult = false;
        boolean result = usuarioController.eliminar(codigo);
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
        usuarioController.crear(usuario1);
        int codigo = 1;
        Usuario usuario = usuario1;
        usuario.setEstado("desactivado");
        boolean expResult = true;
        boolean result = usuarioController.actualizar(codigo, usuario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of actualizar method, of class UsuarioController.
     */
    @Test
    public void testActualizar2() {
        System.out.println("actualizar");
        usuarioController.crear(usuario1);
        int codigo = 2;
        Usuario usuario = usuario1;
        usuario.setEstado("desactivado");
        boolean expResult = false;
        boolean result = usuarioController.actualizar(codigo, usuario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of actualizar method, of class UsuarioController.
     */
    @Test
    public void testActualizar3() {
        System.out.println("actualizar");
        int codigo = 2;
        Usuario usuario = usuario1;
        usuario.setEstado("desactivado");
        boolean expResult = false;
        boolean result = usuarioController.actualizar(codigo, usuario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getListaUsuario method, of class UsuarioController.
     */
    @Test
    public void testGetListaUsuario() {
        System.out.println("getListaUsuario");
        usuarioController.crear(usuario1);
        List<Usuario> expResult = new ArrayList<>();
        expResult.add(usuario1);
        List<Usuario> result = usuarioController.getListaUsuario();
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
