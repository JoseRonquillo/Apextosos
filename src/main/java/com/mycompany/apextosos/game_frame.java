/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.apextosos;

import static java.awt.Component.CENTER_ALIGNMENT;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.*;
import com.mysql.cj.jdbc.exceptions.SQLError;
import java.awt.*;
/**

/**
 *
 * @author JuanMa
 */
public class game_frame extends javax.swing.JPanel {
    public Color color1;
    public Color color2;
    public Color color3;
    public int cantidad;
    public int level;
    public int levels_completes;
    String nombre;
    String curso;
    JPanel panel_principal;
    Conexion acceso = new Conexion();

    /**
     * Creates new form game_frame
     */
    
    public game_frame(String nombre, String curso, JPanel panel_principal, Color type_color1, Color type_color2, Color type_color3) {
        this.nombre = nombre;
        this.curso = curso;
        this.panel_principal = panel_principal;
        this.color1 = type_color1;
        this.color2 = type_color2; 
        this.color3 = type_color3;
        initComponents();
        initComponents2(this.color1, this.color2);

    }

    public static String createBlankLines(int numLines) {
        StringBuilder blankLines = new StringBuilder();
        for (int i = 0; i < numLines; i++) {
            blankLines.append("\n");
        }
        return blankLines.toString();
    }
    
    public void initComponents2(Color color1m, Color color2m) {
        // buscar la cantidad de de niveles totales
        Connection con = null; 
        PreparedStatement ps = null;
        ResultSet rs = null;
        if(this.curso.toLowerCase().replaceAll("\\s+", "").trim().equals("fisica")){
            try {
                con = acceso.Conectar();
                String sql = "SELECT COUNT(*) AS total FROM fisica";
                ps = con.prepareStatement(sql);
                rs = ps.executeQuery();

                if (rs.next()) {
                    int totalFilas = rs.getInt("total");
                    this.cantidad = totalFilas;

                }
            } catch (SQLException e) {
                e.printStackTrace(); 
            } finally {
                try {
                    if (rs != null) rs.close();
                    if (ps != null) ps.close();
                    if (con != null) con.close();
                } catch (SQLException e) {
                    e.printStackTrace(); 
                }

            apex_DAO dao = new apex_DAO(color1, color2, color3);

            System.out.println("Buscando progreso para el usuario: " + this.nombre);
            
            ArrayList<ProgresoCurso> progreso = dao.BuscarProgresoUsuario1(this.nombre);
            
            if (progreso != null && !progreso.isEmpty()) {
                for (ProgresoCurso p : progreso) {
                    System.out.println(p.level_user);
                    this.level = Integer.parseInt(p.level_user);
                }
            } else {
                System.out.println("No se encontraron datos o hubo un error.");
            }
        }
        }
        else{
            try {
                con = acceso.Conectar();
                String sql = "SELECT COUNT(*) AS total FROM Precalculo";
                ps = con.prepareStatement(sql);
                rs = ps.executeQuery();

                if (rs.next()) {
                    int totalFilas = rs.getInt("total");
                    this.cantidad = totalFilas;

                }
            } catch (SQLException e) {
                e.printStackTrace(); 
            } finally {
                try {
                    if (rs != null) rs.close();
                    if (ps != null) ps.close();
                    if (con != null) con.close();
                } catch (SQLException e) {
                    e.printStackTrace(); 
                }

            apex_DAO dao = new apex_DAO(color1, color2, color3);

            System.out.println("Buscando progreso para el usuario: " + this.nombre);
            
            ArrayList<ProgresoCurso> progreso = dao.BuscarProgresoUsuario2(this.nombre);
            
            if (progreso != null && !progreso.isEmpty()) {
                for (ProgresoCurso p : progreso) {
                    System.out.println(p.level_user);
                    this.level = Integer.parseInt(p.level_user);
                }
            } else {
                System.out.println("No se encontraron datos o hubo un error.");
            }
        }
        }
        //  parte grafica 

        this.lb_curse_name.setText(this.curso);
        JTextArea texto = new JTextArea(createBlankLines(13*cantidad));
        this.setBackground(this.color1);
        this.panel1.setBackground(color2m);
        texto.setEditable(false);
        texto.setLineWrap(false);
        texto.setBackground(color2m);
        texto.setBounds(500, 100, 400, 600); 
        JScrollPane scroll = new JScrollPane(texto, JScrollPane.VERTICAL_SCROLLBAR_NEVER, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scroll.setBorder(null);
        scroll.setBounds(400, 100, 400, 600); 
        //lista de botones 
        JButton[] botones = new JButton[cantidad]; 
        
        int posicion_x = 100;
        int posicion_y = 0;
        int sumarle_X = 50;
        int contador = 0;
        String ruta;
        String txt;
        levels_completes = level - 1;
        this.lb_cantidad_niveles.setText("NIVELES: " + cantidad);
        this.lb_cantidad_niveles_complete.setText("COMPLETADOS: " + levels_completes);
        this.lb_curse_name.setAlignmentY(CENTER_ALIGNMENT);
        this.lb_curse_name.setAlignmentX(CENTER_ALIGNMENT);

        
        
        for (int i = 0; i < botones.length; i++) {
                
                if (i < level - 1){
                    txt = new String("COMPLETADO");
                    ruta = new String("/images_games/gifts/skyblue.gif");
                }
                else if (i == botones.length - 1){
                    ruta = new String("/images_games/gifts/red.gif");
                    txt = new String("FINAL");
                }

                else
                {
                    txt = new String("???");
                    ruta = new String("/images_games/gifts/purple.gif");
                }
                ImageIcon icono = new ImageIcon(game_frame.class.getResource(ruta));
                botones[i] = new JButton(txt);
                botones[i].setIcon(icono);
                botones[i].setVerticalTextPosition(JLabel.CENTER);
                botones[i].setHorizontalTextPosition(JLabel.CENTER);
                botones[i].setFont(new Font("Arial", Font.BOLD, 16)); // Cambia la fuente, estilo y tamaño
                botones[i].setForeground(Color.WHITE);
                botones[i].setBounds(posicion_x, posicion_y, 200, 200);
                botones[i].setBorderPainted(false);
                botones[i].setContentAreaFilled(false);
                if (contador == 2){
                    sumarle_X = sumarle_X * -1;
                    contador = 0;
                }

                final int index = i; 
                botones[i].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        generate_level(index);
                    }
                });

