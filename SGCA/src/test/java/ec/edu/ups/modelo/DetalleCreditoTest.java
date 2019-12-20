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
public class DetalleCreditoTest {

    private DetalleCredito detalleCredito;

    public DetalleCreditoTest() {
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
        Date fechaCaducidad = format.parse("1/10/2023");

        detalleCredito = new DetalleCredito(1, 1600.0, fechaPago, 0.07, 130.0, fechaCaducidad, 1600.0, 1, 3, 360.0);
        System.out.println(detalleCredito);
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getCodigo method, of class DetalleCredito.
     */
    @Test
    public void testGetCodigo() {
        System.out.println("getCodigo");
        int expResult = 1;
        int result = detalleCredito.getCodigo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCodigo method, of class DetalleCredito.
     */
    @Test
    public void testSetCodigo() {
        System.out.println("setCodigo");
        int codigo = 0;
        DetalleCredito instance = new DetalleCredito();
        instance.setCodigo(codigo);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCapital method, of class DetalleCredito.
     */
    @Test
    public void testGetCapital() {
        System.out.println("getCapital");
        Double expResult = 1600.0;
        Double result = detalleCredito.getCapital();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCapital method, of class DetalleCredito.
     */
    @Test
    public void testSetCapital() {
        System.out.println("setCapital");
        Double capital = null;
        DetalleCredito instance = new DetalleCredito();
        instance.setCapital(capital);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getFechaPago method, of class DetalleCredito.
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
        Date result = detalleCredito.getFechaPago();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setFechaPago method, of class DetalleCredito.
     */
    @Test
    public void testSetFechaPago() {
        System.out.println("setFechaPago");
        Date fechaPago = null;
        DetalleCredito instance = new DetalleCredito();
        instance.setFechaPago(fechaPago);
        // TODO review the generated test code and remove the default call to fail.
        //ail("The test case is a prototype.");
    }

    /**
     * Test of getInteres method, of class DetalleCredito.
     */
    @Test
    public void testGetInteres() {
        System.out.println("getInteres");
        Double expResult = 0.07;
        Double result = detalleCredito.getInteres();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setInteres method, of class DetalleCredito.
     */
    @Test
    public void testSetInteres() {
        System.out.println("setInteres");
        Double interes = null;
        DetalleCredito instance = new DetalleCredito();
        instance.setInteres(interes);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCuota method, of class DetalleCredito.
     */
    @Test
    public void testGetCuota() {
        System.out.println("getCuota");
        Double expResult = 130.0;
        Double result = detalleCredito.getCuota();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCuota method, of class DetalleCredito.
     */
    @Test
    public void testSetCuota() {
        System.out.println("setCuota");
        Double cuota = null;
        DetalleCredito instance = new DetalleCredito();
        instance.setCuota(cuota);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getFechaCaducidad method, of class DetalleCredito.
     */
    @Test
    public void testGetFechaCaducidad() {
        System.out.println("getFechaCaducidad");
        DateFormat format = new SimpleDateFormat("dd/mm/yyyy"); // Creamos un formato de fecha
        Date expResult = null;
        try {
            expResult = format.parse("1/10/2023");
        } catch (ParseException ex) {
            Logger.getLogger(PersonaTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        Date result = detalleCredito.getFechaCaducidad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setFechaCaducidad method, of class DetalleCredito.
     */
    @Test
    public void testSetFechaCaducidad() {
        System.out.println("setFechaCaducidad");
        Date fechaCaducidad = null;
        DetalleCredito instance = new DetalleCredito();
        instance.setFechaCaducidad(fechaCaducidad);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getMontoMora method, of class DetalleCredito.
     */
    @Test
    public void testGetMontoMora() {
        System.out.println("getMontoMora");
        Double expResult = 1600.0;
        Double result = detalleCredito.getMontoMora();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setMontoMora method, of class DetalleCredito.
     */
    @Test
    public void testSetMontoMora() {
        System.out.println("setMontoMora");
        Double montoMora = null;
        DetalleCredito instance = new DetalleCredito();
        instance.setMontoMora(montoMora);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNumeroCuota method, of class DetalleCredito.
     */
    @Test
    public void testGetNumeroCuota() {
        System.out.println("getNumeroCuota");
        int expResult = 1;
        int result = detalleCredito.getNumeroCuota();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setNumeroCuota method, of class DetalleCredito.
     */
    @Test
    public void testSetNumeroCuota() {
        System.out.println("setNumeroCuota");
        int numeroCuota = 0;
        DetalleCredito instance = new DetalleCredito();
        instance.setNumeroCuota(numeroCuota);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNumeroDiasMora method, of class DetalleCredito.
     */
    @Test
    public void testGetNumeroDiasMora() {
        System.out.println("getNumeroDiasMora");
        int expResult = 3;
        int result = detalleCredito.getNumeroDiasMora();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setNumeroDiasMora method, of class DetalleCredito.
     */
    @Test
    public void testSetNumeroDiasMora() {
        System.out.println("setNumeroDiasMora");
        int numeroDiasMora = 0;
        DetalleCredito instance = new DetalleCredito();
        instance.setNumeroDiasMora(numeroDiasMora);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getSaldoCapital method, of class DetalleCredito.
     */
    @Test
    public void testGetSaldoCapital() {
        System.out.println("getSaldoCapital");
        Double expResult = 360.0;
        Double result = detalleCredito.getSaldoCapital();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setSaldoCapital method, of class DetalleCredito.
     */
    @Test
    public void testSetSaldoCapital() {
        System.out.println("setSaldoCapital");
        Double saldoCapital = null;
        DetalleCredito instance = new DetalleCredito();
        instance.setSaldoCapital(saldoCapital);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class DetalleCredito.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = "DetalleCredito{codigo=1, capital=1600.0, fechaPago=Tue Jan 01 00:10:00 COT 2019, interes=0.07, cuota=130.0, fechaCaducidad=Sun Jan 01 00:10:00 COT 2023, montoMora=1600.0, numeroCuota=1, numeroDiasMora=3, saldoCapital=360.0}";
        String result = detalleCredito.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}
