package edu.txstate.jd1225.springdependencyinjectionexample.shapes;
import javax.inject.Named;

@Named
public class Square extends Shape{

    @Override
    public double area() {
        return (perimeter/4) * (perimeter/4);
    }

    @Override
    public double height() {
        return perimeter/4;
    }

    @Override
    public String name() {
        return "Square";
    }

}
