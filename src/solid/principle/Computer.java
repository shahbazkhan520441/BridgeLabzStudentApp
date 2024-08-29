package solid.principle;
// dependency inversion
interface Keyboard {
    void type();
}

class MechanicalKeyboard implements Keyboard {
    @Override
    public void type() {
        System.out.println("Typing on a mechanical keyboard");
    }
}

class MembraneKeyboard implements Keyboard {
    @Override
    public void type() {
        System.out.println("Typing on a membrane keyboard");
    }
}

public class Computer {
    private Keyboard keyboard;

    // Constructor to inject the Keyboard dependency
    Computer(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    void useKeyboard() {
        keyboard.type();
    }

    public static void main(String[] args) {
        // Create a MechanicalKeyboard instance and use it in the Computer
        Keyboard mechanicalKeyboard = new MechanicalKeyboard();
        Computer computerWithMechanicalKeyboard = new Computer(mechanicalKeyboard);
        computerWithMechanicalKeyboard.useKeyboard();  // Should print: Typing on a mechanical keyboard

        // Create a MembraneKeyboard instance and use it in the Computer
        Keyboard membraneKeyboard = new MembraneKeyboard();
        Computer computerWithMembraneKeyboard = new Computer(membraneKeyboard);
        computerWithMembraneKeyboard.useKeyboard();  // Should print: Typing on a
}}