package logicalprogrames;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.Scanner;

public class CouponNumber
{

    // Method to generate a random number between 0 and N-1
    public static int generateRandomNumber(int N) {
        Random random = new Random();
        return random.nextInt(N);
    }

    // Method to calculate the number of random numbers needed to generate N distinct coupon numbers
    public static int collectCoupons(int N) {
        Set<Integer> distinctCoupons = new HashSet<>();
        int count = 0;

        // Keep generating random numbers until we have N distinct coupons
        while (distinctCoupons.size() < N) {
            int coupon = generateRandomNumber(N);
            distinctCoupons.add(coupon);
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the number of distinct coupons
        System.out.print("Enter the number of distinct coupon numbers: ");
        int N = scanner.nextInt();

        // Calculate the total number of random numbers needed to get all distinct coupons
        int totalRandomNumbers = collectCoupons(N);

        // Display the result
        System.out.println("Total random numbers needed to generate " + N + " distinct coupon numbers: " + totalRandomNumbers);

        scanner.close();
    }
}

