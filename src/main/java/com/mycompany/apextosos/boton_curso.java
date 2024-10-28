/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.apextosos;

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
    
    public boton_curso(String nombre, String texto, JPanel panel_principal){
        this.nombre = nombre;
        this.curso = texto;
        this.panel_principal = panel_principal;
        this.setText(curso);
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            Adentro_curso ad = new Adentro_curso(nombre,curso,panel_principal);
            ad.setSize(1487,1411);
            ad.setLocation(0,0);
            panel_principal.removeAll();
            panel_principal.add(ad,BorderLayout.CENTER);
            panel_principal.revalidate();
            panel_principal.repaint();
            }
        });
    }
    
    
}
