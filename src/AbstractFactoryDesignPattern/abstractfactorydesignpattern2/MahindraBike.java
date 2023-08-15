package AbstractFactoryDesignPattern.abstractfactorydesignpattern2;

public class MahindraBike implements Vehicle{
    @Override
    public void startVehicle() {
        System.out.println("Start Mahindra Bike with Remote");
    }

    @Override
    public void displayVehicleSpecifications() {
        System.out.println("Mahindra Bike -> IOT technology used to facilitate customers with more features. ");
    }
}
