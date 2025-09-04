// Polymorphism in Java
// Polymorphism means "many forms". It allows methods to do different things 
// based on the object that it is acting upon.
// It can be achieved in two ways:
// 1. Compile-time polymorphism (Method Overloading)
// 2. Run-time polymorphism (Method Overriding)

// ---------------- Compile-time Polymorphism ----------------
class CompileTimePoly {
    // Method Overloading
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }
}

// ---------------- Run-time Polymorphism ----------------
class Parent {
    void show() {
        System.out.println("Parent's show()");
    }
}

class Child extends Parent {
    // Method Overriding
    @Override
    void show() {
        System.out.println("Child's show()");
    }
}

// Another Run-time Polymorphism Example
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

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

// ---------------- Main Class ----------------
public class Polymorphismdemo {
    public static void main(String[] args) {
        
        // ---------- Compile-time Polymorphism ----------
        CompileTimePoly obj = new CompileTimePoly();
        System.out.println("Addition (int): " + obj.add(5, 10));
        System.out.println("Addition (double): " + obj.add(5.5, 4.5));

        // ---------- Run-time Polymorphism (Parent–Child) ----------
        Parent p1 = new Parent();
        Parent p2 = new Child(); // Upcasting

        p1.show();  // Parent's show()
        p2.show();  // Child's show()

        // ---------- Run-time Polymorphism (Animal–Dog–Cat) ----------
        Animal a1 = new Dog();
        Animal a2 = new Cat();

        a1.sound(); // Dog barks
        a2.sound(); // Cat meows
    }
}
