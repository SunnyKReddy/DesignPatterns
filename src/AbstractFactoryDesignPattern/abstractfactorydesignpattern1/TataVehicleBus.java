package AbstractFactoryDesignPattern.abstractfactorydesignpattern1;

public class TataVehicleBus implements Vehicle{
    @Override
    public void displayFeatures() {
        System.out.println("Tata Company Bus");
    }

    @Override
    public void drive() {
        System.out.println("Ride Safe ... Don't standon foot board");
    }
}
