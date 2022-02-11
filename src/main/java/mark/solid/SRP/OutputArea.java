package mark.solid.SRP;

public class OutputArea {
    Shape shape;

    public OutputArea(Shape shape) {
        this.shape = shape;
    }

    public void console() {
        System.out.println();
        System.out.println(shape.getShapeName() + " area is " + shape.calcArea());
    }

    public void HTML() {
        System.out.println();
        System.out.println("<HTML>");
        System.out.println(shape.getShapeName() + " area is " + shape.calcArea());
        System.out.println("</HTML>");
    }
}
