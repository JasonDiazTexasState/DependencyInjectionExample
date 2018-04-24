package edu.txstate.jd1225.springdependencyinjectionexample;

import edu.txstate.jd1225.springdependencyinjectionexample.shapes.Shape;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class DrawingBoardExample3 {
    @Inject
    private Shape shape;

    public String printResults() {

        System.out.println("Example 3 shape is: " + shape.name());
        System.out.println("Example 3 shape area is: " + shape.area());
        System.out.println("Example 3 shape height is: " + shape.height());
        return shape.name();

    }
}
