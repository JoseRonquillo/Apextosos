
package com.mycompany.apextosos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class boton_problema extends JButton{
    int codigo;
    String nombre;
    String curso;
    JPanel panel_principal;
    private Color color1;
    private Color color2;
    private Color color3;
    
    public boton_problema(int codigo, String nombre, String curso, JPanel panel_principal, Color data_color1, Color data_color2, Color data_color3,boton_problema[] btns){
        this.codigo = codigo;
        this.nombre = nombre;
        this.curso = curso;
        this.panel_principal = panel_principal;
        this.color1 = data_color1;
        this.color2 = data_color2;
        this.color3 = data_color3;
        this.setText("Problema: "+codigo);
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            Pasa_preguntas ps= new Pasa_preguntas(panel_principal,nombre,curso,codigo ,color1, color2, color3);
            ps.setSize(780,635);
            ps.setLocation(0,0);
            panel_principal.removeAll();
            panel_principal.add(ps,BorderLayout.CENTER);
            panel_principal.revalidate();
            panel_principal.repaint();
            }
        });
    }
}
