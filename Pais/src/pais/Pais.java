/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pais;

import vista.VentanaPais;

/**
 *
 * @author alumno
 */
public class Pais {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Disparador, llama a la ventana
            //Forma larga: 
            //VentanaPais miVentana = new VentanaPais();
            //miVentana.setVisible(true);
        new VentanaPais().setVisible(true);
    }
    
}
