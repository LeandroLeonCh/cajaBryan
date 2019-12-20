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
 * @author Starman
 */
public class EmpleadoTest {

    private Empleado empleado;

    public EmpleadoTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() throws ParseException {
        DateFormat format = new SimpleDateFormat("dd/mm/yyyy"); // Creamos un formato de fecha
        Date fecha = format.parse("25/03/1995");
        Date fechaIngreso = format.parse("15/10/2019");
        empleado = new Empleado(1, "0104796230", "Xavier", "Jarro", fecha, "0983037178", "El Cebollar", "cajero", "activo", fechaIngreso, 650.44);
        empleado.toString();

    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getCargo method, of class Empleado.
     */
    @Test
    public void testGetCargo() {
        System.out.println("getCargo");
        String expResult = "cajero";
        String result = empleado.getCargo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of setCargo method, of class Empleado.
     */
    @Test
    public void testSetCargo() {
        System.out.println("setCargo");
        String cargo = "";
        Empleado instance = new Empleado();
        instance.setCargo(cargo);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getEstado method, of class Empleado.
     */
    @Test
    public void testGetEstado() {
        System.out.println("getEstado");
        String expResult = "activo";
        String result = empleado.getEstado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setEstado method, of class Empleado.
     */
    @Test
    public void testSetEstado() {
        System.out.println("setEstado");
        String estado = "";
        Empleado instance = new Empleado();
        instance.setEstado(estado);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getFechaIngreso method, of class Empleado.
     */
    @Test
    public void testGetFechaIngreso() {
        System.out.println("getFechaIngreso");
        DateFormat format = new SimpleDateFormat("dd/mm/yyyy"); // Creamos un formato de fecha
        Date expResult = null;
        try {
            expResult = format.parse("15/10/2019");
        } catch (ParseException ex) {
            Logger.getLogger(PersonaTest.class.getName()).log(Level.SEVERE, null, ex);
        }

        Date result = empleado.getFechaIngreso();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setFechaIngreso method, of class Empleado.
     */
    @Test
    public void testSetFechaIngreso() {
        System.out.println("setFechaIngreso");
        Date fechaIngreso = null;
        Empleado instance = new Empleado();
        instance.setFechaIngreso(fechaIngreso);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getSueldo method, of class Empleado.
     */
    @Test
    public void testGetSueldo() {
        System.out.println("getSueldo");
        double expResult = 650.44;
        double result = empleado.getSueldo();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setSueldo method, of class Empleado.
     */
    @Test
    public void testSetSueldo() {
        System.out.println("setSueldo");
        double sueldo = 0.0;
        Empleado instance = new Empleado();
        instance.setSueldo(sueldo);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Empleado.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = "Empleado{cargo=cajero, estado=activo, fechaIngreso=Tue Jan 15 00:10:00 COT 2019, sueldo=650.44}";
        String result = empleado.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}
