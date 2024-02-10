package ma.web1.web1spring.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import ma.web1.web1spring.models.Usuario;

@Repository
public interface UsuarioRepository extends MongoRepository<Usuario, String> {
    @Query("{ 'email' : ?0 }")
    Optional<Usuario> findUsuarioByEmail(String email);

}
