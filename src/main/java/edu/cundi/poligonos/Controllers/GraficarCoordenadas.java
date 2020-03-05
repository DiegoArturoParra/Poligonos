package edu.cundi.poligonos.Controllers;

import edu.cundi.poligonos.Views.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Clase controlador que grafica las figuras.
 *
 * @author diego parra
 */
public class GraficarCoordenadas implements ActionListener {

    FormularioGrafico grafico;

    public GraficarCoordenadas(FormularioGrafico grafico) {
        this.grafico = grafico;
        this.grafico.add(grafico.btnGraficar, BorderLayout.SOUTH);
        this.grafico.add(grafico.plano, BorderLayout.CENTER);
        this.grafico.btnGraficar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public void iniciar() {
        grafico.setVisible(true);
    }

}
