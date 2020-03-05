/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cundi.poligonos.Views;

import java.awt.*;

import javax.swing.*;

/**
 *
 * @author diego
 */
public class FormularioGrafico extends JFrame {

    public PlanoCartesiano plano;
    public final JButton btnGraficar = new JButton("Graficar");
    public FormularioGrafico() {
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(300, 300, 510, 600);
        setLayout(new BorderLayout());
        plano = new PlanoCartesiano();
        setLocationRelativeTo(null);
        add(plano, BorderLayout.CENTER);
        add(btnGraficar);
    }

}
