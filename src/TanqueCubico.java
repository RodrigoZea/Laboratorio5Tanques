
import java.util.ArrayList;


/**
 * Clase encargada de realizar objetos de tipo Tanque Cubico.
 * @author Rodrigo Zea y Rodolfo Alonzo
 * @version 02.11.17
 */
public class TanqueCubico extends Tanque{
    
    private float longitud;
    
    public TanqueCubico(){ 
        
    }
    
    /**
     * crea un nuevo objeto tanque de tipo cubico
     * @param id el id del tanque
     * @param valvulasEnUso las valvulas que tiene en uso el tanque
     * @param longitud la longitud de un lado del tanque, o la arista
     */
    public TanqueCubico(int id, int valvulasEnUso, float longitud){
       super(id, valvulasEnUso);
       this.longitud = longitud;
       calcularCapacidad();
       calcularAgua();
    }
    
    /**
     * calcula la capacidad del tanque
     */
    public void calcularCapacidad(){
        float capacidadC = (longitud*longitud*longitud);
        setCapacidad(capacidadC);
    }
    
    /**
     * calcula el agua inicial del tanque, al inicio el tanque está lleno de agua
     */
    @Override
    public void calcularAgua(){
        setCantAgua(getCapacidad());
    }
    
    /**
     * permite configurar la longitud del lado
     * @param longitud el lado del cubo, o la arista
     */
    public void setLongitud(float longitud){
        this.longitud = longitud;
    }
    
    /**
     * obtiene la longitud del lado
     * @return longitud el lado del cubo, o la arista
     */
    public float getLongitud(){
        return longitud;
    }
}
