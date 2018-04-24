package edu.txstate.jd1225.springdependencyinjectionexample.shapes;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class EquilateralTriangle extends Shape {
    private double leg;

    @Inject
    public EquilateralTriangle(Double perimeter) {
        super(perimeter);
        leg = (perimeter / 3);
    }

    @Override
    public Double area() {
        return Math.sqrt(3) / 4 * leg * leg;
    }

    @Override
    public Double height() {
        return leg / 2 * Math.sqrt(3);
    }

    @Override
    public String name() {
        return "EquilateralTriangle";
    }

}
