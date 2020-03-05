package edu.cundi.poligonos.Controllers;

import edu.cundi.poligonos.Models.*;
import edu.cundi.poligonos.Views.*;
import java.awt.event.*;
import javax.swing.JOptionPane;

/**
 * Esta clase registra lo del formulario.
 *
 * @author diego parra
 * @version 1.0.0
 */
public class RegistrarCoordenadas implements ActionListener {

    /**
     * se instancia un objeto de la clase formulario.
     */
    private Formulario vista;
    private Poligonos figura;
    private GraficarCoordenadas gC;
    private FormularioGrafico ventana;

    /**
     * Constructor que recibe el parametro como objeto De la clase formulario y
     * formularioGrafico
     *
     * @param vista párametro como objeto de la Formulario.
     *
     */
    public RegistrarCoordenadas(Formulario vista) {
        this.vista = vista;
        this.vista.btnPintar.addActionListener(this);
        this.vista.btnLimpiar.addActionListener(this);
        this.vista.btnCalcular.addActionListener(this);
    }

    /**
     * Método que inicia la ventana principal
     */
    public void iniciar() {
        vista.setVisible(true);
    }

    /**
     * Método que recibe las coordenadas del triangulo.
     *
     * @param x1 párametro que recibe la coordenada x1
     * @param y1 párametro que recibe la coordenada y1
     * @param x2 párametro que recibe la coordenada x2
     * @param y2 párametro que recibe la coordenada y2
     * @param x3 párametro que recibe la coordenada x3
     * @param y3 párametro que recibe la coordenada y3
     * @param color párametro que recibe el color.
     */
    public void registroTriangulo(double x1, double y1, double x2, double y2, double x3, double y3, String color) {
        figura = new Triangulo(x1, y1, x2, y2, x3, y3, color);
        vista.inputArea.setText(Double.toString(figura.hallarArea()));
        vista.inputPerimetro.setText(Double.toString(figura.hallarPerimetro()));
        vista.inputTipoTriangulo.setText(((Triangulo) figura).hallarTipoTriangulo());
    }

    /**
     * Método que recibe las coordenadas del cuadrilatero sea Cuadrado o
     * Rectangulo.
     *
     * @param x1 párametro que recibe la coordenada x1
     * @param y1 párametro que recibe la coordenada y1
     * @param x2 párametro que recibe la coordenada x2
     * @param y2 párametro que recibe la coordenada y2
     * @param x3 párametro que recibe la coordenada x3
     * @param y3 párametro que recibe la coordenada y3
     * @param x4 párametro que recibe la coordenada x4
     * @param y4 párametro que recibe la coordenada y4
     * @param color párametro que recibe el color.
     */
    public void registroCuadrilatero(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4, String color) {
        if (vista.listaFiguras.getSelectedItem().equals("Cuadrado")) {
            Cuadrado c1 = new Cuadrado(x1, y1, x2, y2, x3, y3, x4, y4, color);
            vista.inputArea.setText(Double.toString(c1.hallarArea()));
            vista.inputPerimetro.setText(Double.toString(c1.hallarPerimetro()));
        } else if (vista.listaFiguras.getSelectedItem().equals("Rectangulo")) {
            Rectangulo r1 = new Rectangulo(x1, y1, x2, y2, x3, y3, x4, y4, color);
            vista.inputArea.setText(Double.toString(r1.hallarArea()));
            vista.inputPerimetro.setText(Double.toString(r1.hallarPerimetro()));
        }
    }

    /**
     * Método que limpia las cajas de texto.
     */
    public void limpiar() {
        vista.inputCoordenadax1.setText("");
        vista.inputCoordenaday1.setText("");
        vista.inputCoordenadax2.setText("");
        vista.inputCoordenaday2.setText("");
        vista.inputCoordenadax3.setText("");
        vista.inputCoordenaday3.setText("");
        vista.inputCoordenadax4.setText("");
        vista.inputCoordenaday4.setText("");
        vista.inputArea.setText("");
        vista.inputPerimetro.setText("");
    }

