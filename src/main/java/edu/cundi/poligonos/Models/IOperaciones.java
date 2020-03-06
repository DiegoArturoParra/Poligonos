package edu.cundi.poligonos.Models;

/**
 * Clase interface que tiene metodos para calcular area y perimetro.
 *
 * @author diego parra
 * @version 1.1.0
 */
public interface IOperaciones {

    /**
     *
     * @return retorna el perimetro del poligono varia según el cuerpo del
     * método.
     */
    public double hallarPerimetro();

    /**
     *
     * @return retorna el area del poligono varia según el cuerpo del método.
     */
    public double hallarArea();
}
