package tests;

import com.mycompany.projetolanchonete.model.Produto;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ProdutoTests {
    
    @Test
    void ProdutoCadastrado(){
        Produto produto = new Produto(2, "Xis Bacon" , "Lanches", 35.0 );
        
        assertEquals(2, produto.getId());
        assertEquals("Xis Bacon", produto.getNome());
        assertEquals("Lanches", produto.getCategoria());
        assertEquals(35.0, produto.getPreco());
    }
}
