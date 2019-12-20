/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

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
 * @author Starman
 */
public class EntidadTest {

    private Entidad entidad;
    private Agencia agencia;
    private List<Agencia> agenciaList;

    public EntidadTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        agenciaList = new ArrayList<>();

        agencia = new Agencia(1, "Cooperativa SGCA", "Gil Ramirez Davalos", "0981241115", "N");
        agenciaList.add(agencia);

        entidad = new Entidad(1, "Bank Sa", "Bank Sa", "0104796230001", agenciaList);
        System.out.println(entidad);
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getCodigo method, of class Entidad.
     */
    @Test
    public void testGetCodigo() {
        System.out.println("getCodigo");
        int expResult = 1;
        int result = entidad.getCodigo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCodigo method, of class Entidad.
     */
    @Test
    public void testSetCodigo() {
        System.out.println("setCodigo");
        int codigo = 0;
        Entidad instance = new Entidad();
        instance.setCodigo(codigo);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNombreComercial method, of class Entidad.
     */
    @Test
    public void testGetNombreComercial() {
        System.out.println("getNombreComercial");
        String expResult = "Bank Sa";
        String result = entidad.getNombreComercial();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setNombreComercial method, of class Entidad.
     */
    @Test
    public void testSetNombreComercial() {
        System.out.println("setNombreComercial");
        String nombreComercial = "";
        Entidad instance = new Entidad();
        instance.setNombreComercial(nombreComercial);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getRazonSocial method, of class Entidad.
     */
    @Test
    public void testGetRazonSocial() {
        System.out.println("getRazonSocial");
        String expResult = "Bank Sa";
        String result = entidad.getRazonSocial();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setRazonSocial method, of class Entidad.
     */
    @Test
    public void testSetRazonSocial() {
        System.out.println("setRazonSocial");
        String razonSocial = "";
        Entidad instance = new Entidad();
        instance.setRazonSocial(razonSocial);
        // TODO review the generated test code and remove the default call to fail.
        //ail("The test case is a prototype.");
    }

    /**
     * Test of getRuc method, of class Entidad.
     */
    @Test
    public void testGetRuc() {
        System.out.println("getRuc");
        String expResult = "0104796230001";
        String result = entidad.getRuc();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setRuc method, of class Entidad.
     */
    @Test
    public void testSetRuc() {
        System.out.println("setRuc");
        String ruc = "";
        Entidad instance = new Entidad();
        instance.setRuc(ruc);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAgenciaList method, of class Entidad.
     */
    @Test
    public void testGetAgenciaList() {
        System.out.println("getAgenciaList");
        List<Agencia> expResult = agenciaList;
        List<Agencia> result = entidad.getAgenciaList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setAgenciaList method, of class Entidad.
     */
    @Test
    public void testSetAgenciaList() {
        System.out.println("setAgenciaList");
        List<Agencia> agenciaList = null;
        Entidad instance = new Entidad();
        instance.setAgenciaList(agenciaList);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Entidad.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = "Entidad{codigo=1, nombreComercial=Bank Sa, razonSocial=Bank Sa, ruc=0104796230001, agenciaList=[Agencia{codigo=1, nombre=Cooperativa SGCA, direccion=Gil Ramirez Davalos, telefono=0981241115, tipo=N}]}";
        String result = entidad.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}
