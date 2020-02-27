package edu.cundi.poligonos.Models;

/**
 * @author diego parra
 */
public class Triangulo extends Poligonos {

    @Override
    public double hallarPerimetro() {

        return getDistanciaCoordenadasx1y1_x2y2() + getDistanciaCoordenadasx1y1_x3y3() + getDistanciaCoordenadasx2y2_x3y3();
    }

    @Override
    public double hallarArea() {
        return super.hallarArea(); //To change body of generated methods, choose Tools | Templates.
    }

}
