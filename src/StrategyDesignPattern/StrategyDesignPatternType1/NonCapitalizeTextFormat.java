package StrategyDesignPattern.StrategyDesignPatternType1;

public class NonCapitalizeTextFormat implements TextFormat{
    @Override
    public void format(String text) {
        System.out.println("Non-Capitalize text (LowerCase): " + text.toLowerCase());
    }
}
