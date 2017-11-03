
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
    
    
    public TanqueOrtagonal(int id, float capacidad, float cantAgua, int valvulasEnUso, float base, float altura){
        super(id, valvulasEnUso);
        this.base = base;
        this.altura = altura;
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
