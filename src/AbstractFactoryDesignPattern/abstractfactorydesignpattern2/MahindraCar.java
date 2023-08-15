package AbstractFactoryDesignPattern.abstractfactorydesignpattern2;

public class MahindraCar implements Vehicle{
    @Override
    public void startVehicle() {
        System.out.println("Start Mahindra Car engine");
    }

    @Override
    public void displayVehicleSpecifications() {
        System.out.println("Mahindra Cars looks like a beast and best in category of Sport Utility Vehicles (SUV)");
    }
}
