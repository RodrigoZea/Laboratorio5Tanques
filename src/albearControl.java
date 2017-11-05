
import com.mongodb.MongoClient;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.query.Query;

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
        return tanque;
    }
    
    public Tanque crearTanqueCilindrico(int id, int valvulasEnUso, float base, float altura){
        Tanque tanque = new TanqueCilindrico(id, valvulasEnUso, base, altura);
        return tanque;
    }
    
    public Tanque crearTanqueOrtogonal(int id, int valvulasEnUso, float base, float altura){
        Tanque tanque = new TanqueOrtagonal(id, valvulasEnUso, base, altura);
        return tanque;
    }
    
    public void agregarALista(Tanque tanque, ArrayList<Controles> ctrls){
        int tanquesMax=0;
        for (Controles ctrl:ctrls){
            if (ctrl.identificacion().equals("Tanque")){
                tanquesMax = tanquesMax +1;
            }
        }
        
        if(tanquesMax==10){
          JOptionPane.showMessageDialog(null, "Error: Ya existen 10 tanques");  
        }else{
          ctrls.add(tanque);   
          JOptionPane.showMessageDialog(null, "Tanque Creado");
        }
            
          
    }
    
    public void showTanquesCreados(JTextArea show, ArrayList<Controles> ctrls){
        String cadena = "";
        for(Controles ctrl: ctrls){ 
            if (ctrl.identificacion().equals("Tanque")){ 
                cadena = cadena + ctrl.showDetails() + "\n";
            }
        }
        
        show.setText(cadena);
    }
    
    public Region crearRegion(String[] nombres, int[] cant, int id){
        Region region = new Region(id, nombres, cant);
        return region;
    }
    
    public void agregarRegion(Region region, ArrayList<Controles> ctrls){
        ctrls.add(region);
        JOptionPane.showMessageDialog(null, "Region Creada");
    }
    
    
    public void salvar(ArrayList<Controles> ctrls){
      Connection con = new Connection();  
      
       System.out.println("Conexión Establecida");
       try{
      if(ctrls.size() > 0){
        for(Controles ctrl:ctrls){
            con.ds.save(ctrl);
         }  
      }
       }catch (Exception e) {
           
       }
      
    }
    
    public void getTanques(ArrayList<Controles> ctrls){
       try{
           
       
        Connection con = new Connection();  
        
        
        Query<TanqueCubico> query = con.ds.createQuery(TanqueCubico.class);
        List<TanqueCubico> tanquesC = query.asList();
        
        tanquesC.forEach((tanque) -> {
            ctrls.add(tanque);
        });
        
        Query<TanqueOrtagonal> queryO = con.ds.createQuery(TanqueOrtagonal.class);
        List<TanqueOrtagonal> tanquesO = queryO.asList(); 
        tanquesO.forEach((tanque) -> {ctrls.add(tanque);});
        
        Query<TanqueCilindrico> queryCi = con.ds.createQuery(TanqueCilindrico.class);
        List<TanqueCilindrico> tanquesCi = queryCi.asList();
        tanquesCi.forEach((tanque) -> {ctrls.add(tanque);});
        
       }catch (Exception e){
           
       }
        
        
    }
        
   public void cuanto(ArrayList<Controles> ctrls){
         if(ctrls.size() > 0){
           System.out.println("lista tiene algo");
           System.out.println(ctrls.size());
       }else{
             System.out.println("lista vacia");
           System.out.println(ctrls.size());
       }
   } 
    
   public void llenarComboBoxTanques(JComboBox tanques, ArrayList<Controles> ctrls){
       System.out.println("porque");
       
       cuanto(ctrls);
       
       for(Controles ctrl:ctrls){ 
           System.out.println("hola");
            if (ctrl.identificacion().equals("Tanque")){ 
                tanques.addItem(ctrl.getID());
            }
        }
   }
    

    
}
