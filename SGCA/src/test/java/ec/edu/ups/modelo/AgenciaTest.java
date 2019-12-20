/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.text.ParseException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author USER
 */
public class AgenciaTest {
    
    private Agencia agencia;
    
    public AgenciaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() throws ParseException{
        agencia = new Agencia(1, "Cooperativa SGCA", "Gil Ramirez Davalos", "0981241115","N");
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getCodigo method, of class Agencia.
     */
    @Test
    public void testGetCodigo() {
        System.out.println("getCodigo");
        int expResult = 1;
        int result = agencia.getCodigo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCodigo method, of class Agencia.
     */
    @Test
    public void testSetCodigo() {
        System.out.println("setCodigo");
        int codigo = 0;
        Agencia instance = new Agencia();
        instance.setCodigo(codigo);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class Agencia.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        String expResult = "Cooperativa SGCA";
        String result = agencia.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Agencia.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Agencia instance = new Agencia();
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDireccion method, of class Agencia.
     */
    @Test
    public void testGetDireccion() {
        System.out.println("getDireccion");
        String expResult = "Gil Ramirez Davalos";
        String result = agencia.getDireccion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setDireccion method, of class Agencia.
     */
    @Test
    public void testSetDireccion() {
        System.out.println("setDireccion");
        String direccion = "";
        Agencia instance = new Agencia();
        instance.setDireccion(direccion);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTelefono method, of class Agencia.
     */
    @Test
    public void testGetTelefono() {
        System.out.println("getTelefono");
        String expResult = "0981241115";
        String result = agencia.getTelefono();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setTelefono method, of class Agencia.
     */
    @Test
    public void testSetTelefono() {
        System.out.println("setTelefono");
        String telefono = "";
        Agencia instance = new Agencia();
        instance.setTelefono(telefono);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTipo method, of class Agencia.
     */
    @Test
    public void testGetTipo() {
        System.out.println("getTipo");
        String expResult = "N";
        String result = agencia.getTipo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setTipo method, of class Agencia.
     */
    @Test
    public void testSetTipo() {
        System.out.println("setTipo");
        String tipo = "";
        Agencia instance = new Agencia();
        instance.setTipo(tipo);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Agencia.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = "Agencia{codigo=1, nombre=Cooperativa SGCA, direccion=Gil Ramirez Davalos, telefono=0981241115, tipo=N}";
        String result = agencia.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
