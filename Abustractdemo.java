// Java
// ---------------- INTERFACE DEMO ----------------
// Interface :-
// 1. Interface is a blueprint of a class
// 2. Supports full abstraction
// 3. Can contain abstract, default, static, and private methods
// 4. Variables inside interface are always: public, static, final
// 5. A class uses 'implements' keyword to provide implementation

// Defining an Interface
interface Shape {
    // Abstract method (no body, must be implemented by child class)
    void draw();

    // Default method (has body, can be used directly or overridden in child class)
    default void info() {
        System.out.println("This is a Shape (default method in interface)");
        helper(); // private method call (internal use only)
    }

    // Static method (belongs to interface, called by InterfaceName only)
    static void welcome() {
        System.out.println("Welcome to Shape Interface (static method)");
    }

    // Private method (Java 9+), used inside interface only
    private void helper() {
        System.out.println("Helper method inside interface (private)");
    }
}

// ---------------- IMPLEMENTATION CLASSES ----------------

// Circle class implementing Shape interface
class Circle implements Shape {
    @Override
    public void draw() {   // implementing abstract method
        System.out.println("Drawing Circle");
    }
}

// Rectangle class implementing Shape interface
class Rectangle implements Shape {
    @Override
    public void draw() {   // implementing abstract method
        System.out.println("Drawing Rectangle");
    }

    // Overriding default method (optional)
    @Override
    public void info() {
        System.out.println("Rectangle has 4 sides (overridden default method)");
    }
}

// ---------------- MAIN CLASS ----------------
public class Abustractdemo {
    public static void main(String[] args) {
        // Static method call (interfaceName.methodName)
        Shape.welcome();  

        // Circle object
        Shape s1 = new Circle();  // upcasting
        s1.draw();                // abstract method (implemented in Circle)
        s1.info();                // default method (from interface)

        // Rectangle object
        Shape s2 = new Rectangle();
        s2.draw();                // abstract method (implemented in Rectangle)
        s2.info();                // overridden default method
    }
}
