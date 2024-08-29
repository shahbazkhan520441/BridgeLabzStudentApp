package structural.design.pattern;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Pizza pizza = new PlainPizza();
        System.out.println(pizza.getDescription() + " $" + pizza.cost());

        Pizza cheesePizza = new CheeseDecorator(new PlainPizza());
        System.out.println(cheesePizza.getDescription() + " $" + cheesePizza.cost());

        Pizza oliveCheesePizza = new OliveDecorator(new CheeseDecorator(new PlainPizza()));
        System.out.println(oliveCheesePizza.getDescription() + " $" + oliveCheesePizza.cost());

        Pizza fullyLoadedPizza = new PepperoniDecorator(new OliveDecorator(new CheeseDecorator(new PlainPizza())));
        System.out.println(fullyLoadedPizza.getDescription() + " $" + fullyLoadedPizza.cost());
    }
}
