package javaoperators_control_statements;

public class MiscelaneousOperators {

    public static void main(String args[]) {
        int a, b;

        // Example of the ternary operator
        a = 10;
        b = (a == 1) ? 20 : 30;
        System.out.println("Value of b is : " + b);

        b = (a == 10) ? 20 : 30;
        System.out.println("Value of b is : " + b);

        // Example of the instanceof operator
        Vehicle v = new Car();
        boolean result = v instanceof Car;
        System.out.println(result);
    }

    // Static nested class
    static class Vehicle {
    }

    // Static nested subclass
    static class Car extends Vehicle {
    }
}
