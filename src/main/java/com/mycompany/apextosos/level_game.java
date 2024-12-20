/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */


package com.mycompany.apextosos;
import java.net.URL;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.*;
import java.awt.*;

    
/**
 *
 * @author JuanMa
 */
public class level_game extends javax.swing.JPanel {
    private Color color1;   
    private Color color2;
    private Color color3;
    private String level_generate;
    private String exercise;
    private String dimensional;
    private String answer; 
    String nombre;
    String curso;
    JPanel panel_principal;
    /**
    /**
     * Creates new form level_game
     */
    public level_game(String nombre, String curso, JPanel panel_principal, Color type_color1, Color type_color2, Color type_color3, int level_generate) {
        this.nombre = nombre;
        this.curso = curso;
        this.panel_principal = panel_principal;
        this.color1 = type_color1;
        this.color2 = type_color2; 
        this.color3 = type_color3;
        this.level_generate = String.valueOf(level_generate + 1);
        initComponents();
        initComponents2(this.color1, this.color2, this.color3);
        

    }
    
    public void initComponents2(Color color1, Color color2, Color color3){
        this.buttonGroup1.add(this.jRadioButton1);
        this.buttonGroup1.add(this.jRadioButton2);
        this.buttonGroup1.add(this.jRadioButton3);
        this.buttonGroup1.add(this.jRadioButton4);
        this.setBackground(color1);
        this.jPanel1.setBackground(color3);
        this.jButton4.setBackground(color3);
        this.jButton7.setBackground(color3);
        System.out.println(color1.equals(Color.decode("#111518")));
        if(color1.equals(Color.decode("#111518"))){
            this.question.setForeground(Color.WHITE);
        }
        else{
            this.question.setForeground(Color.BLACK);
        }


        // busqueda de dato
        if(this.curso.toLowerCase().replaceAll("\\s+", "").trim().equals("fisica")){
            apex_DAO dao = new apex_DAO(color1, color2, color3);
            ArrayList<level_fisica> nivel = dao.Buscar_level_fisica(this.level_generate);
            if (nivel != null && !nivel.isEmpty()) {
                for (level_fisica p : nivel) {
                    this.exercise = p.pregunta;
                    this.dimensional = p.dimensional;
                    this.answer = p.respuesta;

                    // generar random donde guardar la respuesta 
                    Random random = new Random();
                    int randomInt = random.nextInt(4) + 1;
                    // generar rangos
                    float inicio_rango = Float.parseFloat(p.respuesta);

                    float rango_min = inicio_rango * 0.5f - inicio_rango;
                    float rango_max = inicio_rango * 0.5f + inicio_rango;

                    // generar archivos 
                    String value1 = generate_false_answer(rango_min, rango_max);
                    String value2 = generate_false_answer(rango_min, rango_max);
                    String value3 = generate_false_answer(rango_min, rango_max);

                    if (randomInt == 1){
                        this.jLabel4.setText(this.answer);
                        this.jLabel5.setText(value1);
                        this.jLabel3.setText(value2);
                        this.jLabel1.setText(value3);
                    }
                    else if (randomInt == 2){
                        this.jLabel5.setText(this.answer);
                        this.jLabel4.setText(value1);
                        this.jLabel3.setText(value2);
                        this.jLabel1.setText(value3);
                    }
                    else if (randomInt == 3){
                        this.jLabel3.setText(this.answer);
                        this.jLabel5.setText(value1);
                        this.jLabel4.setText(value2);
                        this.jLabel1.setText(value3);
                    }
                    else{
                        this.jLabel1.setText(this.answer);
                        this.jLabel5.setText(value1);
                        this.jLabel3.setText(value2);
                        this.jLabel4.setText(value3);
                    }

                    load_images();
                }
            } else {
                System.out.println("No se encontraron datos o hubo un error.");
            }
        }
        else{

            apex_DAO dao = new apex_DAO(color1, color2, color3);
            ArrayList<level_fisica> nivel = dao.Buscar_level_precalculo(this.level_generate);
            if (nivel != null && !nivel.isEmpty()) {
                for (level_fisica p : nivel) {
                    this.exercise = p.pregunta;
                    this.dimensional = p.dimensional;
                    this.question.setText(this.exercise);
                    this.answer = p.respuesta;
                    // generar random donde guardar la  respuesta 
                    Random random = new Random();
                    int randomInt = random.nextInt(4) + 1;
                    // generar rangos
                    float inicio_rango = Float.parseFloat(p.respuesta);
                    
                    float rango_min = inicio_rango * 0.5f - inicio_rango;
                    float rango_max = inicio_rango * 0.5f + inicio_rango;
                    
                    // generar archivos 
                    String value1 = generate_false_answer(rango_min, rango_max);
                    String value2 = generate_false_answer(rango_min, rango_max);
                    String value3 = generate_false_answer(rango_min, rango_max);

                    if (randomInt == 1){
                        this.jLabel4.setText(this.answer);
                        this.jLabel5.setText(value1);
                        this.jLabel3.setText(value2);
                        this.jLabel1.setText(value3);
                    }
                    else if (randomInt == 2){
                        this.jLabel5.setText(this.answer);
                        this.jLabel4.setText(value1);
                        this.jLabel3.setText(value2);
                        this.jLabel1.setText(value3);
                    }
                    else if (randomInt == 3){
                        this.jLabel3.setText(this.answer);
                        this.jLabel5.setText(value1);
                        this.jLabel4.setText(value2);
                        this.jLabel1.setText(value3);
                    }
                    else{
                        this.jLabel1.setText(this.answer);
                        this.jLabel5.setText(value1);
                        this.jLabel3.setText(value2);
                        this.jLabel4.setText(value3);
                    }

                    System.out.println(randomInt);

                }
            } else {
                System.out.println("No se encontraron datos o hubo un error.");
            }
        
        }


    }

    

