/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mongodb;

import com.mongodb.client.FindIterable; 
import com.mongodb.client.MongoCollection; 
import com.mongodb.client.MongoDatabase;  

import java.util.Iterator; 
import org.bson.Document; 
import com.mongodb.MongoClient; 
import com.mongodb.MongoCredential; 
import java.util.ArrayList;
/**
 *
 * @author tolotra
 */
public class MongoDb {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

      fonction f = new fonction();
      String val = f.Find("donne", "personne");
      System.out.println(val);

    }
    
}
