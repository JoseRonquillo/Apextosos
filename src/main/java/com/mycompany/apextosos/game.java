/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.apextosos;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author JuanMa
 */

public class game extends javax.swing.JFrame {
    public Color colorBlue = Color.decode("#1D3557");
    public Color colorSkySkyBlue = Color.decode("#F1FAEE");
    public int cantidad = 20;


    public game() {
        setPreferredSize(new Dimension(400, 400));
        initComponents();
        initComponents2();
    }
    
    public void initComponents2() {
        this.getContentPane().setBackground(colorBlue);
        JTextArea texto = new JTextArea(createBlankLines(13 *cantidad ));
        texto.setLineWrap(false);
        texto.setBackground(colorBlue);
        texto.setBounds(500, 100, 400, 600); 
        JScrollPane scroll = new JScrollPane(texto, JScrollPane.VERTICAL_SCROLLBAR_NEVER, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scroll.setBorder(null);
        scroll.setBounds(500, 100, 400, 600); 
        //lista de botones 
        JButton[] botones = new JButton[cantidad]; 
        
        int posicion_x = 100;
        int posicion_y = 0;
        int sumarle_X = 50;
        int contador = 0;
        int level = 15;
        String ruta;
        String txt;
        
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
                ImageIcon icono = new ImageIcon(game.class.getResource(ruta));
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
                        System.out.println("Botón " + (index + 1) + " presionado.");
                    }
                });

                contador += 1;

                // Agregar el botón a la ventana
                texto.add(botones[i]);
                posicion_y += 200;
                posicion_x += sumarle_X;
            }


        this.add(scroll);
        this.setSize(1500,800);   
    }

    public static String createBlankLines(int numberOfLines) {
        StringBuilder blankLines = new StringBuilder(); 

        for (int i = 0; i < numberOfLines; i++) {
            blankLines.append("\n");
        }
        
        return blankLines.toString();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_games/gifts/owl_2.gif"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_games/gifts/rubon65-7a8fe.gif"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_games/gifts/amth.gif"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 278, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new game().setVisible(true);
            }
        });      
    }
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
