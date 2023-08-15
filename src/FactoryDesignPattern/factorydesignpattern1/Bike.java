package FactoryDesignPattern.factorydesignpattern1;

public class Bike implements Vehicle{
    @Override
    public void displayFeatures() {
        System.out.println("----------- BIKE FEATURES -----------");
        System.out.println("Bike has 2 wheels, with engine power ranging from 100cc to 1000cc... ");
        System.out.println("Weight range is 100 kg to 200kg, and designed for 2 persons seat capacity.");
    }

    @Override
    public void drive() {
        System.out.println("----------- BIKE RIDE -----------");
        System.out.println("Kick start the engine or press the self start button to start ride.");
        System.out.println("Use helmet and Jacket for safety.  :-)");
    }
}
