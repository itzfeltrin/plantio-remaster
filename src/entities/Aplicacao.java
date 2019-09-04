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
public class Aplicacao {
    private String data;
    private String observacao;
    private Lavoura lavoura;
    
    public Aplicacao(String data, String observacao, Lavoura lavoura) throws Exception {
        if(data.length() == 10) {
            this.data = data;
            this.lavoura = lavoura;
            if(observacao.length() == 0) this.observacao = null;
            else this.observacao = observacao;
        }
        else {
            throw new Exception ("Data de aplicação inválida!");
        }
    }
}
