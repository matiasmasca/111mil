
package controlador;

//import modelo.Pelicula;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;



public class Datos {
    
    
    public void nuevo(String nombre, int  id_genero, int  id_calificacion, int  id_paisOrigen, String duracion, String tituloOriginal, String aniEstreno, byte disponible){
        
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        /*
        Pelicula pelis = new Pelicula();
        
        pelis.setNombre(nombre);
        pelis.setIdgenero(id_genero);
        pelis.setIdcalificacion(id_calificacion);
        pelis.setIdpaisdeorigen(id_paisOrigen);
        pelis.setDuracion(duracion);
        pelis.setAnioEstreno(aniEstreno);
        pelis.setTituloOriginal(tituloOriginal);
        pelis.setDisponible(disponible);
        
        
        Transaction tx = session.beginTransaction();
        
        session.save(pelis);
        
        tx.commit();
        
        session.flush();
        
        session.close();
        */
    }
    
    
    
    
    
    
    
    
    
}
