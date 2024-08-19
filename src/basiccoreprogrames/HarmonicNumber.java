package basiccoreprogrames;

import java.util.Scanner;

public class HarmonicNumber {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		// Input: Harmonic value N
		System.out.print("Enter the Harmonic value N: ");
		int N = scanner.nextInt();

		// Ensure N != 0
		if (N <= 0) {
			System.out.println("N should be greater than 0");
			return;
		}

		// Logic: Compute the Nth Harmonic number
		double harmonicValue = 0.0;
		for (int i = 1; i <= N; i++) {
			harmonicValue += 1.0 / i;
		}

		// Output: Print the Nth Harmonic value
		System.out.println("The " + N + "th Harmonic value is: " + harmonicValue);

		scanner.close();
	}
}


