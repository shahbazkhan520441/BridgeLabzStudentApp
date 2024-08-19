package basiccoreprogrames;

import java.util.Scanner;

public class PrimeFactorization {



	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number to find its prime factors: ");
		int N = scanner.nextInt();

		System.out.print("Prime factors of " + N + " are: ");
		primeFactorization(N);
	}

	public static void primeFactorization(int N) {
		// Check for number of 2s that divide N
		while (N % 2 == 0) {
			System.out.print(2 + " ");
			N /= 2;
		}

		// Che1ck for odd factors
		for (int i = 3; i * i <= N; i += 2) {
			while (N % i == 0) {
				System.out.print(i + " ");
				N /= i;
			}
		}

		// This condition is to check if N is a prime number greater than 2
		if (N > 2) {
			System.out.print(N);
		}
	}
}

