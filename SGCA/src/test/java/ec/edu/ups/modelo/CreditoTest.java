/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.util.Date;
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
public class CreditoTest {
    
    public CreditoTest() {
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
     * Test of getCodigo method, of class Credito.
     */
    @Test
    public void testGetCodigo() {
        System.out.println("getCodigo");
        Credito instance = new Credito();
        int expResult = 0;
        int result = instance.getCodigo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCodigo method, of class Credito.
     */
    @Test
    public void testSetCodigo() {
        System.out.println("setCodigo");
        int codigo = 0;
        Credito instance = new Credito();
        instance.setCodigo(codigo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDetalle method, of class Credito.
     */
    @Test
    public void testGetDetalle() {
        System.out.println("getDetalle");
        Credito instance = new Credito();
        String expResult = "";
        String result = instance.getDetalle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDetalle method, of class Credito.
     */
    @Test
    public void testSetDetalle() {
        System.out.println("setDetalle");
        String detalle = "";
        Credito instance = new Credito();
        instance.setDetalle(detalle);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFechaInicio method, of class Credito.
     */
    @Test
    public void testGetFechaInicio() {
        System.out.println("getFechaInicio");
        Credito instance = new Credito();
        Date expResult = null;
        Date result = instance.getFechaInicio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFechaInicio method, of class Credito.
     */
    @Test
    public void testSetFechaInicio() {
        System.out.println("setFechaInicio");
        Date fechaInicio = null;
        Credito instance = new Credito();
        instance.setFechaInicio(fechaInicio);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFechaFin method, of class Credito.
     */
    @Test
    public void testGetFechaFin() {
        System.out.println("getFechaFin");
        Credito instance = new Credito();
        Date expResult = null;
        Date result = instance.getFechaFin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFechaFin method, of class Credito.
     */
    @Test
    public void testSetFechaFin() {
        System.out.println("setFechaFin");
        Date fechaFin = null;
        Credito instance = new Credito();
        instance.setFechaFin(fechaFin);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMonto method, of class Credito.
     */
    @Test
    public void testGetMonto() {
        System.out.println("getMonto");
        Credito instance = new Credito();
        Double expResult = null;
        Double result = instance.getMonto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMonto method, of class Credito.
     */
    @Test
    public void testSetMonto() {
        System.out.println("setMonto");
        Double monto = null;
        Credito instance = new Credito();
        instance.setMonto(monto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTiempo method, of class Credito.
     */
    @Test
    public void testGetTiempo() {
        System.out.println("getTiempo");
        Credito instance = new Credito();
        int expResult = 0;
        int result = instance.getTiempo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTiempo method, of class Credito.
     */
    @Test
    public void testSetTiempo() {
        System.out.println("setTiempo");
        int tiempo = 0;
        Credito instance = new Credito();
        instance.setTiempo(tiempo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTipoEntrega method, of class Credito.
     */
    @Test
    public void testGetTipoEntrega() {
        System.out.println("getTipoEntrega");
        Credito instance = new Credito();
        Double expResult = null;
        Double result = instance.getTipoEntrega();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTipoEntrega method, of class Credito.
     */
    @Test
    public void testSetTipoEntrega() {
        System.out.println("setTipoEntrega");
        Double tipoEntrega = null;
        Credito instance = new Credito();
        instance.setTipoEntrega(tipoEntrega);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSocio method, of class Credito.
     */
    @Test
    public void testGetSocio() {
        System.out.println("getSocio");
        Credito instance = new Credito();
        Socio expResult = null;
        Socio result = instance.getSocio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSocio method, of class Credito.
     */
    @Test
    public void testSetSocio() {
        System.out.println("setSocio");
        Socio socio = null;
        Credito instance = new Credito();
        instance.setSocio(socio);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTasaInteres method, of class Credito.
     */
    @Test
    public void testGetTasaInteres() {
        System.out.println("getTasaInteres");
        Credito instance = new Credito();
        TasaInteres expResult = null;
        TasaInteres result = instance.getTasaInteres();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTasaInteres method, of class Credito.
     */
    @Test
    public void testSetTasaInteres() {
        System.out.println("setTasaInteres");
        TasaInteres tasaInteres = null;
        Credito instance = new Credito();
        instance.setTasaInteres(tasaInteres);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Credito.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Credito instance = new Credito();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
