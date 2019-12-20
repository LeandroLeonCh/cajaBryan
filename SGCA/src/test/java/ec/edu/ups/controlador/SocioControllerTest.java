/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Socio;
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
public class SocioControllerTest {

    Socio socio1 = null;
    Socio socio2 = null;
    SocioController instance = null;

    public SocioControllerTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() throws ParseException {
        instance = new SocioController();
        DateFormat format = new SimpleDateFormat("dd/mm/yyyy"); // Creamos un formato de fecha
        Date fecha = format.parse("17/01/1999");
        Date fecha2 = format.parse("18/02/2000");
        Date fecha3 = format.parse("19/03/2001");
        socio1 = new Socio(1, "0703021287", "Jordan", "Murillo", fecha, "0980792708", "Av. Loja", "Activo", fecha3, 150.00);
        socio2 = new Socio(2, "0706148509", "Holger", "Espinoza", fecha2, "0994607375", "Av. Loja", "Activo", fecha3, 505.00);
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getSocioList method, of class SocioController.
     */
    @Test
    public void testGetSocioList() {
        System.out.println("getSocioList");
        instance.crearSocio(socio1);
        List<Socio> expResult = new ArrayList<>();
        expResult.add(socio1);
        List<Socio> result = instance.getSocioList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setSocioList method, of class SocioController.
     */
    @Test
    public void testSetSocioList() {
        System.out.println("setSocioList");
        List<Socio> socioList = null;
        SocioController instance = new SocioController();
        instance.setSocioList(socioList);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of crearSocio method, of class SocioController.
     */
    @Test
    public void testCrearSocio() {
        System.out.println("crearSocio");
        instance.crearSocio(socio1);
        instance.crearSocio(socio2);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of buscarSocio method, of class SocioController.
     */
    @Test
    public void testBuscarSocio() {
        System.out.println("buscarSocio");
        instance.crearSocio(socio1);
        String cedula = "0703021287";
        Socio expResult = socio1;
        Socio result = instance.buscarSocio(cedula);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of buscarSocio method, of class SocioController.
     */
    @Test
    public void testBuscarSocio1() {
        System.out.println("buscarSocio");
        instance.crearSocio(socio1);
        String cedula = "";
        Socio expResult = null;
        Socio result = instance.buscarSocio(cedula);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of buscarSocio method, of class SocioController.
     */
    @Test
    public void testBuscarSocio2() {
        System.out.println("buscarSocio");
        String cedula = "";
        Socio expResult = null;
        Socio result = instance.buscarSocio(cedula);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarSocio method, of class SocioController.
     */
    @Test
    public void testEliminarSocio() {
        System.out.println("eliminarSocio");
        instance.crearSocio(socio2);
        String cedula = "0706148509";
        boolean expResult = true;
        boolean result = instance.eliminarSocio(cedula);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarSocio method, of class SocioController.
     */
    @Test
    public void testEliminarSocio1() {
        System.out.println("eliminarSocio");
        String cedula = "0706148509";
        boolean expResult = false;
        boolean result = instance.eliminarSocio(cedula);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarSocio method, of class SocioController.
     */
    @Test
    public void testEliminarSocio2() {
        System.out.println("eliminarSocio");
        instance.crearSocio(socio1);
        String cedula = "0706148509";
        boolean expResult = false;
        boolean result = instance.eliminarSocio(cedula);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of actualizarSocio method, of class SocioController.
     */
    @Test
    public void testActualizarSocio() {
        System.out.println("actualizarSocio");
        instance.crearSocio(socio1);
        String cedula = "0703021287";
        Socio socio = socio1;
        socio.setpNombre("Jordan Fernando");
        socio.setpApellido("Murillo Valarezo");
        boolean expResult = true;
        boolean result = instance.actualizarSocio(cedula, socio1);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of actualizarSocio method, of class SocioController.
     */
    @Test
    public void testActualizarSocio1() {
        System.out.println("actualizarSocio");
        instance.crearSocio(socio1);
        String cedula = "0706148509";
        Socio socio = socio1;
        socio.setpNombre("Jordan Fernando");
        socio.setpApellido("Murillo Valarezo");
        boolean expResult = false;
        boolean result = instance.actualizarSocio(cedula, socio1);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of actualizarSocio method, of class SocioController.
     */
    @Test
    public void testActualizarSocio2() {
        System.out.println("actualizarSocio");
        String cedula = "0706148509";
        Socio socio = socio1;
        socio.setpNombre("Jordan Fernando");
        socio.setpApellido("Murillo Valarezo");
        boolean expResult = false;
        boolean result = instance.actualizarSocio(cedula, socio1);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
