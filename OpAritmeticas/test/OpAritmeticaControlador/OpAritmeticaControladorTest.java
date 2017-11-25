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
    
    /*Camino feliz*/
    
    @Test
    public void testSumar(){
        OpAritmeticaControlador miCalculadora = new OpAritmeticaControlador();
        String resultadoReal =  miCalculadora.calcular("1", "2", "+");
        String resultadoEsperado = "3";
        
        assertEquals(resultadoEsperado, resultadoReal);
    } 

    @Test
    public void testRestar(){
        OpAritmeticaControlador miCalculadora = new OpAritmeticaControlador();
        String resultadoReal =  miCalculadora.calcular("2", "1", "-");
        String resultadoEsperado = "1";
        
        assertEquals(resultadoEsperado, resultadoReal);
    } 
    
    @Test
    public void testProducto(){
        OpAritmeticaControlador miCalculadora = new OpAritmeticaControlador();
        String resultadoReal =  miCalculadora.calcular("2", "1", "*");
        String resultadoEsperado = "2";
        
        assertEquals(resultadoEsperado, resultadoReal);
    }
    
    @Test
    public void testDivision(){
        OpAritmeticaControlador miCalculadora = new OpAritmeticaControlador();
        String resultadoReal =  miCalculadora.calcular("4", "2", "/");
        String resultadoEsperado = "2";
        
        assertEquals(resultadoEsperado, resultadoReal);
    } 
    
    /**
     * Test of calcular method, of class OpAritmeticaControlador.
     */
    @Test
    public void testSinOperador() {
        System.out.println("Sin operador");
        String pOperando1 = "0";
        String pOperando2 = "0";
        String pOperador = "";
        OpAritmeticaControlador miCalculadora = new OpAritmeticaControlador();
        String expResult = "No reconozco esa operación";
        String resultadoReal =  miCalculadora.calcular(pOperando1, pOperando2, pOperador);    

        assertEquals(expResult, resultadoReal);
    }
    
    /* Casos extremos */
    @Test
    public void testSumarCeros(){
        OpAritmeticaControlador miCalculadora = new OpAritmeticaControlador();
        String resultadoReal =  miCalculadora.calcular("0", "0", "+");
        String resultadoEsperado = "0";
        
        assertEquals(resultadoEsperado, resultadoReal);
    }
    
    @Test
    public void testSumarNegativos(){
        OpAritmeticaControlador miCalculadora = new OpAritmeticaControlador();
        String resultadoReal =  miCalculadora.calcular("-1", "-1", "+");
        String resultadoEsperado = "-2";
        
        assertEquals(resultadoEsperado, resultadoReal);
    }
    
    @Test
    public void testSumarOpuestos(){
        OpAritmeticaControlador miCalculadora = new OpAritmeticaControlador();
        String resultadoReal =  miCalculadora.calcular("-1", "1", "+");
        String resultadoEsperado = "0";
        
        assertEquals(resultadoEsperado, resultadoReal);
    }
    
    @Test
    public void testProductoCero(){
        OpAritmeticaControlador miCalculadora = new OpAritmeticaControlador();
        String resultadoReal =  miCalculadora.calcular("2", "0", "*");
        String resultadoEsperado = "0";
        
        assertEquals(resultadoEsperado, resultadoReal);
    }
    
    @Test
    public void testProductoNegativo(){
        OpAritmeticaControlador miCalculadora = new OpAritmeticaControlador();
        String resultadoReal =  miCalculadora.calcular("2", "-1", "*");
        String resultadoEsperado = "-2";
        
        assertEquals(resultadoEsperado, resultadoReal);
    }
    @Test(expected=java.lang.ArithmeticException.class)
    public void testDivideByZero() {
        OpAritmeticaControlador miCalculadora = new OpAritmeticaControlador();
        String resultadoReal =  miCalculadora.calcular("2", "0", "/");
    }

}
