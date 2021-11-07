/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Copito
 */
public class TrabajadoresTest {
    
    public TrabajadoresTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of calcularIncentivo method, of class Trabajadores.
     */
    @Test
    public void testCalcularIncentivo() {
        System.out.println("calcularIncentivo");
        Trabajadores instance = new Trabajadores();
        int expResult = 0;
        int result = instance.calcularIncentivo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of mostrarIncentivo method, of class Trabajadores.
     */
    @Test
    public void testMostrarIncentivo() {
        System.out.println("mostrarIncentivo");
        Trabajadores instance = new Trabajadores();
        instance.mostrarIncentivo();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRut method, of class Trabajadores.
     */
    @Test
    public void testGetRut() {
        System.out.println("getRut");
        Trabajadores instance = new Trabajadores();
        String expResult = "";
        String result = instance.getRut();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class Trabajadores.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Trabajadores instance = new Trabajadores();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSexo method, of class Trabajadores.
     */
    @Test
    public void testGetSexo() {
        System.out.println("getSexo");
        Trabajadores instance = new Trabajadores();
        char expResult = ' ';
        char result = instance.getSexo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEdad method, of class Trabajadores.
     */
    @Test
    public void testGetEdad() {
        System.out.println("getEdad");
        Trabajadores instance = new Trabajadores();
        int expResult = 0;
        int result = instance.getEdad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSueldo method, of class Trabajadores.
     */
    @Test
    public void testGetSueldo() {
        System.out.println("getSueldo");
        Trabajadores instance = new Trabajadores();
        int expResult = 0;
        int result = instance.getSueldo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCantidadDeHijos method, of class Trabajadores.
     */
    @Test
    public void testGetCantidadDeHijos() {
        System.out.println("getCantidadDeHijos");
        Trabajadores instance = new Trabajadores();
        int expResult = 0;
        int result = instance.getCantidadDeHijos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRut method, of class Trabajadores.
     */
    @Test
    public void testSetRut() {
        System.out.println("setRut");
        String rut = "";
        Trabajadores instance = new Trabajadores();
        instance.setRut(rut);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Trabajadores.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Trabajadores instance = new Trabajadores();
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSexo method, of class Trabajadores.
     */
    @Test
    public void testSetSexo() {
        System.out.println("setSexo");
        char sexo = ' ';
        Trabajadores instance = new Trabajadores();
        instance.setSexo(sexo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEdad method, of class Trabajadores.
     */
    @Test
    public void testSetEdad() {
        System.out.println("setEdad");
        int edad = 0;
        Trabajadores instance = new Trabajadores();
        instance.setEdad(edad);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSueldo method, of class Trabajadores.
     */
    @Test
    public void testSetSueldo() {
        System.out.println("setSueldo");
        int sueldo = 0;
        Trabajadores instance = new Trabajadores();
        instance.setSueldo(sueldo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCantidadDeHijos method, of class Trabajadores.
     */
    @Test
    public void testSetCantidadDeHijos() {
        System.out.println("setCantidadDeHijos");
        int cantidadDeHijos = 0;
        Trabajadores instance = new Trabajadores();
        instance.setCantidadDeHijos(cantidadDeHijos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
