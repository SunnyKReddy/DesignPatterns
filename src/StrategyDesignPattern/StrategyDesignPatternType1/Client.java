package StrategyDesignPattern.StrategyDesignPatternType1;

public class Client {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        String unformatedText = textEditor.editor("Strategy Design Pattern -> Text Editor example");

        TextFormat textFormatCapitalize = new CapitalizeTextFormat();
        //Get formated text by passing unformated Text
        textFormatCapitalize.format(unformatedText);

        TextFormat textFormatNonCapitalize = new NonCapitalizeTextFormat();
        //Get formated text by passing unformated Text
        textFormatNonCapitalize.format(unformatedText);
    }
}
