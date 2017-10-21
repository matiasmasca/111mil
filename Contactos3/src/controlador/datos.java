/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JTextField;
import modelo.Profesion;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Alumno
 */
public class datos {
    
    
    public void nuevo(String nombre, String profesion){
        
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        
        Profesion p = new Profesion();
        
        p.setNombre(nombre);
        p.setProfesion(profesion);
        
        
        
        Transaction tx = session.beginTransaction();
        
        session.saveOrUpdate(p);
        
        tx.commit();
        
        session.flush();
        
        session.close();
        
    }
    
     public void actualizar(int id,String nombre, String profesion){
        
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        
        Profesion p = new Profesion();
        
        p.setId(id);
        p.setNombre(nombre);
        p.setProfesion(profesion);
        
        
        
        Transaction tx = session.beginTransaction();
        
        session.update(p);
        
        tx.commit();
        
        session.flush();
        
        session.close();
        
    }
     
     public String leer(int id){
         
         SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session session = sf.openSession();
            
        Transaction tx = session.beginTransaction();
        
        Profesion prof=(Profesion)session.get(Profesion.class,id);
         
         String nom =prof.getNombre();            
         String p =prof.getProfesion(); 
        tx.commit();
        
        session.flush();
        
        session.close();
        
         String datos = "Nombre: "+nom+"; Profesion: "+p+"...";
        
         
       return datos;  
         
         
     }
     
     
     
      public void eliminar(int id){
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        
        Profesion p = new Profesion();
        
        p.setId(id);
                       
        Transaction tx = session.beginTransaction();
        
        session.delete(p);
        
        tx.commit();
        
        session.flush();
        
        session.close();
        
    }
    
    
}
