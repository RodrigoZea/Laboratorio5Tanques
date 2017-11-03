/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MIGUEL
 */
public class Region implements Controles{
    int idR;
    String[] municipios;
    int[] habitantes;
    
    public Region(){
        
    }
    
    public Region(int idR, String[] municipios, int[] habitantes){
        this.idR = idR;
        this.municipios = municipios;
        this.habitantes = habitantes;
    }
    
    @Override
    public void calcularAgua() {
        
    }
    
}
