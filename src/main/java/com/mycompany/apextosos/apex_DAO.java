
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
    System.out.println("Puntaje: "+rs.getInt(4));
    System.out.println("Nombre: "+rs.getString(5));
    usuario us = new usuario();
    us.setUsuario(rs.getString(1));
    us.setContrasena(rs.getString(2));
    us.setCursos(rs.getString(3));
    us.setPuntaje(rs.getInt(4));
    us.setNombre(rs.getString(5));
    datos.add(us);
}
 return datos ;
    }catch (Exception e) {
}
    return null;
    }
    
    public Boolean verificar_login(String Usuario, String Contrasena){
      Boolean comprobado = false;
      String sql = "SELECT * FROM `usuarios` WHERE `usuario` = '"+Usuario+"'";
      try {
           con = acceso.Conectar();
     ps= con.prepareStatement(sql);
     rs = ps.executeQuery();
     if (rs.next()) {
       if (rs.getString(2).equals(Contrasena)){
           comprobado = true;
       }
} else {
        System.out.println("Caracter invalido");
} 
          
           }catch (Exception e) {
}
      return comprobado;
  }
    
    public ArrayList<usuario> Buscar_usuario(String Usuario){
      String sql = "SELECT * FROM `usuarios` WHERE `usuario` = '"+Usuario+"'";
      try {
    con = acceso.Conectar ();
    ps= con.prepareStatement(sql);
    rs = ps.executeQuery();
    ArrayList<usuario>datos = new ArrayList<usuario>();
 while (rs.next()){
    usuario us = new usuario();
    us.setUsuario(rs.getString(1));
    us.setContrasena(rs.getString(2));
    us.setCursos(rs.getString(3));
    us.setPuntaje(rs.getInt(4));
    us.setNombre(rs.getString(5));
    datos.add(us);
}
 return datos ;
    }catch (Exception e) {
}
    return null;
    }
    
    public Pregunta Buscar_preguntaB(String curso, int codigo){
      String sql = "SELECT * FROM `"+curso+"B` WHERE `codigo` = '"+codigo+"'";
      try {
    con = acceso.Conectar ();
    ps= con.prepareStatement(sql);
    rs = ps.executeQuery();
    Pregunta pr = new Pregunta();
 while (rs.next()){
    pr.setCodigo(rs.getInt(1));
    pr.setInstrucciones(rs.getString(2));
    pr.setEnunciado(rs.getString(3));
    pr.setTipo(rs.getString(4));
    pr.setP_r(rs.getString(5));
    pr.setRespuesta(rs.getString(6));
    pr.setPuntos(rs.getInt(7));
}
 return pr ;
    }catch (Exception e) {
}
    return null;
    }
    
}
