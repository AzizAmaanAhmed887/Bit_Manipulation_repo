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

    public static void oddOrEven(int num) {
        int bitMask = 1; // 0001 in binary
        if ((num & bitMask) == 0) {
            System.out.println(num + " is Even");
        } else {
            System.out.println(num + " is Odd");
        }
    }

    public static void main(String[] args) {
        oddOrEven(6);
    }
}
