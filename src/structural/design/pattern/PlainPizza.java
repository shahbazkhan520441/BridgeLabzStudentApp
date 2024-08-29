package structural.design.pattern;

public class PlainPizza implements Pizza {
    @Override
    public String getDescription() {
        return "Plain pizza";
    }

    @Override
    public double cost() {
        return 8.00; // base price of the pizza
    }
}
