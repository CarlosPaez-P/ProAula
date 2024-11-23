package proaula.Domain.Model;

/**
 *
 * @author Carlos Paez
 */
public class Tarea {

    private String nombre;
    private String descripcion;
    private Boolean realizado;
    
  
  public Tarea(String nombre, String descripcion){
      this.nombre = nombre;
      this.descripcion = descripcion;
      this.realizado = false;
  }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Boolean getRealizado() {
        return realizado;
    }

    public void setRealizado(Boolean realizado) {
        this.realizado = realizado;
    }
   


    }

