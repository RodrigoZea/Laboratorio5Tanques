
import com.mongodb.MongoClient;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.Timer;
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
 * @version 02.11.17
 */

public class albearControl {
        
    /**
     * Crea un nuevo tanque de tipo cubico
     * @param id el id del tanque
     * @param valvulasEnUso las valvulas en uso
     * @param longitud la longitud de un lado del tanque o la arista
     * @return tanque Un nuevo tanque cubico
     */
    public Tanque crearTanqueCubico(int id, int valvulasEnUso, float longitud){
        Tanque tanque = new TanqueCubico(id, valvulasEnUso, longitud);
        return tanque;
    }
    
    /**
     * Crea un nuevo tanque de tipo cilindrico
     * @param id el id del tanque
     * @param valvulasEnUso las valvulas en uso
     * @param base la base del tanque cilindrico
     * @param altura la altura del cilindro
     * @return tanque Un nuevo tanque cilindrico
     */
    public Tanque crearTanqueCilindrico(int id, int valvulasEnUso, float base, float altura){
        Tanque tanque = new TanqueCilindrico(id, valvulasEnUso, base, altura);
        return tanque;
    }
    
    /**
     * Crea un nuevo tanque de tipo ortogonal
     * @param id el id del tanque
     * @param valvulasEnUso las valvulas en uso
     * @param base la base del tanque
     * @param altura la altura del tanque
     * @return tanque Un nuevo tanque ortogonal
     */
    public Tanque crearTanqueOrtogonal(int id, int valvulasEnUso, float base, float altura){
        Tanque tanque = new TanqueOrtagonal(id, valvulasEnUso, base, altura);
        return tanque;
    }
    
    /**
     * Agrega un tanque a la lista de tanques y regiones
     * @param tanque El tanque a ser agregado
     * @param ctrls La lista de tanques y regiones del programa
     */
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
    
    /**
     * Muestra todos los tanques creados y su información actual
     * @param show El area de texto donde se desplegará la informacion
     * @param ctrls La lista de tanques y regiones del programa
     */
    public void showTanquesCreados(JTextArea show, ArrayList<Controles> ctrls){
        String cadena = "";
        for(Controles ctrl: ctrls){ 
            if (ctrl.identificacion().equals("Tanque")){ 
                cadena = cadena + ctrl.showDetails() + "\n";
            }
        }
        
        show.setText(cadena);
    }
    
    /**
     * Crea una nueva region
     * @param nombres Es la lista de los nombres de los municipios
     * @param cant La lista con la cantidad de habitantes por municipio
     * @param id El id de la region
     * @return region La nueva region creada
     */
    public Region crearRegion(String[] nombres, int[] cant, int id){
        Region region = new Region(id, nombres, cant);
        return region;
    }
    
    /**
     * Agrega una region a la lista de tanques y regiones
     * @param region La region que quiere ser agregada a la lista
     * @param ctrls La lista de tanques y regiones del programa
     */
    public void agregarRegion(Region region, ArrayList<Controles> ctrls){
        ctrls.add(region);
        JOptionPane.showMessageDialog(null, "Region Creada");
    }
    
    /**
     * Conecta a la base de datos y transfiere la lista de tanques y regiones a la base de datos
     * @param ctrls La lista de tanques y regiones del programa
     */
    public void salvar(ArrayList<Controles> ctrls){
      Connection con = new Connection();  
     
       
       try{
      if(ctrls.size() > 0){
        for(Controles ctrl:ctrls){
            con.ds.save(ctrl);
         }  
      }
       }catch (Exception e) {
           
       }
      
    }
    
    /**
     * Colecta los tanques y regiones almacenados en la base de datos y los traslada a la lista al inicio del programa
     * @param ctrls La lista de tanques y regiones del programa
     */
    public void getTanques(ArrayList<Controles> ctrls){
       try{
           
       
        Connection con = new Connection();  
        
        if(ctrls.size()==0){ 
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
        
        Query<Region> queryRe = con.ds.createQuery(Region.class);
        List<Region> regiones = queryRe.asList();
        regiones.forEach((reg) -> {
            ctrls.add(reg);
            });
           
        }
      
       }catch (Exception e){
           
       }
        
        
    }
        
