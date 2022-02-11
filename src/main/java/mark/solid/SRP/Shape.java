package mark.solid.SRP;

public abstract class Shape {
    protected double area;
    protected String name;

    public abstract double calcArea();
    public abstract String getShapeName();
}
