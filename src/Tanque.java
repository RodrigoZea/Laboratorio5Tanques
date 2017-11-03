
import java.util.ArrayList;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Juan Rodolfo Alonzo
 */
@Entity
public abstract class Tanque implements Controles {
    
    @Id private ObjectId idt;
    private int id;
    private float capacidad;
    private float dimension;
    private float cantAgua;
    private ArrayList<String> fechas;
    private int valvulasEnUso;
    
    public Tanque(){
        
    }
    
    public Tanque(int id, int valvulasEnUso){
        this.id = id;
        this.valvulasEnUso = valvulasEnUso; 
    }
    
    public void abrirValvula(){
        
    }
    
    @Override
    public void calcularAgua(){
        
    }
    
    public void restaurarAgua(){
        
    }
    
    public void setID(int id){
        this.id = id;
    }
    
    public int getID(){
        return id;
        
    }
    
    public void setCapacidad(float capacidad){
        this.capacidad = capacidad;
    }
    
    public float getCapacidad(){
        return capacidad;
    }
    
    public void setDimension(float dimension){
        this.dimension = dimension;
    }
    
    public float getDimension(){
        return dimension;
    }
    
    public void setCantAgua(float cantAgua){
        this.cantAgua = cantAgua;
    }
    
    public float getCantAgua(){
        return cantAgua;
    }
    
    public void setValvulasEnUso(int valvulasEnUso){
        this.valvulasEnUso = valvulasEnUso;
    }
    
    public int getValvulasEnUso(){
        return valvulasEnUso;
    }
    
}
