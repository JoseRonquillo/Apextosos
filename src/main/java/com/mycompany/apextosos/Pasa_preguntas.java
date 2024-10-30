/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.apextosos;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author chatman
 */
public class Pasa_preguntas extends javax.swing.JPanel {
    JPanel panel_principal; 
    String nombre; 
    String curso;
    int codigo;
    Pregunta pregunta;
    JTextField[] arraytxt;
    
    public Pasa_preguntas(JPanel panel_principal, String nombre, String curso, int codigo, Color color1_d, Color color2_d, Color color3_d) {
        this.panel_principal = panel_principal;
        this.nombre = nombre;
        this.curso = curso;
        this.codigo = codigo;
        apex_DAO apx = new apex_DAO(color1_d, color2_d, color3_d);
        this.pregunta = apx.Buscar_preguntaB(curso, codigo);
        initComponents();
        this.textopr.setText(pregunta.getInstrucciones() + " \n" +pregunta.getEnunciado());
        this.arraytxt = new JTextField[4];
        crear_cajas_txt();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRound1 = new com.mycompany.apextosos.PanelRound();
        jScrollPane1 = new javax.swing.JScrollPane();
        textopr = new javax.swing.JTextArea();
        opciones = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        panelRound1.setBackground(new java.awt.Color(61, 235, 188));
        panelRound1.setRoundBottomLeft(50);
        panelRound1.setRoundBottomRight(50);
        panelRound1.setRoundTopLeft(50);
        panelRound1.setRoundTopRight(50);

        jScrollPane1.setBorder(null);

        textopr.setEditable(false);
        textopr.setBackground(new java.awt.Color(61, 235, 188));
        textopr.setColumns(20);
        textopr.setRows(5);
        textopr.setBorder(null);
        jScrollPane1.setViewportView(textopr);

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 729, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                .addContainerGap())
        );

        opciones.setLayout(new java.awt.GridLayout());

        jButton1.setText("Enviar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(opciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opciones, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        verificar_respuestas();
    }//GEN-LAST:event_jButton1ActionPerformed
    
    public void crear_cajas_txt(){
        String tipo_e = pregunta.getTipo();
        int cantidad = Integer.parseInt(String.valueOf(tipo_e.charAt(1)));
        
        for(int i = 0; i < cantidad; i++){
            JTextField txt = new JTextField("");
            opciones.add(txt);
            arraytxt[i] = txt;
        }
        
    }
    
    public void verificar_respuestas(){
        String tipo_e = pregunta.getTipo();
        int cantidad = Integer.parseInt(String.valueOf(tipo_e.charAt(1)));
        String respuesta = pregunta.getRespuesta();
        String texto = "";
        String[] respuestas = new String[cantidad];
        int pos = 0;
        for(int i = 0; i < respuesta.length(); i++) {
        char caracter = respuesta.charAt(i);
        String letra = String.valueOf(caracter);
        if (letra.equals(";")){
            System.out.println(texto);
            respuestas[pos] = texto;
            pos += 1;
            texto = "";
        } else {
         texto += letra;
        }
      }
        
        int correctas = 0;
        
        for(int j = 0; j < cantidad; j++){
            if(respuestas[j].replaceAll("\\s+", "").equals(arraytxt[j].getText().replaceAll("\\s+", ""))){
                correctas += 1;
                arraytxt[j].setForeground(Color.GREEN);
            } else {
                arraytxt[j].setForeground(Color.RED);
            }
        }
        
        if (correctas == cantidad){
            JOptionPane.showMessageDialog(null, "¡Respuesta correcta!", "Felicidades", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Respuesta incorrecta", "Intenta otra vez", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel opciones;
    private com.mycompany.apextosos.PanelRound panelRound1;
    private javax.swing.JTextArea textopr;
    // End of variables declaration//GEN-END:variables
}
