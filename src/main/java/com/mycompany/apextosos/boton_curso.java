/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.apextosos;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author chatman
 */
public class boton_curso extends JButton{
    
    String nombre;
    String curso;
    JPanel panel_principal;
    private Color color1;
    private Color color2;
    private Color color3;

    public boton_curso(String nombre, String texto, JPanel panel_principal, Color data_color1, Color data_color2, Color data_color3){
        this.nombre = nombre;
        this.curso = texto;
        this.panel_principal = panel_principal;
        this.color1 = data_color1;
        this.color2 = data_color2;
        this.color3 = data_color3;
        this.setText(curso);
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            Adentro_curso ad = new Adentro_curso(nombre,curso,panel_principal, color1, color2, color3);
            ad.setSize(780,645);
            ad.setLocation(0,0);
            panel_principal.removeAll();
            panel_principal.add(ad,BorderLayout.CENTER);
            panel_principal.revalidate();
            panel_principal.repaint();
            }
        });
    }
    
    
}
