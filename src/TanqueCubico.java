
import java.util.ArrayList;

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
    
    public TanqueCubico(int id, int valvulasEnUso, float longitud){
       super(id, valvulasEnUso);
       this.longitud = longitud;
       calcularCapacidad();
       calcularAgua();
    }
    
    public void calcularCapacidad(){
        float capacidadC = (longitud*longitud*longitud);
        setCapacidad(capacidadC);
    }
    
    public void calcularAgua(){
        setCantAgua(getCapacidad());
    }
    
    public void setLongitud(float longitud){
        this.longitud = longitud;
    }
    
    public float getLongitud(){
        return longitud;
    }
}
