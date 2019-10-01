/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entities.Aplicacao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class AplicacaoDAO {
    public static boolean insert(Aplicacao aplicacao) throws ParseException {        
        String sql = "INSERT INTO aplicacao (data, observacao, cod_lavoura) VALUES (?, ?, ?)";
        try {
            PreparedStatement ps = conexao.Conexao.getConexao().prepareStatement(sql);            ;            
            java.sql.Date data = java.sql.Date.valueOf(aplicacao.data);            
            ps.setDate(1, data);
            ps.setString(2, aplicacao.observacao);
            ps.setDouble(3, aplicacao.lavoura.codigo);
            ps.executeUpdate();
            return true;
        } 
        catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace();
            //JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage());
            return false;
        }
    }
    
    public static int getCodigo(Aplicacao aplicacao) throws ParseException {

        String sql = "SELECT codigo FROM aplicacao WHERE data = ? AND cod_lavoura = ? ORDER BY codigo";
        try {            
            PreparedStatement ps = conexao.Conexao.getConexao().prepareStatement(sql);
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");            
            java.util.Date date = format.parse(aplicacao.data);
            ps.setDate(1, new java.sql.Date(date.getTime()));
            ps.setInt(2, aplicacao.lavoura.codigo);                         
            ResultSet rs = ps.executeQuery();
            int codigo = 0;
            while(rs.next()){
                codigo = rs.getInt("codigo");
            }
            return codigo;
        } 
        catch (SQLException | ClassNotFoundException ex) {
            System.out.println("Erro: " + ex.getMessage());
            return 0;
        }
    }
    
    public static boolean delete(int codigo){
        String sql = "DELETE FROM aplicacao WHERE codigo = ?";
        try {
            PreparedStatement ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ps.setInt(1, codigo);
            ps.executeUpdate();
            return true;
        }
        catch (SQLException | ClassNotFoundException ex){
            JOptionPane.showMessageDialog(null, "Não pode ser deletada");
            return false;
        }
    }
    
    public static boolean update(Aplicacao aplicacao) {
        String sql = "UPDATE aplicacao SET data = ?, observacao = ? WHERE codigo = ?";        
        try {            
            java.sql.Date data = java.sql.Date.valueOf(aplicacao.data);            
            PreparedStatement ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ps.setDate(1, data);
            ps.setString(2, aplicacao.observacao);
            ps.setInt(3, aplicacao.codigo);            
            ps.executeUpdate();
            return true;
        } 
        catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage());
            return false;
        }
    }
}
