
import com.mongodb.MongoClient;
import java.util.ArrayList;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rodrigo Zea y Rodolfo Alonzo
 */

public class albearControl {
//Connection con = new Connection();    
        
        
    public Tanque crearTanqueCubico(int id, int valvulasEnUso, float longitud){
        Tanque tanque = new TanqueCubico(id, valvulasEnUso, longitud);
        System.out.println("creado");
        return tanque;
    }
    
    public void agregarALista(Tanque tanque, ArrayList<Controles> ctrls){
        ctrls.add(tanque);
        System.out.println("exito");
        
        
    }
    
    public void establecerConexion(){
       
    }
}
