package DecoratorDesignPattern.DecoratorDesignPattern1;

public class Tomato implements PizzaToppings{
    public final Pizza pizza;

    public Tomato(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDesc() {
        return this.pizza.getDesc()+ "Tomato (10), ";
    }

    @Override
    public double getPrice() {
        return this.pizza.getPrice() + 10;
    }
}
