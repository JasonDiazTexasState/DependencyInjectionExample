package edu.txstate.jd1225.springdependencyinjectionexample.shapes;


public abstract class Shape implements IShape {
    Double perimeter = 0.0;
    public Shape(double perimeter) {
        this.perimeter = perimeter;
    }

    public static class ShapeException extends Exception {
        public ShapeException(String message) {
            super(message);
        }
    }
}
