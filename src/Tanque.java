/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Juan Rodolfo Alonzo
 */
public abstract class Tanque {
    
    private int id;
    private float capacidad;
    private float dimension;
    private float cantAgua;
    private String fechas;
    private int valvulasEnUso;
    
    public Tanque(){
        
    }
    
    public void abrirValvula(){
        
    }
    
    public void calcularAgua(){
        
    }
    
    public void restaurarAgua(){
        
    }
    
    public void setID(){
        this.id = id;
    }
    
    public int getID(){
        return id;
        
    }
    
    public void setCapacidad(){
        this.capacidad = capacidad;
    }
    
    public float getCapacidad(){
        return capacidad;
    }
    
    public void setDimension(){
        this.dimension = dimension;
    }
    
    public float getDimension(){
        return dimension;
    }
    
    public void setCantAgua(){
        this.cantAgua = cantAgua;
    }
    
    public float getCantAgua(){
        return cantAgua;
    }
    
    public void setFechas(){
        this.fechas = fechas;
    }
    
    public String getFechas(){
        return fechas;
    }
    
    public void setValvulasEnUso(){
        this.valvulasEnUso = valvulasEnUso;
    }
    
    public int getValvulasEnUso(){
        return valvulasEnUso;
    }
    
}
