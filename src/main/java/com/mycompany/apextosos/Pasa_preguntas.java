/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.apextosos;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

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
    boolean parcial;
    Simulacros sim;
    JButton ej;    
    Color color1;
    Color color2;
    Color color3;
    

    public Pasa_preguntas(JPanel panel_principal, String nombre, String curso, int codigo, Color color1_d, Color color2_d, Color color3_d) {
        this.panel_principal = panel_principal;
        this.nombre = nombre;
        this.curso = curso;
        this.codigo = codigo;
        apex_DAO apx = new apex_DAO(color1_d, color2_d, color3_d);
        System.out.println("El curso es:"+curso);
        System.out.println("El codigo es:"+codigo);
        this.pregunta = apx.Buscar_preguntaB(curso.replaceAll("\\s+", ""), codigo);
        initComponents();
        this.textopr.setText(pregunta.getInstrucciones() + " \n" +pregunta.getEnunciado());
        this.arraytxt = new JTextField[4];
        this.parcial = false;
        crear_cajas_txt();
        this.color1 = color1_d;
        this.color2 = color2_d;
        this.color3 = color3_d;
        this.setBackground(color1_d);
        this.panelRound1.setBackground(color3_d);
        this.opciones.setBackground(color2_d);
        this.jButton1.setBackground(color1_d);
        this.jButton2.setBackground(color1_d);
        this.panel_principal.setBackground(color1_d);
        if(color1.equals(Color.decode("#111518"))){
            this.jButton1.setForeground(Color.WHITE);
            this.jButton2.setForeground(Color.white);
        }
        else{
            this.jButton1.setForeground(Color.BLACK);
            this.jButton2.setForeground(Color.BLACK);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRound1 = new com.mycompany.apextosos.PanelRound();
        jScrollPane1 = new javax.swing.JScrollPane();
        textopr = new javax.swing.JTextArea();
        opciones = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

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

        opciones.setLayout(new java.awt.GridLayout(1, 0));

        jButton1.setText("Enviar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Regresar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
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
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        verificar_respuestas();
        if(parcial){
            jButton1.setEnabled(false);
            ej.setEnabled(false);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.out.println(this.color1);
        listadoPrecalculo return_curse = new listadoPrecalculo(this.nombre, this.curso, this.panel_principal, this.color1, this.color2, this.color3);
        return_curse.setSize(2000, 1000);
        return_curse.setLocation(0,0 );
        this.removeAll();   
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.setSize(900, 700);
        this.add(return_curse);
        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_jButton2ActionPerformed
    
    public void setParcial(){
    this.parcial = true;
    this.jButton2.setVisible(false);
    }
    
    public void getSimulacro(Simulacros simulacro){
        this.sim = simulacro;
    }
    
    public void getEj(JButton ej){
        this.ej = ej;
    }
    
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
            if(parcial){
                sim.sumar_nota();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Respuesta incorrecta", "Intenta otra vez", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel opciones;
    private com.mycompany.apextosos.PanelRound panelRound1;
    private javax.swing.JTextArea textopr;
    // End of variables declaration//GEN-END:variables
}
