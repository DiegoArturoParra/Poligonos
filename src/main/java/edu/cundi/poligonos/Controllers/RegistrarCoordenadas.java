package edu.cundi.poligonos.Controllers;

import edu.cundi.poligonos.Models.*;
import edu.cundi.poligonos.Views.*;
import java.awt.event.*;
import java.util.List;
import javax.swing.*;

/**
 * Esta clase registra las coordenadas en el formulario.
 *
 * @author diego parra
 * @version 1.1.0
 */
public class RegistrarCoordenadas implements ActionListener {

    /**
     * Se instancia un objeto de la clase formulario.
     */
    private Formulario vista;
    /**
     * Se instancia una lista de la Interface Ioperaciones.
     */
    private List<IOperaciones> listaPoligonos;
    /**
     * Se instancia un objeto de la clase GraficarCoordenadas.
     */
    private GraficarCoordenadas gC;
    /**
     * Se instancia un objeto de la clase FormularioGrafico.
     */
    private FormularioGrafico ventana;

    /**
     * Constructor que recibe el parametro como objeto De la clase formulario y
     * formularioGrafico
     *
     * @param vista párametro como objeto de la Formulario.
     * @param listaPoligonos párametro como una lista de la interface
     * IOPeraciones
     *
     */
    public RegistrarCoordenadas(Formulario vista, List<IOperaciones> listaPoligonos) {
        this.vista = vista;
        this.listaPoligonos = listaPoligonos;
        this.vista.btnGuardar.addActionListener(this);
        this.vista.btnLimpiar.addActionListener(this);
        this.vista.btnCalcular.addActionListener(this);
    }

    /**
     * Método que inicia la ventana principal
     */
    public void iniciar() {
        vista.setVisible(true);
    }

    public void agregarPoligonos(double x1, double y1, double x2, double y2,
            double x3, double y3, double x4, double y4, String color) {
        if (vista.listaFiguras.getSelectedItem().equals("Triangulo")) {
            listaPoligonos.add(new Triangulo(x1, y1, x2, y2, x3, y3, color));
            ventana = new FormularioGrafico();
            gC = new GraficarCoordenadas(ventana, listaPoligonos);
        } else if (vista.listaFiguras.getSelectedItem().equals("Cuadrado")) {
            listaPoligonos.add(new Cuadrado(x1, y1, x2, y2, x3, y3, x4, y4, color));
            ventana = new FormularioGrafico();
            gC = new GraficarCoordenadas(ventana, listaPoligonos);
        } else if (vista.listaFiguras.getSelectedItem().equals("Rectangulo")) {
            listaPoligonos.add(new Rectangulo(x1, y1, x2, y2, x3, y3, x4, y4, color));
            ventana = new FormularioGrafico();
            gC = new GraficarCoordenadas(ventana, listaPoligonos);
        }
        // limpiamos las cajas de texto.
        limpiar();
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
     * Método que imprime los datos de la lista.
     */
    public void imprimirDatos() {
        String listaCompleta = "";
        for (IOperaciones lista : listaPoligonos) {
            listaCompleta += "\n" + lista.toString();
        }
        System.out.println("LISTA DE POLIGONOS" + listaCompleta);
        JOptionPane.showMessageDialog(ventana, "Lista de Poligonos." + listaCompleta);
    }

    /**
     *
     * @param e párametro que utiliza el boton.
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btnCalcular) {
            /**
             * recorremos la lista de poligonos y saber que instancia tiene la
             * lista para asi castear.
             */
            for (IOperaciones lista : listaPoligonos) {
                if (lista instanceof Triangulo) {
                    vista.inputArea.setText(Double.toString(((Triangulo) lista).hallarArea()));
                    vista.inputPerimetro.setText(Double.toString(((Triangulo) lista).hallarPerimetro()));
                    vista.inputTipoTriangulo.setText(((Triangulo) lista).hallarTipoTriangulo());
                    gC.iniciar();
                } else if (lista instanceof Cuadrado) {
                    vista.inputArea.setText(Double.toString(((Cuadrado) lista).hallarArea()));
                    vista.inputPerimetro.setText(Double.toString(((Cuadrado) lista).hallarPerimetro()));
                    gC.iniciar();
                } else if (lista instanceof Rectangulo) {
                    vista.inputArea.setText(Double.toString(((Rectangulo) lista).hallarArea()));
                    vista.inputPerimetro.setText(Double.toString(((Rectangulo) lista).hallarPerimetro()));
                    gC.iniciar();
                } else {
                    throw new AssertionError("Subtipo desconocido no se encontro.");
                }
            }
            imprimirDatos();
        }

        /**
         * Ingresa al botón guardar.
         */
        if (e.getSource() == vista.btnGuardar) {
            try {
                /**
                 * Se invoca el Método agregarPoligonos.
                 */
                agregarPoligonos(Double.parseDouble(vista.inputCoordenadax1.getText()),
                        Double.parseDouble(vista.inputCoordenaday1.getText()), Double.parseDouble(vista.inputCoordenadax2.getText()),
                        Double.parseDouble(vista.inputCoordenaday2.getText()), Double.parseDouble(vista.inputCoordenadax3.getText()),
                        Double.parseDouble(vista.inputCoordenaday3.getText()), Double.parseDouble(vista.inputCoordenadax4.getText()),
                        Double.parseDouble(vista.inputCoordenaday4.getText()), vista.listaColores.getSelectedItem().toString());
            } catch (NumberFormatException e1) {
                JOptionPane.showMessageDialog(null, "Solo ingrese números.", "Error!", JOptionPane.ERROR_MESSAGE);
                System.out.println("Datos no tomados. " + e1);
                limpiar();
            }
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
