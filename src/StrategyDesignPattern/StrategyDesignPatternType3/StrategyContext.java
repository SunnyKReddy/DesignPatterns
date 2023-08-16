package StrategyDesignPattern.StrategyDesignPatternType3;

public class StrategyContext {
    CalculationStrategy calculationStrategy;

    StrategyContext(CalculationStrategy calculationStrategy){
       this.calculationStrategy = calculationStrategy;
    }

    public void executeStrategy(int a, int b){
        System.out.println(calculationStrategy.doCalculation(a,b));
    }
}
