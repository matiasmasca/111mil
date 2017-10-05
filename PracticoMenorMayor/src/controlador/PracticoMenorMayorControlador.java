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
public class PracticoMenorMayorControlador {
    
    public int menor(int numero1, int numero2,int numero3,int numero4,int numero5,int numero6) { 
        //Defino un vector de 6 elementos, el indice arranca en 0
        int vec[] = new int[6];
        int menor = 2147483647;
        //inicializo el vector en 0
        for (int i = 0; i <= 5; i++) {
            vec[i]=0;
        }
        
        //asigno los valores que recibo por parametro a un elemento del vector.
        vec[0]= numero1;
        vec[1]= numero2;
        vec[2]= numero3;
        vec[3]= numero4;
        vec[4]= numero5;
        vec[5]= numero6;
        
        // recorro todos los valores y voy comparando, con el valor mayor.
        //al terminar el FOR se han comparado todos los elementos con el mayor.
        for (int i = 0; i <= 5; i++) {
            if ( vec[i] < menor ) {
                menor = vec[i];
            }
        }
        
        //devolver lo que este en menor
        return menor;     
    }
    
    public int mayor(int num1,int num2,int num3,int num4,int num5,int num6){
        //Defino un vector de 6 elementos, el indice arranca en 0
        int vec[] = new int[6];
        int mayor = 0;
        //inicializo el vector en 0
        for (int i = 0; i <= 5; i++) {
            vec[i]=0;
        }
        //asigno los valores que recibo por parametro a un elemento del vector.
        vec[0]= num1;
        vec[1]= num2;
        vec[2]= num3;
        vec[3]= num4;
        vec[4]= num5;
        vec[5]= num6;
        
        // recorro todos los valores y voy comparando, con el valor mayor.
        //al terminar el FOR se han comparado todos los elementos con el mayor.
        for (int i = 0; i <= 5; i++) {
            if ( vec[i] > mayor ) {
                mayor = vec[i];
            }
        }
        
        return mayor;
    }
    
}
