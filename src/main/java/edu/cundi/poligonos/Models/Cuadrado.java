
package edu.cundi.poligonos.Models;

/**
 *
 * @author diego parra
 */
public class Cuadrado extends Poligonos {
    private double coordenadax4y4;

    public Cuadrado(double coordenadax1y1, double coordenadax2y2, double coordenadax3y3, double coordenadax4y4) {
        super(coordenadax1y1, coordenadax2y2, coordenadax3y3);
        this.coordenadax4y4 = coordenadax4y4;
    }

    @Override
    public double hallarPerimetro() {
        return super.hallarPerimetro(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double hallarArea() {
        return super.hallarArea(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
