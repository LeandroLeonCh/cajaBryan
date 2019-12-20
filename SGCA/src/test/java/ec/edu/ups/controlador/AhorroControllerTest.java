/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Ahorro;
import ec.edu.ups.modelo.DetalleAhorro;
import ec.edu.ups.modelo.Socio;
import ec.edu.ups.modelo.TasaInteres;
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
public class AhorroControllerTest {

    Ahorro ahorro1 = null;
    Ahorro ahorro2 = null;
    DetalleAhorro deta1 = null;
    DetalleAhorro deta2 = null;
    TasaInteres tasa1 = null;
    TasaInteres tasa2 = null;
    Socio socio1 = null;
    Socio socio2 = null;
    List<DetalleAhorro> detalleAhorroList = null;
    AhorroController instance = null;

    public AhorroControllerTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() throws ParseException {
        instance = new AhorroController();
        detalleAhorroList = new ArrayList<>();
        DateFormat format = new SimpleDateFormat("dd/mm/yyyy"); // Creamos un formato de fecha
        Date fecha = format.parse("17/01/2018");
        Date fecha2 = format.parse("18/02/2017");
        Date fecha3 = format.parse("20/12/2017");
        Date fecha4 = format.parse("21/12/2018");
        deta1 = new DetalleAhorro(1, fecha, 54.5, 500.00);
        deta2 = new DetalleAhorro(2, fecha2, 25.00, 100.00);
        tasa1 = new TasaInteres(1, "Tasa 1", "Mensual", 75.00);
        tasa2 = new TasaInteres(2, "Tasa 2", "Anual", 125.00);
        detalleAhorroList.add(deta1);
        detalleAhorroList.add(deta2);
        socio1 = new Socio(1, "0703021287", "Jordan", "Murillo", fecha, "0980792708", "Av. Loja", "Activo", fecha3, 150.00);
        socio2 = new Socio(2, "0706148509", "Holger", "Espinoza", fecha2, "0994607375", "Av. Loja", "Activo", fecha3, 505.00);
        ahorro1 = new Ahorro(1, "Activo", fecha3, 1000.00, socio1, tasa1, detalleAhorroList);
        ahorro2 = new Ahorro(2, "Activo", fecha4, 5000.00, socio2, tasa2, detalleAhorroList);
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of crearAhorro method, of class AhorroController.
     */
    @Test
    public void testCrear() {
        System.out.println("crear");
        instance.crearAhorro(ahorro1);
        instance.crearAhorro(ahorro2);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of buscarAhorro method, of class AhorroController.
     */
    @Test
    public void testBuscar() {
        System.out.println("buscar");
        instance.crearAhorro(ahorro1);
        int codigo = 1;
        Ahorro expResult = ahorro1;
        Ahorro result = instance.buscarAhorro(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of buscarAhorro method, of class AhorroController.
     */
    @Test
    public void testBuscar1() {
        System.out.println("buscar");
        instance.crearAhorro(ahorro1);
        int codigo = 2;
        Ahorro expResult = null;
        Ahorro result = instance.buscarAhorro(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of buscarAhorro method, of class AhorroController.
     */
    @Test
    public void testBuscar2() {
        System.out.println("buscar");
        instance.crearAhorro(ahorro1);
        int codigo = 2;
        Ahorro expResult = null;
        Ahorro result = instance.buscarAhorro(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarAhorro method, of class AhorroController.
     */
    @Test
    public void testEliminar() {
        System.out.println("eliminar");
        instance.crearAhorro(ahorro2);
        int codigo = 2;
        boolean expResult = true;
        boolean result = instance.eliminarAhorro(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
        /**
     * Test of eliminarAhorro method, of class AhorroController.
     */
    @Test
    public void testEliminar1() {
        System.out.println("eliminar");
        int codigo = 2;
        boolean expResult = false;
        boolean result = instance.eliminarAhorro(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
        /**
     * Test of eliminarAhorro method, of class AhorroController.
     */
    @Test
    public void testEliminar2() {
        System.out.println("eliminar");
        instance.crearAhorro(ahorro1);
        int codigo = 2;
        boolean expResult = false;
        boolean result = instance.eliminarAhorro(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of actualizarAhorro method, of class AhorroController.
     */
    @Test
    public void testActualizar() {
        System.out.println("actualizar");
        instance.crearAhorro(ahorro1);
        int codigo = 1;
        Ahorro ahorro = ahorro1;
        ahorro.setMonto(5000.00);
        boolean expResult = true;
        boolean result = instance.actualizarAhorro(codigo, ahorro);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of actualizarAhorro method, of class AhorroController.
     */
    @Test
    public void testActualizar1() {
        System.out.println("actualizar");
        instance.crearAhorro(ahorro1);
        int codigo = 2;
        Ahorro ahorro = ahorro1;
        ahorro.setMonto(5000.00);
        boolean expResult = false;
        boolean result = instance.actualizarAhorro(codigo, ahorro);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of actualizarAhorro method, of class AhorroController.
     */
    @Test
    public void testActualizar2() {
        System.out.println("actualizar");
        int codigo = 2;
        Ahorro ahorro = ahorro1;
        ahorro.setMonto(5000.00);
        boolean expResult = false;
        boolean result = instance.actualizarAhorro(codigo, ahorro);
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
        instance.crearAhorro(ahorro1);
        List<Ahorro> expResult = new ArrayList<>();
        expResult.add(ahorro1);
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
