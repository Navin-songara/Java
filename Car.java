public class Car {
    // Attributes
    String color;
    String model;
    int year;

    // Constructor
    public Car(String color, String model, int year) {
        this.color = color;
        this.model = model;
        this.year = year;
    }

    // Method to display car details
    public void displayDetails() {
        System.out.println("Car Model: " + model);
        System.out.println("Car Color: " + color);
        System.out.println("Car Year: " + year);
    }

    // Main method to run the program
    public static void main(String[] args) {
        Car car1 = new Car("Red", "Toyota", 2020);
        Car car2 = new Car("Black", "BMW", 2022);

        car1.displayDetails();
        System.out.println("---------------");
        car2.displayDetails();
    }
}
