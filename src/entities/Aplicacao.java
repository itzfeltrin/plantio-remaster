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
    public Integer codigo;
    public String data;
    public String observacao;
    public Double valor;
    public Lavoura lavoura;
    
    public Aplicacao(String data, String observacao, Lavoura lavoura) throws Exception {
        if(data.length() == 10) {
            this.data = data;
            this.lavoura = lavoura;
            this.valor = 0.00;
            if(observacao.length() == 0) this.observacao = null;
            else this.observacao = observacao;            
        }
        else {
            throw new Exception ("Data de aplicação inválida!");
        }
    }
}
