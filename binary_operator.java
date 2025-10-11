public class binary_operator {
    public static int binaryAND(int a, int b) {
        return a & b;
    }

    public static int binaryOR(int a, int b) {
        return a | b;
    }

    public static int binaryXOR(int a, int b) {
        return a ^ b;
    }

    public static int binaryOnesComplement(int a) {
        return ~a;
    }

    public static int binaryLeftShift(int a, int b) {
        return a << b;
    }

    public static int binaryRightShift(int a, int b) {
        return a >> b;
    }

    public static void main(String[] args) {
        System.out.println(binaryLeftShift(5, 2)); // Output: 20
        System.out.println(binaryRightShift(20, 2)); // Output: 5
    }
}
