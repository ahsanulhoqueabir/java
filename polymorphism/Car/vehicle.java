
public class vehicle {
    private String brand;
    private int year;

    public vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public void getModel() {
        System.out.println(brand);
    }
}
