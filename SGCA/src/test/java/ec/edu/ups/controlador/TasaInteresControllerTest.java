/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.TasaInteres;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ISMAEL
 */
public class TasaInteresControllerTest {
    
    TasaInteres tasaInteres1 = null;
    TasaInteresController instance = null;
    
    public TasaInteresControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new TasaInteresController();
        tasaInteres1 = new TasaInteres(1, "Plazo fijo", "mensual", 0.12);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getListTasaInteres method, of class TasaInteresController.
     */
    @Test
    public void testGetListTasaInteres() {
        System.out.println("getListTasaInteres");
        instance.crear(tasaInteres1);
        List<TasaInteres> expResult = new ArrayList<>();
        expResult.add(tasaInteres1);
        List<TasaInteres> result = instance.getListTasaInteres();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setListTasaInteres method, of class TasaInteresController.
     */
    @Test
    public void testSetListTasaInteres() {
        System.out.println("setListTasaInteres");
        List<TasaInteres> listTasaInteres = null;
        TasaInteresController instance = new TasaInteresController();
        instance.setListTasaInteres(listTasaInteres);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of crear method, of class TasaInteresController.
     */
    @Test
    public void testCrear() {
        System.out.println("crear");
        instance.crear(tasaInteres1);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of buscar method, of class TasaInteresController.
     */
    @Test
    public void testBuscar() {
        System.out.println("buscar");
        instance.crear(tasaInteres1);
        int codigo = 1;
        TasaInteres expResult = tasaInteres1;
        TasaInteres result = instance.buscar(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of eliminar method, of class TasaInteresController.
     */
    @Test
    public void testEliminar() {
        System.out.println("eliminar");
        instance.crear(tasaInteres1);
        int codigo = 1;
        boolean expResult = false;
        boolean result = instance.eliminar(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of actualizar method, of class TasaInteresController.
     */
    @Test
    public void testActualizar() {
        System.out.println("actualizar");
        instance.crear(tasaInteres1);
        int codigo = 1;
        TasaInteres tasaInteres = tasaInteres1;
        tasaInteres.setPorcentaje(0.10);
        boolean expResult = false;
        boolean result = instance.actualizar(codigo, tasaInteres);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
