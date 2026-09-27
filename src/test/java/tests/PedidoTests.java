package tests;

import com.mycompany.projetolanchonete.model.Pedido;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

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
}