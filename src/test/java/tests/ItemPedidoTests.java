package tests;

import com.mycompany.projetolanchonete.model.ItemPedido;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

/**
 *
 * @author aluno.saolucas
 */
public class ItemPedidoTests {

    @Test
    void ItemPedidoCompleto() {
        ItemPedido itempedido = new ItemPedido(4, "Xis Salada", 29, 5);

        assertEquals(4, itempedido.getIdProduto());
        assertEquals("Xis Salada", itempedido.getNomeProduto());
        assertEquals(29, itempedido.getPrecoUnitario());
        assertEquals(5, itempedido.getQuantidade());
    }

    @Test
    void ItemPedidoComQuantidadeUm() {
        ItemPedido item = new ItemPedido(1, "Refrigerante", 8.5, 1);

        assertEquals(1, item.getIdProduto());
        assertEquals("Refrigerante", item.getNomeProduto());
        assertEquals(8.5, item.getPrecoUnitario());
        assertEquals(1, item.getQuantidade());
    }

    @Test
    void ItemPedidoComPrecoZero() {
        ItemPedido item = new ItemPedido(10, "Amostra Grátis", 0.0, 2);

        assertEquals(10, item.getIdProduto());
        assertEquals("Amostra Grátis", item.getNomeProduto());
        assertEquals(0.0, item.getPrecoUnitario());
        assertEquals(2, item.getQuantidade());
    }

    @Test
    void ItemPedidoComQuantidadeAlta() {
        ItemPedido item = new ItemPedido(7, "Xis Completo", 32.0, 50);

        assertEquals(7, item.getIdProduto());
        assertEquals("Xis Completo", item.getNomeProduto());
        assertEquals(32.0, item.getPrecoUnitario());
        assertEquals(50, item.getQuantidade());
    }

    @Test
    void ItemPedidoComIdNegativo() {
        ItemPedido item = new ItemPedido(-1, "Produto Inválido", 15.0, 1);

        assertEquals(-1, item.getIdProduto());
        assertEquals("Produto Inválido", item.getNomeProduto());
        assertEquals(15.0, item.getPrecoUnitario());
        assertEquals(1, item.getQuantidade());
    }

    @Test
    void ItemPedidoComQuantidadeZero() {
        ItemPedido item = new ItemPedido(3, "Xis Frango", 25.0, 0);

        assertEquals(3, item.getIdProduto());
        assertEquals("Xis Frango", item.getNomeProduto());
        assertEquals(25.0, item.getPrecoUnitario());
        assertEquals(0, item.getQuantidade());
    }

    @Test
    void ItemPedidoComQuantidadeNegativa() {
        ItemPedido item = new ItemPedido(5, "Batata Frita", 12.0, -3);

        assertEquals(5, item.getIdProduto());
        assertEquals("Batata Frita", item.getNomeProduto());
        assertEquals(12.0, item.getPrecoUnitario());
        assertEquals(-3, item.getQuantidade());
    }

    @Test
    void ItemPedidoComPrecoNegativo() {
        ItemPedido item = new ItemPedido(8, "Produto Erro", -10.0, 2);

        assertEquals(8, item.getIdProduto());
        assertEquals("Produto Erro", item.getNomeProduto());
        assertEquals(-10.0, item.getPrecoUnitario());
        assertEquals(2, item.getQuantidade());
    }

    @Test
    void ItemPedidoComNomeNulo() {
        ItemPedido item = new ItemPedido(9, null, 20.0, 1);

        assertEquals(9, item.getIdProduto());
        assertNull(item.getNomeProduto());
        assertEquals(20.0, item.getPrecoUnitario());
        assertEquals(1, item.getQuantidade());
    }

    @Test
    void ItemPedidoComNomeVazio() {
        ItemPedido item = new ItemPedido(11, "", 18.0, 4);

        assertEquals(11, item.getIdProduto());
        assertEquals("", item.getNomeProduto());
        assertEquals(18.0, item.getPrecoUnitario());
        assertEquals(4, item.getQuantidade());
    }
}