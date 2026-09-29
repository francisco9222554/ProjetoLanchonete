package tests;

import com.mycompany.projetolanchonete.model.Pedido;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

/**
 *
 * @author aluno.saolucas
 */
public class PedidoTests {

    @Test
    void PedidoCompleto() {
        Pedido pedido = new Pedido();

        pedido.setId(1);
        pedido.setIdUsuario(4);
        pedido.setNomeCliente("Luis Felipe");
        pedido.setTelefone("984532134");
        pedido.setCpf("99944433322");
        pedido.setCep("98453-343");
        pedido.setRua("Avenida João Pereira");
        pedido.setNumero("405");
        pedido.setBairro("Camboim");
        pedido.setComplemento("Apartamento 1");
        pedido.setValorTotal(43.0);
        pedido.setFrete(8.0);

        assertEquals(1, pedido.getId());
        assertEquals(4, pedido.getIdUsuario());
        assertEquals("Luis Felipe", pedido.getNomeCliente());
        assertEquals("984532134", pedido.getTelefone());
        assertEquals("99944433322", pedido.getCpf());
        assertEquals("98453-343", pedido.getCep());
        assertEquals("Avenida João Pereira", pedido.getRua());
        assertEquals("405", pedido.getNumero());
        assertEquals("Camboim", pedido.getBairro());
        assertEquals("Apartamento 1", pedido.getComplemento());
        assertEquals(43.0, pedido.getValorTotal());
        assertEquals(8.0, pedido.getFrete());
    }

    @Test
    void PedidoSemComplemento() {
        Pedido pedido = new Pedido();
        pedido.setId(2);
        pedido.setIdUsuario(5);
        pedido.setNomeCliente("Maria Souza");
        pedido.setTelefone("51987654321");
        pedido.setCpf("11122233344");
        pedido.setCep("90000-000");
        pedido.setRua("Rua das Flores");
        pedido.setNumero("100");
        pedido.setBairro("Centro");
        pedido.setComplemento("");
        pedido.setValorTotal(55.0);
        pedido.setFrete(10.0);

        assertEquals(2, pedido.getId());
        assertEquals(5, pedido.getIdUsuario());
        assertEquals("Maria Souza", pedido.getNomeCliente());
        assertEquals("51987654321", pedido.getTelefone());
        assertEquals("11122233344", pedido.getCpf());
        assertEquals("90000-000", pedido.getCep());
        assertEquals("Rua das Flores", pedido.getRua());
        assertEquals("100", pedido.getNumero());
        assertEquals("Centro", pedido.getBairro());
        assertEquals("", pedido.getComplemento());
        assertEquals(55.0, pedido.getValorTotal());
        assertEquals(10.0, pedido.getFrete());
    }

    @Test
    void PedidoComFreteZero() {
        Pedido pedido = new Pedido();
        pedido.setId(3);
        pedido.setIdUsuario(1);
        pedido.setNomeCliente("João Pedro");
        pedido.setTelefone("51999887766");
        pedido.setCpf("55566677788");
        pedido.setCep("91000-100");
        pedido.setRua("Av. Principal");
        pedido.setNumero("50");
        pedido.setBairro("Bairro Novo");
        pedido.setComplemento("Casa");
        pedido.setValorTotal(30.0);
        pedido.setFrete(0.0);

        assertEquals(3, pedido.getId());
        assertEquals(0.0, pedido.getFrete());
        assertEquals(30.0, pedido.getValorTotal());
    }

    @Test
    void PedidoComValoresMinimos() {
        Pedido pedido = new Pedido();
        pedido.setId(0);
        pedido.setIdUsuario(0);
        pedido.setNomeCliente("A");
        pedido.setTelefone("1");
        pedido.setCpf("1");
        pedido.setCep("1");
        pedido.setRua("R");
        pedido.setNumero("1");
        pedido.setBairro("B");
        pedido.setComplemento("");
        pedido.setValorTotal(0.0);
        pedido.setFrete(0.0);

        assertEquals(0, pedido.getId());
        assertEquals(0, pedido.getIdUsuario());
        assertEquals("A", pedido.getNomeCliente());
        assertEquals(0.0, pedido.getValorTotal());
        assertEquals(0.0, pedido.getFrete());
    }

