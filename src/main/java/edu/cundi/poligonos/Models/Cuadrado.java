package edu.cundi.poligonos.Models;

/**
 * Esta subclase hereda de la clase base Cuadrilatero que a su vez hereda de la
 * clase Padre Poligonos, tiene los metodos y atributos en común.
 *
 * @author diego parra
 * @version 1.0.0
 */
public class Cuadrado extends Cuadrilatero {

    /**
     *
     * @param coordenadax1
     * @param coordenaday1
     * @param coordenadax2
     * @param coordenaday2
     * @param coordenadax3
     * @param coordenaday3
     * @param coordenadax4
     * @param coordenaday4
     */
    public Cuadrado(double coordenadax1, double coordenaday1, double coordenadax2, double coordenaday2,
            double coordenadax3, double coordenaday3, double coordenadax4, double coordenaday4) {
        super(coordenadax1, coordenaday1, coordenadax2, coordenaday2,
                coordenadax3, coordenaday3, coordenadax4, coordenaday4);
    }

    /**
     *
     * @return Este método halla el perimetro del cuadrado
     */
    @Override
    public double hallarPerimetro() {
        return getDistanciaCoordenadasx1y1_x2y2() * 4;
    }

    /**
     *
     * @return Metodo que halla el area tanto del rectangulo.
     */
    @Override
    public double hallarArea() {
        return Math.pow(getDistanciaCoordenadasx1y1_x2y2(), 2);
    }

}
