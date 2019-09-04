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
public class LavouraPlanta {
    private Lavoura lavoura;
    private Planta planta;
    private String data;
    
    public LavouraPlanta(Lavoura lavoura, Planta planta, String data) throws Exception {
        if(lavoura != null) {            
            if(planta != null) {
                if(data.length() == 10) {
                    this.lavoura = lavoura;
                    this.planta = planta;
                    this.data = data;
                }
                else {
                    throw new Exception("Data inválida!");
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
