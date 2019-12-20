/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.DetalleAhorro;
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
public class DetalleAhorroControllerTest {
    
    public DetalleAhorroControllerTest() {
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
     * Test of crear method, of class DetalleAhorroController.
     */
    @Test
    public void testCrear() {
        System.out.println("crear");
        DetalleAhorro detalleAhorro = null;
        DetalleAhorroController instance = new DetalleAhorroController();
        instance.crear(detalleAhorro);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscar method, of class DetalleAhorroController.
     */
    @Test
    public void testBuscar() {
        System.out.println("buscar");
        int codigo = 0;
        DetalleAhorroController instance = new DetalleAhorroController();
        DetalleAhorro expResult = null;
        DetalleAhorro result = instance.buscar(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminar method, of class DetalleAhorroController.
     */
    @Test
    public void testEliminar() {
        System.out.println("eliminar");
        int codigo = 0;
        DetalleAhorroController instance = new DetalleAhorroController();
        boolean expResult = false;
        boolean result = instance.eliminar(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of actualizar method, of class DetalleAhorroController.
     */
    @Test
    public void testActualizar() {
        System.out.println("actualizar");
        int codigo = 0;
        DetalleAhorro detalleAhorro = null;
        DetalleAhorroController instance = new DetalleAhorroController();
        instance.actualizar(codigo, detalleAhorro);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDetalleAhorroList method, of class DetalleAhorroController.
     */
    @Test
    public void testGetDetalleAhorroList() {
        System.out.println("getDetalleAhorroList");
        DetalleAhorroController instance = new DetalleAhorroController();
        List<DetalleAhorro> expResult = null;
        List<DetalleAhorro> result = instance.getDetalleAhorroList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDetalleAhorroList method, of class DetalleAhorroController.
     */
    @Test
    public void testSetDetalleAhorroList() {
        System.out.println("setDetalleAhorroList");
        List<DetalleAhorro> detalleAhorroList = null;
        DetalleAhorroController instance = new DetalleAhorroController();
        instance.setDetalleAhorroList(detalleAhorroList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
