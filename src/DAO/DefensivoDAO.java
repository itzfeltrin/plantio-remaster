/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entities.Defensivo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author itzfeltrin
 */
public class DefensivoDAO {
    public static boolean insert(Defensivo defensivo) {        
        String sql = "INSERT INTO defensivo (nome, classe) VALUES (?, ?)";
        try {
            PreparedStatement ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, defensivo.nome);
            ps.setString(2, defensivo.classe);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Defensivo adicionado com sucesso!");
            return true;
        } 
        catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage());
            return false;
        }
    }
    
    public static ArrayList<String[]> consult() {
        ArrayList<String[]> resultados = new ArrayList<>();
        String sql = "SELECT codigo, nome, classe FROM defensivo ORDER BY codigo";
        PreparedStatement ps;
        try {
            ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String[] linha = new String[3];
                linha[0] = rs.getString("codigo");
                linha[1] = rs.getString("nome");
                linha[2] = rs.getString("classe");
                resultados.add(linha);
            }
            return resultados;
        } 
        catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage());
            return null;
        }
    }
    
    public static boolean update(Defensivo defensivo) {
        String sql = "UPDATE defensivo SET nome = ?, classe = ? WHERE codigo = ?";
        try {
            PreparedStatement ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, defensivo.nome);
            ps.setString(2, defensivo.classe);
            ps.setInt(3, defensivo.codigo);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Defensivo alterado com sucesso!");
            return true;
        } 
        catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage());
            return false;
        }
    }
    
    public static boolean delete(int codigo){
        String sql = "DELETE FROM defensivo WHERE codigo = ?";
        try {
            PreparedStatement ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ps.setInt(1, codigo);
            ps.executeUpdate();
            return true;
        }
        catch (SQLException | ClassNotFoundException ex){
            JOptionPane.showMessageDialog(null, "Não pode ser deletado");
            return false;
        }
    }
    
    public static ArrayList<String[]> search(String text) {
        ArrayList<String[]> resultados = new ArrayList<>();
        String texto = "%" + text + "%";
        String sql = "SELECT codigo, nome, classe FROM defensivo WHERE upper(nome) LIKE ? OR upper(classe) LIKE ? ORDER BY codigo";
        PreparedStatement ps;
        try {
            ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, texto.toUpperCase());
            ps.setString(2, texto.toUpperCase());
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String[] linha = new String[3];
                linha[0] = rs.getString("codigo");
                linha[1] = rs.getString("nome");
                linha[2] = rs.getString("classe");
                resultados.add(linha);
            }
            return resultados;
        } 
        catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage());
            return null;
        }
    }
    
    public static ArrayList<String> getClasse() {
        ArrayList<String> resultados = new ArrayList<>();
        String sql = "SELECT DISTINCT(classe) FROM defensivo";
        PreparedStatement ps;
        try {
            ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String classe = rs.getString("classe");
                resultados.add(classe);
            }
            return resultados;
        } 
        catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage());
            return null;
        }
    }
    
    public static ArrayList<Defensivo> getDefensivoByClasse(String text) {
        ArrayList<Defensivo> resultados = new ArrayList<>();        
        String sql = "SELECT codigo, nome, classe FROM defensivo WHERE classe = ? ORDER BY codigo";
        PreparedStatement ps;
        try {
            ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, text);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Defensivo aux = new Defensivo(rs.getString("nome"), rs.getString("classe"));
                aux.codigo = rs.getInt("codigo");
                resultados.add(aux);
            }
            return resultados;
        } 
        catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage());
            return null;
        }
    }
}
