package logicalprogrames;

import java.util.Scanner;

public class stopwatch {
    private long startTime;
    private long endTime;

    // Method to start the stopwatch
    public void start() {
        startTime = System.currentTimeMillis();
        System.out.println("Stopwatch started...");
    }

    // Method to stop the stopwatch
    public void stop() {
        endTime = System.currentTimeMillis();
        System.out.println("Stopwatch stopped...");
    }

    // Method to calculate and print the elapsed time
    public void getElapsedTime() {
        long elapsedTime = endTime - startTime;
        System.out.println("Elapsed time: " + elapsedTime + " milliseconds");
    }

    public static void main(String[] args) {
        stopwatch stopwatch = new stopwatch();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Press '1' to start the stopwatch");
        scanner.nextInt();
        stopwatch.start();

        System.out.println("Press '2' to stop the stopwatch");
        scanner.nextInt();
        stopwatch.stop();

        stopwatch.getElapsedTime();
        
        scanner.close();
    }
}

