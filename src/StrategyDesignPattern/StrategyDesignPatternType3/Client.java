package StrategyDesignPattern.StrategyDesignPatternType3;

public class Client {
    public static void main(String[] args) {
        //AdditionCalculationStrategy
        StrategyContext strategyContext = new StrategyContext(new AdditionCalculationStrategy());
        strategyContext.executeStrategy(10,20);

        //SubstarctionCalculationStrategy
        strategyContext = new StrategyContext(new SubstractionCalculationStrategy());
        strategyContext.executeStrategy(10, 5);

        //MultiplicationCalculationStrategy
        strategyContext = new StrategyContext(new MultiplicationCalculationStrategy());
        strategyContext.executeStrategy(5, 7);
    }
}
