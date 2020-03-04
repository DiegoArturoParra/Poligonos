package edu.cundi.poligonos.Models;

import java.awt.Graphics;

/**
 * Esta clase hereda de la clase Padre Poligonos, el cual tiene los metodos y
 * atributos en común.
 *
 * @author diego parra
 * @version 1.1.0
 */
public class Triangulo extends Poligonos {

    /**
     * Atributo que guarda el tipo de triangulo según su lado.
     */
    private String tipoTriangulo;

    /**
     * Constructor que recibe parametros de las coordenadas:
     *
     * @param coordenadax1 párametro que guarda la coordenada x1.
     * @param coordenadax2 párametro que guarda la coordenada x2.
     * @param coordenaday2 párametro que guarda la coordenada y2.
     * @param coordenaday1 párametro que guarda la coordenada y1.
     * @param coordenadax3 párametro que guarda la coordenada x3.
     * @param coordenaday3 párametro que guarda la coordenada y3.
     */
    public Triangulo(double coordenadax1, double coordenaday1, double coordenadax2,
            double coordenaday2, double coordenadax3, double coordenaday3) {
        super(coordenadax1, coordenaday1, coordenadax2, coordenaday2, coordenadax3, coordenaday3);
    }

    /**
     *
     * @return Método que devuelve el tipo de triangulo.
     */
    public String getTipoTriangulo() {
        return tipoTriangulo;
    }

    /**
     *
     * @return Este método halla el perimetro del triangulo según las
     * coordenadas.
     */
    @Override
    public double hallarPerimetro() {

        return getDistanciaCoordenadasx1y1_x2y2() + getDistanciaCoordenadasx1y1_x3y3() + getDistanciaCoordenadasx2y2_x3y3();
    }

    /**
     *
     * @return Este metodo halla el área del triangulo según las coordenadas a
     * partir de la formula de determinante.
     */
    @Override
    public double hallarArea() {
        return Math.abs(getCoordenadax1() * (getCoordenaday2() - getCoordenaday3()) + getCoordenadax2()
                * (getCoordenaday3() - getCoordenaday1()) + getCoordenadax3() * (getCoordenaday1() - getCoordenaday2())) / 2;
    }

    /**
     *
     * @return Método que halla que tipo de triangulo es segun sus lados, se
     * hizo con las distancias.
     */
    public String hallarTipoTriangulo() {

        if (getDistanciaCoordenadasx1y1_x2y2() == getDistanciaCoordenadasx1y1_x3y3()
                && getDistanciaCoordenadasx1y1_x2y2() == getDistanciaCoordenadasx2y2_x3y3()) {
            tipoTriangulo = "Equilatero";
        } else if (getDistanciaCoordenadasx1y1_x2y2() == getDistanciaCoordenadasx1y1_x3y3()
                || getDistanciaCoordenadasx1y1_x2y2() == getDistanciaCoordenadasx2y2_x3y3()
                || getDistanciaCoordenadasx1y1_x3y3() == getDistanciaCoordenadasx2y2_x3y3()) {
            tipoTriangulo = "Isósceles";
        } else if (getDistanciaCoordenadasx1y1_x2y2() != getDistanciaCoordenadasx1y1_x3y3()
                && getDistanciaCoordenadasx1y1_x2y2() != getDistanciaCoordenadasx2y2_x3y3()
                && getDistanciaCoordenadasx1y1_x3y3() != getDistanciaCoordenadasx2y2_x3y3()) {
            tipoTriangulo = "Escaleno";
        } else {
            tipoTriangulo = "No es un triangulo";
        }
        return tipoTriangulo;
    }

    @Override
    public void pintarPoligono(Graphics g) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void color(Graphics g) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
