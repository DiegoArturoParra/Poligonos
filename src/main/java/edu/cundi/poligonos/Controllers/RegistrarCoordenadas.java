package edu.cundi.poligonos.Controllers;

import edu.cundi.poligonos.Models.*;
import edu.cundi.poligonos.Views.*;
import java.awt.event.*;

/**
 * Esta clase registra lo del formulario.
 *
 * @author diego parra
 * @version 1.0.0
 */
public class RegistrarCoordenadas implements ActionListener {

    Formulario vista;

    public RegistrarCoordenadas() {
    }

    public RegistrarCoordenadas(Formulario vista) {
        this.vista = vista;
        vista.btnPintar.addActionListener(this);
        vista.btnLimpiar.addActionListener(this);
        vista.btnCalcular.addActionListener(this);
    }

    public void registroTriangulo(double x1, double y1, double x2, double y2, double x3, double y3) {
        Triangulo t1 = new Triangulo(x1, y1, x2, y2, x3, y3);
        vista.inputArea.setText(Double.toString(t1.hallarArea()));
        vista.inputPerimetro.setText(Double.toString(t1.hallarPerimetro()));

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btnCalcular) {

            if (vista.listaFiguras.getSelectedItem() == "Triangulo") {
                registroTriangulo(Double.parseDouble(vista.inputCoordenadax1.getText()),
                        Double.parseDouble(vista.inputCoordenaday1.getText()),
                        Double.parseDouble(vista.inputCoordenadax2.getText()), Double.parseDouble(vista.inputCoordenaday2.getText()),
                        Double.parseDouble(vista.inputCoordenadax3.getText()), Double.parseDouble(vista.inputCoordenaday3.getText()));
            } else if (vista.listaFiguras.getSelectedItem() == "Cuadrado") {

            } else if (vista.listaFiguras.getSelectedItem() == "Rectangulo") {

            }
        }
    }
}
