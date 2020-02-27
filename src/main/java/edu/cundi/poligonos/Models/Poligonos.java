package edu.cundi.poligonos.Models;

/**
 *
 * @author diego parra
 */
public class Poligonos {

    private double coordenadax1;
    private double coordenaday1;
    private double coordenadax2;
    private double coordenaday2;
    private double coordenadax3;
    private double coordenaday3;
    private double distanciaCoordenadasx1y1_x2y2;
    private double distanciaCoordenadasx2y2_x3y3;
    private double distanciaCoordenadasx1y1_x3y3;

    public double getCoordenadax1() {
        return coordenadax1;
    }

    public void setCoordenadax1(double coordenadax1) {
        this.coordenadax1 = coordenadax1;
    }

    public double getCoordenaday1() {
        return coordenaday1;
    }

    public void setCoordenaday1(double coordenaday1) {
        this.coordenaday1 = coordenaday1;
    }

    public double getCoordenadax2() {
        return coordenadax2;
    }

    public void setCoordenadax2(double coordenadax2) {
        this.coordenadax2 = coordenadax2;
    }

    public double getCoordenaday2() {
        return coordenaday2;
    }

    public void setCoordenaday2(double coordenaday2) {
        this.coordenaday2 = coordenaday2;
    }

    public double getCoordenadax3() {
        return coordenadax3;
    }

    public void setCoordenadax3(double coordenadax3) {
        this.coordenadax3 = coordenadax3;
    }

    public double getCoordenaday3() {
        return coordenaday3;
    }

    public void setCoordenaday3(double coordenaday3) {
        this.coordenaday3 = coordenaday3;
    }

    public double getDistanciaCoordenadasx1y1_x2y2() {
        return distanciaCoordenadasx1y1_x2y2;
    }

    public void setDistanciaCoordenadasx1y1_x2y2(double distanciaCoordenadasx1y1_x2y2) {
        
        distanciaCoordenadasx1y1_x2y2 =  Math.sqrt(Math.pow(coordenaday2 - coordenaday1, 2) 
                + Math.pow(coordenadax2 - coordenadax1, 2));
        
        this.distanciaCoordenadasx1y1_x2y2 = distanciaCoordenadasx1y1_x2y2;
    }

    public double getDistanciaCoordenadasx2y2_x3y3() {
        return distanciaCoordenadasx2y2_x3y3;
    }

    public void setDistanciaCoordenadasx2y2_x3y3(double distanciaCoordenadasx2y2_x3y3) {
        distanciaCoordenadasx2y2_x3y3= Math.sqrt(Math.pow(coordenadax3 - coordenadax1, 2) 
                + Math.pow(coordenaday3 - coordenaday1, 2));
        
        this.distanciaCoordenadasx2y2_x3y3 = distanciaCoordenadasx2y2_x3y3;
    }

    public double getDistanciaCoordenadasx1y1_x3y3() {
        return distanciaCoordenadasx1y1_x3y3;
    }

    public void setDistanciaCoordenadasx1y1_x3y3(double distanciaCoordenadasx1y1_x3y3) {
        distanciaCoordenadasx1y1_x3y3 =  Math.sqrt(Math.pow(coordenadax3 - coordenadax2, 2) 
                + Math.pow(coordenaday3 - coordenaday2, 2));
        this.distanciaCoordenadasx1y1_x3y3 = distanciaCoordenadasx1y1_x3y3;
    }

    
    
    public double hallarArea() {
        return 0;
    }

    public double hallarPerimetro() {
        return 0;
    }

}
