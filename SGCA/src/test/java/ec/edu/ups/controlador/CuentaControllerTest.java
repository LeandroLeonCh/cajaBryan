/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Cuenta;
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
 * @author USER
 */
public class CuentaControllerTest {
    Cuenta cuenta1 = null;
    Cuenta cuenta2 = null;
    Socio socio1 = null;
    Socio socio2 = null;
    CuentaController instance = null;
    
    public CuentaControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() throws ParseException {
        instance = new CuentaController();
        DateFormat format = new SimpleDateFormat("dd/mm/yyyy"); // Creamos un formato de fecha
        Date fechaR1 = format.parse("27/07/2017");
        Date fechaR2 = format.parse("07/07/2019");
        Date fechaN1 = format.parse("17/01/1999");
        Date fechaN2 = format.parse("18/02/2000");
        Date fechaI = format.parse("19/03/2001");
        
        socio1 = new Socio(1, "0703021287", "Jordan", "Murillo", fechaN1, "0980792708", "Av. Loja", "Activo", fechaI, 150.00);
        socio2 = new Socio(2, "0706148509", "Holger", "Espinoza", fechaN2, "0994607375", "Av. Loja", "Activo", fechaI, 505.00);
    
        
        cuenta1 = new Cuenta(1, "7890123456", fechaR1, "Activo", socio1);
        System.out.println(socio1);
        cuenta2 = new Cuenta(1, "1234567890", fechaR2, "Activo", socio2);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getCuentaList method, of class CuentaController.
     */
    @Test
    public void testGetCuentaList() {
        System.out.println("getCuentaList");
        instance.crearCuenta(cuenta1);
        List<Cuenta> expResult = new ArrayList<>();
        expResult.add(cuenta1);
        List<Cuenta> result = instance.getCuentaList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCuentaList method, of class CuentaController.
     */
    @Test
    public void testSetCuentaList() {
        System.out.println("setCuentaList");
        List<Cuenta> cuentaList = null;
        CuentaController instance = new CuentaController();
        instance.setCuentaList(cuentaList);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of crearCuenta method, of class CuentaController.
     */
    @Test
    public void testCrearCuenta() {
        System.out.println("crearCuenta");
        instance.crearCuenta(cuenta1);
        instance.crearCuenta(cuenta2);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of buscarCuenta method, of class CuentaController.
     */
    @Test
    public void testBuscarCuenta() {
        System.out.println("buscarCuenta");
        instance.crearCuenta(cuenta1);
        int codigo = 1;
        Cuenta expResult = cuenta1;
        Cuenta result = instance.buscarCuenta(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of buscarCuenta method, of class CuentaController.
     */
    @Test
    public void testBuscarCuenta1() {
        System.out.println("buscarCuenta");
        instance.crearCuenta(cuenta1);
        int codigo = 0;
        Cuenta expResult = null;
        Cuenta result = instance.buscarCuenta(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of buscarCuenta method, of class CuentaController.
     */
    @Test
    public void testBuscarCuenta2() {
        System.out.println("buscarCuenta");
        int codigo = 0;
        Cuenta expResult = null;
        Cuenta result = instance.buscarCuenta(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarCuenta method, of class CuentaController.
     */
    @Test
    public void testEliminarCuenta() {
        System.out.println("eliminarCuenta");
        instance.crearCuenta(cuenta2);
        int codigo = 1;
        boolean expResult = true;
        boolean result = instance.eliminarCuenta(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of eliminarCuenta method, of class CuentaController.
     */
    @Test
    public void testEliminarCuenta1() {
        System.out.println("eliminarCuenta");
        int codigo = 2;
        boolean expResult = false;
        boolean result = instance.eliminarCuenta(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of eliminarCuenta method, of class CuentaController.
     */
    @Test
    public void testEliminarCuenta2() {
        System.out.println("eliminarCuenta");
        instance.crearCuenta(cuenta1);
        int codigo = 2;
        boolean expResult = false;
        boolean result = instance.eliminarCuenta(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of actualizarCuenta method, of class CuentaController.
     */
    @Test
    public void testActualizarCuenta() {
        System.out.println("actualizarCuenta");
        instance.crearCuenta(cuenta1);
        int codigo = 1;
        Cuenta cuenta = cuenta1;
        cuenta.setEstado("Desactivada");
        boolean expResult = true;
        boolean result = instance.actualizarCuenta(codigo, cuenta1);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of actualizarCuenta method, of class CuentaController.
     */
    @Test
    public void testActualizarCuenta1() {
        System.out.println("actualizarCuenta");
        instance.crearCuenta(cuenta1);
        int codigo = 2;
        Cuenta cuenta = cuenta1;
        cuenta.setEstado("Desactivada");
        boolean expResult = false;
        boolean result = instance.actualizarCuenta(codigo, cuenta1);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of actualizarCuenta method, of class CuentaController.
     */
    @Test
    public void testActualizarCuenta2() {
        System.out.println("actualizarCuenta");
        int codigo = 2;
        Cuenta cuenta = cuenta1;
        cuenta.setEstado("Desactivada");
        boolean expResult = false;
        boolean result = instance.actualizarCuenta(codigo, cuenta1);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
