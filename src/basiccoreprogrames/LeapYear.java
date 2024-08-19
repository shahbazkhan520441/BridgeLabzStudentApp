package basiccoreprogrames;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Input: Year
		System.out.print("Enter a 4-digit year: ");
		int year = scanner.nextInt();

		// Ensure it is a 4-digit number
		if (year < 1000 || year > 9999) {
			System.out.println("Please enter a valid 4-digit year.");
		} else {
			// Logic: Determine if it is a Leap Year
			boolean isLeapYear = false;

			if (year % 4 == 0) {
				if (year % 100 != 0 || year % 400 == 0) {
					isLeapYear = true;
				}
			}

			// Output: Print if the year is a Leap Year or not
			if (isLeapYear) {
				System.out.println(year + " is a Leap Year.");
			} else {
				System.out.println(year + " is not a Leap Year.");
			}
			
			scanner.close();


		}

	}
}
