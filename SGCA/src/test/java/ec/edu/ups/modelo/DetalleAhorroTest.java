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
 * @author Starman
 */
public class DetalleAhorroTest {

    private DetalleAhorro detalleAhorro;

    public DetalleAhorroTest() {
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
        Date fechaPago = format.parse("1/10/2019");
        detalleAhorro = new DetalleAhorro(1, fechaPago, 0.07, 600.0);
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getCodigo method, of class DetalleAhorro.
     */
    @Test
    public void testGetCodigo() {
        System.out.println("getCodigo");
        int expResult = 1;
        int result = detalleAhorro.getCodigo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCodigo method, of class DetalleAhorro.
     */
    @Test
    public void testSetCodigo() {
        System.out.println("setCodigo");
        int codigo = 0;
        DetalleAhorro instance = new DetalleAhorro();
        instance.setCodigo(codigo);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getFechaPago method, of class DetalleAhorro.
     */
    @Test
    public void testGetFechaPago() {
        System.out.println("getFechaPago");
        DateFormat format = new SimpleDateFormat("dd/mm/yyyy"); // Creamos un formato de fecha
        Date expResult = null;
        try {
            expResult = format.parse("1/10/2019");
        } catch (ParseException ex) {
            Logger.getLogger(PersonaTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        Date result = detalleAhorro.getFechaPago();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setFechaPago method, of class DetalleAhorro.
     */
    @Test
    public void testSetFechaPago() {
        System.out.println("setFechaPago");
        Date fechaPago = null;
        DetalleAhorro instance = new DetalleAhorro();
        instance.setFechaPago(fechaPago);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getInteres method, of class DetalleAhorro.
     */
    @Test
    public void testGetInteres() {
        System.out.println("getInteres");
        double expResult = 0.07;
        double result = detalleAhorro.getInteres();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setInteres method, of class DetalleAhorro.
     */
    @Test
    public void testSetInteres() {
        System.out.println("setInteres");
        double interes = 0.0;
        DetalleAhorro instance = new DetalleAhorro();
        instance.setInteres(interes);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of getSaldo method, of class DetalleAhorro.
     */
    @Test
    public void testGetSaldo() {
        System.out.println("getSaldo");
        double expResult = 600.0;
        double result = detalleAhorro.getSaldo();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of setSaldo method, of class DetalleAhorro.
     */
    @Test
    public void testSetSaldo() {
        System.out.println("setSaldo");
        double saldo = 0.0;
        DetalleAhorro instance = new DetalleAhorro();
        instance.setSaldo(saldo);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class DetalleAhorro.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = "DetalleAhorro{codigo=1, fechaPago=Tue Jan 01 00:10:00 COT 2019, interes=0.07, saldo=600.0}";
        String result = detalleAhorro.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

}
