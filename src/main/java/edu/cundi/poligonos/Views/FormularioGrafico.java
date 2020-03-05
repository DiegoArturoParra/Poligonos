/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cundi.poligonos.Views;

import java.awt.*;

import javax.swing.*;

/**
 * Clase formulario que muestra el plano cartesiano en una ventana(frame).
 *
 * @author diego parra
 */
public class FormularioGrafico extends JFrame {

    /**
     * se instancia un objeto de la clase planoCartesiano para pintarlo en un
     * panel.
     */
    public PlanoCartesiano plano;
    /**
     * boton para graficar.
     */
    public final JButton btnGraficar = new JButton("Graficar");

    /**
     * Constructor que inicializa al frame.
     */
    public FormularioGrafico() {
        setBounds(300, 300, 510, 600);
        setLayout(new BorderLayout());
        plano = new PlanoCartesiano();
        this.setLocation(700, 130);
        add(btnGraficar);
    }
}
