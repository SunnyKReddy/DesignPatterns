package DecoratorDesignPattern.DecoratorDesignPattern1;

public class MaidaBasePizza implements Pizza {

    @Override
    public String getDesc() {
        return "PizzaBase- Maida (80), ";
    }

    @Override
    public double getPrice() {
        return 80;
    }
}
