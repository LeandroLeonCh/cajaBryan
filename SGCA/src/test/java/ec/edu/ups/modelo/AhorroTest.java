/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
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
public class AhorroTest {
    
    private Ahorro ahorro;
    private Socio socio;
    private TasaInteres tasaInteres;
    private DetalleAhorro detalleAhorro;
    //private DetalleAhorro detalleAhorro2;
    private List<DetalleAhorro> listaDetalleAhorro;
    
    public AhorroTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() throws ParseException{
        listaDetalleAhorro = new ArrayList<>();
        DateFormat format = new SimpleDateFormat("dd/mm/yyyy"); // Creamos un fomato de fecha
        Date fecha = format.parse("25/07/2017");
        Date fechaN = format.parse("20/04/1994");
        Date fechaI = format.parse("10/01/2016");
        Date fechaP = format.parse("11/01/2016");
        
        detalleAhorro = new DetalleAhorro(1, fechaP, 0.02, 100.0 );
        listaDetalleAhorro.add(detalleAhorro);
        socio = new Socio("Activo", fechaI, 12.666, 1, "0703021287", "Jordan", "Murillo", fechaN, "0980792708", "Av. Loja" );
        tasaInteres = new TasaInteres(1, "Tasa 1", "2019", 0.40);
        
        ahorro = new Ahorro(1, "Activo", fecha, 769.78, socio, tasaInteres, listaDetalleAhorro);
        System.out.println(ahorro+"este es el sout de ahorro");
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getCodigo method, of class Ahorro.
     */
    @Test
    public void testGetCodigo() {
        System.out.println("getCodigo");
        int expResult = 1;
        int result = ahorro.getCodigo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCodigo method, of class Ahorro.
     */
    @Test
    public void testSetCodigo() {
        System.out.println("setCodigo");
        int codigo = 0;
        Ahorro instance = new Ahorro();
        instance.setCodigo(codigo);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getEstado method, of class Ahorro.
     */
    @Test
    public void testGetEstado() {
        System.out.println("getEstado");
        String expResult = "Activo";
        String result = ahorro.getEstado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setEstado method, of class Ahorro.
     */
    @Test
    public void testSetEstado() {
        System.out.println("setEstado");
        String estado = "";
        Ahorro instance = new Ahorro();
        instance.setEstado(estado);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getFechaRegistro method, of class Ahorro.
     */
    @Test
    public void testGetFechaRegistro() {
        System.out.println("getFechaRegistro");
        DateFormat format = new SimpleDateFormat("dd/mm/yyyy"); // Creamos un formato de fecha
        Date expResult = null;
        try {
            expResult = format.parse("25/07/2017");
        } catch (ParseException ex) {
            Logger.getLogger(PersonaTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        Date result = ahorro.getFechaRegistro();
        System.out.println("result " + result);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setFechaRegistro method, of class Ahorro.
     */
    @Test
    public void testSetFechaRegistro() {
        System.out.println("setFechaRegistro");
        Date fechaRegistro = null;
        Ahorro instance = new Ahorro();
        instance.setFechaRegistro(fechaRegistro);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getMonto method, of class Ahorro.
     */
    @Test
    public void testGetMonto() {
        System.out.println("getMonto");
        double expResult = 769.78;
        double result = ahorro.getMonto();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setMonto method, of class Ahorro.
     */
    @Test
    public void testSetMonto() {
        System.out.println("setMonto");
        double monto = 0.0;
        Ahorro instance = new Ahorro();
        instance.setMonto(monto);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getSocio method, of class Ahorro.
     */
    @Test
    public void testGetSocio() {
        System.out.println("getSocio");
        Socio expResult = socio;
        Socio result = ahorro.getSocio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setSocio method, of class Ahorro.
     */
    @Test
    public void testSetSocio() {
        System.out.println("setSocio");
        Socio socio = null;
        Ahorro instance = new Ahorro();
        instance.setSocio(socio);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTasaInteres method, of class Ahorro.
     */
    @Test
    public void testGetTasaInteres() {
        System.out.println("getTasaInteres");
        TasaInteres expResult = tasaInteres;
        TasaInteres result = ahorro.getTasaInteres();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setTasaInteres method, of class Ahorro.
     */
    @Test
    public void testSetTasaInteres() {
        System.out.println("setTasaInteres");
        TasaInteres tasaInteres = null;
        Ahorro instance = new Ahorro();
        instance.setTasaInteres(tasaInteres);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDetalleAhorro method, of class Ahorro.
     */
    @Test
    public void testGetDetalleAhorro() {
        System.out.println("getDetalleAhorro");
        List<DetalleAhorro> expResult = listaDetalleAhorro;
        List<DetalleAhorro> result = ahorro.getDetalleAhorro();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setDetalleAhorro method, of class Ahorro.
     */
    @Test
    public void testSetDetalleAhorro() {
        System.out.println("setDetalleAhorro");
        List<DetalleAhorro> detalleAhorro = null;
        Ahorro instance = new Ahorro();
        instance.setDetalleAhorro(detalleAhorro);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Ahorro.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = "Ahorro{codigo=1, estado=Activo, fechaRegistro=Wed Jan 25 00:07:00 COT 2017, monto=769.78, socio=Socio{estado=Activo, fechaIngreso=Sun Jan 10 00:01:00 COT 2016, monto=12.666}, tasaInteres=TasaInteres{codigo=1, nombre=Tasa 1, periodo=2019, porcentaje=0.4}, detalleAhorro=[DetalleAhorro{codigo=1, fechaPago=Mon Jan 11 00:01:00 COT 2016, interes=0.02, saldo=100.0}]}";
        String result = ahorro.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}

