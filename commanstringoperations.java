public class StringOperations {
    public static void main(String[] args) {
        String text = "Hello World"; // Ek simple string banayi hai

        // String ka length check kar rahe hain
        System.out.println("Length: " + text.length()); // Total characters count

        // Pehla character nikal rahe hain
        System.out.println("First character: " + text.charAt(0)); // Index 0 ka character

        // Substring le rahe hain - starting se 5 characters tak
        System.out.println("Substring (0,5): " + text.substring(0, 5)); // "Hello" milega

        // Check kar rahe hain ki "World" string mein hai ya nahi
        System.out.println("Contains 'World': " + text.contains("World")); // true ya false

        // Check kar rahe hain ki string "Hello" se start hoti hai
        System.out.println("Starts with 'Hello': " + text.startsWith("Hello")); // true

        // Check kar rahe hain ki string "World" pe end hoti hai
        System.out.println("Ends with 'World': " + text.endsWith("World")); // true

        // "World" ko "Java" se replace kar rahe hain
        String newText = text.replace("World", "Java"); // Nayi string ban gayi
        System.out.println("Replaced text: " + newText); // Output: Hello Java

        // String ko uppercase aur lowercase mein convert kar rahe hain
        System.out.println("Uppercase: " + text.toUpperCase()); // Sab capital letters
        System.out.println("Lowercase: " + text.toLowerCase()); // Sab small letters

        // Character ka index nikal rahe hain
        System.out.println("Index of 'o': " + text.indexOf('o')); // Pehli baar 'o' kahan aaya
        System.out.println("Last index of 'l': " + text.lastIndexOf('l')); // Last 'l' kahan hai

        // Extra spaces hata rahe hain string ke aage aur peeche se
        String padded = "   Hello World   "; // Thodi padding wali string
        System.out.println("Trimmed: '" + padded.trim() + "'"); // Clean version

        // String ko split kar rahe hain space ke basis pe
        String[] words = text.split(" "); // Do words milenge: Hello, World
        System.out.println("Split words:");
        for (String word : words) {
            System.out.println("- " + word); // Har word ko alag print kar rahe hain
        }

        // String comparison kar rahe hain
        String anotherText = "hello world"; // Same words, lowercase mein
        System.out.println("Equals: " + text.equals(anotherText)); // Case-sensitive comparison
        System.out.println("Equals ignore case: " + text.equalsIgnoreCase(anotherText)); // Case ignore karke compare
    }
}