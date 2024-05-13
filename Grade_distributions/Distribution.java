
public class Distribution {
    int[] Rating = { 1, 3, 4, 2, 1, 2, 3, 3, 5, 3 };
    int[] Count = new int[5];

    public void countRatings() {
        for (int i = 0; i < Rating.length; i++) {
            Count[Rating[i] - 1]++;
        }
    }

}
