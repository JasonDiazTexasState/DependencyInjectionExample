package edu.txstate.jd1225.springdependencyinjectionexample;

import edu.txstate.jd1225.springdependencyinjectionexample.shapes.Shape;
import edu.txstate.jd1225.springdependencyinjectionexample.shapes.ShapeFactory;

public class DrawingBoardExample1 {

    public DrawingBoardExample1(){

    }

    public void printResults(){
        double perimeter = 100;
        try {

            Shape shape = ShapeFactory.getShape("Circle", perimeter);
            System.out.println("Example 1 shape is: " + shape.name());
            System.out.println("Example 1 shape area is: " + shape.area());
            System.out.println("Example 1 shape height is: " + shape.height());

        } catch (Shape.ShapeException e) {
            e.printStackTrace();
        }

    }
}
