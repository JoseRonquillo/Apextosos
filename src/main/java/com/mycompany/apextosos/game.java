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
    public int cantidad = 50;


    public game() {
        setPreferredSize(new Dimension(400, 400));
        initComponents();
        initComponents2();
    }
    
    public void initComponents2() {
        this.getContentPane().setBackground(colorBlue);
        JTextArea texto = new JTextArea(createBlankLines(7 *cantidad ));
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
        
       for (int i = 0; i < botones.length; i++) {
            botones[i] = new JButton();
            ImageIcon icono = new ImageIcon(game.class.getResource("/images_games/circule64.png"));
            botones[i].setIcon(icono);
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
            posicion_y += 100;
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1016, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 654, Short.MAX_VALUE)
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
    // End of variables declaration//GEN-END:variables
}
