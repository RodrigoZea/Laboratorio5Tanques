/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MIGUEL
 */

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;

public class Connection {
    Datastore ds;

    public Connection(){
        MongoClient mongo = new MongoClient();
        Morphia morphia = new Morphia();
        morphia.map(Tanque.class).map(Region.class);
        ds = morphia.createDatastore(mongo, "tanques");
    }
    
        /*DB dataBase;
    DBCollection coleccion;
    BasicDBObject document = new BasicDBObject();
    
    public Connection(){
        try{
          Mongo mongo = new Mongo("Localhost", 27017);  
          dataBase = mongo.getDB("lab5");
          coleccion = dataBase.getCollection("tanques");
          System.out.println("Connection done");
            
        } catch (Exception ex){
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }*/
    
    /*public boolean insertar(Tanque ejemplo){
        document.put("Tanque", ejemplo);
        coleccion.insert(document);
        return true;
    }
    
    public void mostrar(){
        DBCursor cursor = coleccion.find();
        while(cursor.hasNext()){
            System.out.println(cursor.next());
        }
    }
    
    public boolean actualizar(Tanque viejo, Tanque nuevo){
        document.put("Tanque", viejo);
        BasicDBObject documentNuevo = new BasicDBObject();
        documentNuevo.put("Tanque", nuevo);
        coleccion.findAndModify(document, documentNuevo);
        return true;
    }*/
}