    /**
     * Indica si ya existe la region o el tanque que se está intentando crear
     * @param ctrls La lista de tanques y regiones del programa
     * @param id El id del objeto
     * @return existe Booleano que indica si ya existe el id del objeto
     */
    public boolean existeID(ArrayList<Controles> ctrls, int id){
       boolean existe=false;
       for(Controles ctrl:ctrls){
          if(ctrl.getID() == id){
              existe=true;
          }
       }
       
       return existe;
   } 
    
    /**
     * Mira cuantos items tiene la lista, método creado por cuestiones de debugging
     * @param ctrls La lista de tanques y regiones del programa
     */
    public void cuanto(ArrayList<Controles> ctrls){
         if(ctrls.size() > 0){
           System.out.println("lista tiene algo");
           System.out.println(ctrls.size());
       }else{
             System.out.println("lista vacia");
           System.out.println(ctrls.size());
       }
   } 
    
    /**
     * El combobox de tanques se "llena" con los tanques que están en la lista
     * @param tanques El combobox de tanques donde el usuario puede seleccionar un tanque
     * @param ctrls La lista de tanques y regiones del programa
     */
    public void llenarComboBoxTanques(JComboBox tanques, ArrayList<Controles> ctrls){
       for(Controles ctrl:ctrls){ 
            if (ctrl.identificacion().equals("Tanque")){ 
                tanques.addItem(ctrl.getID());
            }
        }
   }
    
    /**
     * El combobox de regiones se "llena" con las regiones que están en la lista
     * @param regiones El combobox de regiones donde el usuario puede seleccionar una region
     * @param ctrls La lista de tanques y regiones del programa
     */
    public void llenarComboBoxRegiones(JComboBox regiones, ArrayList<Controles> ctrls){
       for(Controles ctrl:ctrls){ 
            if (ctrl.identificacion().equals("Region")){ 
                regiones.addItem(ctrl.getID());
            }
        }
   }
    
    /**
     * Busca un tanque en la lista y desplega sus datos en un textarea
     * @param id el id del tanque que se busca
     * @param ctrls La lista de tanques y regiones del programa
     * @param tanque el area de texto donde se desplegará los detalles del tanque
     */
    public void buscarTanque(int id, ArrayList<Controles> ctrls, JTextArea tanque){
        for(Controles ctrl:ctrls){ 
            if (ctrl.identificacion().equals("Tanque")){ 
                if(ctrl.getID() == id){
                    tanque.setText(ctrl.showDetails());
                    break;
                }
            }
        }
    }
    
    /**
     * Busca una region en la lista y desplega sus datos en un textarea
     * @param id el id de la region que se busca
     * @param ctrls La lista de tanques y regiones del programa
     * @param region el area de texto donde se desplegará los detalles de la region
     * @param lblAgua label que desplega cuanta agua se debe alimentar a la region
     */
    public void buscarRegion(int id, ArrayList<Controles> ctrls, JTextArea region, JLabel lblAgua){
        for(Controles ctrl:ctrls){ 
            if (ctrl.identificacion().equals("Region")){ 
                if(ctrl.getID() == id){
                    region.setText(ctrl.showDetails());
                    lblAgua.setText(ctrl.getNecesidad() + "");
                    break;
                }
            }
        }
    }
    
    /**
     * Agrega una fecha a la lista de fechas que tiene el tanque
     * @param id el id del tanque al que se agregará la fecha
     * @param ctrls La lista de tanques y regiones del programa
     * @param fecha la fecha en la que se realizo una operacion
     */
    public void agregarFecha(int id, ArrayList<Controles> ctrls, String fecha){
        Tanque tanque = null;
        
        for(Controles ctrl:ctrls){ 
            if (ctrl.identificacion().equals("Tanque")){ 
                if(ctrl.getID() == id){
                    tanque = (Tanque) ctrl;
                    break;
                }
            }
        }
        
        tanque.fechas.add(fecha);
    }
    
