package AbstractFactoryDesignPattern.abstractfactorydesignpattern2;

public class MahindraBus implements Vehicle{
    @Override
    public void startVehicle() {
        System.out.println("Start Mahindra Bus Engine");
    }

    @Override
    public void displayVehicleSpecifications() {
        System.out.println("Mahindra Bus is very affordable and easy to maintain!");
    }
}
