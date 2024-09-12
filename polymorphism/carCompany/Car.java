class Car {
    String make;
    String model;
    int year;
    String color;
    Double price;

    Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    Car(String make, String model, int year, String color) {
        this(make, model, year);
        this.color = color;
    }

    Car(String make, String model, int year, double price) {
        this(make, model, year);
        this.price = price;
    }

    Car(String make, String model, int year, String color, double price) {
        this(make, model, year, color);
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                (color != null ? ", color='" + color + '\'' : "") +
                (price != null ? ", price=" + price : "") +
                '}';
    }
}

