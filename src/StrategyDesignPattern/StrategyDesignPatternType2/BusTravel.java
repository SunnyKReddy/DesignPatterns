package StrategyDesignPattern.StrategyDesignPatternType2;

public class BusTravel implements Travel{
    @Override
    public void travel() {
        System.out.println("Travelling by BUS");
    }
}
