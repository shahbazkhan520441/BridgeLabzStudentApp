package problemusingifeslestatements;

import java.util.Scanner;

public class NumberToWords {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = scanner.nextInt();

		if (number <= 9) {
			System.out.println("Unit");
		} else if (number <= 10) {
			System.out.println("Ten");
		} else if (number <= 100) {
			System.out.println("Hundred");
		} else if (number <= 1000) {
			System.out.println("Thousand");
		} else {
			System.out.println("Number is greater than 1000. No category available.");
		}

		scanner.close();
	}

}
