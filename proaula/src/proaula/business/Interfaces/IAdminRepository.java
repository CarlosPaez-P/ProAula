package proaula.business.Interfaces;

import java.util.List;
import proaula.Domain.Model.Tarea;
import proaula.Domain.Model.User;

/**
 *
 * @author Carlos Paez
 */
public interface IAdminRepository {
    public User findUsername(String Usuario);
    public void saveUser(User usuario) throws Exception;
    public void deleteUser(User usuario) throws Exception;
    public List<User> getUserAll();
    public void saveTarea(User usuario, Tarea tarea) throws Exception;
    public void deleteTarea(User usuario, Tarea tarea) throws Exception;
    public void editTarea(Tarea tarea, String nuevoNombre, String nuevaDescripcion);
    public List<Tarea> findTareaPorUser(User usuario) throws Exception;
    public void saveFrase (String tipo, String frase, List<String> frasesElogio, 
            List<String> frasesAliento, List<String> frasesMotivacionales) 
            throws Exception;
    public void deleteFrase (String tipo, String frase, List<String> frasesElogio, 
            List<String> frasesAliento, List<String> frasesMotivacionales) 
            throws Exception;
    
}

