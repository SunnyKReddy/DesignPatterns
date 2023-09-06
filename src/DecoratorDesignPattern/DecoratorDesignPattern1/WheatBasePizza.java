package DecoratorDesignPattern.DecoratorDesignPattern1;

public class WheatBasePizza implements Pizza {

    @Override
    public String getDesc() {
        return "PizzaBase- Wheat (100), ";
    }

    @Override
    public double getPrice() {
        return 100;
    }
}
