// package Inheritance;

public class Car extends Vehicle {
    int doorCount;

    public Car(
            String brand,
            int year, int doorCount) {
        super(brand, year);
        this.doorCount = doorCount;
    }

    void hook() {
        System.out.println("Car is being hooked");
    }

    public static void main(String[] args) {
        Car car = new Car("Toyota", 2020, 4);
        car.drive();
        car.hook();
    }

}
