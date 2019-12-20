/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.DetalleAhorro;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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

    DetalleAhorro deta1 = null;
    DetalleAhorro deta2 = null;
    DetalleAhorroController instance = null;

    public DetalleAhorroControllerTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() throws ParseException {
        instance = new DetalleAhorroController();
        DateFormat format = new SimpleDateFormat("dd/mm/yyyy"); // Creamos un formato de fecha
        Date fecha = format.parse("17/01/2018");
        Date fecha2 = format.parse("18/02/2017");
        deta1 = new DetalleAhorro(1, fecha, 54.5, 500.00);
        deta2 = new DetalleAhorro(2, fecha2, 25.00, 100.00);
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of crearDetalleAhorro method, of class DetalleAhorroController.
     */
    @Test
    public void testCrear() {
        System.out.println("crear");
        instance.crearDetalleAhorro(deta1);
        instance.crearDetalleAhorro(deta2);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of buscarDetalleAhorro method, of class DetalleAhorroController.
     */
    @Test
    public void testBuscar() {
        System.out.println("buscar");
        instance.crearDetalleAhorro(deta1);
        int codigo = 1;
        DetalleAhorro expResult = deta1;
        DetalleAhorro result = instance.buscarDetalleAhorro(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of buscarDetalleAhorro method, of class DetalleAhorroController.
     */
    @Test
    public void testBuscar1() {
        System.out.println("buscar");
        instance.crearDetalleAhorro(deta1);
        int codigo = 0;
        DetalleAhorro expResult = null;
        DetalleAhorro result = instance.buscarDetalleAhorro(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of buscarDetalleAhorro method, of class DetalleAhorroController.
     */
    @Test
    public void testBuscar2() {
        System.out.println("buscar");
        int codigo = 0;
        DetalleAhorro expResult = null;
        DetalleAhorro result = instance.buscarDetalleAhorro(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarDetalleAhorro method, of class DetalleAhorroController.
     */
    @Test
    public void testEliminar() {
        System.out.println("eliminar");
        instance.crearDetalleAhorro(deta2);
        int codigo = 2;
        boolean expResult = true;
        boolean result = instance.eliminarDetalleAhorro(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarDetalleAhorro method, of class DetalleAhorroController.
     */
    @Test
    public void testEliminar1() {
        System.out.println("eliminar");
        int codigo = 2;
        boolean expResult = false;
        boolean result = instance.eliminarDetalleAhorro(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarDetalleAhorro method, of class DetalleAhorroController.
     */
    @Test
    public void testEliminar2() {
        System.out.println("eliminar");
        instance.crearDetalleAhorro(deta1);
        int codigo = 2;
        boolean expResult = false;
        boolean result = instance.eliminarDetalleAhorro(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of actualizarDetalleAhorro method, of class DetalleAhorroController.
     */
    @Test
    public void testActualizar() {
        System.out.println("actualizar");
        instance.crearDetalleAhorro(deta1);
        int codigo = 1;
        DetalleAhorro detalleAhorro = deta1;
        detalleAhorro.setSaldo(400.0);
        boolean expResult = true;
        boolean result = instance.actualizarDetalleAhorro(codigo, detalleAhorro);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of actualizarDetalleAhorro method, of class DetalleAhorroController.
     */
    @Test
    public void testActualizar1() {
        System.out.println("actualizar");
        instance.crearDetalleAhorro(deta1);
        int codigo = 2;
        DetalleAhorro detalleAhorro = deta1;
        detalleAhorro.setSaldo(400.0);
        boolean expResult = false;
        boolean result = instance.actualizarDetalleAhorro(codigo, detalleAhorro);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of actualizarDetalleAhorro method, of class DetalleAhorroController.
     */
    @Test
    public void testActualizar2() {
        System.out.println("actualizar");
        int codigo = 2;
        DetalleAhorro detalleAhorro = deta1;
        detalleAhorro.setSaldo(400.0);
        boolean expResult = false;
        boolean result = instance.actualizarDetalleAhorro(codigo, detalleAhorro);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of getDetalleAhorroList method, of class DetalleAhorroController.
     */
    @Test
    public void testGetDetalleAhorroList() {
        System.out.println("getDetalleAhorroList");
        instance.crearDetalleAhorro(deta1);
        List<DetalleAhorro> expResult = new ArrayList<>();
        expResult.add(deta1);
        List<DetalleAhorro> result = instance.getDetalleAhorroList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
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
        //fail("The test case is a prototype.");
    }

}
