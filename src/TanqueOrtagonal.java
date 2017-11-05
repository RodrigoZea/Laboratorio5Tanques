
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
public class TanqueOrtagonal extends Tanque{
    
    private float base;
    private float altura;
    
    public TanqueOrtagonal(){
        
    }
    
    public TanqueOrtagonal(int id, int valvulasEnUso, float base, float altura){
        super(id, valvulasEnUso);
        this.base = base;
        this.altura = altura;
        calcularCapacidad();
        calcularAgua();
    }
    
    public void calcularCapacidad(){
        float capacidadC = (base*altura);
        setCapacidad(capacidadC);
    }
    
    @Override
    public void calcularAgua(){
        setCantAgua(getCapacidad());
    }
    
    public void setBase(float base){
        this.base = base;
    }
    
    public float getBase(){
        return base;
    }
    
    public void setAltura(float altura){
        this.altura = altura;
    }
    
    public float getAltura(){
        return altura;
    }
}
