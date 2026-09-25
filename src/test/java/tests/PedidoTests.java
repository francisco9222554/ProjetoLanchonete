/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
    void PedidoCompleto(){
        Pedido pedido = new Pedido(1, 4, "Luis Felipe", "984532134", "99944433322", "98453-343", "Avenida João Pereira", "405", "Camboim", "Apartamento 1", 40, 8); 
        
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
        assertEquals(40, pedido.getValorTotal());
        assertEquals(8, pedido.getFrete());
        
    }
}
