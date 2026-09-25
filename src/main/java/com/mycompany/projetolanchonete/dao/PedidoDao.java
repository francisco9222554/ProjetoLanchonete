package com.mycompany.projetolanchonete.dao;

import com.mycompany.projetolanchonete.model.Pedido;
import com.mycompany.projetolanchonete.model.ItemPedido;
import java.sql.*;

public class PedidoDao {

    public void salvar(Pedido pedido) {
        String sqlPedido = "INSERT INTO pedido (id_usuario, nome_cliente, telefone, cpf, cep, rua, numero, bairro, complemento, valor_total, frete) " +
                           "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        String sqlItem = "INSERT INTO item_pedido (id_pedido, id_produto, nome_produto, preco_unitario, quantidade) " +
                         "VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = Conexao.conectar()) {
            conn.setAutoCommit(false); // começa transação

            // Salva o pedido
            try (PreparedStatement ps = conn.prepareStatement(sqlPedido, Statement.RETURN_GENERATED_KEYS)) {
                ps.setInt(1, pedido.getIdUsuario());
                ps.setString(2, pedido.getNomeCliente());
                ps.setString(3, pedido.getTelefone());
                ps.setString(4, pedido.getCpf());
                ps.setString(5, pedido.getCep());
                ps.setString(6, pedido.getRua());
                ps.setString(7, pedido.getNumero());
                ps.setString(8, pedido.getBairro());
                ps.setString(9, pedido.getComplemento());
                ps.setDouble(10, pedido.getValorTotal());
                ps.setDouble(11, pedido.getFrete());
                ps.executeUpdate();

                // Pega o ID gerado do pedido
                ResultSet rs = ps.getGeneratedKeys();
                int idPedido = 0;
                if (rs.next()) {
                    idPedido = rs.getInt(1);
                }

                // Salva os itens do pedido
                try (PreparedStatement psItem = conn.prepareStatement(sqlItem)) {
                    for (ItemPedido item : pedido.getItens()) {
                        psItem.setInt(1, idPedido);
                        psItem.setInt(2, item.getIdProduto());
                        psItem.setString(3, item.getNomeProduto());
                        psItem.setDouble(4, item.getPrecoUnitario());
                        psItem.setInt(5, item.getQuantidade());
                        psItem.addBatch();
                    }
                    psItem.executeBatch();
                }
            }

            conn.commit(); // confirma tudo
            System.out.println("Pedido salvo com sucesso!");

        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Erro ao salvar pedido: " + e.getMessage());
        }
    }
}