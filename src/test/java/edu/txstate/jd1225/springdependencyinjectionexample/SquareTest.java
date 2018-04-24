package edu.txstate.jd1225.springdependencyinjectionexample;

import edu.txstate.jd1225.springdependencyinjectionexample.shapes.Shape;
import edu.txstate.jd1225.springdependencyinjectionexample.shapes.ShapeFactory;
import edu.txstate.jd1225.springdependencyinjectionexample.shapes.Square;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class SquareTest {

    private static Shape shape;

    @BeforeClass
    public static void setUp() {
        try {
            shape = ShapeFactory.getShape("Square", 40);
        } catch (Shape.ShapeException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void area() {
        double area = shape.area();
        Assert.assertEquals(100, area, .01);
    }

    @Test
    public void height() {
        double height = shape.height();
        Assert.assertEquals(10, height, 0);
    }
}