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
        if(user.length() > 0) {
            if(password.length() > 0) {
                this.user = user;
                this.password = password;
            }
            else {
                throw new Exception("Senha inválida");
            }
        }
        else {
            throw new Exception("Nome de usuário inválido");
        }
    }
}
