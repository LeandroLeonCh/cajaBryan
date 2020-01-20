/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Credito;
import ec.edu.ups.modelo.Socio;
import ec.edu.ups.modelo.TasaInteres;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
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
public class CreditoControllerTest {
    
    Credito credito1 = null;
    Credito credito2 = null;
    CreditoController instance = null;
    private Socio socio;
    private TasaInteres tasaInteres;
    
    
    public CreditoControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() throws ParseException {
        instance = new CreditoController();
        DateFormat format = new SimpleDateFormat("dd/mm/yyyy");
        Date fecha = format.parse("17/01/1999");
        Date fecha2 = format.parse("18/02/2000");
        Date fechaFin = format.parse("01/01/2019");
        Date fechaN = format.parse("20/04/1994");
        Date fechaI = format.parse("10/01/2016");
        Date fechaF = format.parse("12/01/2016");
        socio = new Socio(1, "0703021287", "Jordan", "Murillo", fechaN, "0980792708", "Av. Loja", "Activo", fechaI, 12.666);
        tasaInteres = new TasaInteres(1, "Tasa 1", "2019", 0.40);
        credito1 = new Credito(1, "Casa", fechaF, fechaI, 100.99, 365, socio, tasaInteres ,null);
        credito2 = new Credito(2, "Casa2", fechaF, fechaI, 200.99, 265, socio, tasaInteres ,null);
        
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of crear method, of class CreditoController.
     */
    @Test
    public void testCrear() {
        System.out.println("crear");
        instance.crear(credito1);
        instance.crear(credito2);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of buscar method, of class CreditoController.
     */
    @Test
    public void testBuscar() {
        System.out.println("buscar");
        instance.crear(credito1);
        int codigo = 1;
        Credito expResult = credito1;
        Credito result = instance.buscar(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
        /**
     * Test of buscar method, of class CreditoController.
     */
    @Test
    public void testBuscar1() {
        System.out.println("buscar");
        instance.crear(credito1);
        int codigo = 0;
        Credito expResult = null;
        Credito result = instance.buscar(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
        /**
     * Test of buscar method, of class CreditoController.
     */
    @Test
    public void testBuscar2() {
        System.out.println("buscar");
        int codigo = 0;
        Credito expResult = null;
        Credito result = instance.buscar(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of eliminar method, of class CreditoController.
     */
    @Test
    public void testEliminar() {
        System.out.println("eliminar");
        instance.crear(credito1);
        int codigo = 1;
        boolean expResult = true;
        boolean result = instance.eliminar(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of eliminar method, of class CreditoController.
     */
    @Test
    public void testEliminar1() {
        System.out.println("eliminar");
        instance.crear(credito2);
        int codigo = 2;
        boolean expResult = true;
        boolean result = instance.eliminar(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of eliminar method, of class CreditoController.
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
     * Test of actualizar method, of class CreditoController.
     */
    @Test
    public void testActualizar() {
        System.out.println("actualizar");
        instance.crear(credito1);
        int codigo = 1;
        Credito credito = credito1;
        credito.setDetalle("Auto");
        boolean expResult = true;
        boolean result = instance.actualizar(codigo, credito);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of actualizar method, of class CreditoController.
     */
    @Test
    public void testActualizar1() {
        System.out.println("actualizar");
        instance.crear(credito1);
        int codigo = 2;
        Credito credito = credito1;
        credito.setDetalle("Auto");
        boolean expResult = false;
        boolean result = instance.actualizar(codigo, credito);
        System.out.println(result);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of actualizar method, of class CreditoController.
     */
    @Test
    public void testActualizar2() {
        System.out.println("actualizar");
        int codigo =2;
        Credito credito = credito1;
        credito.setDetalle("Auto");
        boolean expResult = false;
        boolean result = instance.actualizar(codigo, credito);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }



    /**
     * Test of getListCredito method, of class CreditoController.
     */
    @Test
    public void testGetListCredito() {
        System.out.println("getListCredito");
        instance.crear(credito1);
        List<Credito> expResult = new ArrayList<>();
        expResult.add(credito1);
        List<Credito> result = (List<Credito>) instance.getListCredito();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
        /**
     * Test of getListCredito method, of class CreditoController.
     */
    @Test
    public void testSetListCredito() {
        System.out.println("setListCredito");
        List<Credito> ahorroList = null;
        CreditoController instance = new CreditoController();
        instance.setListCredito(ahorroList);

        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
