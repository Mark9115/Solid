package mark.solid.SRP;

/**
 * Class Shape hasn't methods to output the area.
 * Class OutputArea responds for output the result.
 * OutputArea -> only responsible for output information. (single responsible principle)
 * Subclasses of Shapes -> only responsible for calculating area. (single responsible principle)
 */
public class SRPExample {
    public static void main(String[] args) {
        OutputArea outputAreaCircle = new OutputArea(new Circle(5));
        OutputArea outputAreaRectangle = new OutputArea(new Rectangle(5,4));
        outputAreaCircle.console();
        outputAreaRectangle.HTML();
    }
}