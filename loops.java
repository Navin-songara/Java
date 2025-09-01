//Loops :- Loop ek programming ka tool hai jisme ek code block ko baar-baar repeat karaya jata hai jab tak koi condition true rahe.
//Loops :- A loop in Java is used to repeat a block of code multiple times until a certain condition becomes false.
// 1. For-Loop
// 2. Enhanced For-Loop
// 3. While-Loop
// 4. Do-While-Loop
public class loops {
    public static void main(String[] args) {
        int i = 1;
        // For-Loop
        for (i = 1; i <= 5; i++) {
            System.out.println("For-Loop Iteration: " + i);
        }

        // Enhanced For-Loop
        int[] numbers = {1, 2, 3, 4, 5};
        for (int num : numbers) {
            System.out.println("Enhanced For-Loop Iteration: " + num);
        }

        // While-Loop
        i = 1;
        while (i <= 5) {
            System.out.println("While-Loop Iteration: " + i);
            i++;
        }

        // Do-While-Loop
        i = 1;
        do {
            System.out.println("Do-While-Loop Iteration: " + i);
            i++;
        } while (i <= 5);
    }
}
