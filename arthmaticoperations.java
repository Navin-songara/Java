class arthmaticoperations {
    public static void main(String[] args) {
        int a = 10 / 2;         // result = 5
        int b = 10 / 3;         // result = 3 (integer division)
        float c = 10 / 3;       // result = 3.0 (integer division, then widened to float)
        float d = 10 / 3.0f;    // result = 3.333... (floating-point division)
        int e = 10 % 3;         // result = 1

        System.out.println(d);  // prints 3.3333333

        // Modify variable 'a' step by step
        a += 10;   // a = 5 + 10 = 15
        a *= 3;    // a = 15 * 3 = 45
        a -= 21;   // a = 45 - 21 = 24
        a /= 2;    // a = 24 / 2 = 12
        a -= 11;   // a = 12 - 11 = 1 ✅

        System.out.println(a); // prints 1

        // increment & decrement (won’t print unless you add println)
        a++; // a = 1 + 1 = 2 (post increment)
         System.out.println(a); // prints 1
        ++a; // a = 2 + 1 = 3 (pre increment)
         System.out.println(a); // prints 1
        a--; // a = 3 - 1 = 2 (post decrement)
         System.out.println(a); // prints 1
        --a; // a = 2 - 1 = 1 (pre decrement)
    }
}
