// package Inheritance;

public class Vehicle {
    String brand;
    int year;

    public Vehicle(
            String brand,
            int year) {
        this.brand = brand;
        this.year = year;
    }

    void drive() {
        System.out.println("Vehicle is being driven");
    }


}
