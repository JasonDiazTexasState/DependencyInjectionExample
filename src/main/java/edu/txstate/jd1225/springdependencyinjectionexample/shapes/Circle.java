package edu.txstate.jd1225.springdependencyinjectionexample.shapes;

import javax.inject.Named;

@Named
public class Circle extends Shape {

    @Override
    public double area() {
        double r = perimeter / (2 * Math.PI);
        double area =  Math.PI * Math.pow(r,2.0);
        return area;
    }

    @Override
    public double height() {
        double r = perimeter / (2 * Math.PI);
        return 2 * r;
    }

    @Override
    public String name() {
        return "Circle";
    }
}
