// Conditional Operators
// Relational Operators = They return a boolean value/Result
public class relationaloperator {
    public static void main(String[] args) {
        int a = 5; // 0101 in binary
        int b = 3; // 0011 in binary

        // EQUAL TO (==)
        System.out.println("EQUAL TO OPERATION:");
        System.out.println(" 5 == 3 = " + (a == b));

        // NOT EQUAL TO (!=)
        System.out.println("NOT EQUAL TO OPERATION:");
        System.out.println(" 5 != 3 = " + (a != b));

        // GREATER THAN (>)
        System.out.println("GREATER THAN OPERATION:");
        System.out.println(" 5 > 3 = " + (a > b));

        // LESS THAN (<)
        System.out.println("LESS THAN OPERATION:");
        System.out.println(" 5 < 3 = " + (a < b));

        // GREATER THAN OR EQUAL TO (>=)
        System.out.println("GREATER THAN OR EQUAL TO OPERATION:");
        System.out.println(" 5 >= 3 = " + (a >= b));

        // LESS THAN OR EQUAL TO (<=)
        System.out.println("LESS THAN OR EQUAL TO OPERATION:");
        System.out.println(" 5 <= 3 = " + (a <= b));
    }
}
