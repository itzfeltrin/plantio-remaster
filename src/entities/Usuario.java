/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author Administrador
 */
public class Usuario {
    public String user;
    public String password;
    
    public Usuario(String user, String password) throws Exception {
        this.user = user;
        this.password = password;
    }
}
