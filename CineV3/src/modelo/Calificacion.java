package modelo;
// Generated 27/10/2017 12:40:45 by Hibernate Tools 4.3.1



/**
 * Calificacion generated by hbm2java
 */
public class Calificacion  implements java.io.Serializable {


     private Integer idCalificacion;
     private String nombre;

    public Calificacion() {
    }

    public Calificacion(String nombre) {
       this.nombre = nombre;
    }
   
    public Integer getIdCalificacion() {
        return this.idCalificacion;
    }
    
    public void setIdCalificacion(Integer idCalificacion) {
        this.idCalificacion = idCalificacion;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }




}


