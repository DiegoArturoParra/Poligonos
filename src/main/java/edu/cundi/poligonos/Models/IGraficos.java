package edu.cundi.poligonos.Models;

import java.awt.Graphics;

/**
 * Clase interface que grafica los poligonos.
 *
 * @author diego parra
 * @version 1.1.0
 */
public interface IGraficos {

    /**
     * Método que gráfica el poligono según las distancias de coordenadas.
     *
     * @param g parámetro como objeto de la clase Graphics para poder graficar
     * el poligono.
     */
    public void pintarPoligono(Graphics g);
}
