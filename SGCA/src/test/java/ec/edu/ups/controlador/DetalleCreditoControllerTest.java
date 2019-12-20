/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.DetalleCredito;
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
 * @author ISMAEL
 */
public class DetalleCreditoControllerTest {
    
    DetalleCredito det1 = null;
    DetalleCredito det2 = null;
    DetalleCreditoController instance = null;
    
    public DetalleCreditoControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() throws ParseException {
        instance = new DetalleCreditoController();
        DateFormat format = new SimpleDateFormat("dd/mm/yyyy"); // Creamos un formato de fecha
        Date fecha = format.parse("17/01/2018");
        Date fecha2 = format.parse("18/02/2017");
        det1 = new DetalleCredito(1, 2000.0, fecha, 100.0, 150.0, fecha2, 0.0, 1, 0, 1800.0);
        det2 = new DetalleCredito(2, 1000.0, fecha, 70.0, 100.0, fecha2, 0.0, 1, 0, 800.0);
        
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getListDetalleCredito method, of class DetalleCreditoController.
     */
    @Test
    public void testGetListDetalleCredito() {
        System.out.println("getListDetalleCredito");
        instance.crear(det1);
        List<DetalleCredito> expResult = new ArrayList<>();
        expResult.add(det1);
        List<DetalleCredito> result = instance.getListDetalleCredito();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setListDetalleCredito method, of class DetalleCreditoController.
     */
    @Test
    public void testSetListDetalleCredito() {
        System.out.println("setListDetalleCredito");
        List<DetalleCredito> listDetalleCredito = null;
        DetalleCreditoController instance = new DetalleCreditoController();
        instance.setListDetalleCredito(listDetalleCredito);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of crear method, of class DetalleCreditoController.
     */
    @Test
    public void testCrear() {
        System.out.println("crear");
        instance.crear(det1);
        instance.crear(det2);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of buscar method, of class DetalleCreditoController.
     */
    @Test
    public void testBuscar() {
        System.out.println("buscar");
        instance.crear(det1);
        int codigo = 1;
        DetalleCredito expResult = det1;
        DetalleCredito result = instance.buscar(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of buscar method, of class DetalleCreditoController.
     */
    @Test
    public void testBuscar1() {
        System.out.println("buscar");
        instance.crear(det1);
        int codigo = 0;
        DetalleCredito expResult = null;
        DetalleCredito result = instance.buscar(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of buscar method, of class DetalleCreditoController.
     */
    @Test
    public void testBuscar2() {
        System.out.println("buscar");
        int codigo = 0;
        DetalleCredito expResult = null;
        DetalleCredito result = instance.buscar(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of eliminar method, of class DetalleCreditoController.
     */
    @Test
    public void testEliminar() {
        System.out.println("eliminar");
        instance.crear(det2);
        int codigo = 2;
        boolean expResult = true;
        boolean result = instance.eliminar(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of eliminar method, of class DetalleCreditoController.
     */
    @Test
    public void testEliminar1() {
        System.out.println("eliminar");
        int codigo = 2;
        boolean expResult = false;
        boolean result = instance.eliminar(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of eliminar method, of class DetalleCreditoController.
     */
    @Test
    public void testEliminar2() {
        System.out.println("eliminar");
        int codigo = 2;
        boolean expResult = false;
        boolean result = instance.eliminar(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of actualizar method, of class DetalleCreditoController.
     */
    @Test
    public void testActualizar() {
        System.out.println("actualizar");
        instance.crear(det1);
        int codigo = 1;
        DetalleCredito detalleCredito = det1;
        detalleCredito.setCuota(80.0);
        boolean expResult = true;
        boolean result = instance.actualizar(codigo, detalleCredito);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of actualizar method, of class DetalleCreditoController.
     */
    @Test
    public void testActualizar1() {
        System.out.println("actualizar");
        instance.crear(det1);
        int codigo = 2;
        DetalleCredito detalleCredito = det1;
        detalleCredito.setCuota(80.0);
        boolean expResult = true;
        boolean result = instance.actualizar(codigo, detalleCredito);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of actualizar method, of class DetalleCreditoController.
     */
    @Test
    public void testActualizar2() {
        System.out.println("actualizar");
        int codigo = 2;
        DetalleCredito detalleCredito = det1;
        detalleCredito.setCuota(80.0);
        boolean expResult = false;
        boolean result = instance.actualizar(codigo, detalleCredito);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
