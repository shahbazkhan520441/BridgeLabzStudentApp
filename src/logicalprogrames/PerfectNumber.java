package logicalprogrames;

public class PerfectNumber {

    // Method to check if a number is perfect
    public static boolean isPerfectNumber(int number) {
        if (number <= 1) {
            return false;
        }

        int sum = 0;

        // Find divisors and sum them
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        // Check if the sum of divisors equals the number
        return sum == number;
    }

    public static void main(String[] args) {
        int number = 28; // You can change this to test other numbers

        if (isPerfectNumber(number)) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }
    }
}

