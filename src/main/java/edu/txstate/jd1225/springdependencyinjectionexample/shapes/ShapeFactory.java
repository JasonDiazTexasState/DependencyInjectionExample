package edu.txstate.jd1225.springdependencyinjectionexample.shapes;

public class ShapeFactory {
    public static Shape getShape(String shape, double perimiter) throws Shape.ShapeException {
        Shape newShape;
        switch (shape) {
            case "Circle":
                newShape = new Circle();
                break;
            case "EquilateralTriangle":
                newShape = new EquilateralTriangle();
                break;
            case "Square":
                newShape = new Square();
                break;
            default:
                throw new Shape.ShapeException("Shape type not found");
        }
        newShape.setPerimeter(perimiter);
        return newShape;
    }
}
