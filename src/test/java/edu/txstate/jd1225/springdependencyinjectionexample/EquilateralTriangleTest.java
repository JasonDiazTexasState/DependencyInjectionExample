package edu.txstate.jd1225.springdependencyinjectionexample;

import edu.txstate.jd1225.springdependencyinjectionexample.shapes.EquilateralTriangle;
import edu.txstate.jd1225.springdependencyinjectionexample.shapes.Shape;
import edu.txstate.jd1225.springdependencyinjectionexample.shapes.ShapeFactory;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class EquilateralTriangleTest {

    private static Shape shape;

    @BeforeClass
    public static void setUp(){
        try {
            shape = ShapeFactory.getShape("EquilateralTriangle", 30.0);
        } catch (Shape.ShapeException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void area() {
        double area = shape.area();
        Assert.assertEquals(43.30, area, .01);
    }

    @Test
    public void height() {
        double height = shape.height();
        Assert.assertEquals(8.66,height, .01);
    }
}