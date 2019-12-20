/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Agencia;
import java.util.ArrayList;
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
public class AgenciaControllerTest {

    Agencia agencia1 = null;
    Agencia agencia2 = null;
    AgenciaController instance = null;

    public AgenciaControllerTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        instance = new AgenciaController();
        agencia1 = new Agencia(1, "Cooperativa SGCA", "Cuenca", "0981241115", "Matriz");
        agencia2 = new Agencia(1, "Cooperativa HOLA", "Pinas", "0989224223", "Sucursal");
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getAgenciaList method, of class AgenciaController.
     */
    @Test
    public void testGetAgenciaList() {
        System.out.println("getAgenciaList");
        instance.crearAgencia(agencia1);
        List<Agencia> expResult = new ArrayList<>();
        expResult.add(agencia1);
        List<Agencia> result = instance.getAgenciaList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setAgenciaList method, of class AgenciaController.
     */
    @Test
    public void testSetAgenciaList() {
        System.out.println("setAgenciaList");
        List<Agencia> agenciaList = null;
        AgenciaController instance = new AgenciaController();
        instance.setAgenciaList(agenciaList);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of crearAgencia method, of class AgenciaController.
     */
    @Test
    public void testCrearAgencia() {
        System.out.println("crearAgencia");
        instance.crearAgencia(agencia1);
        instance.crearAgencia(agencia2);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of buscarAgencia method, of class AgenciaController.
     */
    @Test
    public void testBuscarAgencia() {
        System.out.println("buscarAgencia");
        instance.crearAgencia(agencia1);
        int codigo = 1;
        Agencia expResult = agencia1;
        Agencia result = instance.buscarAgencia(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of buscarAgencia method, of class AgenciaController.
     */
    @Test
    public void testBuscarAgencia1() {
        System.out.println("buscarAgencia");
        instance.crearAgencia(agencia1);
        int codigo = 0;
        Agencia expResult = null;
        Agencia result = instance.buscarAgencia(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of buscarAgencia method, of class AgenciaController.
     */
    @Test
    public void testBuscarAgencia2() {
        System.out.println("buscarAgencia");
        int codigo = 0;
        Agencia expResult = null;
        Agencia result = instance.buscarAgencia(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarAgencia method, of class AgenciaController.
     */
    @Test
    public void testEliminarAgencia() {
        System.out.println("eliminarAgencia");
        instance.crearAgencia(agencia2);
        int codigo = 1;
        boolean expResult = true;
        boolean result = instance.eliminarAgencia(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of eliminarAgencia method, of class AgenciaController.
     */
    @Test
    public void testEliminarAgencia1() {
        System.out.println("eliminarAgencia");
        int codigo = 2;
        boolean expResult = false;
        boolean result = instance.eliminarAgencia(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of eliminarAgencia method, of class AgenciaController.
     */
    @Test
    public void testEliminarAgencia2() {
        System.out.println("eliminarAgencia");
        instance.crearAgencia(agencia1);
        int codigo = 2;
        boolean expResult = false;
        boolean result = instance.eliminarAgencia(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of actualizarAgencia method, of class AgenciaController.
     */
    @Test
    public void testActualizarAgencia() {
        System.out.println("actualizarAgencia");
        instance.crearAgencia(agencia1);
        int codigo = 1;
        Agencia agencia = agencia1;
        agencia.setDireccion("Loja");
        boolean expResult = true;
        boolean result = instance.actualizarAgencia(codigo, agencia1);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of actualizarAgencia method, of class AgenciaController.
     */
    @Test
    public void testActualizarAgencia1() {
        System.out.println("actualizarAgencia");
        instance.crearAgencia(agencia1);
        int codigo = 2;
        Agencia agencia = agencia1;
        agencia.setDireccion("Loja");
        boolean expResult = false;
        boolean result = instance.actualizarAgencia(codigo, agencia1);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of actualizarAgencia method, of class AgenciaController.
     */
    @Test
    public void testActualizarAgencia2() {
        System.out.println("actualizarAgencia");
        int codigo = 2;
        Agencia agencia = agencia1;
        agencia.setDireccion("Loja");
        boolean expResult = false;
        boolean result = instance.actualizarAgencia(codigo, agencia1);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}
