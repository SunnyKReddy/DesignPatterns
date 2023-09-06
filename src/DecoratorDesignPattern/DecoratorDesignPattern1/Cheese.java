package DecoratorDesignPattern.DecoratorDesignPattern1;

public class Cheese implements PizzaToppings{
    public final Pizza pizza;

    public Cheese(Pizza pizza) {
        this.pizza = pizza;
    }
    @Override
    public String getDesc() {
        return this.pizza.getDesc()+ "Cheese (10), ";
    }

    @Override
    public double getPrice() {
        return this.pizza.getPrice() + 10;
    }
}
