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
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class PersonaTest {

    private Persona p1;

    public PersonaTest() {
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
        Date fecha = format.parse("17/01/1999");
        System.out.println(fecha);
        p1 = new Persona(1, "0703021287", "Jordan", "Murillo", fecha, "0980792708", "Av. Loja");
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getpCodigo method, of class Persona.
     */
    @Test
    public void testGetpCodigo() {
        System.out.println("getpCodigo");
        int expResult = 1;
        int result = p1.getpCodigo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setpCodigo method, of class Persona.
     */
    @Test
    public void testSetpCodigo() {
        System.out.println("setpCodigo");
        int pCodigo = 0;
        Persona instance = new Persona();
        instance.setpCodigo(pCodigo);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getpCedula method, of class Persona.
     */
    @Test
    public void testGetpCedula() {
        System.out.println("getpCedula");
        String expResult = "0703021287";
        String result = p1.getpCedula();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of setpCedula method, of class Persona.
     */
    @Test
    public void testSetpCedula() {
        System.out.println("setpCedula");
        String pCedula = "";
        Persona instance = new Persona();
        instance.setpCedula(pCedula);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getpNombre method, of class Persona.
     */
    @Test
    public void testGetpNombre() {
        System.out.println("getpNombre");
        String expResult = "Jordan";
        String result = p1.getpNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setpNombre method, of class Persona.
     */
    @Test
    public void testSetpNombre() {
        System.out.println("setpNombre");
        String pNombre = "";
        Persona instance = new Persona();
        instance.setpNombre(pNombre);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getpApellido method, of class Persona.
     */
    @Test
    public void testGetpApellido() {
        System.out.println("getpApellido");
        String expResult = "Murillo";
        String result = p1.getpApellido();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of setpApellido method, of class Persona.
     */
    @Test
    public void testSetpApellido() {
        System.out.println("setpApellido");
        String pApellido = "";
        Persona instance = new Persona();
        instance.setpApellido(pApellido);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getpFechaNacimiento method, of class Persona.
     */
    @Test
    public void testGetpFechaNacimiento() {
        System.out.println("getpFechaNacimiento");
        DateFormat format = new SimpleDateFormat("dd/mm/yyyy"); // Creamos un formato de fecha
        Date expResult = null;
        try {
            expResult = format.parse("17/01/1999");
        } catch (ParseException ex) {
            Logger.getLogger(PersonaTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        Date result = p1.getpFechaNacimiento();
        System.out.println("result " + result);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setpFechaNacimiento method, of class Persona.
     */
    @Test
    public void testSetpFechaNacimiento() {
        System.out.println("setpFechaNacimiento");
        Date pFechaNacimiento = null;
        Persona instance = new Persona();
        instance.setpFechaNacimiento(pFechaNacimiento);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of getpTelefono method, of class Persona.
     */
    @Test
    public void testGetpTelefono() {
        System.out.println("getpTelefono");
        String expResult = "0980792708";
        String result = p1.getpTelefono();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setpTelefono method, of class Persona.
     */
    @Test
    public void testSetpTelefono() {
        System.out.println("setpTelefono");
        String pTelefono = "";
        Persona instance = new Persona();
        instance.setpTelefono(pTelefono);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getpDireccion method, of class Persona.
     */
    @Test
    public void testGetpDireccion() {
        System.out.println("getpDireccion");
        String expResult = "Av. Loja";
        String result = p1.getpDireccion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setpDireccion method, of class Persona.
     */
    @Test
    public void testSetpDireccion() {
        System.out.println("setpDireccion");
        String pDireccion = "";
        Persona instance = new Persona();
        instance.setpDireccion(pDireccion);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Persona.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = "Persona{pCodigo=1, pCedula=0703021287, pNombre=Jordan, pApellido=Murillo, pFechaNacimiento=Sun Jan 17 00:01:00 COT 1999, pTelefono=0980792708, pDireccion=Av. Loja}";
        String result = p1.toString();
        System.out.println(p1.toString());
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

}
