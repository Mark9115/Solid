package mark.solid.LSP;

/**
 * Square should supplement but shouldn't replace the conduct of the Rectangle class.
 * If we set length and width to Square instance, the result will be incorrect;
 */
abstract class Shape {
    protected double area;

    public abstract double calcArea();
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double calcArea() {
        area = length * width;
        return (area);
    }
}

class Square extends Rectangle {
    public Square(double s) {
        super(s, s);
    }
}

/* correct implementation

class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double calcArea() {
        area = side * side;
        return (area);
    }
}

*/

public class LSPExample {
    public static void main(String[] args) {
        Square square = new Square(2);
        square.setLength(4);
        square.setWidth(3);

        Rectangle rectangle = new Rectangle(4, 3);
        System.out.println("Square Area = " + square.calcArea());    //12 - It's not correct.
        System.out.println("Rectangle Area = " + rectangle.calcArea()); //12

    }
}
