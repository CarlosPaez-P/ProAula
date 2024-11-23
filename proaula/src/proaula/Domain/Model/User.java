package proaula.Domain.Model;

import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Carlos Paez
 */
public class User {

    
    private String nombre;
    private String apellido;
    private Date fechaNacimiento; 
    private String correo;
    private String usuario;
    private String contraseña;
    private int codeAdmin;
    private List <Tarea> tareas;
    private List <String> frasesMotivacionales;
    
    public User(String nombre, String apellido, Date fechaNacimiento, 
            String correo, String usuario, String contraseña, int codeAdmin) 
            throws Exception{
        validarNombre(nombre);
        validarApellido(apellido);
        validarFechaNacimiento(fechaNacimiento);
        validarCorreo(correo);
        validarUsuario(usuario);
        validarContraseña(contraseña);
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.correo = correo;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.codeAdmin = codeAdmin;
        this.frasesMotivacionales = frasesMotivacionales;

    }
    
    private void validarNombre(String nombre) throws Exception {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new Exception("El nombre es requerido.");
        }
    }
    
    private void validarApellido(String apellido) throws Exception {
        if (apellido == null || apellido.trim().isEmpty()) {
            throw new Exception("El apellido es requerido.");
        }
    }
    
    private void validarFechaNacimiento(Date fechaNacimiento) throws Exception {
        if (fechaNacimiento == null) {
            throw new Exception("La fecha de nacimiento es requerida.");
        }
    } 
    
    private void validarCorreo(String correo) throws Exception {
        if (correo == null || !correo.contains("@")){
            throw new Exception("El correo debe ser valido.");
        }
    }
    
    private void validarUsuario(String usuario) throws Exception {
        if (usuario == null || usuario.trim().isEmpty()) {
            throw new Exception("El usuario es requerido.");
        }
    }
    
    private void validarContraseña(String contraseña) throws Exception {
        if (contraseña == null || contraseña.length() <6 ) {
          throw new Exception("La contraseña debe tener minimo 6 caracteres.");
        }
    }
    
    public List<Tarea> getTareas(){
        return tareas;
    }
    
    public void setTareas(List<Tarea> tareas) {
        this.tareas = tareas;
    }
    public void marcarTareaRealizada (Tarea tarea, boolean realizado){
        tarea.setRealizado(realizado);
    }

    public String solicitarFraseMotivacional() {
        if (frasesMotivacionales == null || frasesMotivacionales.isEmpty()){
         return "no hay frases motivacionales";
        }
     Random rand = new Random();
     return frasesMotivacionales.get(rand.nextInt(frasesMotivacionales.size()));
    }

    public boolean validarContrasena(String contraseña) {
        return this.contraseña.equals(contraseña);
    }
    
      public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws Exception {
        validarNombre(nombre);
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) throws Exception {
        validarApellido(apellido);
        this.apellido = apellido;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) throws Exception {
        validarFechaNacimiento(fechaNacimiento);
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) throws Exception {
        validarCorreo(correo);
        this.correo = correo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) throws Exception {
        validarUsuario(usuario);
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContrasena(String contraseña) {
        validarContrasena(contraseña);
        this.contraseña = contraseña;
        
    }

    public int getCodeAdmin() {
        return codeAdmin;
    }

    public void setCodigoAdmin(int codeAdmin) {
        this.codeAdmin = codeAdmin;
    }
    
    public List<String> getFrasesMotivacionales() {
        return frasesMotivacionales;
    } 
}



