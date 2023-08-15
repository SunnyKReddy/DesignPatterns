package AbstractFactoryDesignPattern.abstractfactorydesignpattern2;

public class TataCar implements Vehicle{
    @Override
    public void startVehicle() {
        System.out.println("Start Tata Car Engine");
    }

    @Override
    public void displayVehicleSpecifications() {
        System.out.println("Tata Car, Rated 5 Star for safety and Strength");
    }
}
