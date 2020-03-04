package edu.cundi.poligonos.Models;

/**
 * Esta clase hereda de la clase Padre Poligonos, el cual tiene los metodos y
 * atributos en común. para los otros dos poligonos cuadrado y rectangulo
 *
 * @author diego parra
 * @version 1.1.0
 */
public abstract class Cuadrilatero extends Poligonos {

    /**
     * Atributo que guarda la coordenada x4
     */
    private double coordenadax4;
    /**
     * Atributo que guarda la coordenada y
     */
    private double coordenaday4;
    /**
     * Atributo que guarda la distancia entre las coordenadas x3-y3, x4-y4
     */
    private double distanciaCoordenadasx3y3_x4y4;
    /**
     * Atributo que guarda la distancia entre las coordenadas x4-y4, x2-y2
     */
    private double distanciaCoordenadasx4y4_x1y1;
    /**
     * Atributo que guarda la distancia entre las coordenadas x2-y2, x4-y4
     */
    private double distanciaCoordenadasx2y2_x4y4;

    /*
    Constructor con parametros sobrecargados que hereda de la clase Poligonos.
     */
    public Cuadrilatero(double coordenadax1, double coordenaday1, double coordenadax2, double coordenaday2,
            double coordenadax3, double coordenaday3, double coordenadax4, double coordenaday4) {
        super(coordenadax1, coordenaday1, coordenadax2, coordenaday2, coordenadax3, coordenaday3);
        this.coordenadax4 = coordenadax4;
        this.coordenaday4 = coordenaday4;
    }

    /**
     *
     * @return Método que devuelve la coordenada x4
     */
    public double getCoordenadax4() {
        return coordenadax4;
    }

    /**
     *
     * @return Método que devuelve la coordenada y4
     */
    public double getCoordenaday4() {
        return coordenaday4;
    }

    /**
     *
     * @return Método que devuelve la distancia que hay entre coordenadas x3-y3,
     * x4-y4
     */
    public double getDistanciaCoordenadasx3y3_x4y4() {
        distanciaCoordenadasx3y3_x4y4 = Math.hypot(coordenadax4 - getCoordenadax3(), coordenaday4 - getCoordenaday3());
        return distanciaCoordenadasx3y3_x4y4;
    }

    /**
     *
     * @return Método que devuelve la distancia que hay entre coordenadas x4-y4,
     * x1-y1
     */
    public double getDistanciaCoordenadasx4y4_x1y1() {
        distanciaCoordenadasx4y4_x1y1 = Math.hypot(getCoordenadax1() - coordenadax4, getCoordenaday1() - coordenaday4);
        return distanciaCoordenadasx4y4_x1y1;
    }

    /**
     *
     * @return Método que devuelve la distancia que hay entre coordenadas x4-y4,
     * x1-y1
     */
    public double getDistanciaCoordenadasx2y2_x4y4() {
        distanciaCoordenadasx2y2_x4y4 = Math.hypot(coordenadax4 - getCoordenadax2(), coordenaday4 - getCoordenaday2());
        return distanciaCoordenadasx2y2_x4y4;
    }

}
