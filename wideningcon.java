public class wideningcon {
    public static void main(String[] args) {
        System.out.println("Widening conversion Example:");

        byte byteValue = 10;        // 1 byte // cup
        short shortValue = byteValue; // 2 bytes // glass
        int intValue = shortValue;    // 4 bytes // jug
        long longValue = intValue;    // 8 bytes // bucket
        float floatValue = longValue; // 4 bytes (but float has wider range than long)
        double doubleValue = floatValue; // 8 bytes

        System.out.println("byte: " + byteValue);
        System.out.println("short: " + shortValue);
        System.out.println("int: " + intValue);
        System.out.println("long: " + longValue);
        System.out.println("float: " + floatValue);
        System.out.println("double: " + doubleValue);
        System.out.println();
    }
}
