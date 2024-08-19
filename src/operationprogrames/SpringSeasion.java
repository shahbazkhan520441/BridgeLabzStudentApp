package operationprogrames;

public class SpringSeasion {

    public static void main(String[] args) {
        int m = 0;
        int d = 0;

        // Ensure the correct number of arguments are passed
        if (args.length == 2) {
            m = Integer.parseInt(args[0]);
            d = Integer.parseInt(args[1]);
        } else {
            System.out.println("Please provide both month and day as command-line arguments.");
            return;
        }

        // Check if the date is between March 20 and June 20
        boolean isSpring = (m == 3 && d >= 20) || 
                           (m == 4) || 
                           (m == 5) || 
                           (m == 6 && d <= 20);

        System.out.println(isSpring);
    }
}

