/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

/**
 *
 * @author alumno
 */
public class PracticoMayorControlador {
    
    public int mayor(int valor1, int valor2){
        //Inicializa las variables locales.
        int numero = 0;
        int numero2 = 0;
        int resultado = 0;
        
        //Variables de trabajo.
        numero = valor1;
        numero2 = valor2;

        //Pregunto cuál es el mayor de los 2 numeros 
        if (numero > numero2) {
            resultado = numero;
        }else{
            resultado = numero2;
        }
        
        //devuelve lo que este guardado en resultado
        return resultado;
    }
    
}
