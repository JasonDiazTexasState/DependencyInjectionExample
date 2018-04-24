package edu.txstate.jd1225.springdependencyinjectionexample.shapes;


public abstract class Shape implements IShape {
    double perimeter = 0;
    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public static class ShapeException extends Exception {
        public ShapeException(String message) {
            super(message);
        }
    }
}
