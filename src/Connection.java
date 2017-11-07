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

//import com.mongodb.BasicDBObject;
//import com.mongodb.DB;
//import com.mongodb.DBCollection;
//import com.mongodb.DBCursor;
//import com.mongodb.Mongo;
import com.mongodb.MongoClient;
//import java.util.logging.Level;
//import java.util.logging.Logger;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;

public class Connection {
    Datastore ds;

    /**
     * Crea una conexión entre el programa y el servidor de MongoDB
     */
    public Connection(){
        MongoClient mongo = new MongoClient();
        Morphia morphia = new Morphia();
        morphia.map(Tanque.class).map(Region.class);
        ds = morphia.createDatastore(mongo, "tanques");
    }
    
       
}
