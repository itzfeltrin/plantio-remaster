/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

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
                if(isThisDateValid(data)) {
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

    public boolean isThisDateValid(String dateToValidate){		
        if(dateToValidate == null){
                return false;
        }
        String dateFormat = "dd/MM/yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
        sdf.setLenient(false);		
        try {			
            //if not valid, it will throw ParseException
            Date date = (Date) sdf.parse(dateToValidate);
            System.out.println(date);		
        } catch (ParseException e) {               
            return false;
        }		
        return true;
    }
}
