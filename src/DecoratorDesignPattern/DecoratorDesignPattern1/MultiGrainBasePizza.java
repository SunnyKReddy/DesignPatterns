package DecoratorDesignPattern.DecoratorDesignPattern1;

public class MultiGrainBasePizza implements Pizza {

    @Override
    public String getDesc() {
        return "PizzaBase- Multigrain (130), ";
    }

    @Override
    public double getPrice() {
        return 130;
    }
}
