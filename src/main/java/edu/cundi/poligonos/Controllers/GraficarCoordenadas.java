package edu.cundi.poligonos.Controllers;

import edu.cundi.poligonos.Models.*;
import edu.cundi.poligonos.Views.*;
import java.awt.BorderLayout;
import java.util.List;
import java.awt.event.*;

/**
 * Clase controlador que grafica las figuras.
 *
 * @author diego parra
 */
public class GraficarCoordenadas implements ActionListener {

    /**
     * Se instancia una lista de la Interface Ioperaciones.
     */
    private List<IOperaciones> listaPoligonos;
    /**
     * Se instancia un objeto grafico de la clase FormularioGrafico
     */
    private FormularioGrafico grafico;

    public GraficarCoordenadas(FormularioGrafico grafico, List<IOperaciones> listaPoligonos) {
        this.grafico = grafico;
        this.listaPoligonos = listaPoligonos;
        this.grafico.add(grafico.btnGraficar, BorderLayout.SOUTH);
        this.grafico.add(grafico.plano, BorderLayout.CENTER);
        this.grafico.btnGraficar.addActionListener(this);
    }

    /**
     * Método que inicia la ventana del plano cartesiano.
     */
    public void iniciar() {
        grafico.setVisible(true);
    }

    /**
     * Método para graficar el poligono en el plano cartesiano.
     */
    public void graficar() {
        for (IOperaciones lista : listaPoligonos) {
            if (lista instanceof Triangulo) {
                ((Triangulo) lista).pintarPoligono(grafico.plano.getGraphics());
            } else if (lista instanceof Cuadrado) {
                ((Cuadrado) lista).pintarPoligono(grafico.plano.getGraphics());
            } else if (lista instanceof Rectangulo) {
                ((Rectangulo) lista).pintarPoligono(grafico.plano.getGraphics());
            } else {
                throw new AssertionError("Subtipo desconocido no se encontro.");
            }
        }

    }

    /**
     * Metodo para utilizar el boton.
     *
     * @param e párametro que utiliza los botones.
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        graficar();
    }
}
