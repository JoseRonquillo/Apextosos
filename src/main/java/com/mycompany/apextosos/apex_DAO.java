
package com.mycompany.apextosos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


public class apex_DAO {
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Conexion acceso = new Conexion();
    
    public ArrayList<usuario> listar (){
        String sql = "select * from usuarios;";
    try {
 con = acceso.Conectar ();
 ps= con.prepareStatement(sql);
rs = ps.executeQuery();
ArrayList<usuario>datos = new ArrayList<usuario>();
 while (rs.next()){
    System.out.println("==============================");
    System.out.println("Usuario: "+rs.getString(1));
    System.out.println("Contraseña: "+rs.getString(2));
    System.out.println("Cursos: "+rs.getString(3));
    usuario us = new usuario();
    us.setUsuario(rs.getString(1));
    us.setContrasena(rs.getString(2));
    us.setCursos(rs.getString(3));
    datos.add(us);
}
 return datos ;
    }catch (Exception e) {
}
    return null;
    }
    
}
