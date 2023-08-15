package AbstractFactoryDesignPattern.abstractfactorydesignpattern1;

public class BMWVehicle implements VehicleManufacture {
    @Override
    public void manufacturer() {
        System.out.println("******* BMW *******");
        System.out.println("Designed and Assembled by BMW.");
    }
}
