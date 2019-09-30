/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entities.AplicacaoDefensivo;
import entities.Lavoura;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class AplicacaoDefensivoDAO {
    public static boolean insert(AplicacaoDefensivo aplicacaoDefensivo) {        
        String sql = "INSERT INTO aplicacaodefensivo (valor, dose, cod_aplicacao, cod_defensivo) VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ps.setDouble(1, aplicacaoDefensivo.valor);
            ps.setDouble(2, aplicacaoDefensivo.dose);
            System.out.println("codigo aplicacao: " + aplicacaoDefensivo.aplicacao.codigo);
            ps.setInt(3, aplicacaoDefensivo.aplicacao.codigo);
            ps.setInt(4, aplicacaoDefensivo.defensivo.codigo);
            ps.executeUpdate();
            //JOptionPane.showMessageDialog(null, "Defensivo adicionado com sucesso!");
            return true;
        } 
        catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage());
            return false;
        }
    }
    
    public static ArrayList<String[]> consult(Lavoura lavoura) {
        ArrayList<String[]> resultados = new ArrayList<>();
        String sql = "SELECT d.classe, d.nome, a.data, a.observacao, ad.dose, ad.valor\n" +
                        "  FROM defensivo d\n" +
                        "  JOIN aplicacaodefensivo ad ON d.codigo = ad.cod_defensivo\n" +
                        "  JOIN aplicacao a ON a.codigo = ad.cod_aplicacao\n" +
                        "  JOIN lavoura l ON l.codigo = a.cod_lavoura\n" +
                        "  WHERE l.codigo = ?";
        PreparedStatement ps;
        try {
            ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ps.setInt(1, lavoura.codigo);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String[] linha = new String[6];
                linha[0] = rs.getString("classe");
                linha[1] = rs.getString("nome");
                linha[2] = rs.getString("data");
                linha[3] = rs.getString("observacao");
                linha[4] = rs.getString("dose");
                linha[5] = rs.getString("valor");
                resultados.add(linha);
            }
            return resultados;
        } 
        catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage());
            return null;
        }
    }
}
