package StrategyDesignPattern.StrategyDesignPatternType2;

public class TrainTravel implements Travel{
    @Override
    public void travel() {
        System.out.println("Travelling by TRAIN");
    }
}
