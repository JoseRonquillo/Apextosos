
package com.mycompany.apextosos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import java.awt.Color;


public class apex_DAO {
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Conexion acceso = new Conexion();
    private Color color1;
    private Color color2;
    private Color color3;
    
    
    public apex_DAO(Color data_color1, Color data_color2, Color data_color3) {
        this.color1 = data_color1;
        this.color2 = data_color2;
        this.color3 = data_color3;
        
    }

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

  public ArrayList<ProgresoCurso> BuscarProgresoUsuario1(String usuario) {
    String sql = "SELECT * FROM `Progreso_Curso` WHERE `usuario_id` = ?";
    ArrayList<ProgresoCurso> datos = new ArrayList<>();

    try {
        con = acceso.Conectar();
        ps = con.prepareStatement(sql);
        ps.setString(1, usuario); 
        rs = ps.executeQuery();

        while (rs.next()) {
            ProgresoCurso progreso = new ProgresoCurso();
            progreso.setCampo1(rs.getString(1)); // Primer campo
            progreso.setCampo2(rs.getString(3)); // Segundo campo
            // ... añadir otroscampos según sea necesario
            datos.add(progreso);
        }
    } catch (SQLException e) {
        e.printStackTrace(); // Imprime la excepción para depuración
    } finally {
        try {
            if (rs != null) rs.close();
            if (ps != null) ps.close();
            if (con != null) con.close();
        } catch (SQLException e) {
            e.printStackTrace(); // Manejo de excepciones al cerrar recursos
        }
    }

    return datos; // Retorna la lista (vacía si no hay resultados)
}

public ArrayList<level_fisica> Buscar_level_fisica(String level) {
    String sql = "SELECT * FROM `fisica` WHERE `idfisica` = ?";
    ArrayList<level_fisica> datos = new ArrayList<>();

    try {
        con = acceso.Conectar();
        ps = con.prepareStatement(sql);
        ps.setString(1, level); // Usar un parámetro para evitar inyecciones SQL
        rs = ps.executeQuery();

        while (rs.next()) {
            level_fisica nivel = new level_fisica();
            // Asigna correctamente cada campo a su método de configuración
            nivel.set_campo1(rs.getString(1)); // Columna 1
            nivel.set_campo2(rs.getString(2)); // Columna 2
            nivel.set_campo3(rs.getString(3)); // Columna 3
            nivel.set_campo4(rs.getString(4)); // Columna 4
            // ... Añadir otros campos según sea necesario
            datos.add(nivel);
        }
    } catch (SQLException e) {
        e.printStackTrace(); // Imprime la excepción para depuración
    } finally {
        try {
            if (rs != null) rs.close();
            if (ps != null) ps.close();
            if (con != null) con.close();
        } catch (SQLException e) {
            e.printStackTrace(); // Manejo de excepciones al cerrar recursos
        }
    }
    return datos;
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
    
}
