package mark.solid.SRP;

public class Circle extends Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String getShapeName() {
        return name = "Circle";
    }

    @Override
    public double calcArea() {
        return area = 3.14 * (radius * radius);
    }

}
