package edu.txstate.jd1225.springdependencyinjectionexample.shapes;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class Square extends Shape {

    @Inject
    public Square(Double perimeter) {
        super(perimeter);
    }

    @Override
    public Double area() {
        return (perimeter / 4) * (perimeter / 4);
    }

    @Override
    public Double height() {
        return perimeter / 4;
    }

    @Override
    public String name() {
        return "Square";
    }

}
