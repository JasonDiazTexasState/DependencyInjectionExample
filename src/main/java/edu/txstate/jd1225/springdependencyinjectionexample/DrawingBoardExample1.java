package edu.txstate.jd1225.springdependencyinjectionexample;

import edu.txstate.jd1225.springdependencyinjectionexample.shapes.Shape;
import edu.txstate.jd1225.springdependencyinjectionexample.shapes.ShapeFactory;

public class DrawingBoardExample1 {

    public DrawingBoardExample1(){

    }

    public String printResults() throws Shape.ShapeException {
        double perimeter = 100;
        Shape shape = ShapeFactory.getShape("Circle", perimeter);

            System.out.println("Example 1 shape is: " + shape.name());
            System.out.println("Example 1 shape area is: " + shape.area());
            System.out.println("Example 1 shape height is: " + shape.height());

        return shape.name();
    }
}
