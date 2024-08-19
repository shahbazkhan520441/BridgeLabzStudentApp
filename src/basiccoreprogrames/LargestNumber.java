package basiccoreprogrames;

import java.util.Scanner;

public class LargestNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for input
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        
        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();
        
        // Find the largest number using ternary operator
        int largest = (num1 >= num2) ? 
                      ((num1 >= num3) ? num1 : num3) : 
                      ((num2 >= num3) ? num2 : num3);
        
        // Display the largest number
        System.out.println("The largest number is: " + largest);
        
        scanner.close();
    }
}
