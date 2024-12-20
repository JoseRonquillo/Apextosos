
package com.mycompany.apextosos;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

/**
 *
 * @author chatman
 */
public class Registrar extends javax.swing.JFrame {
    private int theme;
    private Color color1;
    private Color color2;
    private Color color3;
    
    /**
     * Creates new form login
     */
    public Registrar() {
        initComponents();
        this.theme = 0;
        initComponents2();   
    }

    private void initComponents2(){
        if (this.theme == 0){
            this.color1 = Color.decode("#111518");
            this.color2 = Color.decode("#0B0F11");
            this.color3 = Color.decode("#090B0C");
        }
        else{
            this.color1 = Color.decode("#F5F5F5");
            this.color2 = Color.decode("#E1E8EB");
            this.color3 = Color.decode("#D6D9DC");
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

        jButton3 = new javax.swing.JButton();
        panelRound1 = new com.mycompany.apextosos.PanelRound();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        txtContra = new javax.swing.JTextField();
        txtConf = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setText("X");
        jButton3.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.0f));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 0, -1, -1));

        panelRound1.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.3f));
        panelRound1.setRoundBottomLeft(50);
        panelRound1.setRoundBottomRight(50);
        panelRound1.setRoundTopLeft(50);
        panelRound1.setRoundTopRight(50);
        panelRound1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                panelRound1ComponentHidden(evt);
            }
        });
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user_15194213.png"))); // NOI18N
        panelRound1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        jButton2.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.0019f));
        jButton2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jButton2.setText("Registrar");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        panelRound1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 217, 33));

        jLabel5.setText("Nombre:");
        panelRound1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jLabel6.setText("Usuario:");
        panelRound1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jLabel7.setText("Contraseña:");
        panelRound1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        jLabel8.setText("Confirmar:");
        panelRound1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));
        panelRound1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 190, -1));
        panelRound1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 190, -1));
        panelRound1.add(txtContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 190, -1));
        panelRound1.add(txtConf, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 190, -1));

        jButton4.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.0019f));
        jButton4.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jButton4.setText("Regresar");
        jButton4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        panelRound1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 217, 33));

        getContentPane().add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 320, 490));

        jLabel4.setBackground(new java.awt.Color(0, 0, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/azul-solido_984027-210891.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 570));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void panelRound1ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_panelRound1ComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_panelRound1ComponentHidden

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(txtContra.getText().equals(txtConf.getText())){
            apex_DAO apx = new apex_DAO(color1,color2,color3);
            apx.insertar_usuario(txtUsuario.getText(), txtContra.getText(), txtNombre.getText());
        } else {
            JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden", "Error", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        login lg = new login();
        lg.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private com.mycompany.apextosos.PanelRound panelRound1;
    private javax.swing.JTextField txtConf;
    private javax.swing.JTextField txtContra;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
