package edu.txstate.jd1225.springdependencyinjectionexample.shapes;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class Circle extends Shape {

    @Inject
    public Circle(Double perimeter) {
        super(perimeter);
    }

    @Override
    public Double area() {
        double r = perimeter / (2 * Math.PI);
        double area = Math.PI * Math.pow(r, 2.0);
        return area;
    }

    @Override
    public Double height() {
        double r = perimeter / (2 * Math.PI);
        return 2 * r;
    }

    @Override
    public String name() {
        return "Circle";
    }
}
