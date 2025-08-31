public class bitwiseoperator {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
    
        // AND OPERATOR (&)
        System.out.println("AND OPERATION:");
        System.out.println(" 5 & 3 = " + (a & b));
        System.out.println("Binary: " + Integer.toBinaryString(a & b));

        // OR OPERATOR (|)
        System.out.println("OR OPERATION:");
        System.out.println(" 5 | 3 = " + (a | b));
        System.out.println("Binary: " + Integer.toBinaryString(a | b));

        // XOR OPERATOR (^)
        System.out.println("XOR OPERATION:");
        System.out.println(" 5 ^ 3 = " + (a ^ b));
        System.out.println("Binary: " + Integer.toBinaryString(a ^ b));

        // NOT Operator | COMPLEMENT OPERATOR (~)
        System.out.println("COMPLEMENT OPERATION:");
        System.out.println(" ~5 = " + (~a));
        System.out.println("Binary: " + Integer.toBinaryString(~a));

        // LEFT SHIFT (<<)
        System.out.println("LEFT SHIFT OPERATION:");
        System.out.println(" 5 << 1 = " + (a << 1));
        System.out.println("Binary: " + Integer.toBinaryString(a << 1));

        // RIGHT SHIFT (>>)
        System.out.println("RIGHT SHIFT OPERATION:");
        System.out.println(" 5 >> 1 = " + (a >> 1));
        System.out.println("Binary: " + Integer.toBinaryString(a >> 1));
    }
}