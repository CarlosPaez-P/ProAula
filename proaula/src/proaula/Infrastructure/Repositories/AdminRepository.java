package proaula.Infrastructure.Repositories;

import proaula.Domain.Model.Tarea;
import proaula.business.Interfaces.IAdminRepository;
import java.util.List;
import java.util.ArrayList;
import proaula.Domain.Model.User;

public class AdminRepository implements IAdminRepository {
    private final List<User> usuarios = new ArrayList<>();

    @Override
    public void saveUser(User usuario) throws IllegalArgumentException {
        if (!usuarios.contains(usuario)) {
            usuarios.add(usuario);
        } else {
            throw new IllegalArgumentException("El usuario ya existe.");
        }
    }

    @Override
    public void deleteUser(User usuario) throws IllegalArgumentException {
        if (usuarios.contains(usuario)) {
            usuarios.remove(usuario);
        } else {
            throw new IllegalArgumentException("El usuario no existe.");
        }
    }

    public List<User> obtenerTodosLosUsuarios() {
        return usuarios;
    }

    public User findUserbyUsername(String nombreUsuario) {
        return usuarios.stream()
                .filter(u -> u.getUsuario().equals(nombreUsuario))
                .findFirst()
                .orElse(null);
    }

    public void saveTarea(User usuario, Tarea tarea) 
            throws IllegalArgumentException {
        if (usuarios.contains(usuario)) {
            usuario.getTareas().add(tarea);
        } else {
            throw new IllegalArgumentException("El usuario no existe.");
        }
    }

    @Override
    public void deleteTarea(User usuario, Tarea tarea)
            throws IllegalArgumentException {
        if (usuarios.contains(usuario)) {
            usuario.getTareas().remove(tarea);
        } else {
            throw new IllegalArgumentException("El usuario no existe.");
        }
    }

    public void editarTarea(Tarea tarea, String nuevoNombre, 
            String nuevaDescripcion) {
        tarea.setNombre(nuevoNombre);
        tarea.setDescripcion(nuevaDescripcion);
    }

    public List<Tarea> buscarTareasPorUsuario(User usuario) throws Exception {
        if (!usuarios.contains(usuario)) {
            throw new Exception("El usuario no existe.");
        }
        return usuario.getTareas();
    }

  
    public void agregarFrase(String tipo, String frase,
            List<String> frasesElogio, List<String> frasesAliento, 
            List<String> frasesMotivacionales) throws IllegalArgumentException,
            Exception {
        switch (tipo.toLowerCase()) {
            case "elogio" -> frasesElogio.add(frase);
            case "aliento" -> frasesAliento.add(frase);
            case "motivacional" -> frasesMotivacionales.add(frase);
            default -> throw new Exception("Tipo de frase no reconocido.");
        }
    }

    public void eliminarFrase(String tipo, String frase, 
            List<String> frasesElogio, List<String> frasesAliento,
            List<String> frasesMotivacionales) throws IllegalArgumentException,
            Exception {
        switch (tipo.toLowerCase()) {
            case "elogio" -> {
                if (frasesElogio.contains(frase)) {
                    frasesElogio.remove(frase);
                } else {
                    throw new IllegalArgumentException
        ("La frase de elogio no existe.");
                }
            }
            case "aliento" -> {
                if (frasesAliento.contains(frase)) {
                    frasesAliento.remove(frase);
                } else {
                    throw new IllegalArgumentException
        ("La frase de aliento no existe.");
                }
            }
            case "motivacional" -> {
                if (frasesMotivacionales.contains(frase)) {
                    frasesMotivacionales.remove(frase);
                } else {
                    throw new Exception("La frase motivacional no existe.");
                }
            }
            default -> throw new Exception("Tipo de frase no reconocido.");
        }
    }

    @Override
    public User findUsername(String Usuario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<User> getUserAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void editTarea(Tarea tarea, String nuevoNombre, String nuevaDescripcion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Tarea> findTareaPorUser(User usuario) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void saveFrase(String tipo, String frase, List<String> frasesElogio, List<String> frasesAliento, List<String> frasesMotivacionales) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void deleteFrase(String tipo, String frase, List<String> frasesElogio, List<String> frasesAliento, List<String> frasesMotivacionales) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}