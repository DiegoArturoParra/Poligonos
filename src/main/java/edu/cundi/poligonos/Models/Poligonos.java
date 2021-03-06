package edu.cundi.poligonos.Models;

import java.awt.Color;
import java.awt.Graphics;

/**
 * Esta clase es la Padre tiene los atributos y metodos en común de las clases
 * hijas.
 *
 * @author diego parra
 * @version 1.1.0
 */
public abstract class Poligonos implements IOperaciones, IGraficos {

    /**
     * atributo que se toma contador para que el id del poligono sea
     * autonúmerico.
     */
    public static int id = 1;
    /**
     * atributo que guarda el id del poligono.
     */
    private int idPoligono;
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
     * Atributo que guarda el color del poligono.
     */
    private String colorPoligono;
    /**
     * Atributo que guarda el area del poligono.
     */
    private double area;
    /**
     * Atributo que guarda el perimetro del poligono.
     */
    private double perimetro;

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
     * @param colorPoligono párametro que guarda el color del poligono.
     */
    public Poligonos(double coordenadax1, double coordenaday1, double coordenadax2, double coordenaday2,
            double coordenadax3, double coordenaday3, String colorPoligono) {
        this.coordenadax1 = coordenadax1;
        this.coordenaday1 = coordenaday1;
        this.coordenadax2 = coordenadax2;
        this.coordenaday2 = coordenaday2;
        this.coordenadax3 = coordenadax3;
        this.coordenaday3 = coordenaday3;
        this.colorPoligono = colorPoligono;
        this.idPoligono = Poligonos.id++;
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

    /**
     *
     * @return retorna el color del poligono
     */
    public String getColorPoligono() {
        return colorPoligono;
    }

    /**
     *
     * @return retorna el area del poligono.
     */
    public double getArea() {
        return area;
    }

    /**
     *
     * @param area párametro que guarda el area del poligono.
     */
    public void setArea(double area) {
        this.area = area;
    }

    /**
     *
     * @return retorna el perimetro del poligono.
     */
    public double getPerimetro() {
        return perimetro;
    }

    /**
     *
     * @param perimetro párametro que guarda el perimetro del poligono.
     */
    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    /**
     *
     * @return Método que valida que color desea el usuario en el poligono.
     */
    public Color validarColor() {
        if (getColorPoligono().equalsIgnoreCase("Rojo")) {
            return Color.red;
        } else if (getColorPoligono().equalsIgnoreCase("Verde")) {
            return Color.green;
        } else if (getColorPoligono().equalsIgnoreCase("Azul")) {
            return Color.blue;
        } else if (getColorPoligono().equalsIgnoreCase("Naranja")) {
            return Color.orange;
        } else if (getColorPoligono().equalsIgnoreCase("Amarillo")) {
            return Color.yellow;
        } else if (getColorPoligono().equalsIgnoreCase("Cyan")) {
            return Color.cyan;
        }
        return null;
    }

    /**
     * Método que pinta el color del poligono.
     *
     * @param g parámetro como objeto de la clase Graphics para poder agregar el
     * color.
     */
    public void pintarColor(Graphics g) {
        Color c = validarColor();
        g.setColor(c);
    }

    /**
     *
     * @return retorna o imprime la información del poligono.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Poligonos{idPoligono=").append(idPoligono);
        sb.append("\n coordenadax1=").append(coordenadax1);
        sb.append("\n coordenaday1=").append(coordenaday1);
        sb.append("\n coordenadax2=").append(coordenadax2);
        sb.append("\n coordenaday2=").append(coordenaday2);
        sb.append("\n coordenadax3=").append(coordenadax3);
        sb.append("\n coordenaday3=").append(coordenaday3);
        sb.append("\n colorPoligono=").append(colorPoligono);
        sb.append("\n area=").append(area);
        sb.append("\n perimetro=").append(perimetro);
        sb.append('}');
        return sb.toString();
    }

}
