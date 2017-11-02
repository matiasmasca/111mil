package modelo;
// Generated 30/10/2017 22:08:51 by Hibernate Tools 4.3.1



/**
 * Pelicula generated by hbm2java
 */
public class Pelicula  implements java.io.Serializable {


     private Integer idPelicula;
     private String anioEstreno;
     private Boolean disponible;
     private String duracion;
     private String fechaIngreso;
     private String nombre;
     private String tituloOriginal;
     private Integer idCalificacion;
     private Integer idGenero;
     private Integer idPais;

    public Pelicula() {
    }

    public Pelicula(String anioEstreno, Boolean disponible, String duracion, String fechaIngreso, String nombre, String tituloOriginal, Integer idCalificacion, Integer idGenero, Integer idPais) {
       this.anioEstreno = anioEstreno;
       this.disponible = disponible;
       this.duracion = duracion;
       this.fechaIngreso = fechaIngreso;
       this.nombre = nombre;
       this.tituloOriginal = tituloOriginal;
       this.idCalificacion = idCalificacion;
       this.idGenero = idGenero;
       this.idPais = idPais;
    }
   
    public Integer getIdPelicula() {
        return this.idPelicula;
    }
    
    public void setIdPelicula(Integer idPelicula) {
        this.idPelicula = idPelicula;
    }
    public String getAnioEstreno() {
        return this.anioEstreno;
    }
    
    public void setAnioEstreno(String anioEstreno) {
        this.anioEstreno = anioEstreno;
    }
    public Boolean getDisponible() {
        return this.disponible;
    }
    
    public void setDisponible(Boolean disponible) {
        this.disponible = disponible;
    }
    public String getDuracion() {
        return this.duracion;
    }
    
    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }
    public String getFechaIngreso() {
        return this.fechaIngreso;
    }
    
    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getTituloOriginal() {
        return this.tituloOriginal;
    }
    
    public void setTituloOriginal(String tituloOriginal) {
        this.tituloOriginal = tituloOriginal;
    }
    public Integer getIdCalificacion() {
        return this.idCalificacion;
    }
    
    public void setIdCalificacion(Integer idCalificacion) {
        this.idCalificacion = idCalificacion;
    }
    public Integer getIdGenero() {
        return this.idGenero;
    }
    
    public void setIdGenero(Integer idGenero) {
        this.idGenero = idGenero;
    }
    public Integer getIdPais() {
        return this.idPais;
    }
    
    public void setIdPais(Integer idPais) {
        this.idPais = idPais;
    }




}


