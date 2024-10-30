
package com.mycompany.apextosos;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import java.awt.BorderLayout;

/**
 *
 * @author chatman
 */
public class Home extends javax.swing.JPanel {

    String nombre;
    String cursos;
    JPanel panel_principal;
    Color color1;
    Color color2;
    Color color3;

    
    public Home(String nombre, String cursos, JPanel panel_principal, Color color1, Color color2, Color color3) {
        this.nombre = nombre;
        this.cursos = cursos;
        this.panel_principal = panel_principal;
        this.color1 = color1;
        this.color2 = color2;
        this.color3 = color3;
        initComponents();
        bienvenida.setText("Bienvenido "+nombre);
        String curso = "";
        for(int i = 0; i < cursos.length(); i++) {
        char caracter = cursos.charAt(i);
        String letra = String.valueOf(caracter);
        //this.jButton2.setBackground(color1);

        JButton btnflashcards = new JButton("HAZ TUS PROPIAS FLASHCARDS!");
        btnflashcards.addActionListener(e -> open_menu_flash());
        btnflashcards.setBounds(540, 70, 235, 30);
        btnflashcards.setBackground(color1);
        btnflashcards.setForeground(Color.WHITE);
        if (letra.equals(",")){
            boton_curso boton = new boton_curso(nombre,curso,panel_principal, color1, color2, color3);
            System.out.println(curso);
            boton.setText(curso);
            boton.setHorizontalTextPosition(SwingConstants.CENTER);
            boton.setVerticalTextPosition(SwingConstants.CENTER);
            if(color1.equals(Color.decode("#111518"))){
                boton.setForeground(Color.WHITE);
                this.jLabel1.setForeground(Color.WHITE);
                this.bienvenida.setForeground(Color.WHITE);
                btnflashcards.setForeground(Color.WHITE);
            }
            else{
                boton.setForeground(Color.BLACK);
                btnflashcards.setForeground(Color.BLACK);

            }
            
            boton.setBackground(color1);
            panel_cursos.add(boton);
            curso = "";
        } else
        if (letra.equals("0")){
            break;
        } else {
         curso += letra;
        }
        this.panel_cursos.setBackground(color1);
        this.panelRound1.setBackground(color2);
        this.setBackground(color1);
        this.add(btnflashcards);


        

    }
    }

    public void open_menu_flash(){
        menu_flash_cards ad = new menu_flash_cards(this.nombre, this.cursos, this.panel_principal, this.color1, this.color2, this.color3);
        ad.setSize(1487,1411);
        ad.setLocation(0,0);
        panel_principal.removeAll();
        panel_principal.add(ad,BorderLayout.CENTER);
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

        panelRound1 = new com.mycompany.apextosos.PanelRound();
        bienvenida = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        panel_scroll = new javax.swing.JScrollPane();
        panel_cursos = new javax.swing.JPanel();

        panelRound1.setBackground(new java.awt.Color(102, 153, 255));
        panelRound1.setRoundBottomLeft(50);
        panelRound1.setRoundBottomRight(50);
        panelRound1.setRoundTopLeft(50);
        panelRound1.setRoundTopRight(50);

        bienvenida.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        bienvenida.setText("jLabel1");

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(267, 267, 267)
                .addComponent(bienvenida)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bienvenida)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel1.setText("Tus cursos:");

        javax.swing.GroupLayout panel_cursosLayout = new javax.swing.GroupLayout(panel_cursos);
        panel_cursos.setLayout(panel_cursosLayout);
        panel_cursosLayout.setHorizontalGroup(
            panel_cursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 762, Short.MAX_VALUE)
        );
        panel_cursosLayout.setVerticalGroup(
            panel_cursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 502, Short.MAX_VALUE)
        );

        panel_cursos.setLayout(new GridLayout(8,1));

        panel_scroll.setViewportView(panel_cursos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_scroll, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 774, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelRound1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(25, 661, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(204, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bienvenida;
    private javax.swing.JLabel jLabel1;
    private com.mycompany.apextosos.PanelRound panelRound1;
    private javax.swing.JPanel panel_cursos;
    private javax.swing.JScrollPane panel_scroll;
    // End of variables declaration//GEN-END:variables
}