    public String generate_false_answer(float min, float max){
        float randomFloat = min + (float) Math.random() * (max - min);
        String formattedFloat = String.format("%.2f", randomFloat);
        return formattedFloat;
    }

    
    public void load_images(){
                try {
            // Reemplaza con el enlace directo a la imagen en Google Drive
            String urlString = this.exercise;
            URL url = new URL(urlString);
            ImageIcon imagen = new ImageIcon(url);
            this.question.setIcon(imagen);

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error al cargar la imagen.");
        }
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        question = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jButton7 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setBackground(new java.awt.Color(17, 21, 25));

        jPanel1.setBackground(new java.awt.Color(9, 11, 12));

        question.setBackground(new java.awt.Color(255, 255, 255));
        question.setForeground(new java.awt.Color(255, 255, 255));
        question.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        question.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(question, javax.swing.GroupLayout.PREFERRED_SIZE, 834, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 223, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(question, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("EJEMPLO2");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("EJEMPLO");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("EJEMPLO");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("EJMPLO");

        jRadioButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jRadioButton1.setText("A");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jRadioButton2.setText("B");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jRadioButton3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jRadioButton3.setText("D");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        jRadioButton4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jRadioButton4.setText("C");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(9, 11, 12));
        jButton7.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("VOLVER");
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

        jButton4.setBackground(new java.awt.Color(9, 11, 12));
        jButton4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("VERIFICAR");
        jButton4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 51, 51))); // NOI18N
        jButton4.setBorderPainted(false);
        jButton4.setDefaultCapable(false);
        jButton4.setFocusPainted(false);
        jButton4.setFocusable(false);
        jButton4.setRequestFocusEnabled(false);
        jButton4.setRolloverEnabled(false);
        jButton4.setVerifyInputWhenFocusTarget(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jRadioButton1)
                            .addGap(169, 169, 169)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jRadioButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton4))
                .addGap(442, 442, 442))
            .addGroup(layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(423, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton4)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton2)
                            .addComponent(jRadioButton3))
                        .addGap(2, 2, 2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(108, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed

    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handlindzg code here:
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        game_frame return_game = new game_frame(this.nombre, this.curso, this.panel_principal, this.color1, this.color2, this.color3);
        return_game.setSize(2000, 1000);
        return_game.setLocation(0,0 );
        this.removeAll();
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.setSize(900, 800);
        this.add(return_game);
        this.revalidate();
        this.repaint();    
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        ButtonModel selectedModel = this.buttonGroup1.getSelection(); // Obtener el modelo seleccionado
        if (selectedModel != null) {
            // Comparar modelos para saber cuál está seleccionado
            if (selectedModel.equals(this.jRadioButton1.getModel())) {
                if (this.jLabel4.getText() == this.answer){
                    // actualizar nivel
                    apex_DAO dao = new apex_DAO(color1, color2, color3);
                    int new_leve = Integer.parseInt(this.level_generate) + 1;
                    if(this.curso.toLowerCase().replaceAll("\\s+", "").trim().equals("fisica")){
                        dao.actualizarCodigo(this.nombre, Integer.toString(new_leve));
                    }
                    else{
                        dao.actualizarCodigo2(this.nombre, Integer.toString(new_leve));
                    }
                    JOptionPane.showMessageDialog(null, "¡Respuesta correcta!", "Felicidades", JOptionPane.INFORMATION_MESSAGE);

                }
            
            } else if (selectedModel.equals(this.jRadioButton2.getModel())) {
                if (this.jLabel5.getText() == this.answer){
                    apex_DAO dao = new apex_DAO(color1, color2, color3);
                    int new_leve = Integer.parseInt(this.level_generate) + 1;
                    if(this.curso.toLowerCase().replaceAll("\\s+", "").trim().equals("fisica")){
                        dao.actualizarCodigo(this.nombre, Integer.toString(new_leve));
                    }
                    else{
                        dao.actualizarCodigo2(this.nombre, Integer.toString(new_leve));
                    }
                    JOptionPane.showMessageDialog(null, "¡Respuesta correcta!", "Felicidades", JOptionPane.INFORMATION_MESSAGE);

                }
            } else if (selectedModel.equals(this.jRadioButton3.getModel())) {
                System.out.println("Opción 3 seleccionada");
                System.out.println(this.jLabel1.getText());
                if (this.jLabel1.getText() == this.answer){
                    apex_DAO dao = new apex_DAO(color1, color2, color3);
                    int new_leve = Integer.parseInt(this.level_generate) + 1;
                    if(this.curso.toLowerCase().replaceAll("\\s+", "").trim().equals("fisica")){
                        dao.actualizarCodigo(this.nombre, Integer.toString(new_leve));
                    }
                    else{
                        dao.actualizarCodigo2(this.nombre, Integer.toString(new_leve));
                    }
                    JOptionPane.showMessageDialog(null, "¡Respuesta correcta!", "Felicidades", JOptionPane.INFORMATION_MESSAGE);
                }
            }
             else if (selectedModel.equals(this.jRadioButton4.getModel())) {
                if (this.jLabel3.getText() == this.answer){
                    apex_DAO dao = new apex_DAO(color1, color2, color3);
                    int new_leve = Integer.parseInt(this.level_generate) + 1;
                    if(this.curso.toLowerCase().replaceAll("\\s+", "").trim().equals("fisica")){
                        dao.actualizarCodigo(this.nombre, Integer.toString(new_leve));
                    }
                    else{
                        dao.actualizarCodigo2(this.nombre, Integer.toString(new_leve));
                    } 
                    JOptionPane.showMessageDialog(null, "¡Respuesta correcta!", "Felicidades", JOptionPane.INFORMATION_MESSAGE);
 
                }
            }
         else {
            System.out.println("No hay ninguna opción seleccionada");
        }
    }
        

    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JLabel question;
    // End of variables declaration//GEN-END:variables
}
