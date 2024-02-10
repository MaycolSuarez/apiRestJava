package ma.web1.web1spring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import ma.web1.web1spring.models.Usuario;
import ma.web1.web1spring.repository.UsuarioRepository;

@Service
@RequiredArgsConstructor
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;

    public void saveUsuario(Usuario usuario) {
        if (usuario != null) {
            // Realiza operaciones con el objeto Usuario
            usuarioRepository.save(usuario);
        } else {
            // Maneja el caso en que usuario es nulo
        }
    }

    public List<Usuario> findAllUsuario() {
        return usuarioRepository.findAll();
    }

    public Optional<Usuario> findUsuario(String id) {
        if (id != null) {
            // Realiza operaciones con el objeto Usuario
            return usuarioRepository.findById(id);
        } else {
            // Maneja el caso en que usuario es nulo
            System.err.println("Usuario no encontrado");
            return null;
        }
    }

    public Optional<Usuario> findUsuarioEmail(String email) {
        if (email != null) {
            // Realiza operaciones con el objeto Usuario
            return usuarioRepository.findUsuarioByEmail(email);
        } else {
            // Maneja el caso en que usuario es nulo
            System.err.println("Usuario no encontrado");
            return null;
        }
    }

    public void deleteUsuario(String id) {
        if (id != null) {
            usuarioRepository.deleteById(id);
        } else {
            // Maneja el caso en que usuario es nulo
        }
    }
}
