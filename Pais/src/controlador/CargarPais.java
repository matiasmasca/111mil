/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.Pais;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Matias Mascazzini y Alejandro Arguello para el curso 111mil Corrientes - 2017
 */
public class CargarPais {
    public void nuevo(String nombre, String idioma){
        //Crea una sesión de hibernate para acceder a la tabla
        //y despues abre esa sesión.
        SessionFactory miSessionFactory = HibernateUtil.getSessionFactory();
        
        Session miSession = miSessionFactory.openSession(); //Abro la sesión
        
        //Crear un objeto de la clase Pais, de mi paquete MODELO.
        Pais unPais = new Pais();
        //le asigno los valores
        unPais.setNombre(nombre);
        unPais.setIdioma(idioma);

        
        //Voy a guardar los datos en la base de datos, mediante hibernate
        Transaction unaTransaccion = miSession.beginTransaction();
        
        //invocar al metodo que graba
        miSession.save(unPais);
        
        //Comprometer los cambios del paso anterior en la DB
        unaTransaccion.commit();
        
        //libera el recurso.
        miSession.flush();
        // cierra la sesión
        miSession.close();        
    }
}
