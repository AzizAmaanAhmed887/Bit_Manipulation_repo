public class bitManipulation {
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

    public static int getIthBit(int num, int i) {
        int bitmask = 1 << i;

        if ((bitmask & num) == 0) {
            return 0; // Ith bit is 0
        } else {
            return 1;
        }
    }

    public static int setIthBit(int num, int i) {
        int bitmask = 1 << i;
        return bitmask | num;
    }

    public static int clearIthBit(int num, int i) {
        int bitmask = ~(1 << i);
        return bitmask & num;
    }

    public static int updateIthBit(int num, int i, int newBit) {
        int n = clearIthBit(num, i); // clear ith bit n = 1010
        int bitMask = newBit << i;
        return n | bitMask;
    }

    public static int clearLastIthBit(int num, int i) {
        int bitMask = ((~0) << i);
        return num & bitMask;
    }

    public static int clearRangeBits(int range, int i, int j) {
        // left part
        int left = ~0 << (j + 1);

        // right part
        int right = (1 << i) -1;

        // final mask
        int mask = left | right;

        // performing AND operation
        return range & mask;
    }

    public static void main(String[] args) {
        System.out.println(clearRangeBits(10, 2,7));
    }
}
