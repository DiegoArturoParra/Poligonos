/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cundi.poligonos.Models;

/**
 *
 * @author diego
 */
public class Cuadrilatero extends Poligonos {
    private double coordenadax4;
    private double coordenaday4;
    private double distanciaCoordenadasx3y3_x4y4;
    private double distanciaCoordenadasx4y4_x1y1;
    private double distanciaCoordenadasx2y2_x4y4;

    public double getCoordenadax4() {
        return coordenadax4;
    }

    public void setCoordenadax4(double coordenadax4) {
        this.coordenadax4 = coordenadax4;
    }

    public double getCoordenaday4() {
        return coordenaday4;
    }

    public void setCoordenaday4(double coordenaday4) {
        this.coordenaday4 = coordenaday4;
    }

    public double getDistanciaCoordenadasx3y3_x4y4() {
        distanciaCoordenadasx3y3_x4y4 =Math.hypot(coordenadax4-getCoordenadax3(), coordenaday4-getCoordenaday3());
        return distanciaCoordenadasx3y3_x4y4;
    }

    public void setDistanciaCoordenadasx3y3_x4y4(double distanciaCoordenadasx3y3_x4y4) {
        this.distanciaCoordenadasx3y3_x4y4 = distanciaCoordenadasx3y3_x4y4;
    }

    public double getDistanciaCoordenadasx4y4_x1y1() {
        distanciaCoordenadasx4y4_x1y1 = Math.hypot(getCoordenadax1()-coordenadax4, getCoordenaday1()-coordenaday4);
        return distanciaCoordenadasx4y4_x1y1;
    }

    public void setDistanciaCoordenadasx4y4_x1y1(double distanciaCoordenadasx4y4_x1y1) {
        this.distanciaCoordenadasx4y4_x1y1 = distanciaCoordenadasx4y4_x1y1;
    }

    public double getDistanciaCoordenadasx2y2_x4y4() {
        distanciaCoordenadasx2y2_x4y4 = Math.hypot(coordenadax4-getCoordenadax2(), coordenaday4-getCoordenaday2());
        return distanciaCoordenadasx2y2_x4y4;
    }

    public void setDistanciaCoordenadasx2y2_x4y4(double distanciaCoordenadasx2y2_x4y4) {
        this.distanciaCoordenadasx2y2_x4y4 = distanciaCoordenadasx2y2_x4y4;
    }
    
    
    @Override
    public double hallarPerimetro() {
        return 
    }

    @Override
    public double hallarArea() {
        return super.hallarArea(); //To change body of generated methods, choose Tools | Templates.
    }
}