    /**
     *
     * @param e párametro que utiliza el boton.
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btnCalcular) {

            if (vista.listaFiguras.getSelectedItem().equals("Triangulo")) {
//                try {
                /**
                 * Se invoca el método registroTriangulo para registrar las
                 * coordenadas del triangulo.
                 */
                registroTriangulo(Double.parseDouble(vista.inputCoordenadax1.getText()),
                        Double.parseDouble(vista.inputCoordenaday1.getText()), Double.parseDouble(vista.inputCoordenadax2.getText()),
                        Double.parseDouble(vista.inputCoordenaday2.getText()), Double.parseDouble(vista.inputCoordenadax3.getText()),
                        Double.parseDouble(vista.inputCoordenaday3.getText()), vista.listaFiguras.getSelectedItem().toString());

//                } catch (NumberFormatException e1) {
//                    JOptionPane.showMessageDialog(null, "Solo ingrese números.", "Error!", JOptionPane.ERROR_MESSAGE);
//                    System.out.println("Datos no tomados. " + e1);
//                    limpiar();
//                }
            } else if (vista.listaFiguras.getSelectedItem().equals("Cuadrado")) {
                try {
                    /**
                     ** Se invoca el método registroCuadrilatero para registrar
                     * las coordenadas del cuadrado.
                     */
                    registroCuadrilatero(Double.parseDouble(vista.inputCoordenadax1.getText()),
                            Double.parseDouble(vista.inputCoordenaday1.getText()), Double.parseDouble(vista.inputCoordenadax2.getText()),
                            Double.parseDouble(vista.inputCoordenaday2.getText()), Double.parseDouble(vista.inputCoordenadax3.getText()),
                            Double.parseDouble(vista.inputCoordenaday3.getText()), Double.parseDouble(vista.inputCoordenadax4.getText()),
                            Double.parseDouble(vista.inputCoordenaday4.getText()), vista.listaFiguras.getSelectedItem().toString());
                } catch (NumberFormatException e1) {
                    JOptionPane.showMessageDialog(null, "Solo ingrese números.", "Error!", JOptionPane.ERROR_MESSAGE);
                    System.out.println("Datos no tomados. " + e1);
                    limpiar();
                }
            } else if (vista.listaFiguras.getSelectedItem().equals("Rectangulo")) {
                try {
                    /**
                     * Se invoca el método registroCuadrilatero para registrar
                     * las coordenadas del rectangulo.
                     */
                    registroCuadrilatero(Double.parseDouble(vista.inputCoordenadax1.getText()),
                            Double.parseDouble(vista.inputCoordenaday1.getText()), Double.parseDouble(vista.inputCoordenadax2.getText()),
                            Double.parseDouble(vista.inputCoordenaday2.getText()), Double.parseDouble(vista.inputCoordenadax3.getText()),
                            Double.parseDouble(vista.inputCoordenaday3.getText()), Double.parseDouble(vista.inputCoordenadax4.getText()),
                            Double.parseDouble(vista.inputCoordenaday4.getText()), vista.listaFiguras.getSelectedItem().toString());
                } catch (NumberFormatException e1) {
                    JOptionPane.showMessageDialog(null, "Solo ingrese números.", "Error!", JOptionPane.ERROR_MESSAGE);
                    System.out.println("Datos no tomados. " + e1);
                    limpiar();
                }
            }
        }

        if (e.getSource() == vista.btnPintar) {
            ventana = new FormularioGrafico();
            gC = new GraficarCoordenadas(ventana);
            gC.iniciar();
        }

        /**
         * Ingresa al boton limpiar.
         */
        if (e.getSource() == vista.btnLimpiar) {
            /*
            se invoca metodo limpiar.
             */
            limpiar();
        }
    }
}
