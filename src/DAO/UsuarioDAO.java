/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entities.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author itzfeltrin
 */
public class UsuarioDAO {
        
    public static boolean insert(Usuario usuario) {
        String sql = "INSERT INTO usuario (nome, senha) VALUES (?, ?)";
        try {
            if(exists(usuario)) {
                throw new Exception("Usuário já existe!");                
            }
            else {
                PreparedStatement ps = conexao.Conexao.getConexao().prepareStatement(sql);
                ps.setString(1, usuario.user);
                ps.setString(2, usuario.password);     
                ps.executeUpdate();
                return true;
            }
        }
        catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage());            
            return false;
        }
    }
    
    public static boolean exists(Usuario usuario) {
        String sql = "SELECT * FROM usuario WHERE nome = ?";
        try {
            PreparedStatement ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, usuario.user);            
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                //System.out.println("Usuario já existe!");
                return true;
            }
            else {
                //JOptionPane.showMessageDialog(null, "Usuario pode ser criado.");
                return false;
            }            
        }
        catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
    
    public static boolean auth(Usuario usuario) {
        String sql = "SELECT * FROM usuario WHERE nome = ? and senha = ?";
        try {
            PreparedStatement ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, usuario.user);
            ps.setString(2, usuario.password);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                //System.out.println("Login OK!");
                return true;
            }
            else {
                JOptionPane.showMessageDialog(null, "Credenciais não conferem!");
                return false;
            }            
        }
        catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            return false;
        }        
    }
}
