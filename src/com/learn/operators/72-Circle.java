package com.learn.operators;

class Circle {
    double radiusInMm;
     Circle(double radiusInMm){
    this.radiusInMm = radiusInMm;
     }
    public static void main(String[] args) {

    }
    double getCircumference(){
    return  2 * radiusInMm * Math.PI;
    }

    double getArea(){
        return  Math.PI * Math.pow(radiusInMm,2);
    }
}
