
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
    protected int id;
    protected float capacidad;
    private float dimension;
    protected float cantAgua;
    protected ArrayList<String> fechas;
    protected int valvulasEnUso;
    protected boolean enUso;
    
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
    
    public String identificacion(){
        String id="";
        id = "Tanque";
        return id;
    }
    
    public void restaurarAgua(){
        
    }
    
    public void setID(int id){
        this.id = id;
    }
    
    @Override
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
    
    public void setEnUso(boolean enUso){
        this.enUso = enUso;
    }
    
    public boolean getEnUso(){
        return enUso;
    }
    
    public String showDetails(){
       String cadena="";
       cadena = "Tanque: " + getID() + "\n" +
               "Capacidad: " + getCapacidad() + "\n";
       
        return cadena;
    }
}
