/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entities.Planta;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author itzfeltrin
 */
public class PlantaDAO {
    public static boolean insert(Planta planta) {        
        String sql = "INSERT INTO planta (tipo, cultivar, kgs) VALUES (?, ?, ?)";
        try {
            PreparedStatement ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, planta.tipo);
            ps.setString(2, planta.cultivar);
            ps.setDouble(3, planta.kgsPorSaca);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Planta adicionada com sucesso!");
            return true;
        } 
        catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage());
            return false;
        }
    }

    
    public static ArrayList<String[]> consult() {
        ArrayList<String[]> resultados = new ArrayList<>();
        String sql = "SELECT codigo, tipo, cultivar, kgs FROM planta ORDER BY codigo";
        PreparedStatement ps;
        try {
            ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String[] linha = new String[4];
                linha[0] = rs.getString("codigo");
                linha[1] = rs.getString("tipo");
                linha[2] = rs.getString("cultivar");
                linha[3] = rs.getString("kgs");
                resultados.add(linha);
            }
            return resultados;
        } 
        catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage());
            return null;
        }
    }
    
    public static boolean update(Planta planta) {
        String sql = "UPDATE planta SET tipo = ?, cultivar = ?, kgs = ? WHERE codigo = ?";
        try {
            PreparedStatement ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, planta.tipo);
            ps.setString(2, planta.cultivar);
            ps.setDouble(3, planta.kgsPorSaca);
            ps.setInt(4, planta.codigo);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Planta alterada com sucesso!");
            return true;
        } 
        catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage());
            return false;
        }
    }
    
    public static boolean delete(int codigo){
        String sql = "DELETE FROM planta WHERE codigo = ?";
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
        String sql = "SELECT codigo, tipo, cultivar, kgs FROM planta WHERE upper(tipo) LIKE ? OR upper(cultivar) LIKE ? ORDER BY codigo";
        PreparedStatement ps;
        try {
            ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, texto.toUpperCase());
            ps.setString(2, texto.toUpperCase());
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String[] linha = new String[4];
                linha[0] = rs.getString("codigo");
                linha[1] = rs.getString("tipo");
                linha[2] = rs.getString("cultivar");
                linha[3] = rs.getString("kgs");
                resultados.add(linha);
            }
            return resultados;
        } 
        catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage());
            return null;
        }
    }
    
    public static ArrayList<String> getTipo() {
        ArrayList<String> resultados = new ArrayList<>();
        String sql = "SELECT DISTINCT(tipo) FROM planta";
        PreparedStatement ps;
        try {
            ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String tipo = rs.getString("tipo");
                resultados.add(tipo);
            }
            return resultados;
        } 
        catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage());
            return null;
        }
    }
    
    public static ArrayList<Planta> getPlantaByTipo(String text) {
        ArrayList<Planta> resultados = new ArrayList<>();        
        String sql = "SELECT codigo, tipo, cultivar, kgs FROM planta WHERE tipo = ? ORDER BY codigo";
        PreparedStatement ps;
        try {
            ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, text);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int codigo = rs.getInt("codigo");
                String tipo = rs.getString("tipo");
                String cultivar = rs.getString("cultivar");
                Double qtd = rs.getDouble("kgs");
                Planta aux = new Planta(tipo, cultivar, qtd);
                aux.codigo = codigo;
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
