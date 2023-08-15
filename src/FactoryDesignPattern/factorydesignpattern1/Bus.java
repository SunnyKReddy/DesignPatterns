package FactoryDesignPattern.factorydesignpattern1;

public class Bus implements Vehicle{
    @Override
    public void displayFeatures() {
        System.out.println("----------- BUS FEATURES -----------");
        System.out.println("Bus has 6 wheels, with engine power ranging from 500cc to 25000cc... ");
        System.out.println("Weight range is 5000kg to 8000kg, and designed for 50 persons seat capacity.");
    }

    @Override
    public void drive() {
        System.out.println("----------- BUS DRIVE -----------");
        System.out.println("Rotate & Turn key to start drive.");
        System.out.println("Don't standon footboard for safety.  :-)");
    }
}
