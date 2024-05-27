
public class Parallelogram extends Quadrilateral {
    public Parallelogram(Point p1, Point p2, Point p3, Point p4) {
        super(p1, p2, p3, p4);
    }

    @Override
    public double getArea() {
        double base = Math.abs(point1.x - point2.x);
        double height = Math.abs(point1.y - point4.y);
        return base * height;
    }

    @Override
    public String toString() {
        return "Parallelogram";
    }
}
