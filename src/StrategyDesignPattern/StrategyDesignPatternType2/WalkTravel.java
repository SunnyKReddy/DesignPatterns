package StrategyDesignPattern.StrategyDesignPatternType2;

public class WalkTravel implements Travel{
    @Override
    public void travel() {
        System.out.println("Travelling by WALK");
    }
}
