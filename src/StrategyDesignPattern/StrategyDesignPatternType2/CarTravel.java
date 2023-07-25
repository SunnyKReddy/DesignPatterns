package StrategyDesignPattern.StrategyDesignPatternType2;

public class CarTravel implements Travel{
    @Override
    public void travel() {
        System.out.println("Travelling by CAR");
    }
}
