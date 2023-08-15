package AbstractFactoryDesignPattern.abstractfactorydesignpattern1;

public class HondaVehicle implements VehicleManufacture {
    @Override
    public void manufacturer() {
        System.out.println("******* HONDA *******");
        System.out.println("Designed and Assembled by Honda.");
    }
}
