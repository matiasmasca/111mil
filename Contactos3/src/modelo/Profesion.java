package modelo;
// Generated 17/10/2017 00:50:08 by Hibernate Tools 4.3.1



/**
 * Profesion generated by hbm2java
 */
public class Profesion  implements java.io.Serializable {


     private Integer id;
     private String nombre;
     private String profesion;

    public Profesion() {
    }

    public Profesion(String nombre, String profesion) {
       this.nombre = nombre;
       this.profesion = profesion;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getProfesion() {
        return this.profesion;
    }
    
    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }




}

