// Logical Operators
//Logical Operators = They operate on boolean values
// Logical Operators are used to combine multiple boolean expressions or conditions.

public class LogicalOperators {

    // Operand 1 Operand 2 Operand 1 || Operand 2
    // true      true    true
    // true      false   true
    // false     true    true
    // false     false   false
    
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        // AND Operator (&&)
        System.out.println("AND OPERATION:");
        System.out.println(" true && false = " + (a && b));

        // OR Operator (||)
        System.out.println("OR OPERATION:");
        System.out.println(" true || false = " + (a || b));

        // NOT Operator (!)
        System.out.println("NOT OPERATION:");
        System.out.println(" !true = " + (!a));
    }
}
