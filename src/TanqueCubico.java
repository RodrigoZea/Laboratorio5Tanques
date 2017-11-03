/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Juan Rodolfo Alonzo
 */
public class TanqueCubico extends Tanque{
    
    private float longitud;
    
    public TanqueCubico(int id, float capacidad, float dimension, float cantAgua, String fechas, int valvulasEnUso){
        this.id = id;
        this.dimension = dimension;
        this.cantAgua = cantAgua;
        this.fechas = fechas;
        this.valvulasEnUso = valvulasEnUso;
    }
    
    public void calcularCapacidad(){
        longitud * longitud * longitud = capacidad;
    }
    
    public void setLongitud(){
        
    }
    
    public float getLongitud(){
        
    }
}
