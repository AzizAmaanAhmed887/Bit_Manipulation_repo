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

    public static void main(String[] args) {
        System.out.println("Binary One's Complement: " + binaryOnesComplement(0));
        System.out.println("Binary And: " + binaryAND(5, 6));
        System.out.println("Binary OR: " + binaryOR(5, 6));
        System.out.println("Binary XOR: " + binaryXOR(5, 6));
    }
}