                contador += 1;

                // Agregar el botón a la ventana
                texto.add(botones[i]);
                posicion_y += 200;
                posicion_x += sumarle_X;
            }


            this.add(scroll);
        }
    
    

    public void generate_level(int type_of_level){
        if (type_of_level < this.level){
            level_game sta = new level_game(this.nombre, this.curso, this.panel_principal, this.color1, this.color2, this.color3, type_of_level);
            sta.setSize(780, 635);
            sta.setLocation(-0,0 );
            this.removeAll();
            JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setResizable(true);
            frame.setSize(780, 635);
            this.add(sta);
            this.revalidate();
            this.repaint();
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // </editor-fold>
@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_curse_name = new javax.swing.JLabel();
        panel1 = new java.awt.Panel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        lb_cantidad_niveles_complete = new javax.swing.JLabel();
        lb_cantidad_niveles = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(17, 21, 24));

        lb_curse_name.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lb_curse_name.setForeground(new java.awt.Color(255, 255, 255));
        lb_curse_name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_curse_name.setToolTipText("");

        panel1.setBackground(new java.awt.Color(11, 15, 17));

        jButton7.setBackground(new java.awt.Color(17, 21, 24));
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("INICIO");
        jButton7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 51, 51))); // NOI18N
        jButton7.setBorderPainted(false);
        jButton7.setDefaultCapable(false);
        jButton7.setFocusPainted(false);
        jButton7.setFocusable(false);
        jButton7.setRequestFocusEnabled(false);
        jButton7.setRolloverEnabled(false);
        jButton7.setVerifyInputWhenFocusTarget(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(17, 21, 24));
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("SETTINGS");
        jButton8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 51, 51))); // NOI18N
        jButton8.setBorderPainted(false);
        jButton8.setDefaultCapable(false);
        jButton8.setFocusPainted(false);
        jButton8.setFocusable(false);
        jButton8.setRequestFocusEnabled(false);
        jButton8.setRolloverEnabled(false);
        jButton8.setVerifyInputWhenFocusTarget(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        lb_cantidad_niveles_complete.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lb_cantidad_niveles_complete.setForeground(new java.awt.Color(255, 255, 255));
        lb_cantidad_niveles_complete.setText("COMPLETADOS 15");

        lb_cantidad_niveles.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lb_cantidad_niveles.setForeground(new java.awt.Color(255, 255, 255));
        lb_cantidad_niveles.setText("NIVELES: 20");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_games/gifts/owl_2.gif"))); // NOI18N

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lb_cantidad_niveles_complete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lb_cantidad_niveles, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel1)))
                .addContainerGap())
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89)
                .addComponent(lb_cantidad_niveles, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lb_cantidad_niveles_complete, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(lb_curse_name, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lb_curse_name, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        System.out.println(this.color1);
        Adentro_curso return_curse = new Adentro_curso(this.nombre, this.curso, this.panel_principal, this.color1, this.color2, this.color3);
        return_curse.setSize(780, 635);
        return_curse.setLocation(0,0 );
        this.removeAll();   
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.setSize(780, 635);
        this.add(return_curse);
        this.revalidate();
        this.repaint();      }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        System.out.println(this.color1);
        settings tools = new settings(this.nombre, this.curso, this.panel_principal,this.color1, this.color2, this.color3);
        tools.setSize(780, 635);
        tools.setLocation(0,0 );
        this.removeAll();
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.setSize(780, 635);
        this.add(tools);
        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_jButton8ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lb_cantidad_niveles;
    private javax.swing.JLabel lb_cantidad_niveles_complete;
    private javax.swing.JLabel lb_curse_name;
    private java.awt.Panel panel1;
    // End of variables declaration//GEN-END:variables
}
