package edu.cundi.poligonos.Models;

/**
 * Esta clase es la Padre tiene los atributos y metodos en común de las clases
 * hijas.
 *
 * @author diego parra
 * @version 1.0.0
 */
public class Poligonos {

    /**
     * Atributo que guarda la coordenada x1
     */
    private double coordenadax1;
    /**
     * Atributo que guarda la coordenada y1
     */
    private double coordenaday1;
    /**
     * Atributo que guarda la coordenada x4
     */
    private double coordenadax2;
    /**
     * Atributo que guarda la coordenada x4
     */
    private double coordenaday2;
    /**
     * Atributo que guarda la coordenada x4
     */
    private double coordenadax3;
    /**
     * Atributo que guarda la coordenada x4
     */
    private double coordenaday3;
    /**
     * Atributo que guarda la distancia entre las coordenadas x3-y3, x4-y4
     */
    private double distanciaCoordenadasx1y1_x2y2;
    /**
     * Atributo que guarda la distancia entre las coordenadas x3-y3, x4-y4
     */
    private double distanciaCoordenadasx2y2_x3y3;
    /**
     * Atributo que guarda la distancia entre las coordenadas x3-y3, x4-y4
     */
    private double distanciaCoordenadasx1y1_x3y3;

    /**
     * Constructor de la clase padre con los parametros en comun de las clases
     * hijas.
     *
     * @param coordenadax1
     * @param coordenaday1
     * @param coordenadax2
     * @param coordenaday2
     * @param coordenadax3
     * @param coordenaday3
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
     * @return
     */
    public double getCoordenadax1() {
        return coordenadax1;
    }

    /**
     *
     * @param coordenadax1
     */
    public void setCoordenadax1(double coordenadax1) {
        this.coordenadax1 = coordenadax1;
    }

    /**
     *
     * @return
     */
    public double getCoordenaday1() {
        return coordenaday1;
    }

    /**
     *
     * @param coordenaday1
     */
    public void setCoordenaday1(double coordenaday1) {
        this.coordenaday1 = coordenaday1;
    }

    /**
     *
     * @return
     */
    public double getCoordenadax2() {
        return coordenadax2;
    }

    /**
     *
     * @param coordenadax2
     */
    public void setCoordenadax2(double coordenadax2) {
        this.coordenadax2 = coordenadax2;
    }

    /**
     *
     * @return
     */
    public double getCoordenaday2() {
        return coordenaday2;
    }

    /**
     *
     * @param coordenaday2
     */
    public void setCoordenaday2(double coordenaday2) {
        this.coordenaday2 = coordenaday2;
    }

    /**
     *
     * @return
     */
    public double getCoordenadax3() {
        return coordenadax3;
    }

    /**
     *
     * @param coordenadax3
     */
    public void setCoordenadax3(double coordenadax3) {
        this.coordenadax3 = coordenadax3;
    }

    /**
     *
     * @return
     */
    public double getCoordenaday3() {
        return coordenaday3;
    }

    /**
     *
     * @param coordenaday3
     */
    public void setCoordenaday3(double coordenaday3) {
        this.coordenaday3 = coordenaday3;
    }

    /**
     *
     * @return
     */
    public double getDistanciaCoordenadasx1y1_x2y2() {
        distanciaCoordenadasx1y1_x2y2 = Math.hypot(coordenadax2 - coordenadax1, coordenaday2 - coordenaday1);
        return distanciaCoordenadasx1y1_x2y2;
    }

    /**
     *
     * @param distanciaCoordenadasx1y1_x2y2
     */
    public void setDistanciaCoordenadasx1y1_x2y2(double distanciaCoordenadasx1y1_x2y2) {
        this.distanciaCoordenadasx1y1_x2y2 = distanciaCoordenadasx1y1_x2y2;
    }

    /**
     *
     * @return
     */
    public double getDistanciaCoordenadasx2y2_x3y3() {
        distanciaCoordenadasx2y2_x3y3 = Math.hypot(coordenadax3 - coordenadax2, coordenaday3 - coordenaday2);
        return distanciaCoordenadasx2y2_x3y3;
    }

    /**
     *
     * @param distanciaCoordenadasx2y2_x3y3
     */
    public void setDistanciaCoordenadasx2y2_x3y3(double distanciaCoordenadasx2y2_x3y3) {

        this.distanciaCoordenadasx2y2_x3y3 = distanciaCoordenadasx2y2_x3y3;
    }

    /**
     *
     * @return
     */
    public double getDistanciaCoordenadasx1y1_x3y3() {

        distanciaCoordenadasx1y1_x3y3 = Math.hypot(coordenadax3 - coordenadax1, coordenaday3 - coordenaday1);
        return distanciaCoordenadasx1y1_x3y3;
    }

    /**
     *
     * @param distanciaCoordenadasx1y1_x3y3
     */
    public void setDistanciaCoordenadasx1y1_x3y3(double distanciaCoordenadasx1y1_x3y3) {

        this.distanciaCoordenadasx1y1_x3y3 = distanciaCoordenadasx1y1_x3y3;
    }

    /**
     *
     * @return
     */
    public double hallarArea() {
        return 0;
    }

    /**
     *
     * @return
     */
    public double hallarPerimetro() {
        return 0;
    }

}
