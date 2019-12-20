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
public class SolicitudCreditoTest {

    private SolicitudCredito solicitudCredito;

    public SolicitudCreditoTest() {
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
        Date fechaRgistro = format.parse("1/10/2019");
        solicitudCredito = new SolicitudCredito(1, 80.0, "activo", fechaRgistro, "carro", 500.0, "casa", "prestamo");
        System.out.println(solicitudCredito);
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getCodigo method, of class SolicitudCredito.
     */
    @Test
    public void testGetCodigo() {
        System.out.println("getCodigo");
        int expResult = 1;
        int result = solicitudCredito.getCodigo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCodigo method, of class SolicitudCredito.
     */
    @Test
    public void testSetCodigo() {
        System.out.println("setCodigo");
        int codigo = 0;
        SolicitudCredito instance = new SolicitudCredito();
        instance.setCodigo(codigo);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getEgresos method, of class SolicitudCredito.
     */
    @Test
    public void testGetEgresos() {
        System.out.println("getEgresos");
        Double expResult = 80.0;
        Double result = solicitudCredito.getEgresos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setEgresos method, of class SolicitudCredito.
     */
    @Test
    public void testSetEgresos() {
        System.out.println("setEgresos");
        Double egresos = null;
        SolicitudCredito instance = new SolicitudCredito();
        instance.setEgresos(egresos);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of getEstado method, of class SolicitudCredito.
     */
    @Test
    public void testGetEstado() {
        System.out.println("getEstado");
        String expResult = "activo";
        String result = solicitudCredito.getEstado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setEstado method, of class SolicitudCredito.
     */
    @Test
    public void testSetEstado() {
        System.out.println("setEstado");
        String estado = "";
        SolicitudCredito instance = new SolicitudCredito();
        instance.setEstado(estado);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getFechaRegistro method, of class SolicitudCredito.
     */
    @Test
    public void testGetFechaRegistro() {
        System.out.println("getFechaRegistro");
        DateFormat format = new SimpleDateFormat("dd/mm/yyyy"); // Creamos un formato de fecha
        Date expResult = null;
        try {
            expResult = format.parse("1/10/2019");
        } catch (ParseException ex) {
            Logger.getLogger(PersonaTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        Date result = solicitudCredito.getFechaRegistro();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setFechaRegistro method, of class SolicitudCredito.
     */
    @Test
    public void testSetFechaRegistro() {
        System.out.println("setFechaRegistro");
        Date fechaRegistro = null;
        SolicitudCredito instance = new SolicitudCredito();
        instance.setFechaRegistro(fechaRegistro);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getGarantia method, of class SolicitudCredito.
     */
    @Test
    public void testGetGarantia() {
        System.out.println("getGarantia");
        String expResult = "carro";
        String result = solicitudCredito.getGarantia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setGarantia method, of class SolicitudCredito.
     */
    @Test
    public void testSetGarantia() {
        System.out.println("setGarantia");
        String garantia = "";
        SolicitudCredito instance = new SolicitudCredito();
        instance.setGarantia(garantia);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getIngresos method, of class SolicitudCredito.
     */
    @Test
    public void testGetIngresos() {
        System.out.println("getIngresos");
        Double expResult = 500.0;
        Double result = solicitudCredito.getIngresos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setIngresos method, of class SolicitudCredito.
     */
    @Test
    public void testSetIngresos() {
        System.out.println("setIngresos");
        Double ingresos = null;
        SolicitudCredito instance = new SolicitudCredito();
        instance.setIngresos(ingresos);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getProposito method, of class SolicitudCredito.
     */
    @Test
    public void testGetProposito() {
        System.out.println("getProposito");
        String expResult = "casa";
        String result = solicitudCredito.getProposito();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setProposito method, of class SolicitudCredito.
     */
    @Test
    public void testSetProposito() {
        System.out.println("setProposito");
        String proposito = "";
        SolicitudCredito instance = new SolicitudCredito();
        instance.setProposito(proposito);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTipo method, of class SolicitudCredito.
     */
    @Test
    public void testGetTipo() {
        System.out.println("getTipo");
        String expResult = "prestamo";
        String result = solicitudCredito.getTipo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setTipo method, of class SolicitudCredito.
     */
    @Test
    public void testSetTipo() {
        System.out.println("setTipo");
        String tipo = "";
        SolicitudCredito instance = new SolicitudCredito();
        instance.setTipo(tipo);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class solicitudCredito.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = "SolicitudCredito{codigo=1, egresos=80.0, estado=activo, fechaRegistro=Tue Jan 01 00:10:00 COT 2019, garantia=carro, ingresos=500.0, proposito=casa, tipo=prestamo}";
        String result = solicitudCredito.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}
