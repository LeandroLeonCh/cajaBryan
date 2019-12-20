/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.SolicitudCredito;
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
public class SolicitudCreditoControllerTest {
    
    SolicitudCredito solicitud1 = null;
    SolicitudCreditoController instance = null;
    
    public SolicitudCreditoControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() throws ParseException {
        instance = new SolicitudCreditoController();
        DateFormat format = new SimpleDateFormat("dd/mm/yyyy"); // Creamos un formato de fecha
        Date fecha = format.parse("17/01/2018");
        solicitud1 = new SolicitudCredito(1, 300.0, "En proceso", fecha, "Cersar Vazquez", 1000.0, "Arriendo", "NOse");
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getListSolicitudCredito method, of class SolicitudCreditoController.
     */
    @Test
    public void testGetListSolicitudCredito() {
        System.out.println("getListSolicitudCredito");
        instance.crear(solicitud1);
        List<SolicitudCredito> expResult = new ArrayList<>();
        expResult.add(solicitud1);
        List<SolicitudCredito> result = instance.getListSolicitudCredito();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setListSolicitudCredito method, of class SolicitudCreditoController.
     */
    @Test
    public void testSetListSolicitudCredito() {
        System.out.println("setListSolicitudCredito");
        List<SolicitudCredito> listSolicitudCredito = null;
        SolicitudCreditoController instance = new SolicitudCreditoController();
        instance.setListSolicitudCredito(listSolicitudCredito);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of crear method, of class SolicitudCreditoController.
     */
    @Test
    public void testCrear() {
        System.out.println("crear");
        instance.crear(solicitud1);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of buscar method, of class SolicitudCreditoController.
     */
    @Test
    public void testBuscar() {
        System.out.println("buscar");
        instance.crear(solicitud1);
        int codigo = 1;
        SolicitudCredito expResult = solicitud1;
        SolicitudCredito result = instance.buscar(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of eliminar method, of class SolicitudCreditoController.
     */
    @Test
    public void testEliminar() {
        System.out.println("eliminar");
        instance.crear(solicitud1);
        int codigo = 1;
        boolean expResult = false;
        boolean result = instance.eliminar(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of actualizar method, of class SolicitudCreditoController.
     */
    @Test
    public void testActualizar() {
        System.out.println("actualizar");
        instance.crear(solicitud1);
        int codigo = 1;
        SolicitudCredito solicitudCredito = solicitud1;
        solicitudCredito.setEstado("Aprobado");
        boolean expResult = false;
        boolean result = instance.actualizar(codigo, solicitudCredito);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
