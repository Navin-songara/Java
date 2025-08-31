// Conditional Statements
// Conditional statements in Java allow a program to make decisions based on certain conditions
// and execute specific blocks of code depending on the outcome.

// Types of Conditional Statements:
// - if Statement
// - if-else Statement
// - if-else if Ladder
// - switch Statement (Works with int, char, String, and enum types)
// - Ternary Operator (variable = (condition) ? value_if_true : value_if_false;)

public class conditionalstatement {
    public static void main(String[] args) {
        boolean isSunny = true;
        boolean isWarm = true;

        // Example with if-else
        if (isSunny && !isWarm) {
            System.out.println("Beach day");
        } else {
            System.out.println("Ghar pe raho");
        }

        int a = 5;
        int b = 10;

        // IF STATEMENT
        if (a < b) {
            System.out.println("a is less than b");
        }

        // IF-ELSE STATEMENT
        if (a > b) {
            System.out.println("a is greater than b");
        } else {
            System.out.println("a is less than or equal to b");
        }

        // SWITCH STATEMENT
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid day");
        }

        // TERNARY OPERATOR
        String result = (a < b) ? "a is smaller" : "a is greater or equal";
        System.out.println(result);
    }
}
