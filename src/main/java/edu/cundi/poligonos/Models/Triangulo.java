package edu.cundi.poligonos.Models;

import java.awt.*;

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
     * @param color párametro que recibe el color.
     */
    public Triangulo(double coordenadax1, double coordenaday1, double coordenadax2, double coordenaday2,
            double coordenadax3, double coordenaday3, String color) {
        super(coordenadax1, coordenaday1, coordenadax2, coordenaday2, coordenadax3, coordenaday3, color);
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
     * @param tipoTriangulo párametro que guarda el tipo del triangulo.
     */
    public void setTipoTriangulo(String tipoTriangulo) {
        this.tipoTriangulo = tipoTriangulo;
    }

    /**
     *
     * @return Este método halla el perimetro del triangulo según las
     * coordenadas.
     */
    @Override
    public double hallarPerimetro() {

        setPerimetro(getDistanciaCoordenadasx1y1_x2y2() + getDistanciaCoordenadasx1y1_x3y3() + getDistanciaCoordenadasx2y2_x3y3());
        return getPerimetro();
    }

    /**
     *
     * @return Este metodo halla el área del triangulo según las coordenadas a
     * partir de la formula de determinante.
     */
    @Override
    public double hallarArea() {
        setArea(Math.abs(getCoordenadax1() * (getCoordenaday2() - getCoordenaday3()) + getCoordenadax2()
                * (getCoordenaday3() - getCoordenaday1()) + getCoordenadax3() * (getCoordenaday1() - getCoordenaday2())) / 2);
        return getArea();
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

    /**
     * Método que grafica el triangulo según las distancias de coordenadas.
     *
     * @param g parámetro como objeto de la clase Graphics para poder graficar
     * el triangulo.
     */
    @Override
    public void pintarPoligono(Graphics g) {
        pintarColor(g);
        int coordenadasX[] = {(int) getCoordenadax1(), (int) getCoordenadax2(), (int) getCoordenadax3()};
        int coordenadasY[] = {(int) getCoordenaday1(), (int) getCoordenaday2(), (int) getCoordenaday3()};
        Polygon p = new Polygon(coordenadasX, coordenadasY, 3);
        g.fillPolygon(p);
    }

    /**
     * 
     * @return imprime los datos del triangulo.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append("\nTriangulo{tipoTriangulo=").append(tipoTriangulo);
        sb.append('}');
        return sb.toString();
    }

}
