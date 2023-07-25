package StrategyDesignPattern.StrategyDesignPatternType1;

public class CapitalizeTextFormat implements TextFormat{
    @Override
    public void format(String text) {
        System.out.println("Capitalize text (UpperCase): " + text.toUpperCase());
    }
}
