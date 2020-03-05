package edu.cundi.poligonos.Views;

import java.awt.*;
import javax.swing.*;

/**
 * // clase que muestra un plano cartesiano en un jframe.
 *
 * @author diego parra
 */
public class PlanoCartesiano extends JPanel {

    /**
     * Constructor para llamar el plano cartesiano.
     */
    public PlanoCartesiano() {
        init();
    }

    /**
     * Metodo que inicia el plano con los bordes.
     */
    public void init() {
        this.setBorder(BorderFactory.createLineBorder(Color.black));
    }

    /**
     * Metodo que dibuja un plano cartesiano.
     *
     * @param g párametro que pinta las lineas en el plano.
     */
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.black);
        g.drawLine(0, this.getHeight() / 2, this.getWidth(), this.getHeight() / 2);
        g.drawLine(this.getWidth() / 2, 0, this.getWidth() / 2, this.getHeight());

    }
}
