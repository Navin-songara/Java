public class decimal {
    public static void main(String[] args) {
        float e = 123.456789f; // ~7 significant digits
        System.out.println("Float Example:");
        System.out.println("----------");
        System.out.println("Original float value: " + e);
        System.out.println("Smallest positive float: " + Float.MIN_VALUE);
        System.out.println("Largest positive float: " + Float.MAX_VALUE);
        System.out.println("Smallest negative float: " + -Float.MIN_VALUE);
        System.out.println("Largest negative float: " + -Float.MAX_VALUE);
        System.out.println();

        // 15 significant digits
        double d = 123.456789012345;
        System.out.println("Double Examples:");
        System.out.println();
        System.out.println("Original double value: " + d);
        System.out.println("Smallest positive double: " + Double.MIN_VALUE);
        System.out.println("Largest positive double: " + Double.MAX_VALUE);
        System.out.println("Smallest negative double: " + -Double.MIN_VALUE);
        System.out.println("Largest negative double: " + -Double.MAX_VALUE);
    }
}

