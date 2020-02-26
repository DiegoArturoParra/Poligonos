
package edu.cundi.poligonos.Models;

/**
 *
 * @author diego parra
 */
public class Poligonos {
    private double coordenadax1y1;
    private double coordenadax2y2;
    private double coordenadax3y3;
    private double area;
    private double perimetro;

    public Poligonos(double coordenadax1y1, double coordenadax2y2, double coordenadax3y3) {
        this.coordenadax1y1 = coordenadax1y1;
        this.coordenadax2y2 = coordenadax2y2;
        this.coordenadax3y3 = coordenadax3y3;
    }

    
    
    public double getCoordenadax1y1() {
        return coordenadax1y1;
    }

    public void setCoordenadax1y1(double coordenadax1y1) {
        this.coordenadax1y1 = coordenadax1y1;
    }

    public double getCoordenadax2y2() {
        return coordenadax2y2;
    }

    public void setCoordenadax2y2(double coordenadax2y2) {
        this.coordenadax2y2 = coordenadax2y2;
    }

    public double getCoordenadax3y3() {
        return coordenadax3y3;
    }

    public void setCoordenadax3y3(double coordenadax3y3) {
        this.coordenadax3y3 = coordenadax3y3;
    }

    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }
    
        
    public double hallarArea(){
     return 0;
    }
    public double hallarPerimetro(){
    return 0;
    }
    
}
