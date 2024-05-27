
public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(4, 0);
        Point p3 = new Point(4, 3);
        Point p4 = new Point(0, 3);

        Trapezoid trapezoid = new Trapezoid(p1, p2, p3, p4, 3);
        System.out.println("Area of " + trapezoid.toString() + ": " + trapezoid.getArea());

        Parallelogram parallelogram = new Parallelogram(p1, p2, p3, p4);
        System.out.println("Area of " + parallelogram.toString() + ": " + parallelogram.getArea());

        Rectangle rectangle = new Rectangle(p1, p2, p3, p4);
        System.out.println("Area of " + rectangle.toString() + ": " + rectangle.getArea());

        Square square = new Square(p1, p2, p3, p4);
        System.out.println("Area of " + square.toString() + ": " + square.getArea());
    }
}
