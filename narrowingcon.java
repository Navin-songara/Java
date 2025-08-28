public class narrowingcon {
    public static void main(String[] args) {
        System.out.println("Narrowing conversion Example:");

        double doubleValue2 = 123.456;
        float floatValue2 = (float) doubleValue2; // Narrowing conversion from double to float
        long longValue2 = (long) floatValue2;     // Narrowing conversion from float to long
        int intValue2 = (int) longValue2;         // Narrowing conversion from long to int

        System.out.println("doubleValue2: " + doubleValue2);
        System.out.println("floatValue2: " + floatValue2);
        System.out.println("longValue2: " + longValue2);
        System.out.println("intValue2: " + intValue2);
        System.out.println();
    }
}