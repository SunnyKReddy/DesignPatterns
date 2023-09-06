package DecoratorDesignPattern.DecoratorDesignPattern1;

public class Chicken implements PizzaToppings{
    public final Pizza pizza;

    public Chicken(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDesc() {
        return this.pizza.getDesc()+ "Chicken (60), ";
    }

    @Override
    public double getPrice() {
        return this.pizza.getPrice() + 60;
    }
}
