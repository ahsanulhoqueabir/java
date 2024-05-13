
public class Main {

    public static void main(String[] args) {

        Distribution d = new Distribution();
        d.countRatings();
        System.out.println("Rating " + "Frequency");
        for (int i = 0; i < d.Count.length; i++) {
            System.out.println((i + 1) + "  " + d.Count[i]);
        }
    }
}
