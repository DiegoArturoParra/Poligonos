package edu.cundi.poligonos.Models;

/**
 * Esta clase es la Padre tiene los atributos y metodos en común de las clases
 * hijas.
 *
 * @author diego parra
 * @version 1.1.0
 */
public abstract class Poligonos implements IOperaciones, IGraficos {

    /**
     * Atributo que guarda la coordenada x1
     */
    private double coordenadax1;
    /**
     * Atributo que guarda la coordenada y1
     */
    private double coordenaday1;
    /**
     * Atributo que guarda la coordenada x2
     */
    private double coordenadax2;
    /**
     * Atributo que guarda la coordenada y2
     */
    private double coordenaday2;
    /**
     * Atributo que guarda la coordenada x3
     */
    private double coordenadax3;
    /**
     * Atributo que guarda la coordenada y3
     */
    private double coordenaday3;
    /**
     * Atributo que guarda la distancia entre las coordenadas x1-y1, x2-y2
     */
    private double distanciaCoordenadasx1y1_x2y2;
    /**
     * Atributo que guarda la distancia entre las coordenadas x2-y2, x3-y3
     */
    private double distanciaCoordenadasx2y2_x3y3;
    /**
     * Atributo que guarda la distancia entre las coordenadas x1-y1, x2-y4
     */
    private double distanciaCoordenadasx1y1_x3y3;

    /**
     * Constructor de la clase padre con los parametros en comun de las clases
     * hijas.
     *
     * @param coordenadax1 párametro que guarda la coordenada x1.
     * @param coordenadax2 párametro que guarda la coordenada x2.
     * @param coordenaday2 párametro que guarda la coordenada y2.
     * @param coordenaday1 párametro que guarda la coordenada y1.
     * @param coordenadax3 párametro que guarda la coordenada x3.
     * @param coordenaday3 párametro que guarda la coordenada y3.
     */
    public Poligonos(double coordenadax1, double coordenaday1, double coordenadax2,
            double coordenaday2, double coordenadax3, double coordenaday3) {
        this.coordenadax1 = coordenadax1;
        this.coordenaday1 = coordenaday1;
        this.coordenadax2 = coordenadax2;
        this.coordenaday2 = coordenaday2;
        this.coordenadax3 = coordenadax3;
        this.coordenaday3 = coordenaday3;
    }

    /**
     *
     * @return Método que devuelve la coordenada x1
     */
    public double getCoordenadax1() {
        return coordenadax1;
    }

    /**
     *
     * @return Método que devuelve la coordenada y1
     */
    public double getCoordenaday1() {
        return coordenaday1;
    }

    /**
     *
     * @return Método que devuelve la coordenada x2
     */
    public double getCoordenadax2() {
        return coordenadax2;
    }

    /**
     *
     * @return Método que devuelve la coordenada y2
     */
    public double getCoordenaday2() {
        return coordenaday2;
    }

    /**
     *
     * @return Método que devuelve la coordenada x3
     */
    public double getCoordenadax3() {
        return coordenadax3;
    }

    /**
     *
     * @return Método que devuelve la coordenada y3
     */
    public double getCoordenaday3() {
        return coordenaday3;
    }

    /**
     *
     * @return método que devuelve la distancia que hay entre coordenadas x1-y1
     * x2-y2
     */
    public double getDistanciaCoordenadasx1y1_x2y2() {
        distanciaCoordenadasx1y1_x2y2 = Math.hypot(coordenadax2 - coordenadax1, coordenaday2 - coordenaday1);
        return distanciaCoordenadasx1y1_x2y2;
    }

    /**
     *
     * @return Método que devuelve la distancia que hay entre coordenadas x2-y2,
     * x3-y3
     */
    public double getDistanciaCoordenadasx2y2_x3y3() {
        distanciaCoordenadasx2y2_x3y3 = Math.hypot(coordenadax3 - coordenadax2, coordenaday3 - coordenaday2);
        return distanciaCoordenadasx2y2_x3y3;
    }

    /**
     *
     * @return Método que devuelve la distancia que hay entre coordenadas x1-y1,
     * x3-y3
     */
    public double getDistanciaCoordenadasx1y1_x3y3() {

        distanciaCoordenadasx1y1_x3y3 = Math.hypot(coordenadax3 - coordenadax1, coordenaday3 - coordenaday1);
        return distanciaCoordenadasx1y1_x3y3;
    }
}
