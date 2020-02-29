package edu.cundi.poligonos.Models;

/**
 * Esta subclase de la clase base Cuadrilatero que a su vez hereda de la clase
 * Padre Poligonos, tiene los metodos y atributos en común.
 *
 * @author diego parra
 * @version 1.0.0
 */
public class Rectangulo extends Cuadrilatero {

    /**
     * Constructor con los parametros de las coordenadas
     *
     * @param coordenadax1 párametro que recibe la coordenada x1
     * @param coordenaday1 párametro que recibe la coordenada y1
     * @param coordenadax2 párametro que recibe la coordenada x2
     * @param coordenaday2 párametro que recibe la coordenada y2
     * @param coordenadax3 párametro que recibe la coordenada x3
     * @param coordenaday3 párametro que recibe la coordenada y3
     * @param coordenadax4 párametro que recibe la coordenada x4
     * @param coordenaday4 párametro que recibe la coordenada y4
     */
    public Rectangulo(double coordenadax1, double coordenaday1, double coordenadax2, double coordenaday2,
            double coordenadax3, double coordenaday3, double coordenadax4, double coordenaday4) {
        super(coordenadax1, coordenaday1, coordenadax2, coordenaday2,
                coordenadax3, coordenaday3, coordenadax4, coordenaday4);
    }

    /**
     * @return Este método calcula el perimetro del rectangulo según sus
     * coordenadas.
     */
    @Override
    public double hallarPerimetro() {
        return 2 * (getDistanciaCoordenadasx1y1_x2y2() + getDistanciaCoordenadasx4y4_x1y1());
    }

    /**
     *
     * @return Metodo que halla el area tanto del rectangulo.
     */
    @Override
    public double hallarArea() {
        return getDistanciaCoordenadasx1y1_x2y2() * getDistanciaCoordenadasx4y4_x1y1();
    }
}
