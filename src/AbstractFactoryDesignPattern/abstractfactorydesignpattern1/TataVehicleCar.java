package AbstractFactoryDesignPattern.abstractfactorydesignpattern1;

public class TataVehicleCar implements Vehicle{
    @Override
    public void displayFeatures() {
        System.out.println("Tata Company Car");
    }

    @Override
    public void drive() {
        System.out.println("Drive Safe ... Use seat belt");
    }
}
