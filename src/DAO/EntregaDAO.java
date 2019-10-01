/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entities.Entrega;
import entities.Lavoura;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author itzfeltrin
 */
public class EntregaDAO {
    public static boolean insert(Entrega entrega) throws ParseException {        
        String sql = "INSERT INTO entrega (cod_planta, cod_lavoura, safra, qtd_sacas, data_entrega) VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = conexao.Conexao.getConexao().prepareStatement(sql);            ;            
            java.sql.Date data = java.sql.Date.valueOf(entrega.dataEntrega);            
            //System.out.println(data);           
            
            ps.setInt(1, entrega.planta.codigo);
            ps.setInt(2, entrega.lavoura.codigo);
            ps.setInt(3, entrega.safra);
            ps.setInt(4, entrega.qtdEmSacas);
            ps.setDate(5, data);
            ps.executeUpdate();
            return true;
        } 
        catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace();
            //JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage());
            return false;
        }
    }
    
    public static ArrayList<String[]> consult(Lavoura lavoura) {
        ArrayList<String[]> resultados = new ArrayList<>();
        String sql = "SELECT e.codigo, p.tipo, p.cultivar, e.safra, e.qtd_sacas, e.qtd_kgs, e.data_entrega, e.data_cadastro, e.data_alteracao\n" +
                        "  FROM lavoura l \n" +
                        "  JOIN entrega e ON l.codigo = e.cod_lavoura\n" +
                        "  JOIN planta p ON p.codigo = e.cod_planta\n" +
                        "  WHERE l.codigo = ?\n" +
                        "  ORDER BY l.codigo";
        PreparedStatement ps;
        try {
            ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ps.setInt(1, lavoura.codigo);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String[] linha = new String[9];
                linha[0] = rs.getString("codigo");
                linha[1] = rs.getString("tipo");
                linha[2] = rs.getString("cultivar");
                linha[3] = rs.getString("safra");
                linha[4] = rs.getString("qtd_sacas");
                linha[5] = rs.getString("qtd_kgs");
                linha[6] = rs.getString("data_entrega");
                linha[7] = rs.getString("data_cadastro");
                linha[8] = rs.getString("data_alteracao");
                resultados.add(linha);
            }
            return resultados;
        } 
        catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage());
            return null;
        }
    }
    
    public static boolean update(Entrega entrega) {
        String sql = "UPDATE entrega SET cod_planta = ?, cod_lavoura = ?, safra = ?, qtd_sacas = ?, data_entrega = ? WHERE codigo = ?";        
        try {            
            java.sql.Date data = java.sql.Date.valueOf(entrega.dataEntrega);            
            PreparedStatement ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ps.setInt(1, entrega.planta.codigo);
            ps.setInt(2, entrega.lavoura.codigo);
            ps.setInt(3, entrega.safra);
            ps.setInt(4, entrega.qtdEmSacas);
            ps.setDate(5, data);
            ps.setInt(6, entrega.codigo);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Alterada com sucesso!");
            return true;
        } 
        catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage());
            return false;
        }
    }
    
    public static boolean delete(int codigo){
        String sql = "DELETE FROM entrega WHERE codigo = ?";
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
}
