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
public class CuentaTest {
    
    private Cuenta c1;
    private Socio s1;
    public CuentaTest() {
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
        Date fecha = format.parse("25/07/2017");
        System.out.println(fecha);
        Date fechaN = format.parse("20/04/1994");
        System.err.println(fechaN);
        Date fechaI = format.parse("10/01/2016");
        System.err.println(fechaI);     
        s1 = new Socio("Activo", fechaI, 12.666, 1, "0703021287", "Jordan", "Murillo", fechaN, "0980792708", "Av. Loja" );
        c1 = new Cuenta(1, "789654321" , fecha, "Activo",s1);
        
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getCodigo method, of class Cuenta.
     */
    @Test
    public void testGetCodigo() {
        System.out.println("getCodigo");
        int expResult = 1;
        int result = c1.getCodigo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCodigo method, of class Cuenta.
     */
    @Test
    public void testSetCodigo() {
        System.out.println("setCodigo");
        int codigo = 0;
        Cuenta instance = new Cuenta();
        instance.setCodigo(codigo);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNumeroCuenta method, of class Cuenta.
     */
    @Test
    public void testGetNumeroCuenta() {
        System.out.println("getNumeroCuenta");
        String expResult = "789654321";
        String result = c1.getNumeroCuenta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setNumeroCuenta method, of class Cuenta.
     */
    @Test
    public void testSetNumeroCuenta() {
        System.out.println("setNumeroCuenta");
        String numeroCuenta = "";
        Cuenta instance = new Cuenta();
        instance.setNumeroCuenta(numeroCuenta);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getFechaRegistro method, of class Cuenta.
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
        Date result = c1.getFechaRegistro();
        System.out.println("result " + result);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setFechaRegistro method, of class Cuenta.
     */
    @Test
    public void testSetFechaRegistro() {
        System.out.println("setFechaRegistro");
        Date fechaRegistro = null;
        Cuenta instance = new Cuenta();
        instance.setFechaRegistro(fechaRegistro);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getEstado method, of class Cuenta.
     */
    @Test
    public void testGetEstado() {
        System.out.println("getEstado");
        String expResult = "Activo";
        String result = c1.getEstado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setEstado method, of class Cuenta.
     */
    @Test
    public void testSetEstado() {
        System.out.println("setEstado");
        String estado = "";
        Cuenta instance = new Cuenta();
        instance.setEstado(estado);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getSocio method, of class Cuenta.
     */
    @Test
    public void testGetSocio() {
        System.out.println("getSocio");
        Socio expResult = s1;
        Socio result = c1.getSocio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setSocio method, of class Cuenta.
     */
    @Test
    public void testSetSocio() {
        System.out.println("setSocio");
        Socio socio = null;
        Cuenta instance = new Cuenta();
        instance.setSocio(socio);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
