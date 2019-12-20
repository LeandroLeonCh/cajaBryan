/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Ahorro;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jordan
 */
public class AhorroControllerTest {
    
    public AhorroControllerTest() {
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
     * Test of crear method, of class AhorroController.
     */
    @Test
    public void testCrear() {
        System.out.println("crear");
        Ahorro ahorro = null;
        AhorroController instance = new AhorroController();
        instance.crear(ahorro);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of buscar method, of class AhorroController.
     */
    @Test
    public void testBuscar() {
        System.out.println("buscar");
        int codigo = 0;
        AhorroController instance = new AhorroController();
        Ahorro expResult = null;
        Ahorro result = instance.buscar(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of eliminar method, of class AhorroController.
     */
    @Test
    public void testEliminar() {
        System.out.println("eliminar");
        int codigo = 0;
        AhorroController instance = new AhorroController();
        boolean expResult = false;
        boolean result = instance.eliminar(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of actualizar method, of class AhorroController.
     */
    @Test
    public void testActualizar() {
        System.out.println("actualizar");
        Ahorro ahorro = null;
        AhorroController instance = new AhorroController();
        boolean expResult = false;
        boolean result = instance.actualizar(ahorro);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAhorroList method, of class AhorroController.
     */
    @Test
    public void testGetAhorroList() {
        System.out.println("getAhorroList");
        AhorroController instance = new AhorroController();
        List<Ahorro> expResult = null;
        List<Ahorro> result = instance.getAhorroList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setAhorroList method, of class AhorroController.
     */
    @Test
    public void testSetAhorroList() {
        System.out.println("setAhorroList");
        List<Ahorro> ahorroList = null;
        AhorroController instance = new AhorroController();
        instance.setAhorroList(ahorroList);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
