/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.apextosos;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class Conexion {

    static Connection contacto=null;
    Connection con;
    String url="jdbc:mysql://mysql-apextosos-p22021a29-5702.e.aivencloud.com:12571/defaultdb";
    String user="avnadmin";
    String pass="AVNS_ImegjAPDilwHIQdsYky";
    
   
    public Connection Conectar(){
     try {
     Class.forName("com.mysql.cj.jdbc.Driver");
     con=DriverManager.getConnection(url,user,pass);
     
     }catch (Exception e) {
         System.out.println("e");}
     return con;
      //este public vonnection no es necesario para la conexion bassica
    }
    public static Connection getConexion(){
    String url="jdbc:mysql://mysql-apextosos-p22021a29-5702.e.aivencloud.com:12571/defaultdb";
    
    try{
     Class.forName("com.mysql.cj.jdbc.Driver");
    }catch (Exception e) {
        
}
    
    try{  
    contacto = DriverManager.getConnection(url,"avnadmin","AVNS_ImegjAPDilwHIQdsYky");
    }catch (Exception e) {
        
}
    return contacto;
    }
    

    public static void main(String[] args) {
        Conexion sp= new Conexion();
        System.out.println(sp.Conectar());
        //definir colores 
        apex_DAO apx = new apex_DAO(Color.decode("#111518"), Color.decode("#0B0F11"), Color.decode("#090B0C"));
        apx.listar();
    }
}
