/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.Calendar;

/**
 *
 * @author itzfeltrin
 */
public class Produtividade {    
    private int qtdSacas;
    private int ano;
    private Lavoura lavoura;
    private Planta planta;
    
    public Produtividade(int qtd, int ano, Lavoura lavoura, Planta planta) throws Exception {
        Calendar cal = Calendar.getInstance();        
        int year = cal.get(Calendar.YEAR);
        if(lavoura != null) {
            if(planta != null) {
                if(qtd > 0) {
                    if(ano <= year) {
                        this.qtdSacas = qtd;
                        this.ano = ano;
                        this.lavoura = lavoura;
                    }
                    else {
                        throw new Exception("Ano inválido!");
                    }
                }
                else {
                    throw new Exception("Número de sacas inválido!");
                }
            }
            else {
                throw new Exception("Planta inválida!");
            }
        }
        else {
            throw new Exception("Lavoura inválida!");
        }
    }
}
