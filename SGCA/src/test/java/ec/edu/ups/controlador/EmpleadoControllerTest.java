/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Empleado;
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
 * @author Starman
 */
public class EmpleadoControllerTest {

    private EmpleadoController empleadoController;
    private Empleado empleado1;
    private Empleado empleado2;

    public EmpleadoControllerTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() throws ParseException {
        empleadoController = new EmpleadoController();

        DateFormat format = new SimpleDateFormat("dd/mm/yyyy"); // Creamos un formato de fecha
        Date fecha = format.parse("25/03/1995");
        Date fechaIngreso = format.parse("15/10/2019");
        empleado1 = new Empleado(1, "0104796230", "Xavier", "Jarro", fecha, "0983037178", "El Cebollar", "cajero", "activo", fechaIngreso, 650.44);
        empleado2 = new Empleado(2, "0104796233", "Jordan", "Murillo", fecha, "0983037178", "El Cebollar", "cajero", "activo", fechaIngreso, 650.44);

    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getEmpleadoList method, of class EmpleadoController.
     */
    @Test
    public void testGetEmpleadoList() {
        System.out.println("getEmpleadoList");
        empleadoController.crearEmpleado(empleado1);
        List<Empleado> expResult = new ArrayList<>();
        expResult.add(empleado1);
        List<Empleado> result = empleadoController.getEmpleadoList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setEmpleadoList method, of class EmpleadoController.
     */
    @Test
    public void testSetEmpleadoList() {
        System.out.println("setEmpleadoList");
        List<Empleado> empleadoList = null;
        EmpleadoController instance = new EmpleadoController();
        instance.setEmpleadoList(empleadoList);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of crearEmpleado method, of class EmpleadoController.
     */
    @Test
    public void testCrearEmpleado() {
        System.out.println("crearEmpleado");
        empleadoController.crearEmpleado(empleado1);
        empleadoController.crearEmpleado(empleado2);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of buscarEmpleado method, of class EmpleadoController.
     */
    @Test
    public void testBuscarEmpleado() {
        System.out.println("buscarEmpleado");
        empleadoController.crearEmpleado(empleado1);
        String cedula = "0104796230";
        Empleado expResult = empleado1;
        Empleado result = empleadoController.buscarEmpleado(cedula);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of buscarEmpleado method, of class EmpleadoController.
     */
    @Test
    public void testBuscarEmpleado2() {
        System.out.println("buscarEmpleado");
        empleadoController.crearEmpleado(empleado1);
        String cedula = "";
        Empleado expResult = null;
        Empleado result = empleadoController.buscarEmpleado(cedula);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of buscarEmpleado method, of class EmpleadoController.
     */
    @Test
    public void testBuscarEmpleado3() {
        System.out.println("buscarEmpleado");
        String cedula = "";
        Empleado expResult = null;
        Empleado result = empleadoController.buscarEmpleado(cedula);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarEmpleado method, of class EmpleadoController.
     */
    @Test
    public void testEliminarEmpleado() {
        System.out.println("eliminarEmpleado");
        empleadoController.crearEmpleado(empleado1);
        String cedula = "0104796230";
        boolean expResult = true;
        boolean result = empleadoController.eliminarEmpleado(cedula);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarEmpleado method, of class EmpleadoController.
     */
    @Test
    public void testEliminarEmpleado2() {
        System.out.println("eliminarEmpleado");
        String cedula = "0104796230";
        boolean expResult = false;
        boolean result = empleadoController.eliminarEmpleado(cedula);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarEmpleado method, of class EmpleadoController.
     */
    @Test
    public void testEliminarEmpleado3() {
        System.out.println("eliminarEmpleado");
        empleadoController.crearEmpleado(empleado1);
        String cedula = "";
        boolean expResult = false;
        boolean result = empleadoController.eliminarEmpleado(cedula);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of actualizarEmpleado method, of class EmpleadoController.
     */
    @Test
    public void testActualizarEmpleado() {
        System.out.println("actualizarEmpleado");

        empleadoController.crearEmpleado(empleado1);
        String cedula = "0104796230";
        Empleado empleado = empleado1;
        empleado.setCargo("cocinero");
        boolean expResult = true;
        boolean result = empleadoController.actualizarEmpleado(cedula, empleado);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of actualizarEmpleado method, of class EmpleadoController.
     */
    @Test
    public void testActualizarEmpleado2() {
        System.out.println("actualizarEmpleado");

        empleadoController.crearEmpleado(empleado1);
        String cedula = "0104796233";
        Empleado empleado = empleado1;
        empleado.setCargo("cocinero");
        boolean expResult = false;
        boolean result = empleadoController.actualizarEmpleado(cedula, empleado);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of actualizarEmpleado method, of class EmpleadoController.
     */
    @Test
    public void testActualizarEmpleado3() {
        System.out.println("actualizarEmpleado");

        empleadoController.crearEmpleado(empleado1);
        String cedula = "0104796233";
        Empleado empleado = empleado1;
        empleado.setCargo("cocinero");
        boolean expResult = false;
        boolean result = empleadoController.actualizarEmpleado(cedula, empleado);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}