    /**
     * Se realiza una simulación de cómo un tanque alimenta a una región
     * @param ctrls La lista de tanques y regiones del programa
     * @param idT El id del tanque 
     * @param idR El id de la región a ser alimentada
     * @param textoAgua label que desplega cuanta agua se debe alimentar a la region
     * @param textoValvulas label que desplega cuantas valvulas abrio el tanque
     * @param txtUso label que desplega si el tanque está en uso o no
     * @param timer timer que realiza esta operacion hasta alimentar la region
     * @param asignar el boton el cual realiza esta operacion
     */
    public void proveerAgua(ArrayList<Controles> ctrls, int idT, int idR, JLabel textoAgua, JLabel textoValvulas, JLabel txtUso, Timer timer, JButton asignar){
        Tanque tanque = null;
        Region region= new Region();
        float aguaPorValvula=0;

        float aguaPorRestar = 0;
        
        for(Controles ctrl:ctrls){ 
            if (ctrl.identificacion().equals("Tanque")){ 
                if(ctrl.getID() == idT){
                    tanque = (Tanque) ctrl;
                    break;
                }
            }
        }
        
        for(Controles ctrl:ctrls){ 
            if (ctrl.identificacion().equals("Region")){ 
                if(ctrl.getID() == idR){
                    region = (Region) ctrl;
                    break;
                }
            }
        }
        
        aguaPorRestar = (2*100)/tanque.getCapacidad();
   
         
        
        if(tanque.getNecesidad() > region.getNecesidad()){
         
          aguaPorValvula = tanque.getNecesidad()/10;  
          
          tanque.setEnUso(true);
          txtUso.setText("Verdadero");
          
          if (aguaPorValvula > region.getNecesidad()){
              tanque.setValvulasEnUso(1);
          }else if ((aguaPorValvula*2) > region.getNecesidad()){
              tanque.setValvulasEnUso(2);
          }else if ((aguaPorValvula*3) > region.getNecesidad()){
              tanque.setValvulasEnUso(3);
          }else if ((aguaPorValvula*4) > region.getNecesidad()){
              tanque.setValvulasEnUso(4);
          }else if ((aguaPorValvula*5) > region.getNecesidad()){
              tanque.setValvulasEnUso(5);
          }else if ((aguaPorValvula*6) > region.getNecesidad()){
              tanque.setValvulasEnUso(6);
          }else if ((aguaPorValvula*7) > region.getNecesidad()){
              tanque.setValvulasEnUso(7);
          }else if ((aguaPorValvula*8) > region.getNecesidad()){
              tanque.setValvulasEnUso(8);
          }else if ((aguaPorValvula*9) > region.getNecesidad()){
              tanque.setValvulasEnUso(9);
          }else if ((aguaPorValvula*10) > region.getNecesidad()){
              tanque.setValvulasEnUso(10);
          }
          
          textoValvulas.setText(tanque.getValvulasEnUso()+"");
          
          region.setNecesidad(region.getNecesidad() - 2);
          tanque.setCantAgua(tanque.getCantAgua() - 2);
          tanque.setPorcentaje(tanque.getPorcentaje() - aguaPorRestar);
          
          if(tanque.getPorcentaje() < 25){
             JOptionPane.showMessageDialog(null, "Aviso: Se ha llegado a menos del 25% de agua del tanque");
          }else if(tanque.getPorcentaje() < 10){
             JOptionPane.showMessageDialog(null, "Aviso: Se ha llegado a menos del 10% de agua del tanque");
              timer.stop();
              tanque.setEnUso(false);
              txtUso.setText("Falso");
              tanque.setValvulasEnUso(0);
              textoValvulas.setText(tanque.getValvulasEnUso()+"");
          }
          
          textoAgua.setText(region.getNecesidad() + "");

          if(region.getNecesidad() <= 0 ){ 
              timer.stop();
              region.setNecesidad(0);
              textoAgua.setText("0");
              JOptionPane.showMessageDialog(null, "Region alimentada");
              tanque.setEnUso(false);
              txtUso.setText("Falso");
              tanque.setValvulasEnUso(0);
              textoValvulas.setText(tanque.getValvulasEnUso()+"");
              asignar.setEnabled(true);
          }        
          
        }
 
        
        
    }
    
}
