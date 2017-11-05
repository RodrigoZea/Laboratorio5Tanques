
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
 * @author MIGUEL
 */
@Entity
public class Region implements Controles{
    @Id private ObjectId idt;
    private int idR;
    private String[] municipios;
    private int[] habitantes;
    private float necesidad;
    //private int totalHabitantes;
    
    public Region(){
        
    }
    
    public Region(int idR, String[] municipios, int[] habitantes){
        this.idR = idR;
        this.municipios = municipios;
        this.habitantes = habitantes;
        calcularAgua();
    }
    
    @Override
    public void calcularAgua() {
       int total=0;
       float promedio=0;
        
        for (int i = 0; i < habitantes.length; i++) {
            total = total + habitantes[i];
        }
        
        promedio = total/10;
        
        setNecesidad(promedio);
    }
    
    @Override
    public String identificacion(){
        String id="";
        id = "Region";
        return id;
    }
    
    @Override
    public String showDetails(){
        String cadena = "", otros = "";
        
        for (int i = 0; i < municipios.length; i++) {
            otros = otros + municipios[i] + " - " + habitantes[i] + "\n";
        }
        
        cadena = "Región: " + getID() + "\n" +
               "Necesidad: " + getNecesidad() + "\n" +
                otros;
        
       return cadena;
    }
    
   
    
   /* public void habitantesTotales(){
        int total=0;
        for (int i = 0; i < habitantes.length; i++) {
            total = total + habitantes[i];
        }
        /setTotalHabitantes(total);
        
    }*/

    public ObjectId getIdt() {
        return idt;
    }

    public void setIdt(ObjectId idt) {
        this.idt = idt;
    }

    public int getID() {
        return idR;
    }

    public void setIdR(int idR) {
        this.idR = idR;
    }

    public String[] getMunicipios() {
        return municipios;
    }

    public void setMunicipios(String[] municipios) {
        this.municipios = municipios;
    }

    public int[] getHabitantes() {
        return habitantes;
    }

    public void setHabitantes(int[] habitantes) {
        this.habitantes = habitantes;
    }
    
    public float getNecesidad(){
        return necesidad;
    }

    public void setNecesidad(float necesidad){
        this.necesidad = necesidad;
    }
    /*public int getTotalHabitantes() {
        return totalHabitantes;
    }

    public void setTotalHabitantes(int totalHabitantes) {
        this.totalHabitantes = totalHabitantes;
    }*/
    
    
}
