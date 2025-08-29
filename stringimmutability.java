public class stringimmutability {
    public static void main(String[] args) {
        String a = "Hello";

        // Calling toUpperCase(), but NOT storing the result
        String b = a.toUpperCase();

        System.out.println(a); // "Hello" → original unchanged (because Strings are immutable)
        System.out.println(b); // "HELLO" → new String object created

        // Correct way: reassign 'a' if you want it updated
        a = a.toUpperCase();
        System.out.println(a); // "HELLO"
    }
}
