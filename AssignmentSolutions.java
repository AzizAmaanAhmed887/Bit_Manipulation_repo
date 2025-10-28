public class AssignmentSolutions {
    // Question 1: What is the value of x^x for any value of x
    public static int power(int x) {
        return x * x;
    }

    // Question 2: Swap two numbers without using any third variable
    public static void swap(int a, int b) {
        System.out.println("Original values: a = " + a + ", b = " + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("Swapped values: a = " + a + ", b = " + b);
    }

    // Question 3: Add 1 to an integer using Bit Manipulation.
    // (Hint: try using Bitwise NOT Operator)
    public static int addOne(int n) {
        return -~n;
    }

    public static void main(String[] args) {
        System.out.println(addOne(5)); // Output: 6
    }
}
