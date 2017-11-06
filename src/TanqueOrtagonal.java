
import java.util.ArrayList;

/**
 * Clase encargada de realizar objetos de tipo Tanque Ortogonal.
 * @author Rodrigo Zea y Rodolfo Alonzo
 * @version 02.11.17
 */
public class TanqueOrtagonal extends Tanque{
    
    private float base;
    private float altura;
    
    public TanqueOrtagonal(){
        
    }
    
    /**
     * crea un nuevo tanque de tipo ortogonal
     * @param id el id del tanque
     * @param valvulasEnUso cuantas valvulas tiene en uso
     * @param base la base del tanque
     * @param altura la altura del tanque
     */
    public TanqueOrtagonal(int id, int valvulasEnUso, float base, float altura){
        super(id, valvulasEnUso);
        this.base = base;
        this.altura = altura;
        calcularCapacidad();
        calcularAgua();
    }
    
    /**
     * calcula cuanto puede almacenar el tanque
     */
    public void calcularCapacidad(){
        float capacidadC = (base*altura);
        setCapacidad(capacidadC);
    }
    
    /**
     * calcula el agua que tiene el tanque, al inicio se asume que está lleno de agua
     */
    @Override
    public void calcularAgua(){
        setCantAgua(getCapacidad());
    }
    
    /**
     * configura la base del tanque
     * @param base la base del tanque en m3
     */
    public void setBase(float base){
        this.base = base;
    }
    
    /**
     * obtiene la base del tanque
     * @return base la base del tanque
     */
    public float getBase(){
        return base;
    }
    
    /**
     * configura la altura del tanque
     * @param altura la altura del tanque
     */
    public void setAltura(float altura){
        this.altura = altura;
    }
    
    /**
     * devuelve la altura del tanque
     * @return altura la altura del tanque
     */
    public float getAltura(){
        return altura;
    }
}
