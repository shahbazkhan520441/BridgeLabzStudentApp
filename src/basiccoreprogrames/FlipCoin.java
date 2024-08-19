package basiccoreprogrames;

import java.util.Random;
import java.util.Scanner;

public class FlipCoin {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		// Prompt user for input and validate it
		System.out.print("Enter the number of times to flip the coin: ");
		int numberOfFlips = scanner.nextInt();

		// Ensure input is a positive integer
		if (numberOfFlips <= 0) {
			System.out.println("Please enter a positive integer.");
			return;
		}

		int headsCount = 0;
		int tailsCount = 0;

		// Flip the coin 'numberOfFlips' times
		for (int i = 0; i < numberOfFlips; i++) {
			if (random.nextDouble() < 0.5) {
				tailsCount++;
			} else {
				headsCount++;
			}
		}

		// Calculate the percentages
		double headsPercentage = (double) headsCount / numberOfFlips * 100;
		double tailsPercentage = (double) tailsCount / numberOfFlips * 100;

		// Output the results
		System.out.println("Heads: " + headsCount + " (" + headsPercentage + "%)");
		System.out.println("Tails: " + tailsCount + " (" + tailsPercentage + "%)");


	}

}
