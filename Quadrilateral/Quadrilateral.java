
public class Quadrilateral {
    protected Point point1;
    protected Point point2;
    protected Point point3;
    protected Point point4;

    public Quadrilateral(Point p1, Point p2, Point p3, Point p4) {
        this.point1 = p1;
        this.point2 = p2;
        this.point3 = p3;
        this.point4 = p4;
    }

    public double getArea() {
        return 0;
    };

    @Override
    public String toString() {
        return "Quadrilateral";
    }

}
