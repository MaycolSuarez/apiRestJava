package ma.web1.web1spring.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import ma.web1.web1spring.models.Usuario;
import ma.web1.web1spring.services.UsuarioService;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1")
public class UserController {

    private final UsuarioService usuarioService;

    @PostMapping("/saveUser")
    @CrossOrigin(origins = "*")
    public void save(@RequestBody Usuario usuario) {
        usuarioService.saveUsuario(usuario);
    }

    @GetMapping("/users")
    @CrossOrigin(origins = "*")
    public List<Usuario> findUsuario() {
        return usuarioService.findAllUsuario();
    }

    @GetMapping("/user/{id}")
    @CrossOrigin(origins = "*")
    public Usuario findUsuario(@PathVariable String id) {
        return usuarioService.findUsuario(id).get();
    }

    @GetMapping("/userbyemail/{email}")
    @CrossOrigin(origins = "*")
    public Usuario findUsuarioByEmail(@PathVariable String email) {
        return usuarioService.findUsuarioEmail(email).get();
    }

    @DeleteMapping("/user/{id}")
    @CrossOrigin(origins = "*")
    public void deleteUsuario(@PathVariable String id) {
        usuarioService.deleteUsuario(id);
    }

    @PutMapping("/updateUser")
    @CrossOrigin(origins = "*")
    public void updateUsuario(@RequestBody Usuario usuario) {
        usuarioService.saveUsuario(usuario);
    }
}
