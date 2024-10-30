/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.apextosos;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JPanel;

/**
 *
 * @author chatm
 */
public class Simulacros extends javax.swing.JPanel {
    JPanel panel_principal;
    String nombre;
    String curso;
    Color color1;
    Color color2;
    Color color3;

    public Simulacros(JPanel panel_principal, String nombre, String curso, Color color1, Color color2, Color color3) {
        this.panel_principal = panel_principal;
        this.nombre = nombre;
        this.curso = curso;
        this.color1 = color1;
        this.color2 = color2;
        this.color3 = color3;
        initComponents();
    }
    
    public void generar(){
        apex_DAO apx = new apex_DAO(color1,color2,color3);
        int dif =Integer.parseInt(dificultad.getSelectedItem().toString()); 
        ArrayList<Pregunta>datos = apx.Buscar_preguntaB_dificultad(curso, dif*10);
        int[] codigos = new int[datos.size()];
        int pos = 0;
        for(Pregunta general: datos){
            codigos[pos] = general.getCodigo();
            pos += 1;
        }
        int min = 0;
        int max = codigos.length-1; 
        Random random = new Random();
        int n1 = random.nextInt(max - min + 1) + min;
        int n2 = random.nextInt(max - min + 1) + min;
        int n3 = random.nextInt(max - min + 1) + min;
        int n4 = random.nextInt(max - min + 1) + min;
        
        while(n2 == n1){
            n2 = random.nextInt(max - min + 1) + min;
        }
        
        while(n3 == n1 || n3 == n2){
            n3 = random.nextInt(max - min + 1) + min;
        }
        
        while(n4 == n1 || n4 == n2 || n4 == n3){
            n4 = random.nextInt(max - min + 1) + min;
        }
        
        int codigo1 = codigos[n1];
        int codigo2 = codigos[n2];
        int codigo3 = codigos[n3];
        int codigo4 = codigos[n4];
        
        boton_problema boton1 = new boton_problema(codigo1,nombre,curso,panel_principal,color1,color2,color3);
        boton_problema boton2 = new boton_problema(codigo2,nombre,curso,panel_principal,color1,color2,color3);
        boton_problema boton3 = new boton_problema(codigo3,nombre,curso,panel_principal,color1,color2,color3);
        boton_problema boton4 = new boton_problema(codigo4,nombre,curso,panel_principal,color1,color2,color3);
        panel_problemas.add(boton1);
        panel_problemas.add(boton2);
        panel_problemas.add(boton3);
        panel_problemas.add(boton4);
        
        panel_problemas.revalidate();
        panel_problemas.repaint();
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        panel_problemas = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        dificultad = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel1.setText("Simulacro de examen:");

        javax.swing.GroupLayout panel_problemasLayout = new javax.swing.GroupLayout(panel_problemas);
        panel_problemas.setLayout(panel_problemasLayout);
        panel_problemasLayout.setHorizontalGroup(
            panel_problemasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panel_problemasLayout.setVerticalGroup(
            panel_problemasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 448, Short.MAX_VALUE)
        );

        panel_problemas.setLayout(new GridLayout(8,1));

        jButton1.setText("Generar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        dificultad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"1","2","3","4","5"}));

        jLabel2.setText("Seleccione dificultad:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_problemas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dificultad, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 473, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(dificultad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panel_problemas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        generar();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> dificultad;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel panel_problemas;
    // End of variables declaration//GEN-END:variables
}
