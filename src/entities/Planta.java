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
public class Planta {
    public Integer codigo;
    public String tipo;
    public String cultivar;
    public Double kgsPorSaca;
    
    public Planta(String tipo, String cultivar) throws Exception {
        if(tipo.length() > 0)
            if(cultivar.length() > 0) {    
                this.tipo = tipo;
                this.cultivar = cultivar;                
            }
            else {
                throw new Exception("Cultivar inválido");
            }
        else {
            throw new Exception("Tipo de planta inválido");
        }
    }
    
    public Planta(String tipo, String cultivar, Double kgs) throws Exception {
        if(tipo.length() > 0)
            if(cultivar.length() > 0) {    
                if(kgs > 0) {
                    this.tipo = tipo;
                    this.cultivar = cultivar;
                    this.kgsPorSaca = kgs;
                }
                else {
                    throw new Exception("Quantidade de quilos inválida");
                }
            }
            else {
                throw new Exception("Cultivar inválido");
            }
        else {
            throw new Exception("Tipo de planta inválido");
        }
    }

    public String getTipo() {
        return this.tipo;
    }

    public String getCultivar() {
        return this.cultivar;
    }
}
