package basiccoreprogrames;

public class Powerof2 {
	    public static void main(String[] args) {
	        // Check if an argument is passed
	        if (args.length != 1) {
	            System.out.println("Please provide one command-line argument for N.");
	            return;
	        }

	        try {
	            int N = Integer.parseInt(args[0]);

	            // Check if N is within the valid range
	            if (N < 0 || N >= 31) {
	                System.out.println("Please enter a value of N such that 0 <= N < 31.");
	                return;
	            }

	            System.out.println("Powers of 2 less than or equal to 2^" + N + ":");
	            for (int i = 0; i <= N; i++) {
	                System.out.println("2^" + i + " = " + (1 << i));
	            }

	        } catch (NumberFormatException e) {
	            System.out.println("Please enter a valid integer value for N.");
	        }
	    }


}
