package DecoratorDesignPattern.DecoratorDesignPattern1;

public class Brocolli implements PizzaToppings {
    public final Pizza pizza;

    public Brocolli(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDesc() {
        return this.pizza.getDesc()+ "Brocolli (40), ";
    }

    @Override
    public double getPrice() {
        return this.pizza.getPrice() + 40;
    }
}
