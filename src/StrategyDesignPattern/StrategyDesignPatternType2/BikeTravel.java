package StrategyDesignPattern.StrategyDesignPatternType2;

public class BikeTravel implements Travel{
    @Override
    public void travel() {
        System.out.println("Travelling by BIKE");
    }
}
