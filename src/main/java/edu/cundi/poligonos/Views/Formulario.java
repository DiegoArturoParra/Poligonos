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
 * @author diego parra
 * @version 1.1.0
 */
public class Formulario extends JFrame {

    public final JLabel labelTipoPoligono = new JLabel("Escoja Su Figura:");
    public final JLabel labelCoordenadax1 = new JLabel("Coordenada x1");
    public JTextField inputCoordenadax1 = new JTextField();
    public final JLabel labelCoordenaday1 = new JLabel("Coordenada y1");
    public JTextField inputCoordenaday1 = new JTextField();
    public final JLabel labelCoordenadax2 = new JLabel("Coordenada x2");
    public JTextField inputCoordenadax2 = new JTextField();
    public final JLabel labelCoordenaday2 = new JLabel("Coordenada y2");
    public JTextField inputCoordenaday2 = new JTextField();
    public final JLabel labelCoordenadax3 = new JLabel("Coordenada x3");
    public JTextField inputCoordenadax3 = new JTextField();
    public final JLabel labelCoordenaday3 = new JLabel("Coordenada y3");
    public JTextField inputCoordenaday3 = new JTextField();
    public final JLabel labelCoordenadax4 = new JLabel("Coordenada x4");
    public JTextField inputCoordenadax4 = new JTextField();
    public final JLabel labelCoordenaday4 = new JLabel("Coordenada y4");
    public JTextField inputCoordenaday4 = new JTextField();
    public final JLabel labelTipoTriangulo = new JLabel("Tipo De Triangulo");
    public JTextField inputTipoTriangulo = new JTextField();
    public final JLabel labelArea = new JLabel("Area");
    public JTextField inputArea = new JTextField();
    public final JLabel labelPerimetro = new JLabel("Perimetro");
    public JTextField inputPerimetro = new JTextField();
    public final JComboBox listaFiguras = new JComboBox();
    public final JButton btnPintar = new JButton("Pintar");
    public final JButton btnLimpiar = new JButton("Limpiar");
    public final JButton btnCalcular = new JButton("Calcular");

    public Formulario() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setTitle("Poligonos Triangulo, Cuadrado, Rectangulo");
        this.setSize(300, 400);
        this.setLocationRelativeTo(null);
        setLayout(new GridLayout(14, 7, 10, 5));

        listaFiguras.addItem("Cuadrado");
        listaFiguras.addItem("Rectangulo");
        listaFiguras.addItem("Triangulo");
        add(labelTipoPoligono);
        add(listaFiguras);
        add(labelCoordenadax1);
        add(inputCoordenadax1);
        add(labelCoordenaday1);
        add(inputCoordenaday1);
        add(labelCoordenadax2);
        add(inputCoordenadax2);
        add(labelCoordenaday2);
        add(inputCoordenaday2);
        add(labelCoordenadax3);
        add(inputCoordenadax3);
        add(labelCoordenaday3);
        add(inputCoordenaday3);
        add(labelCoordenadax4);
        add(inputCoordenadax4);
        add(labelCoordenaday4);
        add(inputCoordenaday4);
        add(labelTipoTriangulo);
        add(inputTipoTriangulo);
        inputTipoTriangulo.setFocusable(false);
        add(labelArea);
        add(inputArea);
        inputArea.setFocusable(false);
        add(labelPerimetro);
        add(inputPerimetro);
        inputPerimetro.setFocusable(false);
        add(btnPintar);
        add(btnLimpiar);
        add(btnCalcular);
    }
}
