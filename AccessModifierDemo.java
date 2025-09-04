// ---------------- ACCESS MODIFIERS IN JAVA ----------------
//
// Definition:
// Access Modifiers in Java define the visibility/scope of classes, methods, variables, and constructors.
// Java provides 4 main access modifiers:
//
// 1. default (no modifier)
//    - When no access modifier is specified, it is considered "default".
//    - Accessible only within the same package.
//    - Cannot be accessed outside the package.
//    - Class level: Yes
//    - Example: int age; (default access)
//
// 2. private
//    - Most restrictive access modifier.
//    - Accessible only within the same class.
//    - Not visible to other classes (even in the same package).
//    - Class level: No (cannot declare top-level class as private)
//    - Example: private int age;
//
// 3. protected
//    - Accessible within the same package.
//    - Also accessible in subclasses (even if they are in different packages).
//    - Class level: No (cannot declare top-level class as protected)
//    - Example: protected int age;
//
// 4. public
//    - Accessible from everywhere (same package + different package).
//    - No restrictions.
//    - Class level: Yes (a top-level class can be public, but file name must match class name).
//    - Example: public int age;
//
// -------------------------------------------------------------------
// Quick Summary Table:
//
// Modifier    | Same Class | Same Package | Subclass (diff package) | Other Package
// ------------|------------|--------------|-------------------------|--------------
// private     | Yes        | No           | No                      | No
// default     | Yes        | Yes          | No                      | No
// protected   | Yes        | Yes          | Yes                     | No
// public      | Yes        | Yes          | Yes                     | Yes
// -------------------------------------------------------------------
// ---------------- CLASS A (same package) ----------------
class A {
    private int privateVar = 10;    // accessible only in class A
    int defaultVar = 20;            // accessible in same package
    protected int protectedVar = 30;// accessible in same package + subclasses
    public int publicVar = 40;      // accessible everywhere

    public void display() {
        System.out.println("Private Var: " + privateVar);
        System.out.println("Default Var: " + defaultVar);
        System.out.println("Protected Var: " + protectedVar);
        System.out.println("Public Var: " + publicVar);
    }
}

// ---------------- CLASS B (same package) ----------------
class B {
    public void show() {
        A obj = new A();
        // System.out.println(obj.privateVar);  //  Not accessible
        System.out.println("Default Var: " + obj.defaultVar);   //  Accessible
        System.out.println("Protected Var: " + obj.protectedVar); //  Accessible
        System.out.println("Public Var: " + obj.publicVar);     //  Accessible
    }
}

// ---------------- CLASS C (subclass, same package) ----------------
class C extends A {
    public void show() {
        // System.out.println(privateVar);   //  Not accessible
        System.out.println("Default Var: " + defaultVar);     //  Accessible
        System.out.println("Protected Var: " + protectedVar); //  Accessible
        System.out.println("Public Var: " + publicVar);       //  Accessible
    }
}

// ---------------- MAIN CLASS ----------------
public class AccessModifierDemo {
    public static void main(String[] args) {
        A a = new A();
        a.display();

        B b = new B();
        b.show();

        C c = new C();
        c.show();
    }
}
