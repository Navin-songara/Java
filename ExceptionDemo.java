// ---------------- EXCEPTION HANDLING DEMO ----------------
//
// Exception = Runtime error (error jo program chalate waqt aata hai)
//
// Java me Exception handle karne ke 5 main keywords hai:
// 1) try       -> jisme risky code likhte hain
// 2) catch     -> exception ko handle karta hai
// 3) finally   -> hamesha execute hota hai (exception aaye ya na aaye)
// 4) throw     -> manually exception generate karne ke liye
// 5) throws    -> method ke signature me likha jata hai agar wo exception throw kar sakta hai
//
// Types of Exceptions:
// 1. Checked Exception  -> Compile time par check hoti hai (ex: IOException, SQLException)
// 2. Unchecked Exception -> Runtime par aati hai (ex: ArithmeticException, NullPointerException)
// 3. Error              -> Serious problems (ex: OutOfMemoryError), inhe handle nahi karte
//
// Niche ek demo hai jo sari cheezen cover karta hai.
//

import java.io.*;

class ExceptionDemo {

    // Method jo exception throw kar sakta hai
    static void riskyMethod() throws IOException {
        throw new IOException("⚠️ File not found!");
    }

    public static void main(String[] args) {

        // Example 1: ArithmeticException
        try {
            int a = 10 / 0; // yaha divide by zero error aayega
        } catch (ArithmeticException e) {
            System.out.println("❌ Arithmetic Exception handled: " + e);
        }

        // Example 2: ArrayIndexOutOfBoundsException
        try {
            int arr[] = {1, 2, 3};
            System.out.println(arr[5]); // galat index
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("❌ Array Index Exception handled: " + e);
        }

        // Example 3: NullPointerException
        try {
            String s = null;
            System.out.println(s.length()); // null object call
        } catch (NullPointerException e) {
            System.out.println("❌ Null Pointer Exception handled: " + e);
        }

        // Example 4: Multiple catch blocks
        try {
            String num = "abc";
            int n = Integer.parseInt(num); // string ko int me convert nahi kar paega
        } catch (NumberFormatException e) {
            System.out.println("❌ Number Format Exception handled: " + e);
        } catch (Exception e) {
            System.out.println("❌ General Exception handled: " + e);
        }

        // Example 5: finally block
        try {
            int x = 5 / 1;
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        } finally {
            System.out.println("✅ Finally block: Always executes!");
        }

        // Example 6: throw keyword
        try {
            throw new ArithmeticException("⚠️ Custom Divide by zero exception!");
        } catch (ArithmeticException e) {
            System.out.println("❌ Thrown Exception handled: " + e.getMessage());
        }

        // Example 7: throws keyword
        try {
            riskyMethod(); // ye method IOException throw karega
        } catch (IOException e) {
            System.out.println("❌ IOException handled: " + e.getMessage());
        }

        System.out.println("🎯 Program continues smoothly after handling exceptions!");
    }
}