    // ========== TESTES NEGATIVOS ==========
    @Test
    void PedidoComIdNegativo() {
        Pedido pedido = new Pedido();
        pedido.setId(-5);
        pedido.setIdUsuario(2);
        pedido.setNomeCliente("Teste");
        pedido.setValorTotal(20.0);
        pedido.setFrete(5.0);

        assertEquals(-5, pedido.getId());
        assertEquals(2, pedido.getIdUsuario());
    }

    @Test
    void PedidoComIdUsuarioNegativo() {
        Pedido pedido = new Pedido();
        pedido.setId(10);
        pedido.setIdUsuario(-1);
        pedido.setNomeCliente("Cliente Teste");

        assertEquals(10, pedido.getId());
        assertEquals(-1, pedido.getIdUsuario());
    }

    @Test
    void PedidoComValorTotalNegativo() {
        Pedido pedido = new Pedido();
        pedido.setId(4);
        pedido.setValorTotal(-50.0);
        pedido.setFrete(8.0);

        assertEquals(-50.0, pedido.getValorTotal());
        assertEquals(8.0, pedido.getFrete());
    }

    @Test
    void PedidoComFreteNegativo() {
        Pedido pedido = new Pedido();
        pedido.setId(5);
        pedido.setValorTotal(40.0);
        pedido.setFrete(-3.0);

        assertEquals(40.0, pedido.getValorTotal());
        assertEquals(-3.0, pedido.getFrete());
    }

    @Test
    void PedidoComCamposNulos() {
        Pedido pedido = new Pedido();
        pedido.setId(6);
        pedido.setIdUsuario(3);
        pedido.setNomeCliente(null);
        pedido.setTelefone(null);
        pedido.setCpf(null);
        pedido.setCep(null);
        pedido.setRua(null);
        pedido.setNumero(null);
        pedido.setBairro(null);
        pedido.setComplemento(null);
        pedido.setValorTotal(25.0);
        pedido.setFrete(7.0);

        assertEquals(6, pedido.getId());
        assertNull(pedido.getNomeCliente());
        assertNull(pedido.getTelefone());
        assertNull(pedido.getCpf());
        assertNull(pedido.getCep());
        assertNull(pedido.getRua());
        assertNull(pedido.getNumero());
        assertNull(pedido.getBairro());
        assertNull(pedido.getComplemento());
        assertEquals(25.0, pedido.getValorTotal());
        assertEquals(7.0, pedido.getFrete());
    }

    @Test
    void PedidoComCamposVazios() {
        Pedido pedido = new Pedido();
        pedido.setId(7);
        pedido.setIdUsuario(8);
        pedido.setNomeCliente("");
        pedido.setTelefone("");
        pedido.setCpf("");
        pedido.setCep("");
        pedido.setRua("");
        pedido.setNumero("");
        pedido.setBairro("");
        pedido.setComplemento("");
        pedido.setValorTotal(15.0);
        pedido.setFrete(5.0);

        assertEquals("", pedido.getNomeCliente());
        assertEquals("", pedido.getTelefone());
        assertEquals("", pedido.getCpf());
        assertEquals("", pedido.getCep());
        assertEquals("", pedido.getRua());
        assertEquals("", pedido.getNumero());
        assertEquals("", pedido.getBairro());
        assertEquals("", pedido.getComplemento());
    }

    @Test
    void PedidoComCpfInvalido() {
        Pedido pedido = new Pedido();
        pedido.setId(8);
        pedido.setCpf("123");
        pedido.setNomeCliente("Teste CPF");

        assertEquals("123", pedido.getCpf());
        assertEquals("Teste CPF", pedido.getNomeCliente());
    }

    @Test
    void PedidoComTelefoneInvalido() {
        Pedido pedido = new Pedido();
        pedido.setId(9);
        pedido.setTelefone("abc-def");
        pedido.setNomeCliente("Teste Telefone");

        assertEquals("abc-def", pedido.getTelefone());
    }
}