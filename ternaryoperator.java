public class ternaryoperator {
    public static void main(String[] args) {
        // result = (condition) ? value_if_true : value_if_false;
        int a = 1;

        String str = (a % 2 == 0) ? "Even" : "Odd";
        System.out.println(str);
    }
}
