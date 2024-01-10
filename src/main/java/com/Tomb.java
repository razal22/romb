package com;

import java.util.InputMismatchException;

public class Tomb {
    public double CalcTombTer(double side, double alfa){
        if (side <= 0 || alfa <=0){
            throw new InputMismatchException();
        }
        double rad = alfa*Math.PI/180;
        return(side*side*Math.sin(rad));
    }
    public double CalcTombKer(double side, double alfa){
        return(side*4);
    }
}
