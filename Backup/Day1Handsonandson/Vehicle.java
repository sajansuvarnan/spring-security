package Day1Handsonandson;

class Car {
    private String make;
    private String model;
    private int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void display() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

public class Vehicle {

    public static void main(String[] args) {
        Car car1 = new Car("India", "Maruthi Swift", 2024);
        Car car2 = new Car("Japan", "BMW XE", 2014);

        car1.display();
        car2.display();
    }
}
