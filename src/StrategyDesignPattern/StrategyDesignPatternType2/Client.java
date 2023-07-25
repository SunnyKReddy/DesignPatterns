package StrategyDesignPattern.StrategyDesignPatternType2;

public class Client {
    public static void main(String[] args) {
        Journey journey1 = new Journey("Hyderabad", "Bangalore", ModeOfTransport.CAR);

        Journey journey2 = new Journey("Bangalore", "Chennai", ModeOfTransport.BUS);

        Journey journey3 = new Journey("Goa", "Kerala", ModeOfTransport.BIKE);
    }
}
