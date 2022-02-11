package mark.solid.OCP;

/**
 * Shape class should be open for extension, but closed for modification.
 * Open-closed Principle helps keep classes clear and stable to reuse.
 * If we add method getPerimeter() in the Shape class, we will break implementations.
 * So, we can just extend Shape class.
 */
abstract class Shape {
    public abstract double getArea();
    //public abstract double getPerimeter();
    //it's not correct because we are not adhering the OCR.
}
abstract class ExtendedShape extends Shape {
    public abstract double getPerimeter();
}

class Rectangle extends Shape {
    protected double a;
    protected double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getArea() {
        return a * b;
    }
}

class Circle extends Shape {
    protected double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * 3.14;
    }
}

class CalculateAreas {
    public double calcArea(Shape shape) {
        return shape.getArea();
    }
}

public class OCRExample {
    public static void main(String[] args) {
        CalculateAreas ca = new CalculateAreas();
        Rectangle rectangle = new Rectangle(1, 2);
        System.out.println("Rectangle area = " + ca.calcArea(rectangle));
        Circle c = new Circle(3);
        System.out.println("Circle area = " + ca.calcArea(c));
    }
}
