/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.apextosos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.*;


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
    boton_problema[] btns;
    int codigo1;
    int codigo2;
    int codigo3;
    int codigo4;

    public Simulacros(JPanel panel_principal, String nombre, String curso, Color color1, Color color2, Color color3,boton_problema[] btns) {
        this.panel_principal = panel_principal;
        this.nombre = nombre;
        this.curso = curso;
        this.color1 = color1;
        this.color2 = color2;
        this.color3 = color3;
        if (btns.length == 4){
            refrescar();
        } else {
            this.btns = btns;
        }
        
        
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
        
        this.codigo1 = codigos[n1];
        this.codigo2 = codigos[n2];
        this.codigo3 = codigos[n3];
        this.codigo4 = codigos[n4];
        
        boton_problema boton1 = new boton_problema(codigo1,nombre,curso,panel_principal,color1,color2,color3,btns);
        boton_problema boton2 = new boton_problema(codigo2,nombre,curso,panel_principal,color1,color2,color3,btns);
        boton_problema boton3 = new boton_problema(codigo3,nombre,curso,panel_principal,color1,color2,color3,btns);
        boton_problema boton4 = new boton_problema(codigo4,nombre,curso,panel_principal,color1,color2,color3,btns);
        boton_problema[] botones = new boton_problema[4];
        this.btns = botones;
        botones[0] = boton1;
        botones[1] = boton2;
        botones[2] = boton3;
        botones[3] = boton4;
        //panel_problemas.add(boton1);
        //panel_problemas.add(boton2);
        //panel_problemas.add(boton3);
        //panel_problemas.add(boton4);
        
        //panel_problemas.revalidate();
        //panel_problemas.repaint();
        
    }
    
    public void refrescar(){
        panel_problemas.add(btns[0]);
        panel_problemas.add(btns[1]);
        panel_problemas.add(btns[2]);
        panel_problemas.add(btns[3]);
        
        panel_problemas.revalidate();
        panel_problemas.repaint();
    }
    
    public void sumar_nota(){
        int n_nota = Integer.parseInt(txtnota.getText()) + 25;
        txtnota.setText(""+n_nota);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        panel_problemas = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        dificultad = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        ej1 = new javax.swing.JButton();
        ej2 = new javax.swing.JButton();
        ej3 = new javax.swing.JButton();
        ej4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtnota = new javax.swing.JLabel();

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
            .addGap(0, 547, Short.MAX_VALUE)
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

        ej1.setText("Ejercicio 1");
        ej1.setEnabled(false);
        ej1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ej1ActionPerformed(evt);
            }
        });

        ej2.setText("Ejercicio 2");
        ej2.setEnabled(false);
        ej2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ej2ActionPerformed(evt);
            }
        });

        ej3.setText("Ejercicio 3");
        ej3.setEnabled(false);
        ej3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ej3ActionPerformed(evt);
            }
        });

        ej4.setText("Ejercicio 4");
        ej4.setEnabled(false);
        ej4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ej4ActionPerformed(evt);
            }
        });

        jButton6.setText("Terminar examen");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel3.setText("Nota:");

        txtnota.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panel_problemas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dificultad, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ej1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ej2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ej3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ej4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton6)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtnota)
                        .addGap(80, 80, 80))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(txtnota))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(dificultad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(ej1)
                    .addComponent(ej2)
                    .addComponent(ej3)
                    .addComponent(ej4)
                    .addComponent(jButton6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panel_problemas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ej1.setEnabled(true);
        ej2.setEnabled(true);
        ej3.setEnabled(true);
        ej4.setEnabled(true);
        txtnota.setText("0");
        generar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ej1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ej1ActionPerformed

        Pasa_preguntas ps= new Pasa_preguntas(panel_problemas,nombre,curso,codigo1 ,color1, color2, color3);
        ps.setParcial();
        ps.getSimulacro(this);
        ps.getEj(ej1);
            ps.setSize(780,635);
            ps.setLocation(0,0);
            panel_problemas.removeAll();
            panel_problemas.add(ps,BorderLayout.CENTER);
            panel_problemas.revalidate();
            panel_problemas.repaint();
    }//GEN-LAST:event_ej1ActionPerformed

    private void ej2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ej2ActionPerformed

        Pasa_preguntas ps= new Pasa_preguntas(panel_problemas,nombre,curso,codigo2 ,color1, color2, color3);
        ps.setParcial();
        ps.getSimulacro(this);
        ps.getEj(ej2);
        ps.setSize(780,635);
        ps.setLocation(0,0);
        panel_problemas.removeAll();
        panel_problemas.add(ps,BorderLayout.CENTER);
        panel_problemas.revalidate();
        panel_problemas.repaint();
    }//GEN-LAST:event_ej2ActionPerformed

    private void ej3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ej3ActionPerformed

        Pasa_preguntas ps= new Pasa_preguntas(panel_problemas,nombre,curso,codigo3 ,color1, color2, color3);
        ps.setParcial();
        ps.getSimulacro(this);
        ps.getEj(ej3);
        ps.setSize(780,635);
        ps.setLocation(0,0);
        panel_problemas.removeAll();
        panel_problemas.add(ps,BorderLayout.CENTER);
        panel_problemas.revalidate();
        panel_problemas.repaint();
    }//GEN-LAST:event_ej3ActionPerformed

    private void ej4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ej4ActionPerformed

        Pasa_preguntas ps= new Pasa_preguntas(panel_problemas,nombre,curso,codigo4 ,color1, color2, color3);
        ps.setParcial();
        ps.getSimulacro(this);
        ps.getEj(ej4);
        ps.setSize(780,635);
        ps.setLocation(0,0);
        panel_problemas.removeAll();
        panel_problemas.add(ps,BorderLayout.CENTER);
        panel_problemas.revalidate();
        panel_problemas.repaint();
    }//GEN-LAST:event_ej4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        String puntaje =  "Tu nota es: " + txtnota.getText();
        JOptionPane.showMessageDialog(null, puntaje, "PUNTAJE: ", JOptionPane.INFORMATION_MESSAGE);

        Adentro_curso return_curse = new Adentro_curso(this.nombre, this.curso, this.panel_principal, this.color1, this.color2, this.color3);
        return_curse.setSize(2000, 2000);
        return_curse.setLocation(0,0 );
        this.removeAll();   
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.setSize(900, 700);
        this.add(return_curse);
        this.revalidate();
        this.repaint();      
    }//GEN-LAST:event_jButton6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> dificultad;
    private javax.swing.JButton ej1;
    private javax.swing.JButton ej2;
    private javax.swing.JButton ej3;
    private javax.swing.JButton ej4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel panel_problemas;
    private javax.swing.JLabel txtnota;
    // End of variables declaration//GEN-END:variables
}
