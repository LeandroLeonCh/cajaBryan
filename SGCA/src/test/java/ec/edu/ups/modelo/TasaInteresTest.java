/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

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
public class TasaInteresTest {

    private TasaInteres tasaInteres;

    public TasaInteresTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        tasaInteres = new TasaInteres(1, "casa", "55", 0.08);
        System.out.println(tasaInteres);
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getCodigo method, of class TasaInteres.
     */
    @Test
    public void testGetCodigo() {
        System.out.println("getCodigo");
        int expResult = 1;
        int result = tasaInteres.getCodigo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCodigo method, of class TasaInteres.
     */
    @Test
    public void testSetCodigo() {
        System.out.println("setCodigo");
        int codigo = 0;
        TasaInteres instance = new TasaInteres();
        instance.setCodigo(codigo);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class TasaInteres.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        String expResult = "casa";
        String result = tasaInteres.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class TasaInteres.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        TasaInteres instance = new TasaInteres();
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPeriodo method, of class TasaInteres.
     */
    @Test
    public void testGetPeriodo() {
        System.out.println("getPeriodo");
        String expResult = "55";
        String result = tasaInteres.getPeriodo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setPeriodo method, of class TasaInteres.
     */
    @Test
    public void testSetPeriodo() {
        System.out.println("setPeriodo");
        String periodo = "";
        TasaInteres instance = new TasaInteres();
        instance.setPeriodo(periodo);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPorcentaje method, of class TasaInteres.
     */
    @Test
    public void testGetPorcentaje() {
        System.out.println("getPorcentaje");
        Double expResult = 0.08;
        Double result = tasaInteres.getPorcentaje();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setPorcentaje method, of class TasaInteres.
     */
    @Test
    public void testSetPorcentaje() {
        System.out.println("setPorcentaje");
        Double porcentaje = null;
        TasaInteres instance = new TasaInteres();
        instance.setPorcentaje(porcentaje);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class TasaInteres.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = "TasaInteres{codigo=1, nombre=casa, periodo=55, porcentaje=0.08}";
        String result = tasaInteres.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}
