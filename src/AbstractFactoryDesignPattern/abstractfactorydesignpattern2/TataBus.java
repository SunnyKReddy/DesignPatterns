package AbstractFactoryDesignPattern.abstractfactorydesignpattern2;

public class TataBus implements Vehicle{

    @Override
    public void startVehicle() {
        System.out.println("Start Tata Bus engine");
    }

    @Override
    public void displayVehicleSpecifications() {
        System.out.println("Tata Bus, More Safety,, More Resilent");
    }
}
