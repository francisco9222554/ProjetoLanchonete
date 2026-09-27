package tests;

import com.mycompany.projetolanchonete.model.Usuario;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class UsuarioTests {
    
    @Test
    void UsuarioCompleto(){
        Usuario usuario = new Usuario("fernando@silva.com", "jooj123" , "CLIENTE", "Fernando Silva" );
        
        assertEquals("fernando@silva.com", usuario.getEmail());
        assertEquals("jooj123", usuario.getSenha());
        assertEquals("CLIENTE", usuario.getTipo());
        assertEquals("Fernando Silva", usuario.getNome());
    }
}