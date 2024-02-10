package ma.web1.web1spring.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(value = "user")
@Data
public class Usuario {

    @Id
    private String id;
    private String nombre;
    private Integer edad;
    private String email;
    private String direccion;
    
}
