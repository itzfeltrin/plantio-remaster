/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author itzfeltrin
 */
public class Defensivo {
    private String nome;
    private String classe;
    
    public Defensivo(String nome, String clase) throws Exception {
        if(nome.length() > 0) {
            if(classe.length() > 0) {
                this.nome = nome;
                this.classe = classe;
            }
            else {
                throw new Exception("Classe inválida!");
            }
        }
        else {
            throw new Exception("Nome inválido!");
        }
    }
}
