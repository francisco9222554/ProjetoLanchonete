package com.mycompany.projetolanchonete.dao;

import com.mycompany.projetolanchonete.model.Usuario;
import java.sql.*;

public class UsuarioDao {
    public Usuario login(String email, String senha) {
        String sql = "SELECT * FROM usuario WHERE email = ? AND senha = ?";
        try (Connection conn = Conexao.conectar();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, email);
            ps.setString(2, senha);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new Usuario(rs.getInt("id"), rs.getString("email"),
                        rs.getString("senha"), rs.getString("tipo"), rs.getString("nome"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean cadastrar(Usuario u) {
        String sql = "INSERT INTO usuario (email, senha, tipo, nome) VALUES (?,?,?,?)";
        try (Connection conn = Conexao.conectar();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, u.getEmail());
            ps.setString(2, u.getSenha());
            ps.setString(3, u.getTipo());
            ps.setString(4, u.getNome());
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }
}