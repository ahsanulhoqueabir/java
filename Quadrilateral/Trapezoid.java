
public class Trapezoid extends Quadrilateral {
    private double height;

    public Trapezoid(Point p1, Point p2, Point p3, Point p4, double height) {
        super(p1, p2, p3, p4);
        this.height = height;
    }

    @Override
    public double getArea() {
        double base1 = Math.abs(point1.x - point2.x);
        double base2 = Math.abs(point3.x - point4.x);
        return 0.5 * (base1 + base2) * height;
    }

    @Override
    public String toString() {
        return "Trapezoid";
    }
}