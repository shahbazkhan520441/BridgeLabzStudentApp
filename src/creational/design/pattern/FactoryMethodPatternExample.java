package creational.design.pattern;

interface Shape {
    void draw();
}

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Square");
    }
}

interface ShapeFactory {
    public static Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}

public class FactoryMethodPatternExample {
    public static void main(String[] args) {
        
        Shape shape1 = ShapeFactory.getShape("CIRCLE");
        shape1.draw();
        Shape shape2 = ShapeFactory.getShape("SQUARE");
        shape2.draw();
    }
}
