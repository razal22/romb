package com;
public class Tomb {
    public double CalcTombTer(double side, double alfa){
        double rad = alfa*Math.PI/180;
        return(side*side*Math.sin(rad));
    }
}
