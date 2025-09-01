
// Inheritance means one class (child) can use the properties and methods of another class (parent).
// It helps in code reusability and building relationships.
// Example: "Vehicle" is a parent class, "Car" and "Bike" inherit from it.

// Inheritance Examples
class Vehicle {
    void fuel() {
        System.out.println("Vehicle needs fuel");
    }
}

// a) Single Inheritance
class Bike extends Vehicle {
    void wheels() {
        System.out.println("Bike has 2 wheels");
    }
}

// b) Multilevel Inheritance
class ElectricBike extends Bike {
    void battery() {
        System.out.println("Electric Bike runs on battery");
    }
}

// c) Hierarchical Inheritance
class Truck extends Vehicle {
    void capacity() {
        System.out.println("Truck carries heavy load");
    }
}

// d) Multiple Inheritance using Interface
interface Flyable {
    void fly();
}
class FlyingCar extends Car implements Flyable {
    FlyingCar(String color, String model) {
        super(color, model);
    }
    public void fly() {
        System.out.println("Flying Car can also fly in the air!");
    }
}
