public class Main {
    public static void main(String[] args) {
        int m = 0;
        do {
            if (m > 10)
                continue;
            m = m + 10;
        } while (m < 50);
        System.out.printf("%d", m);
    }
}
