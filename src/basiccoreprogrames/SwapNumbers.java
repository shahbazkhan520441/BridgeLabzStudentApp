package basiccoreprogrames;

public class SwapNumbers {
    public static void main(String[] args) {
        // Initialize two numbers
        int a = 10;
        int b = 20;

        // Display numbers before swapping
        System.out.println("Before swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Swap the numbers without using a temporary variable
        a = a + b; // Step 1: a becomes the sum of a and b
        b = a - b; // Step 2: b becomes the original value of a
        a = a - b; // Step 3: a becomes the original value of b

        // Display numbers after swapping
        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
