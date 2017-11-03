/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Juan Rodolfo Alonzo
 */
public class TanqueCilindrico extends Tanque{
    
    private float base;
    private float altura;
    
    public TanqueCilindrico(int id, float capacidad, float dimension, float cantAgua, String fechas, int valvulasEnUso){
        this.id = id;
        this.capacidad = capacidad;
        this.dimension = dimension;
        this.cantAgua = cantAgua;
        this.fechas = fechas;
        this.valvulasEnUso = valvulasEnUso;
    }
    
    public void calcularCapacidad(){
        
    }
    
    public void setBase(){
        this.base = base;
    }
    
    public float getBase(){
        return base;
    }
    
    public void setAltura(){
        this.altura = altura;
    }
    
    public float getAltura(){
        return altura;
    }
}
