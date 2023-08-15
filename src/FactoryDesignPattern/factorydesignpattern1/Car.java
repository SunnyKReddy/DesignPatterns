package FactoryDesignPattern.factorydesignpattern1;

public class Car implements Vehicle{
    @Override
    public void displayFeatures() {
        System.out.println("----------- CAR FEATURES -----------");
        System.out.println("Car has 4 wheels, with engine power ranging from 700cc to 9000cc... ");
        System.out.println("Weight range is 400 kg to 600kg, and designed for 5 persons seat capacity.");
    }

    @Override
    public void drive() {
        System.out.println("----------- CAR DRIVE -----------");
        System.out.println("Press start button to start drive.");
        System.out.println("Use Seatbelt and Airbags for safety.  :-)");
    }
}
