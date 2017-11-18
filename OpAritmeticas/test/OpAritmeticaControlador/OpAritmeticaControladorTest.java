/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
buena info. bien sintetica 
http://www.jtech.ua.es/j2ee/publico/lja-2012-13/sesion04-apuntes.html

*/
package OpAritmeticaControlador;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alumno
 */
public class OpAritmeticaControladorTest {
    
    public OpAritmeticaControladorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /*
    @Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    */
    
    @Test
    public void testSumar(){
        OpAritmeticaControlador miCalculadora = new OpAritmeticaControlador();
        String resultadoReal =  miCalculadora.calcular("1", "2", "+");
        String resultadoEsperado = "3";
        
        assertEquals(resultadoEsperado, resultadoReal);
        
    } 

    /**
     * Test of calcular method, of class OpAritmeticaControlador.
     */
    @Test
    public void testCalcular() {
        System.out.println("calcular");
        String pOperando1 = "";
        String pOperando2 = "";
        String pOperador = "";
        OpAritmeticaControlador instance = new OpAritmeticaControlador();
        String expResult = "";
        String result = instance.calcular(pOperando1, pOperando2, pOperador);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
