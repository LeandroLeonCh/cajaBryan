/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
public class UsuarioTest {

    private Empleado empleado;
    private Usuario usuario;

    public UsuarioTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() throws ParseException {
        DateFormat format = new SimpleDateFormat("dd/mm/yyyy"); // Creamos un formato de fecha
        Date fecha = format.parse("25/03/1995");
        Date fechaIngreso = format.parse("15/10/2019");
        empleado = new Empleado(1, "0104796230", "Xavier", "Jarro", fecha, "0983037178", "El Cebollar", "cajero", "activo", fechaIngreso, 650.44);
        usuario = new Usuario(1, "Xavier", "Patito123", "activo", "cajero", empleado);

    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getCodigo method, of class Usuario.
     */
    @Test
    public void testGetCodigo() {
        System.out.println("getCodigo");
        int expResult = 1;
        int result = usuario.getCodigo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCodigo method, of class Usuario.
     */
    @Test
    public void testSetCodigo() {
        System.out.println("setCodigo");
        int codigo = 0;
        Usuario instance = new Usuario();
        instance.setCodigo(codigo);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class Usuario.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        String expResult = "Xavier";
        String result = usuario.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Usuario.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Usuario instance = new Usuario();
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getClave method, of class Usuario.
     */
    @Test
    public void testGetClave() {
        System.out.println("getClave");
        String expResult = "Patito123";
        String result = usuario.getClave();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setClave method, of class Usuario.
     */
    @Test
    public void testSetClave() {
        System.out.println("setClave");
        String clave = "";
        Usuario instance = new Usuario();
        instance.setClave(clave);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getEstado method, of class Usuario.
     */
    @Test
    public void testGetEstado() {
        System.out.println("getEstado");
        String expResult = "activo";
        String result = usuario.getEstado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setEstado method, of class Usuario.
     */
    @Test
    public void testSetEstado() {
        System.out.println("setEstado");
        String estado = "";
        Usuario instance = new Usuario();
        instance.setEstado(estado);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getRol method, of class Usuario.
     */
    @Test
    public void testGetRol() {
        System.out.println("getRol");
        String expResult = "cajero";
        String result = usuario.getRol();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setRol method, of class Usuario.
     */
    @Test
    public void testSetRol() {
        System.out.println("setRol");
        String rol = "";
        Usuario instance = new Usuario();
        instance.setRol(rol);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getEmpleado method, of class Usuario.
     */
    @Test
    public void testGetEmpleado() {
        System.out.println("getEmpleado");
        Empleado expResult = empleado;
        Empleado result = usuario.getEmpleado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setEmpleado method, of class Usuario.
     */
    @Test
    public void testSetEmpleado() {
        System.out.println("setEmpleado");
        Empleado empleado = null;
        Usuario instance = new Usuario();
        instance.setEmpleado(empleado);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Usuario.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = "Usuario{codigo=1, nombre=Xavier, clave=Patito123, estado=activo, rol=cajero, empleado=Empleado{cargo=cajero, estado=activo, fechaIngreso=Tue Jan 15 00:10:00 COT 2019, sueldo=650.44}}";
        String result = usuario.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}
