package structural.design.pattern;

public class CheeseDecorator extends PizzaDecorator {
    public CheeseDecorator(Pizza decoratedPizza) {
        super(decoratedPizza);
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription() + ", with cheese";
    }

    @Override
    public double cost() {
        return decoratedPizza.cost() + 1.50; // cheese costs extra
    }
}

 class OliveDecorator extends PizzaDecorator {
    public OliveDecorator(Pizza decoratedPizza) {
        super(decoratedPizza);
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription() + ", with olives";
    }

    @Override
    public double cost() {
        return decoratedPizza.cost() + 1.00; // olives cost extra
    }
}

 class PepperoniDecorator extends PizzaDecorator {
    public PepperoniDecorator(Pizza decoratedPizza) {
        super(decoratedPizza);
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription() + ", with pepperoni";
    }

    @Override
    public double cost() {
        return decoratedPizza.cost() + 2.00; // pepperoni costs extra
    }
}
