package edu.txstate.jd1225.springdependencyinjectionexample.shapes;

import javax.inject.Named;

@Named
public class EquilateralTriangle extends Shape{
    private double leg = 0.0;

    @Override
    public double area() {
        leg =  (perimeter/3);
        return  Math.sqrt(3) / 4 * leg * leg;
    }

    @Override
    public double height() {
        leg =  (perimeter/3);
        return leg / 2 * Math.sqrt(3);
    }

    @Override
    public String name() {
        return "EquilateralTriangle";
    }

}
