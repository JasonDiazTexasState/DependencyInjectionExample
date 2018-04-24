package edu.txstate.jd1225.springdependencyinjectionexample;

import edu.txstate.jd1225.springdependencyinjectionexample.shapes.Shape;

public class DrawingBoardExample2 {
    private static Shape shape;

    public DrawingBoardExample2(Shape shape){
        this.shape = shape;
    }

    public String printResults(){
        System.out.println("Example 2 shape is: " + shape.name());
        System.out.println("Example 2 shape area is: " + shape.area());
        System.out.println("Example 2 shape height is: " + shape.height());

        return shape.name();
    }
}
