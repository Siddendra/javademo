package com.sidd.javademo.application.designpattern.factory;

public class PolygonFactory {
    public Polygon getPolygon(int numerOfsides) {
        if(numerOfsides == 3) {
            return new Triangle();
        }  else if(numerOfsides == 4) {
            return new Square();
        } else if(numerOfsides == 5) {
            return new Pentagon();
        } else if(numerOfsides == 7) {
            return new Heptagon();
        } else if(numerOfsides == 8) {
            return new Octagon();
        }
        return null;
    }
}
