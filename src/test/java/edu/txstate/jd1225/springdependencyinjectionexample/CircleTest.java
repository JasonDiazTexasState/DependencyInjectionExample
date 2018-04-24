package edu.txstate.jd1225.springdependencyinjectionexample;

import edu.txstate.jd1225.springdependencyinjectionexample.shapes.Circle;
import edu.txstate.jd1225.springdependencyinjectionexample.shapes.Shape;
import edu.txstate.jd1225.springdependencyinjectionexample.shapes.ShapeFactory;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CircleTest {
    private static Shape shape;

    @BeforeClass
    public static void setUp() {
        try {
            shape = ShapeFactory.getShape("Circle", 100);
        } catch (Shape.ShapeException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void area() {
        double area = shape.area();
        assertEquals(795.77, area, .01);
    }

    @Test
    public void height() {
        double height = shape.height();
        assertEquals(31.83, height, .01);
    }
}