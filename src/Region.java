
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;


/**
 * Crea una nueva región, con sus 10 municipios y cantidad de habitantes
 * @author Rodrigo Zea y Rodolfo Alonzo
 * @version 02.11.17
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
    
    /**
     * Crea un nuevo objeto de tipo region
     * @param idR el id de la region
     * @param municipios los nombres de los 10 municipios
     * @param habitantes la cantidad de habitantes de cada municipio
     */
    public Region(int idR, String[] municipios, int[] habitantes){
        this.idR = idR;
        this.municipios = municipios;
        this.habitantes = habitantes;
        calcularAgua();
    }
    
    /**
     * calcula la necesidad de agua de la región en base a los habitantes totales
     */
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
    
    /**
     * Identifica al objeto, diferenciandose de los tanques
     * @return identificacion Un string que identifica si es un tanque o una region el objeto
     */
    @Override
    public String identificacion(){
        String id="";
        id = "Region";
        return id;
    }
    
    /**
     * Almacena la información importante que se quiere desplegar de la región
     * @return cadena Toda la información importante que se quiere mostrar
     */
    @Override
    public String showDetails(){
        String cadena = "", otros = "";
        
        for (int i = 0; i < municipios.length; i++) {
            otros = otros + municipios[i] + " - " + habitantes[i] + "\n";
        }
        
        cadena = "Región: " + getID() + "\n" +
               "Necesidad: " + getNecesidad() + " m3" + "\n" +
                otros;
        
       return cadena;
    }

    @Override
    public void setEnUso(boolean enUso){
        
    }
    
    /**
     * regresa el id de la region en la base de datos
     * @return idt el id de la region en la base de datos
     */
    public ObjectId getIdt() {
        return idt;
    }

    /**
     * deja configurar el id de la region en la base de datos
     * @param idt el id de la region en la base de datos
     */
    public void setIdt(ObjectId idt) {
        this.idt = idt;
    }

    /**
     * obtiene el id de la region
     * @return idR Es el ID de la región ingresado por el usuario
     */
    @Override
    public int getID() {
        return idR;
    }

    /**
     * configura el id de la region
     * @param idR Es el ID de la región ingresado por el usuario
     */
    public void setIdR(int idR) {
        this.idR = idR;
    }

    /**
     * devuelve la lista de municipios
     * @return municipios una lista con los nombres de los municipios
     */
    public String[] getMunicipios() {
        return municipios;
    }

    /**
     * configura la lista de municipios
     * @param municipios una lista con los nombres de los municipios
     */
    public void setMunicipios(String[] municipios) {
        this.municipios = municipios;
    }

    /**
     * devuelve la lista de cantidades de habitantes
     * @return habitantes la lista con las cantidades de habitantes
     */
    public int[] getHabitantes() {
        return habitantes;
    }

    /**
     * configura la lista de cantidades de habitantes
     * @param habitantes la lista de cantidades de habitantes
     */
    public void setHabitantes(int[] habitantes) {
        this.habitantes = habitantes;
    }
    
    /**
     * devuelve cuanta agua necesita la region
     * @return necesidad Es la cantidad de agua que necesita la region
     */
    @Override
    public float getNecesidad(){
        return necesidad;
    }

    /**
     * configura cuanta agua necesita la region
     * @param necesidad Es la cantidad de agua que necesita la region
     */
    public void setNecesidad(float necesidad){
        this.necesidad = necesidad;
    }

    
}
