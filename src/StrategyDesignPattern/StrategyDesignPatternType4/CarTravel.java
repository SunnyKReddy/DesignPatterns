package StrategyDesignPattern.StrategyDesignPatternType4;

public class CarTravel implements Travel{
    @Override
    public void startJourney(String source, String destination) {
        System.out.println("Started Jorney from " + source + " to " + destination + " via Car.");
    }
}
