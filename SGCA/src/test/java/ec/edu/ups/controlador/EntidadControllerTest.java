/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Agencia;
import ec.edu.ups.modelo.Entidad;
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
public class EntidadControllerTest {
    
    Entidad entidad1 = null;
    Entidad entidad2 = null;
    EntidadController instance = null;
    Agencia agencia = null;
    Agencia agencia1 = null;
    private List<Agencia> listaAgencia;
    
    public EntidadControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new EntidadController();
        listaAgencia = new ArrayList<>();
        
        agencia = new Agencia(1, "Cooperativa SGCA", "Gil Ramirez Davalos", "0981241115","N");
        listaAgencia.add(agencia);
        agencia1 = new Agencia(2, "Cooperativa hola", "Ramirez Davalos", "09812","N");
        listaAgencia.add(agencia1);
        
        entidad1 = new Entidad(1, "Cooperativa 1", "Hola", "0010705644110", listaAgencia );
        entidad2 = new Entidad(2, "Cooperativa 2", "Chao", "0010700334592", listaAgencia);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of crear method, of class EntidadController.
     */
    @Test
    public void testCrearEntidad() {
        System.out.println("crearEntidad");
        instance.crearEntidad(entidad1);
        instance.crearEntidad(entidad2);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of buscar method, of class EntidadController.
     */
    @Test
    public void testBuscarEntidad() {
        System.out.println("buscarEntidad");
        instance.crearEntidad(entidad1);
        int codigo = 1;
        Entidad expResult = entidad1;
        Entidad result = instance.buscarEntidad(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of buscar method, of class EntidadController.
     */
    
    @Test
    public void testBuscarEntidad1() {
        System.out.println("buscarEntidad");
        instance.crearEntidad(entidad1);
        int codigo = 0;
        Entidad expResult = null;
        Entidad result = instance.buscarEntidad(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of buscar method, of class EntidadController.
     */
    
    @Test
    public void testBuscarEntidad2() {
        System.out.println("buscarEntidad");
        int codigo = 0;
        Entidad expResult = null;
        Entidad result = instance.buscarEntidad(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of eliminar method, of class EntidadController.
     */
    @Test
    public void testEliminarEntidad() {
        System.out.println("eliminarEntidad");
        instance.crearEntidad(entidad2);
        int codigo = 2;
        boolean expResult = true;
        boolean result = instance.eliminarEntidad(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of eliminar method, of class EntidadController.
     */
    @Test
    public void testEliminarEntidad1() {
        System.out.println("eliminarEntidad");
        int codigo = 2;
        boolean expResult = false;
        boolean result = instance.eliminarEntidad(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of eliminar method, of class EntidadController.
     */
    @Test
    public void testEliminarEntidad2() {
        System.out.println("eliminarEntidad");
        instance.crearEntidad(entidad2);
        int codigo = 1;
        boolean expResult = false;
        boolean result = instance.eliminarEntidad(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of actualizar method, of class EntidadController.
     */
    @Test
    public void testActualizarEntidad() {
        System.out.println("actualizarEntidad");
        instance.crearEntidad(entidad1);
        int codigo = 1;
        Entidad entidad = entidad1;
        entidad.setNombreComercial("Cambio 2");
        boolean expResult = true;
        boolean result = instance.actualizarEntidad(entidad1);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of actualizar method, of class EntidadController.
     */
    @Test
    public void testActualizarEntidad1() {
        System.out.println("actualizarEntidad");
        instance.crearEntidad(entidad1);
        int codigo = 1;
        Entidad entidad = entidad1;
        entidad.setNombreComercial("Cambio 2");
        boolean expResult = true;
        boolean result = instance.actualizarEntidad(entidad1);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of actualizar method, of class EntidadController.
     */
    @Test
    public void testActualizarEntidad2() {
        System.out.println("actualizarEntidad");
        int codigo = 2;
        Entidad entidad = entidad1;
        entidad.setNombreComercial("Cambio 2");
        boolean expResult = false;
        boolean result = instance.actualizarEntidad(entidad1);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getEntidadList method, of class EntidadController.
     */
    @Test
    public void testGetEntidadList() {
        System.out.println("getEntidadList");
        instance.crearEntidad(entidad1);
        List<Entidad> expResult = new ArrayList<>();
        expResult.add(entidad1);
        List<Entidad> result = instance.getEntidadList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setEntidadList method, of class EntidadController.
     */
    @Test
    public void testSetEntidadList() {
        System.out.println("setEntidadList");
        List<Entidad> entidadList = null;
        EntidadController instance = new EntidadController();
        instance.setEntidadList(entidadList);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
