package DecoratorDesignPattern.DecoratorDesignPattern1;

public class Meat implements PizzaToppings{
    public final Pizza pizza;

    public Meat(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDesc() {
        return this.pizza.getDesc()+ "Meat (80), ";
    }

    @Override
    public double getPrice() {
        return this.pizza.getPrice() + 80;
    }
}
