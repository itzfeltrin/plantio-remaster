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
public class Lavoura {
    public Integer codigo;
    public String nome;
    public Double extensao;
    
    public Lavoura(String nome, Double extensao) throws Exception {
        if(nome.length() > 0 && extensao >= 0.1) {
            this.nome = nome;
            this.extensao = extensao;
            this.codigo = null;
        }
        else {
            throw new Exception ("Dados de lavoura inválidos!");
        }
    }
}
