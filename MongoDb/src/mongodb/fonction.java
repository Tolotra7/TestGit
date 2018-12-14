/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mongodb;

import com.google.gson.Gson;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import org.bson.Document;
import org.bson.types.ObjectId;

/**
 *
 * @author tolotra
 */
public class fonction {
    public String Find(String databasename,String collectionName){
        MongoClient mongo = new MongoClient( "localhost" , 27017 ); 
      
      // Accessing the database 
      MongoDatabase database = mongo.getDatabase(databasename);  
      
      // Retrieving a collection 
      MongoCollection<Document> collection = database.getCollection(collectionName);
      System.out.println("Collection sampleCollection selected successfully"); 

      // Getting the iterable object 
        FindIterable<Document> doc = collection.find(); 
      int i = 1; 

      // Getting the iterator 
      Iterator it = doc.iterator(); 
      ArrayList<Personne> val = new ArrayList<Personne>();
      
      int id =0;
      while(it.hasNext()){
          Document a = (Document)it.next();
          String nom = (String)a.getString("nom");
          String prenom = (String)a.getString("prenom");
          Personne p = new Personne(nom,prenom);
          val.add(p);
      }
    
     String json = new Gson().toJson(val);
      
     return json;
    }
}
