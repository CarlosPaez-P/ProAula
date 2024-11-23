package proaula.Domain.Model;

import java.util.Date;


public class Admin extends User {

    public Admin(String nombre, String apellido, Date fechaNacimiento,
            String correo, String usuario, String contraseña, int codeAdmin) throws Exception {
        super(nombre, apellido, fechaNacimiento, correo, usuario, contraseña,
                codeAdmin);
    }
    
    public int crearCodeAdmin(){
        return (int) (Math.random()* 10000);
    }
}  