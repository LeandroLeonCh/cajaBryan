/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Persona;
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
public class PersonaControllerTest {
    
    Persona persona1 = null;
    Persona persona2 = null;
    PersonaController instance = null;
    
    public PersonaControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() throws ParseException {
        instance = new PersonaController();
        DateFormat format = new SimpleDateFormat("dd/mm/yyyy"); // Creamos un formato de fecha
        Date fecha = format.parse("17/01/1999");
        Date fecha2 = format.parse("18/02/2000");
        persona1 = new Persona(1, "0703021287", "Jordan", "Murillo", fecha, "0980792708", "Av. Loja");
        persona2 = new Persona(2, "0706148509", "Holger", "Espinoza", fecha2, "0994607375", "Av. Loja");
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of setPersonaList method, of class PersonaController.
     */
    /*  @Test
    public void testSetPersonaList() {
        System.out.println("setPersonaList");
        List<Persona> personaList = new ArrayList<>();
        personaList.add(persona1);
        instance.setPersonaList(personaList);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
     */
    /**
     * Test of getPersonaList method, of class PersonaController.
     */
    @Test
    public void testGetPersonaList() {
        System.out.println("getPersonaList");
        List<Persona> expResult = new ArrayList<>();
        expResult.add(persona1);
        expResult.forEach((Persona p) -> System.out.println(p));
        List<Persona> result = instance.getPersonaList();
        System.out.println("---------------");
        result.forEach((Persona p) -> System.out.println(p));
        System.out.println("---------------");
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of crearPersona method, of class PersonaController.
     */
    @Test
    public void testCrearPersona() {
        System.out.println("crearPersona");
        instance.crearPersona(persona1);
        instance.crearPersona(persona2);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of buscarPersona method, of class PersonaController.
     */
    @Test
    public void testBuscarPersona() {
        System.out.println("buscarPersona");
        String cedula = "0703021287";
        Persona expResult = persona1;
        System.out.println(expResult);
        Persona result = instance.buscarPersona(cedula);
        System.out.println(result);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of actualizarPersona method, of class PersonaController.
     */
    @Test
    public void testActualizarPersona() {
        System.out.println("actualizarPersona");
        String cedula = "0703021287";
        Persona persona = persona1;
        persona.setpNombre("Jordan Fernando");
        persona.setpApellido("Murillo Valarezo");
        instance.actualizarPersona(cedula, persona);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of borrarPersona method, of class PersonaController.
     */
    @Test
    public void testBorrarPersona() {
        System.out.println("borrarPersona");
        String cedula = "0706148509";
        instance.borrarPersona(cedula);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
