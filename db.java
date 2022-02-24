/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author sumith
 */
public class db {
    
  private  static  Connection son;
    
    public static void myConnection()throws Exception{
    
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Statement s =    (Statement) DriverManager.getConnection("jdbc:mysql://localhost:3307/app10","root","1234");
                                 
                                   son.createStatement();
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
   
    
    
    
    
}
          public static void  AudConnection(String query)throws  Exception{
         
             if(son== null){
         myConnection();
         
             }
             Statement s=son.createStatement();
                 s.executeUpdate(query);
                 
          
          }
          
          public static   ResultSet  SearchConnect(String query) throws Exception{
          
             if(son== null){
         myConnection();
         
             }
            Statement s=son.createStatement();
            ResultSet rs =s.executeQuery(query);
          
          return rs;
          }
}
class Test{
    public static void main(String[] args) {
        db mydb =new db();
    }


}
