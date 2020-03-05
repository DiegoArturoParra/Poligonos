package edu.cundi.poligonos.Controllers;

import edu.cundi.poligonos.Models.*;
import edu.cundi.poligonos.Views.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Clase controlador que grafica las figuras.
 *
 * @author diego parra
 */
public class GraficarCoordenadas implements ActionListener {

    private FormularioGrafico grafico;
    private Poligonos figura;

    public GraficarCoordenadas(FormularioGrafico grafico, Poligonos figura) {
        this.figura = figura;
        this.grafico = grafico;
        this.grafico.add(grafico.btnGraficar, BorderLayout.SOUTH);
        this.grafico.add(grafico.plano, BorderLayout.CENTER);
        this.grafico.btnGraficar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        graficar();
    }

    public void iniciar() {
        grafico.setVisible(true);
    }

    public void graficar() {
     ((Triangulo)figura).pintarPoligono(grafico.plano.getGraphics());
    }
}
