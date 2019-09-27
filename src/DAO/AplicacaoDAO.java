/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entities.Aplicacao;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class AplicacaoDAO {
    public static boolean insert(Aplicacao aplicacao) {        
        String sql = "INSERT INTO aplicacao (data, observacao, valor) VALUES (?, ?, ?)";
        try {
            PreparedStatement ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ps.setDate(1, Date.valueOf(aplicacao.data));
            ps.setString(2, aplicacao.observacao);
            ps.setDouble(2, aplicacao.valor);
            ps.executeUpdate();
            //JOptionPane.showMessageDialog(null, "Defensivo adicionado com sucesso!");
            return true;
        } 
        catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage());
            return false;
        }
    }
}
