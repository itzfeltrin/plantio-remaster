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
public class Entrega {
    public Lavoura lavoura;
    public Planta planta;
    public Integer safra;
    public Integer qtdEmSacas;
    public Integer qtdEmKgs;
    public String dataEntrega;
    public int codigo;
    
    public Entrega(Lavoura lavoura, Planta planta, Integer safra, Integer qtd, String data) throws Exception {
        if(lavoura != null) {
            if(planta != null) {
                if(safra > 0) {
                    if(qtd > 0) {
                        if(data.length() == 10) {
                            this.lavoura = lavoura;
                            this.planta = planta;
                            this.safra = safra;
                            this.qtdEmSacas = qtd;
                            this.dataEntrega = data;
                        }
                        else {
                            throw new Exception("Data de entrega inválida");
                        }
                    } 
                    else {
                        throw new Exception("Quantidade inválida");
                    }
                }
                else {
                    throw new Exception("Safra inválida");
                }
            }
            else {
                throw new Exception("Planta inválida");
            }
        }
        else {
            throw new Exception("Lavoura inválida");
        }
    }
}
