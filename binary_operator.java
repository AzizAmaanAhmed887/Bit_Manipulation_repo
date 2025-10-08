import java.util.*;

public class binary_operator {
    public static int binaryAND(int a, int b) {
        return a & b;
    }

    public static int binaryOR(int a, int b) {
        return a | b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bianry And: " + binaryAND(5, 6));
        System.out.println("Bianry OR: " + binaryOR(5, 6));
    }
}
