package proaula.business.Interfaces;

import java.util.List;
import proaula.Domain.Model.User;

/**
 *
 * @author Carlos Paez
 */
public interface IUserRepository {
    public User findByUsername(String Usuario) throws Exception;
    void save(User usuario) throws Exception;
    void delete(User usuario) throws Exception;
    void edit(User usuario) throws Exception;
    List<User> findAll();       
    
}
