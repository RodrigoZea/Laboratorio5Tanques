
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
 * @author Rodrigo Zea y Rodolfo Alonzo
 * @version 02.11.17
 */
@Entity
public abstract class Tanque implements Controles {
    
    @Id private ObjectId idt;
    protected int id;
    protected float capacidad;
    private float dimension;
    protected float cantAgua;
    protected ArrayList<String> fechas = new ArrayList<>();
    protected int valvulasEnUso;
    protected boolean enUso;
    protected float porcentaje;
    
    public Tanque(){
        
    }
    
    /**
     * Crea un nuevo objeto de Tipo tanque, aunque la clase es abstracta por lo que Tanque como tal no se instancia
     * @param id El id del tanque
     * @param valvulasEnUso Las valvulas en uso del tanque
     */
    public Tanque(int id, int valvulasEnUso){
        this.id = id;
        this.valvulasEnUso = valvulasEnUso; 
        this.porcentaje = 100;
    }
    
    
    @Override
    public void calcularAgua(){
        
    }
    
    /**
     * Le da una identificacion al objeto
     * @return id String que identifica si el objeto es un tanque o region
     */
    @Override 
    public String identificacion(){
        String id="";
        id = "Tanque";
        return id;
    }
    
    public void restaurarAgua(){
        
    }
    
    @Override
    public float getNecesidad(){
        return cantAgua;
    }
    
    /**
     * Permite configurar el ID del tanque
     * @param id El id del Tanque
     */
    public void setID(int id){
        this.id = id;
    }
    
    @Override
    public int getID(){
        return id;
        
    }
    
    /**
     * Permite configurar la capacidad del tanque
     * @param capacidad La capacidad en m3 del tanque
     */
    public void setCapacidad(float capacidad){
        this.capacidad = capacidad;
    }
    
    /**
     * Permite obtener la capacidad del tanque
     * @return capacidad La capacidad en m3 del tanque
     */
    public float getCapacidad(){
        return capacidad;
    }
    
    /**
     * Permite configurar la dimension genérica del tanque
     * @param dimension La dimension generica del tanque
     */
    public void setDimension(float dimension){
        this.dimension = dimension;
    }
    
    /**
     * Permite obtener la dimension generica del tanque
     * @return dimension La dimension generica del tanque
     */
    public float getDimension(){
        return dimension;
    }
    
    /**
     * Permite configurar la cantidad de Agua que tiene el tanque
     * @param cantAgua La cantidad de agua que tiene el tanque
     */
    public void setCantAgua(float cantAgua){
        this.cantAgua = cantAgua;
    }
    
    /**
     * Obtiene la cantidad de Agua que tiene el tanque
     * @return cantAgua La cantidad de agua que tiene el tanque
     */
    public float getCantAgua(){
        return cantAgua;
    }
    
    /**
     * Configura la cantidad de válvulas que están siendo usadas del tanque
     * @param valvulasEnUso La cantidad de valvulas que están siendo usadas
     */
    public void setValvulasEnUso(int valvulasEnUso){
        this.valvulasEnUso = valvulasEnUso;
    }
    
    /**
     * Obtiene la cantidad de válvulas que están siendo usadas del tanque
     * @return valvulasEnUso La cantidad de valvulas que están siendo usadas
     */
    public int getValvulasEnUso(){
        return valvulasEnUso;
    }
    
    @Override
    public void setEnUso(boolean enUso){
        this.enUso = enUso;
    }
    
    /**
     * Permite obtener el estado del tanque
     * @return enUso El estado del tanque. Si está en uso o no
     */
    public boolean getEnUso(){
        return enUso;
    }
    
    /**
     * Permite configurar el porcentaje de agua que tiene el tanque
     * @param porcentaje El porcentaje de agua que tiene el tanque
     */
    public void setPorcentaje(float porcentaje){
        this.porcentaje = porcentaje;
    }
    
    /**
     * Permite obtener el porcentaje de agua que tiene el tanque
     * @return porcentaje El porcentaje de agua que tiene el tanque
     */
    public float getPorcentaje(){
        return porcentaje;
    }
    
    @Override
    public String showDetails(){
       String cadena="";
       cadena = "Tanque: " + getID() + "\n" +
               "Capacidad: " + getCapacidad() + " m3" + "\n" +
               "Cantidad de Agua disponible:" + getCantAgua() + " m3" + "\n" +
               "Porcentaje Actual: " + getPorcentaje();
       
       
        return cadena;
    }
}
