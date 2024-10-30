/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.apextosos;
import java.awt.Color;
import java.awt.BorderLayout;

/**
 *
 * @author chatman
 */
public class Menu_principal extends javax.swing.JFrame {
    private Color color1;
    private Color color2;
    private Color color3;

    String nombre;
    String cursos;
    
    public Menu_principal(String nombre, String cursos, Color color1_d, Color color2_d, Color color3_d) {
        this.nombre = nombre;
        this.cursos = cursos;
        this.color1  = color1_d;
        this.color2 = color2_d;
        this.color3 = color3_d;

        initComponents();
        Home hm = new Home(nombre,cursos,panel_principal, color1_d, color2_d, color3_d);
        hm.setSize(807,511);
        hm.setLocation(0,0);
        this.panel_principal.setBackground(color1_d);
        panel_principal.removeAll();
        panel_principal.add(hm,BorderLayout.CENTER);
        panel_principal.revalidate();
        panel_principal.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_principal = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout panel_principalLayout = new javax.swing.GroupLayout(panel_principal);
        panel_principal.setLayout(panel_principalLayout);
        panel_principalLayout.setHorizontalGroup(
            panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 785, Short.MAX_VALUE)
        );
        panel_principalLayout.setVerticalGroup(
            panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 637, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[], Color color1, Color color2, Color color3) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
 
        if (args.length > 0) {
                String nombre = args[0];
                String cursos = args[0];
                java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                new Menu_principal(nombre,cursos, color1, color2, color3).setVisible(true);
            }
        });
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel panel_principal;
    // End of variables declaration//GEN-END:variables
}
