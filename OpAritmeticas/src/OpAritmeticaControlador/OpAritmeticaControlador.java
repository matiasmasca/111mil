/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OpAritmeticaControlador;

/**
 *
 * @author alumno
 */
public class OpAritmeticaControlador {
    
    public String calcular(String pOperando1, String pOperando2, String pOperador){
         //Realizo el calculo según la opcion ingresada
        String strResultado = "No sé que hacer";
              
        int auxOperando1 = 0;
        int auxOperando2 = 0;
        int auxResultado = 0;

        auxOperando1 = Integer.parseInt(pOperando1);
        auxOperando2= Integer.parseInt(pOperando2);
                
        switch (pOperador) {
            case "+":
                auxResultado = auxOperando1 + auxOperando2;
                strResultado = String.valueOf(auxResultado);
                break;            
            case "-":
                auxResultado = auxOperando1 - auxOperando2;
                strResultado = String.valueOf(auxResultado);
                break;
            case "*":
                auxResultado = auxOperando1 * auxOperando2;
                strResultado = String.valueOf(auxResultado);
                break;
            case "/":
                auxResultado = auxOperando1 / auxOperando2;
                strResultado = String.valueOf(auxResultado);
                break;        
            default:
                strResultado = String.valueOf("No reconozco esa operación");
                break;
        }
        
        return strResultado;
        
        
    }
    
}
