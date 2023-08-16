package StrategyDesignPattern.StrategyDesignPatternType3;

public class SubstractionCalculationStrategy implements CalculationStrategy{
    @Override
    public int doCalculation(int a, int b) {
        return a - b;
    }
}
