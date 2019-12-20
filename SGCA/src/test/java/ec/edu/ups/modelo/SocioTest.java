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
 * @author USER
 */
public class SocioTest {
    
    private Socio s1;
    
    public SocioTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() throws ParseException{
        DateFormat format = new SimpleDateFormat("dd/mm/yyyy");// Creamos un formato de fecha
        Date fechaN = format.parse("20/04/1994");
        System.err.println(fechaN);
        Date fechaI = format.parse("10/01/2016");
        System.err.println(fechaI);
        s1 = new Socio("Activo", fechaI, 12.666, 1, "0703021287", "Jordan", "Murillo", fechaN, "0980792708", "Av. Loja" );
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getEstado method, of class Socio.
     */
    @Test
    public void testGetEstado() {
        System.out.println("getEstado");
        String expResult = "Activo";
        String result = s1.getEstado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEstado method, of class Socio.
     */
    @Test
    public void testSetEstado() {
        System.out.println("setEstado");
        String estado = "";
        Socio instance = new Socio();
        instance.setEstado(estado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFechaIngreso method, of class Socio.
     */
    @Test
    public void testGetFechaIngreso() {
        System.out.println("getFechaIngreso");
        DateFormat format = new SimpleDateFormat("dd/mm/yyyy"); // Creamos un formato de fecha
        Date expResult = null;
        try {
            expResult = format.parse("10/01/2016");
        } catch (ParseException ex) {
            Logger.getLogger(PersonaTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        Date result = s1.getpFechaNacimiento();
        System.out.println("result " + result);
        assertEquals(expResult, result);
    }

    /**
     * Test of setFechaIngreso method, of class Socio.
     */
    @Test
    public void testSetFechaIngreso() {
        System.out.println("setFechaIngreso");
        Date fechaIngreso = null;
        Socio instance = new Socio();
        instance.setFechaIngreso(fechaIngreso);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMonto method, of class Socio.
     */
    @Test
    public void testGetMonto() {
        System.out.println("getMonto");
        double expResult = 12.666;
        double result = s1.getMonto();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMonto method, of class Socio.
     */
    @Test
    public void testSetMonto() {
        System.out.println("setMonto");
        double monto = 0.0;
        Socio instance = new Socio();
        instance.setMonto(monto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
