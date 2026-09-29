package tests;

import com.mycompany.projetolanchonete.model.Usuario;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;

public class UsuarioTests {

    @Test
    void UsuarioCompleto() {
        Usuario usuario = new Usuario("fernando@silva.com", "jooj123", "CLIENTE", "Fernando Silva");

        assertEquals("fernando@silva.com", usuario.getEmail());
        assertEquals("jooj123", usuario.getSenha());
        assertEquals("CLIENTE", usuario.getTipo());
        assertEquals("Fernando Silva", usuario.getNome());
    }

    @Test
    void UsuarioTipoAdmin() {
        Usuario usuario = new Usuario("admin@lanchonete.com", "admin@2024", "ADMIN", "Administrador Sistema");

        assertEquals("admin@lanchonete.com", usuario.getEmail());
        assertEquals("admin@2024", usuario.getSenha());
        assertEquals("ADMIN", usuario.getTipo());
        assertEquals("Administrador Sistema", usuario.getNome());
    }

    @Test
    void UsuarioTipoFuncionario() {
        Usuario usuario = new Usuario("func@lanchonete.com", "senhaFunc1", "FUNCIONARIO", "Carlos Oliveira");

        assertEquals("func@lanchonete.com", usuario.getEmail());
        assertEquals("senhaFunc1", usuario.getSenha());
        assertEquals("FUNCIONARIO", usuario.getTipo());
        assertEquals("Carlos Oliveira", usuario.getNome());
    }

    @Test
    void UsuarioComSenhaLonga() {
        Usuario usuario = new Usuario("ana@email.com", "S3nh@F0rte!2024#Abc", "CLIENTE", "Ana Paula");

        assertEquals("ana@email.com", usuario.getEmail());
        assertEquals("S3nh@F0rte!2024#Abc", usuario.getSenha());
        assertEquals("CLIENTE", usuario.getTipo());
        assertEquals("Ana Paula", usuario.getNome());
    }

    @Test
    void UsuarioComNomeComposto() {
        Usuario usuario = new Usuario("jose@email.com", "jose123", "CLIENTE", "José da Silva Santos");

        assertEquals("jose@email.com", usuario.getEmail());
        assertEquals("jose123", usuario.getSenha());
        assertEquals("CLIENTE", usuario.getTipo());
        assertEquals("José da Silva Santos", usuario.getNome());
    }


    @Test
    void UsuarioComEmailNulo() {
        Usuario usuario = new Usuario(null, "senha123", "CLIENTE", "Nome Teste");

        assertNull(usuario.getEmail());
        assertEquals("senha123", usuario.getSenha());
        assertEquals("CLIENTE", usuario.getTipo());
        assertEquals("Nome Teste", usuario.getNome());
    }

    @Test
    void UsuarioComEmailVazio() {
        Usuario usuario = new Usuario("", "senha123", "CLIENTE", "Nome Teste");

        assertEquals("", usuario.getEmail());
        assertEquals("senha123", usuario.getSenha());
        assertEquals("CLIENTE", usuario.getTipo());
        assertEquals("Nome Teste", usuario.getNome());
    }

    @Test
    void UsuarioComEmailInvalido() {
        Usuario usuario = new Usuario("emailinvalido", "senha123", "CLIENTE", "Nome Teste");

        assertEquals("emailinvalido", usuario.getEmail());
        assertEquals("senha123", usuario.getSenha());
        assertEquals("CLIENTE", usuario.getTipo());
        assertEquals("Nome Teste", usuario.getNome());
    }

    @Test
    void UsuarioComSenhaNula() {
        Usuario usuario = new Usuario("teste@email.com", null, "CLIENTE", "Nome Teste");

        assertEquals("teste@email.com", usuario.getEmail());
        assertNull(usuario.getSenha());
        assertEquals("CLIENTE", usuario.getTipo());
        assertEquals("Nome Teste", usuario.getNome());
    }

    @Test
    void UsuarioComSenhaVazia() {
        Usuario usuario = new Usuario("teste@email.com", "", "CLIENTE", "Nome Teste");

        assertEquals("teste@email.com", usuario.getEmail());
        assertEquals("", usuario.getSenha());
        assertEquals("CLIENTE", usuario.getTipo());
        assertEquals("Nome Teste", usuario.getNome());
    }

    @Test
    void UsuarioComTipoNulo() {
        Usuario usuario = new Usuario("teste@email.com", "senha123", null, "Nome Teste");

        assertEquals("teste@email.com", usuario.getEmail());
        assertEquals("senha123", usuario.getSenha());
        assertNull(usuario.getTipo());
        assertEquals("Nome Teste", usuario.getNome());
    }

    @Test
    void UsuarioComTipoVazio() {
        Usuario usuario = new Usuario("teste@email.com", "senha123", "", "Nome Teste");

        assertEquals("teste@email.com", usuario.getEmail());
        assertEquals("senha123", usuario.getSenha());
        assertEquals("", usuario.getTipo());
        assertEquals("Nome Teste", usuario.getNome());
    }

    @Test
    void UsuarioComTipoInvalido() {
        Usuario usuario = new Usuario("teste@email.com", "senha123", "INVALIDO", "Nome Teste");

        assertEquals("teste@email.com", usuario.getEmail());
        assertEquals("senha123", usuario.getSenha());
        assertEquals("INVALIDO", usuario.getTipo());
        assertEquals("Nome Teste", usuario.getNome());
    }

    @Test
    void UsuarioComNomeNulo() {
        Usuario usuario = new Usuario("teste@email.com", "senha123", "CLIENTE", null);

        assertEquals("teste@email.com", usuario.getEmail());
        assertEquals("senha123", usuario.getSenha());
        assertEquals("CLIENTE", usuario.getTipo());
        assertNull(usuario.getNome());
    }

    @Test
    void UsuarioComNomeVazio() {
        Usuario usuario = new Usuario("teste@email.com", "senha123", "CLIENTE", "");

        assertEquals("teste@email.com", usuario.getEmail());
        assertEquals("senha123", usuario.getSenha());
        assertEquals("CLIENTE", usuario.getTipo());
        assertEquals("", usuario.getNome());
    }

    @Test
    void UsuarioComTodosCamposNulos() {
        Usuario usuario = new Usuario(null, null, null, null);

        assertNull(usuario.getEmail());
        assertNull(usuario.getSenha());
        assertNull(usuario.getTipo());
        assertNull(usuario.getNome());
    }
}