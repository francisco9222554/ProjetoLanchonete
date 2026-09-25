package com.mycompany.projetolanchonete.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.io.File;

public class Conexao {

    private static final String URL = "jdbc:sqlite:lanchonete.db";

    public static Connection conectar() throws SQLException {
        return DriverManager.getConnection(URL);
    }

    public static void inicializarBanco() {
        System.out.println("=== INICIANDO BANCO DE DADOS ===");
        
        File dbFile = new File("lanchonete.db");
        System.out.println("Caminho do banco: " + dbFile.getAbsolutePath());

        String sqlUsuario = "CREATE TABLE IF NOT EXISTS usuario (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "email TEXT UNIQUE NOT NULL, " +
                "senha TEXT NOT NULL, " +
                "tipo TEXT NOT NULL, " +
                "nome TEXT)";

        String sqlProduto = "CREATE TABLE IF NOT EXISTS produto (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "nome TEXT NOT NULL, " +
                "categoria TEXT NOT NULL, " +
                "preco REAL NOT NULL)";

        String sqlPedido = "CREATE TABLE IF NOT EXISTS pedido (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "id_usuario INTEGER, " +
                "nome_cliente TEXT, " +
                "telefone TEXT, " +
                "cpf TEXT, " +
                "cep TEXT, " +
                "rua TEXT, " +
                "numero TEXT, " +
                "bairro TEXT, " +
                "complemento TEXT, " +
                "valor_total REAL, " +
                "frete REAL)";

        String sqlItem = "CREATE TABLE IF NOT EXISTS item_pedido (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "id_pedido INTEGER, " +
                "id_produto INTEGER, " +
                "nome_produto TEXT, " +
                "preco_unitario REAL, " +
                "quantidade INTEGER)";

        try {
            Class.forName("org.sqlite.JDBC");
            
            try (Connection conn = conectar();
                 Statement st = conn.createStatement()) {

                st.execute(sqlUsuario);
                st.execute(sqlProduto);
                st.execute(sqlPedido);
                st.execute(sqlItem);

                st.execute("INSERT OR IGNORE INTO usuario (email, senha, tipo, nome) " +
                           "VALUES ('admin@lanchonete.com', 'admin123', 'ADMIN', 'Administrador')");

                System.out.println("Banco inicializado com sucesso!");
                System.out.println("Tabelas criadas/verificadas.");
                System.out.println("Admin padrão: admin@lanchonete.com / admin123");
                
            }
        } catch (ClassNotFoundException e) {
            System.err.println("ERRO: Driver SQLite não encontrado!");
            System.err.println("Adicione o sqlite-jdbc.jar nas Libraries do projeto.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("ERRO ao conectar/criar banco: " + e.getMessage());
            e.printStackTrace();
        }
    }
}