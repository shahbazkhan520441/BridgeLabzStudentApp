package basiccoreprogrames;

import java.util.Scanner;

public class VowelOrConsonant {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for input
        System.out.print("Enter an alphabet: ");
        char ch = scanner.next().charAt(0);
        
        // Convert character to lower case to simplify comparison
        ch = Character.toLowerCase(ch);
        
        // Check if the input is an alphabet
        if (ch >= 'a' && ch <= 'z') {
            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch + " is a vowel.");
            } else {
                System.out.println(ch + " is a consonant.");
            }
        } else {
            System.out.println("The input is not an alphabet.");
        }
        
        scanner.close();
    }
}
