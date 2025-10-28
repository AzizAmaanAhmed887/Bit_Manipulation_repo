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
        int right = (1 << i) - 1;

        // final mask
        int mask = left | right;

        // performing AND operation
        return range & mask;
    }

    public static boolean isPowOfTwo(int num) {
        return (num & (num - 1)) == 0; // true, else false
    }

    public static int countSetBits(int num) {
        int count = 0;
        while (num > 0) {
            if ((num & 1) != 0) {
                count++;
            }
            num = num >> 1;
        }
        return count;
    }

//    public static int fastExponentiation(int a, int n) {
//        int ans = 1;
//        while (n > 0) {
//            if ((n & 1) != 0) { // checking LSB
//                ans = ans * a;
//            }
//            a = a * a;
//            n = n >> 1;
//        }
//        return ans;
//    }

    public static int fastExpo(int base, int power) {
        int result = 1;

        while (power > 0) {
            if ((power & 1) != 0) {
                // check LSB of power
                result = result * base;
            }
            base *= base;
            power = power >> 1;
        }

        return result;
    }

    public static int modulerExpo(int base, int exponent, int modulus) {
        // Edge case:
        if (modulus == 1) {
            return 0;
        }

        int result = 1; // Initialize result with 1

        // take base inside modulus
        base = base % modulus;

        // loop till expo > 0
        while (exponent > 0) {
            if (exponent % 2 == 1) {
                result *= base;
            }

            // half the expo
            exponent = exponent >> 1;

            // square the base
            base *= base;

        }
        // return result
        return result;
    }

    public static void main(String[] args) {
        int base = 2;
        int exponent = 10;
        int modulus = 1000;
        System.out.println("(" + base + "^" + exponent + ") % " + modulus +
                " = " + modulerExpo(base, exponent, modulus));
        // Output: 24//        System.out.println(fastExpo(3, 5));
//        System.out.println(countSetBits(16));
//        System.out.println(isPowOfTwo(7));
    }
}
