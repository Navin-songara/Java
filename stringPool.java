class stringpool {
    public static void main(String[] args) {
        String str1 = "Hello";              // String literal → goes into String Pool
        String str2 = "Hello";              // Same literal → refers to same object in pool
        String str3 = new String("Hello");  // New object → stored in Heap

        System.out.println(str1 == str2);      // true  → same reference in String Pool
        System.out.println(str1 == str3);      // false → different references (pool vs heap)
        System.out.println(str1.equals(str3)); // true  → contents are the same
    }
}
