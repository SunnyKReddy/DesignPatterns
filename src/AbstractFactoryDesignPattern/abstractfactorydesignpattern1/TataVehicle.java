package AbstractFactoryDesignPattern.abstractfactorydesignpattern1;

public class TataVehicle implements VehicleManufacture {
    @Override
    public void manufacturer() {
        System.out.println("******* TATA MOTORS *******");
        System.out.println("Designed and Assembled by Tata Motors.");
    }
}
