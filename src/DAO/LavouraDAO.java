/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entities.Lavoura;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author itzfeltrin
 */
public class LavouraDAO {
    public static boolean insert(Lavoura lavoura) {        
        String sql = "INSERT INTO lavoura (nome, extensao) VALUES (?, ?)";
        try {
            PreparedStatement ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, lavoura.nome);
            ps.setDouble(2, lavoura.extensao);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Lavoura adicionada com sucesso!");
            return true;
        } 
        catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage());
            return false;
        }
    }
    
    public static ArrayList<String[]> consult() {
        ArrayList<String[]> resultados = new ArrayList<>();
        String sql = "SELECT codigo, nome, extensao FROM lavoura ORDER BY codigo";
        PreparedStatement ps;
        try {
            ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String[] linha = new String[3];
                linha[0] = rs.getString("codigo");
                linha[1] = rs.getString("nome");
                linha[2] = rs.getString("extensao");
                resultados.add(linha);
            }
            return resultados;
        } 
        catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage());
            return null;
        }
    }
    
    public static boolean update(Lavoura lavoura) {
        String sql = "UPDATE lavoura SET nome = ?, extensao = ? WHERE codigo = ?";
        try {
            PreparedStatement ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, lavoura.nome);
            ps.setDouble(2, lavoura.extensao);
            ps.setInt(3, lavoura.codigo);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Lavoura alterada com sucesso!");
            return true;
        } 
        catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage());
            return false;
        }
    }
    
    public static boolean delete(int codigo){
        String sql = "DELETE FROM lavoura WHERE codigo = ?";
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
    
    public static ArrayList<String[]> search(String text) {
        ArrayList<String[]> resultados = new ArrayList<>();
        String texto = "%" + text + "%";
        String sql = "SELECT codigo, nome, extensao FROM lavoura WHERE upper(nome) LIKE ? ORDER BY codigo";
        PreparedStatement ps;
        try {
            ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, texto.toUpperCase());            
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String[] linha = new String[4];
                linha[0] = rs.getString("codigo");
                linha[1] = rs.getString("nome");
                linha[2] = rs.getString("extensao");                
                resultados.add(linha);
            }
            return resultados;
        } 
        catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage());
            return null;
        }
    }
    public static int getCodigo(Lavoura lavoura) {

        String sql = "SELECT codigo FROM lavoura WHERE nome = ? AND extensao = ?";
        try {            
            PreparedStatement ps = conexao.Conexao.getConexao().prepareStatement(sql);            
            ps.setString(1, lavoura.nome);
            ps.setDouble(2, lavoura.extensao);
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
    
    public static ArrayList<Lavoura> getLavouras() {
        ArrayList<Lavoura> resultados = new ArrayList<>();
        String sql = "SELECT * FROM lavoura ORDER BY codigo";
        PreparedStatement ps;
        try {
            ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                try {
                    int codigo = rs.getInt("codigo");
                    String nome = rs.getString("nome");
                    Double extensao = rs.getDouble("extensao");
                    Lavoura aux = new Lavoura(nome, extensao);
                    aux.codigo = codigo;
                    resultados.add(aux);
                }
                catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage());
                }
            }
            return resultados;
        } 
        catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage());
            return null;
        }
    }
    
}
