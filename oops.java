// OOPS : Object-Oriented Programming System
// OOPS :- A programming paradigm based on the concept of "objects",
// which can contain data and code: data in the form of fields (attributes/properties),
// and code, in the form of methods (functions).

// Key Concepts of OOP

// 1. Class :- 
// A class is like a blueprint or template for objects.
// It defines how an object will look (attributes) and what it can do (methods).
// Example: "Car" class can have color, model, and methods like drive() or stop().

// 2. Object :- 
// An object is a real-world entity created from a class.
// It is an instance of a class with actual data.
// Example: "BMW" (red, 2024 model) is an object of the Car class.

// 3. Inheritance :- 
// Inheritance means one class (child) can use the properties and methods of another class (parent).
// It helps in code reusability and building relationships.
// Example: "Vehicle" is a parent class, "Car" and "Bike" inherit from it.

// 4. Polymorphism :- 
// Polymorphism means "many forms".
// It allows the same method name to perform different actions depending on the object.
// Example: 
// - Compile-time (Method Overloading): add(int, int), add(int, int, int).
// - Run-time (Method Overriding): Animal.sound() → Dog.sound() gives "Bark".

// 5. Encapsulation :- 
// Encapsulation means bundling data (variables) and methods inside one class.
// It hides the inner details and only shows what is necessary (data hiding).
// Example: private variables + public getter/setter methods to control access.

// 6. Abstraction :-
// Abstraction means showing only the important things and hiding unnecessary details.
// It focuses on "what to do" instead of "how to do".
// Example: When we drive a car, we only use the steering and brakes (what to do),
// but we don’t know the internal engine logic (how it works).
// In Java → achieved using abstract classes and interfaces.

// ---------- Example Code for All Concepts in One Frame ----------

// 1. Class + Object
class Car {
    String color;
    String model;

    Car(String color, String model) { // Constructor
        this.color = color;
        this.model = model;
    }

    void display() {
        System.out.println("Car Model: " + model + ", Color: " + color);
    }
}

// 2. Inheritance
class Vehicle {
    void fuel() {
        System.out.println("Vehicle needs fuel");
    }
}

class Bike extends Vehicle {
    void wheels() {
        System.out.println("Bike has 2 wheels");
    }
}

// 3. Encapsulation (with Constructor + Getter/Setter)
class Student {
    private String name;  
    private int age;

    // Constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }

    // Getter methods
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}

// 4. Polymorphism - Overloading (Compile time)
class MathOperation {
    int add(int a, int b) {
        return a + b;
    }
    int add(int a, int b, int c) {
        return a + b + c;
    }
}

// 5. Polymorphism - Overriding (Run time)
class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// 6. Abstraction
abstract class Shape {
    abstract void draw(); // only method declaration (what to do)
}

class Circle extends Shape {
    void draw() { // implementation (how to do)
        System.out.println("Drawing a Circle");
    }
}


// ------------ Main Class to Run All Examples ------------
public class oops {
    public static void main(String[] args) {
        System.out.println("=== Class & Object ===");
        Car c1 = new Car("Red", "BMW");
        c1.display();

        System.out.println("\n=== Inheritance ===");
        Bike b = new Bike();
        b.fuel();   // from parent
        b.wheels(); // from child

        System.out.println("\n=== Encapsulation with Constructor ===");
        Student s1 = new Student("Navin", 21); // using constructor
        System.out.println("Student Name: " + s1.getName() + ", Age: " + s1.getAge());

        Student s2 = new Student("", 0); // default values
        s2.setName("Rahul"); // using setter
        s2.setAge(22);
        System.out.println("Student Name: " + s2.getName() + ", Age: " + s2.getAge());

        System.out.println("\n=== Polymorphism (Overloading) ===");
        MathOperation m = new MathOperation();
        System.out.println("Add 2 nums: " + m.add(2, 3));
        System.out.println("Add 3 nums: " + m.add(2, 3, 4));

        System.out.println("\n=== Polymorphism (Overriding) ===");
        Animal a = new Dog();  // parent reference, child object
        a.sound();

        System.out.println("\n=== Abstraction ===");
        Shape shape = new Circle();
        shape.draw();
    }
}
