public class stackandheap {
    public static void main(String[] args) {
        int a = 1; // stack and heap (string pool)
        String str = "Hello"; // heap (String Pool)
        String str2 = "Hello"; // Same literal, points to the same object in the string pool
        System.out.println(1 == 1); // checking value equality
        System.out.println(str == str2); // checking reference equality
        System.out.println(str.equals(str2)); // checking content equality
    }
}
