package proaula.Infrastructure.Repositories;

import java.util.ArrayList;
import java.util.List;
import proaula.Domain.Model.User;
import proaula.business.Interfaces.IUserRepository;

/**
 * Repositorio de usuario
 */
public class UserRepository implements IUserRepository {
    private List<User> usuarios = new ArrayList<>();

    @Override
    public User findByUsername(String usuario) {
        return usuarios.stream()
                .filter(u -> u.getUsuario().equals(usuario))
                .findFirst()
                .orElse(null);
    }

    @Override
    public void save(User usuario) throws Exception {
        if (findByUsername(usuario.getUsuario()) != null) {
            throw new IllegalArgumentException("El nombre de usuario ya existe.");
        }
        usuarios.add(usuario);
    }

    @Override
    public void delete(User usuario) throws Exception {
        usuarios.removeIf(u -> u.getUsuario().equals(usuario.getUsuario()));
    }

    @Override
    public void edit(User usuario) throws Exception {
        User existingUser = findByUsername(usuario.getUsuario());
        if (existingUser == null) {
            throw new IllegalArgumentException("El usuario no existe.");
        }
        usuarios.remove(existingUser);
        usuarios.add(usuario);
    }

    @Override
    public List<User> findAll() {
        return usuarios;
    }
}
