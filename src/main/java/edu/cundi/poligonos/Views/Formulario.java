package edu.cundi.poligonos.Views;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author diego parra
 */
public class Formulario extends JFrame implements ActionListener {

    private final JLabel labelTipo = new JLabel("Escoja Su Figura:");
    private final JLabel labelCoordenadax1 = new JLabel("Coordenada x1");
    private JTextField inputCoordenadax1 = new JTextField();

    private final JLabel labelCoordenaday1 = new JLabel("Coordenada y1");
    private JTextField inputCoordenaday1 = new JTextField();

    private final JLabel labelCoordenadax2 = new JLabel("Coordenada x2");
    private JTextField inputCoordenadax2 = new JTextField();

    private final JLabel labelCoordenaday2 = new JLabel("Coordenada y2");
    private JTextField inputCoordenaday2 = new JTextField();

    private final JLabel labelCoordenadax3 = new JLabel("Coordenada x3");
    private JTextField inputCoordenadax3 = new JTextField();

    private final JLabel labelCoordenaday3 = new JLabel("Coordenada y3");
    private JTextField inputCoordenaday3 = new JTextField();

    private final JLabel labelCoordenadax4 = new JLabel("Coordenada x4");
    private JTextField inputCoordenadax4 = new JTextField();

    private final JLabel labelCoordenaday4 = new JLabel("Coordenada y4");
    private JTextField inputCoordenaday4 = new JTextField();

    private final JLabel labelArea = new JLabel("Area");
    private JTextField inputArea = new JTextField();

    private final JLabel labelPerimetro = new JLabel("Perimetro");
    private JTextField inputPerimetro = new JTextField();

    private final JComboBox listaFiguras = new JComboBox();
    private final JButton btnPintar = new JButton("Pintar");
    private final JButton btnLimpiar = new JButton("Limpiar");
    private final JButton btnCalcular= new JButton("Calcular");

    public Formulario() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Poligonos Triangulo, Cuadrado, Rectangulo");
        this.setSize(1080, 1600);
        this.setLocationRelativeTo(null);
        setLayout(new GridLayout(7, 7, 10, 5));

        listaFiguras.addItem("Cuadrado");
        listaFiguras.addItem("Rectangulo");

        listaFiguras.addItem("Triangulo");

        btnPintar.addActionListener(this);
        btnLimpiar.addActionListener(this);
        btnCalcular.addActionListener(this);
        add(labelTipo);
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

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
