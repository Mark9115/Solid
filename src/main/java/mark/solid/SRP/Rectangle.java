package mark.solid.SRP;

public class Rectangle extends Shape {
    private final double a;
    private final double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double calcArea() {
        return area = (a * b);
    }

    @Override
    public String getShapeName() {
        return name = "Rectangle";
    }
}
