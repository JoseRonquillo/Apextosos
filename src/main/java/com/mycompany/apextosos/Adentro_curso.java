/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.apextosos;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author chatman
 */
public class Adentro_curso extends javax.swing.JPanel {
    private Color color1;
    private Color color2;
    private Color color3;
    private String cursos = "Precalculo, Fisica,";
    String nombre;
    String curso;
    JPanel panel_principal;
    
    public Adentro_curso(String nombre, String curso, JPanel panel_principal, Color color1_d, Color color2_d, Color color3_d ) {
        this.nombre = nombre;
        this.curso = curso;
        this.panel_principal = panel_principal;
        this.color1 = color1_d;
        this.color2 = color2_d;
        this.color3 = color3_d;
        initComponents();
        jLabel1.setText(curso);
        this.setBackground(color1_d);
        if(color1_d.equals(Color.decode("#111518"))){
            this.jLabel1.setForeground(Color.WHITE);
        }
        else{
            this.jLabel1.setForeground(Color.BLACK);
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

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel1.setText("jLabel1");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_unidad.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_problemas.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_simulacion.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/setting2.png"))); // NOI18N
        jButton5.setBorder(null);
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton4.setText("REGRESAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jButton5)
                                .addGap(81, 81, 81)
                                .addComponent(jButton4))
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(282, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jButton4))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5)))
                .addContainerGap(75, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed


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
                              // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        System.out.println(this.color1);
        settings tools = new settings(this.nombre, this.curso, this.panel_principal, this.color1, this.color2, this.color3);
        tools.setSize(4000, 2000);
        tools.setLocation(0,0 );
        this.removeAll();
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.setSize(700, 525);
        this.add(tools);
        this.revalidate();
        this.repaint();                // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        listadoPrecalculo return_game = new listadoPrecalculo(this.nombre, this.curso, this.panel_principal, this.color1, this.color2, this.color3);
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
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        boton_problema[] btns = new boton_problema[1];
        Simulacros sm= new Simulacros(panel_principal,nombre,curso ,color1, color2, color3,btns);
            sm.setSize(780,635);
            sm.setLocation(0,0);
            panel_principal.removeAll();
            panel_principal.add(sm,BorderLayout.CENTER);
            panel_principal.revalidate();
            panel_principal.repaint();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Home return_curse = new Home(this.nombre, this.cursos, this.panel_principal, this.color1, this.color2, this.color3);
        return_curse.setSize(2000, 1000);
        return_curse.setLocation(0,0 );
        this.removeAll();   
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900, 600);
        this.add(return_curse);
        this.revalidate();
        this.repaint();  
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
