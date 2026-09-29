package tests;

import com.mycompany.projetolanchonete.model.Produto;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;

public class ProdutoTests {

    // ========== TESTE POSITIVO ==========
    @Test
    void ProdutoCadastrado() {
        Produto produto = new Produto(2, "Xis Bacon", "Lanches", 35.0);

        assertEquals(2, produto.getId());
        assertEquals("Xis Bacon", produto.getNome());
        assertEquals("Lanches", produto.getCategoria());
        assertEquals(35.0, produto.getPreco());
    }

    @Test
    void ProdutoComPrecoBaixo() {
        Produto produto = new Produto(5, "Água Mineral", "Bebidas", 3.50);

        assertEquals(5, produto.getId());
        assertEquals("Água Mineral", produto.getNome());
        assertEquals("Bebidas", produto.getCategoria());
        assertEquals(3.50, produto.getPreco());
    }

    @Test
    void ProdutoComPrecoAlto() {
        Produto produto = new Produto(12, "Xis Especial Gourmet", "Lanches", 89.90);

        assertEquals(12, produto.getId());
        assertEquals("Xis Especial Gourmet", produto.getNome());
        assertEquals("Lanches", produto.getCategoria());
        assertEquals(89.90, produto.getPreco());
    }

    @Test
    void ProdutoCategoriaDiferente() {
        Produto produto = new Produto(8, "Milkshake de Chocolate", "Sobremesas", 18.0);

        assertEquals(8, produto.getId());
        assertEquals("Milkshake de Chocolate", produto.getNome());
        assertEquals("Sobremesas", produto.getCategoria());
        assertEquals(18.0, produto.getPreco());
    }

    @Test
    void ProdutoComPrecoZero() {
        Produto produto = new Produto(20, "Amostra", "Promoções", 0.0);

        assertEquals(20, produto.getId());
        assertEquals("Amostra", produto.getNome());
        assertEquals("Promoções", produto.getCategoria());
        assertEquals(0.0, produto.getPreco());
    }

    // ========== TESTES NEGATIVOS ==========
    @Test
    void ProdutoComIdNegativo() {
        Produto produto = new Produto(-1, "Produto Inválido", "Lanches", 25.0);

        assertEquals(-1, produto.getId());
        assertEquals("Produto Inválido", produto.getNome());
        assertEquals("Lanches", produto.getCategoria());
        assertEquals(25.0, produto.getPreco());
    }

    @Test
    void ProdutoComIdZero() {
        Produto produto = new Produto(0, "Produto Zero", "Outros", 10.0);

        assertEquals(0, produto.getId());
        assertEquals("Produto Zero", produto.getNome());
        assertEquals("Outros", produto.getCategoria());
        assertEquals(10.0, produto.getPreco());
    }

    @Test
    void ProdutoComPrecoNegativo() {
        Produto produto = new Produto(15, "Produto Erro", "Lanches", -20.0);

        assertEquals(15, produto.getId());
        assertEquals("Produto Erro", produto.getNome());
        assertEquals("Lanches", produto.getCategoria());
        assertEquals(-20.0, produto.getPreco());
    }

    @Test
    void ProdutoComNomeNulo() {
        Produto produto = new Produto(3, null, "Bebidas", 8.0);

        assertEquals(3, produto.getId());
        assertNull(produto.getNome());
        assertEquals("Bebidas", produto.getCategoria());
        assertEquals(8.0, produto.getPreco());
    }

    @Test
    void ProdutoComNomeVazio() {
        Produto produto = new Produto(4, "", "Lanches", 22.0);

        assertEquals(4, produto.getId());
        assertEquals("", produto.getNome());
        assertEquals("Lanches", produto.getCategoria());
        assertEquals(22.0, produto.getPreco());
    }

    @Test
    void ProdutoComCategoriaNula() {
        Produto produto = new Produto(6, "Xis Calabresa", null, 28.0);

        assertEquals(6, produto.getId());
        assertEquals("Xis Calabresa", produto.getNome());
        assertNull(produto.getCategoria());
        assertEquals(28.0, produto.getPreco());
    }

    @Test
    void ProdutoComCategoriaVazia() {
        Produto produto = new Produto(7, "Batata", "", 12.0);

        assertEquals(7, produto.getId());
        assertEquals("Batata", produto.getNome());
        assertEquals("", produto.getCategoria());
        assertEquals(12.0, produto.getPreco());
    }

    @Test
    void ProdutoComNomeECategoriaNulos() {
        Produto produto = new Produto(9, null, null, 15.0);

        assertEquals(9, produto.getId());
        assertNull(produto.getNome());
        assertNull(produto.getCategoria());
        assertEquals(15.0, produto.getPreco());
    }
}