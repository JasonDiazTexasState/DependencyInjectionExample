package edu.txstate.jd1225.springdependencyinjectionexample.shapes;

public class ShapeFactory {
    public static Shape getShape(String shape, double perimiter) throws Shape.ShapeException {
        Shape newShape;
        switch (shape) {
            case "Circle":
                return new Circle(perimiter);
            case "EquilateralTriangle":
                return new EquilateralTriangle(perimiter);
            case "Square":
                return new Square(perimiter);
            default:
                throw new Shape.ShapeException("Shape type not found");
        }
    }
}
