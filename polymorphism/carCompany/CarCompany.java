class CarCompany {
    private Car car;

    public void addCar(String make, String model, int year) {
        car = new Car(make, model, year);
        System.out.println("Car added: " + car);
    }

    public void addCar(String make, String model, int year, String color) {
        car = new Car(make, model, year, color);
        System.out.println("Car added: " + car);
    }

    public void addCar(String make, String model, int year, double price) {
        car = new Car(make, model, year, price);
        System.out.println("Car added: " + car);
    }

    public void addCar(String make, String model, int year, String color, double price) {
        car = new Car(make, model, year, color, price);
        System.out.println("Car added: " + car);
    }

    public void getCarDetails() {
        if (car != null) {
            System.out.println("Car details: " + car);
        } else {
            System.out.println("No car in the inventory.");
        }
    }

    public static void main(String[] args) {
        CarCompany company = new CarCompany();
        company.addCar("Toyota", "Corolla", 2021);
        company.getCarDetails();

        company.addCar("Honda", "Civic", 2020, "Red");
        company.getCarDetails();

        company.addCar("Ford", "Mustang", 2019, 30000);
        company.getCarDetails();

        company.addCar("Chevrolet", "Camaro", 2018, "Black", 35000);
        company.getCarDetails();
    }
}