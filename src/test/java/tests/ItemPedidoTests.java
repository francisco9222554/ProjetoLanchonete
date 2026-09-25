/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tests;
import com.mycompany.projetolanchonete.model.ItemPedido;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
/**
 *
 * @author aluno.saolucas
 */
public class ItemPedidoTests {
    
    @Test
    void ItemPedidoCompleto(){
        ItemPedido itempedido = new ItemPedido(4, "Xis Salada", 29, 1);
        
        assertEquals(4, itempedido.getIdProduto());
        assertEquals("Xis Salada", itempedido.getNomeProduto());
        assertEquals(29, itempedido.getPrecoUnitario());
        assertEquals(5, itempedido.getQuantidade());
    }
}
