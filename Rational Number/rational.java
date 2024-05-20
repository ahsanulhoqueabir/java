
public class rational {
    private int numerator = 0;
    private int denominator = 1;

    public rational() {

    }

    public rational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;

    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public String toString() {
        return numerator + "/" + denominator;
    }

    public int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public rational add(rational other) {
        int a = this.numerator;
        int b = this.denominator;
        int c = other.numerator;
        int d = other.denominator;
        int Gcd = gcd((a * d + b * c), b * d);
        return new rational((a * d + b * c) / Gcd, b * d / Gcd);
    }

    public rational subtract(rational other) {
        int a = this.numerator;
        int b = this.denominator;
        int c = other.numerator;
        int d = other.denominator;
        int Gcd = gcd((a * d - b * c), b * d);
        return new rational((a * d - b * c) / Gcd, b * d / Gcd);
    }

    public rational multiply(rational other) {
        int a = this.numerator;
        int b = this.denominator;
        int c = other.numerator;
        int d = other.denominator;
        int Gcd = gcd(a * c, b * d);
        return new rational(a * c / Gcd, b * d / Gcd);
    }

    public rational divide(rational other) {
        int a = this.numerator;
        int b = this.denominator;
        int c = other.numerator;
        int d = other.denominator;
        int Gcd = gcd(a * d, b * c);
        return new rational(a * d / Gcd, b * c / Gcd);
    }

    public static void main(String[] args) {
        rational r1 = new rational(1, 4);
        rational r2 = new rational(1, 2);
        rational r3 = r1.add(r2);
        System.out.println(r3.toString());
    }

}