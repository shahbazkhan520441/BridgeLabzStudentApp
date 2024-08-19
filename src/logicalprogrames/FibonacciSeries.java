package logicalprogrames;

public class FibonacciSeries {

    // Method to print Fibonacci series up to a given number of terms
    public static void printFibonacci(int terms) {
        int first = 0, second = 1;
        System.out.print("Fibonacci Series: " + first + ", " + second);
        
        for (int i = 3; i <= terms; i++) {
            int next = first + second;
            System.out.print(", " + next);
            first = second;
            second = next;
        }
    }

    public static void main(String[] args) {
        int numberOfTerms = 10; // You can change this to however many terms you want
        printFibonacci(numberOfTerms);
    }
}
