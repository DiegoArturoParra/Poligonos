package edu.cundi.poligonos.Models;

/**
 * Esta clase hereda de la clase Padre Poligonos, el cual tiene los metodos y
 * atributos en común.
 *
 * @author diego parra
 * @version 1.0.0
 */
public class Triangulo extends Poligonos {

    /**
     * Atributo que guarda el tipo de triangulo según su lado.
     */
    private String tipoTriangulo;

    /**
     * Constructor que recibe parametros de las coordenadas:
     *
     * @param coordenadax1
     * @param coordenaday1
     * @param coordenadax2
     * @param coordenaday2
     * @param coordenadax3
     * @param coordenaday3
     */
    public Triangulo(double coordenadax1, double coordenaday1, double coordenadax2,
            double coordenaday2, double coordenadax3, double coordenaday3) {
        super(coordenadax1, coordenaday1, coordenadax2, coordenaday2, coordenadax3, coordenaday3);
    }

    /**
     *
     * @return Este metodo halla el perimetro del triangulo según las
     * coordenadas.
     */
    /**
     *
     * @return
     */
    public String getTipoTriangulo() {
        return tipoTriangulo;
    }

    /**
     *
     * @param tipoTriangulo
     */
    public void setTipoTriangulo(String tipoTriangulo) {
        this.tipoTriangulo = tipoTriangulo;
    }

    @Override
    public double hallarPerimetro() {

        return getDistanciaCoordenadasx1y1_x2y2() + getDistanciaCoordenadasx1y1_x3y3() + getDistanciaCoordenadasx2y2_x3y3();
    }

    /**
     *
     * @return Este metodo halla el área del triangulo según las coordenadas a partir de la formula de determinante.
     */
    @Override
    public double hallarArea() {
        return Math.abs(getCoordenadax1() * (getCoordenaday2() - getCoordenaday3()) + getCoordenadax2()
                * (getCoordenaday3() - getCoordenaday1()) + getCoordenadax3() * (getCoordenaday1() - getCoordenaday2())) / 2;
    }

}
