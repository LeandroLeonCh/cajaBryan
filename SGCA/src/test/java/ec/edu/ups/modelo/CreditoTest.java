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
public class CreditoTest {
    
    private Credito credito;
    private Socio socio;
    private TasaInteres tasaInteres;
    
    public CreditoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() throws ParseException{
        DateFormat format = new SimpleDateFormat("dd/mm/yyyy"); // Creamos un fomato de fecha
        Date fechaInicio = format.parse("01/01/2018");
        System.out.println(fechaInicio);
        Date fechaFin = format.parse("01/01/2019");
        Date fechaN = format.parse("20/04/1994");
        Date fechaI = format.parse("10/01/2016");
        
        socio = new Socio(1, "0703021287", "Jordan", "Murillo", fechaN, "0980792708", "Av. Loja", "Activo", fechaI, 12.666);
        tasaInteres = new TasaInteres(1, "Tasa 1", "2019", 0.40);
        
        credito = new Credito(1, "Casa", fechaInicio, fechaFin, 100.99, 365, 100.00, socio, tasaInteres );
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
        int expResult = 1;
        int result = credito.getCodigo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
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
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDetalle method, of class Credito.
     */
    @Test
    public void testGetDetalle() {
        System.out.println("getDetalle");
        String expResult = "Casa";
        String result = credito.getDetalle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
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
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getFechaInicio method, of class Credito.
     */
    @Test
    public void testGetFechaInicio() {
        System.out.println("getFechaInicio");
        DateFormat format = new SimpleDateFormat("dd/mm/yyyy"); // Creamos un formato de fecha
        Date expResult = null;
        try {
            expResult = format.parse("01/01/2018");
        } catch (ParseException ex) {
            Logger.getLogger(PersonaTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        Date result = credito.getFechaInicio();
        System.out.println("result " + result);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
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
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getFechaFin method, of class Credito.
     */
    @Test
    public void testGetFechaFin() {
        System.out.println("getFechaFin");
        DateFormat format = new SimpleDateFormat("dd/mm/yyyy"); // Creamos un formato de fecha
        Date expResult = null;
        try {
            expResult = format.parse("01/01/2019");
        } catch (ParseException ex) {
            Logger.getLogger(PersonaTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        Date result = credito.getFechaFin();
        System.out.println("result " + result);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
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
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getMonto method, of class Credito.
     */
    @Test
    public void testGetMonto() {
        System.out.println("getMonto");
        Double expResult = 100.99;
        Double result = credito.getMonto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
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
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTiempo method, of class Credito.
     */
    @Test
    public void testGetTiempo() {
        System.out.println("getTiempo");
        int expResult = 365;
        int result = credito.getTiempo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
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
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTipoEntrega method, of class Credito.
     */
    @Test
    public void testGetTipoEntrega() {
        System.out.println("getTipoEntrega");
        Double expResult = 100.00;
        Double result = credito.getTipoEntrega();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
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
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getSocio method, of class Credito.
     */
    @Test
    public void testGetSocio() {
        System.out.println("getSocio");
        Socio expResult = socio;
        Socio result = credito.getSocio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
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
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTasaInteres method, of class Credito.
     */
    @Test
    public void testGetTasaInteres() {
        System.out.println("getTasaInteres");
        TasaInteres expResult = tasaInteres;
        TasaInteres result = credito.getTasaInteres();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
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
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Credito.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = "Credito{codigo=1, detalle=Casa, fechaInicio=Mon Jan 01 00:01:00 COT 2018, fechaFin=Tue Jan 01 00:01:00 COT 2019, monto=100.99, tiempo=365, tipoEntrega=100.0, socio=Socio{estado=Activo, fechaIngreso=Sun Jan 10 00:01:00 COT 2016, monto=12.666}, tasaInteres=TasaInteres{codigo=1, nombre=Tasa 1, periodo=2019, porcentaje=0.4}}";
        String result = credito.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
