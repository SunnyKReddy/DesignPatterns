package AbstractFactoryDesignPattern.abstractfactorydesignpattern1;

public class TataVehicleBike implements Vehicle{
    @Override
    public void displayFeatures() {
        System.out.println("Tata Company Bike");
    }

    @Override
    public void drive() {
        System.out.println("Ride Safe ... Use Helmet");
    }
}
