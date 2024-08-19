package logicalprogrames;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for input
        System.out.print("Enter a number to reverse: ");
        int number = scanner.nextInt();
        
        // Initialize variable to store the reversed number
        int reverse = 0;
        
        // Process the number until it becomes 0
        while (number != 0) {
            // Step 1: Get the remainder (last digit)
            int remainder = number % 10;
            
            // Step 2: Multiply reverse by 10 and add the remainder
            reverse = reverse * 10 + remainder;
            
            // Step 3: Divide the number by 10 (remove the last digit)
            number = number / 10;
        }
        
        // Display the reversed number
        System.out.println("Reversed Number: " + reverse);
        
        scanner.close();
    }
}

