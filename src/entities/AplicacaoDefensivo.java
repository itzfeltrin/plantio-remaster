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
public class AplicacaoDefensivo {
    public Aplicacao aplicacao;
    public Defensivo defensivo;
    public Double valor;
    public Double dose;
    
    public AplicacaoDefensivo(Aplicacao aplicacao, Defensivo defensivo, Double valor, Double dose) throws Exception {
        this.aplicacao = aplicacao;
        this.defensivo = defensivo;
        if(valor > 0) {
            if(dose > 0) {
                this.valor = valor;
                this.dose = dose;
            }
            else {
                throw new Exception("Dose inválida!");
            }
        }
        else {
            throw new Exception("Valor inválido!");
        }
    }
}
