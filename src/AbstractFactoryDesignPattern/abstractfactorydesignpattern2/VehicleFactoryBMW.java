package AbstractFactoryDesignPattern.abstractfactorydesignpattern2;

public class VehicleFactoryBMW implements VehicleFactoryInterface{
    @Override
    public void assembleEngine() {
        System.out.println("Assemble BMW Engines");
    }

    @Override
    public void testEngine() {
        System.out.println("Test BMW Engines");
    }

    @Override
    public void displayFactoryInfo() {
        System.out.println("BMW Factory");
    }

    public Vehicle getVehicle(String vehicleType){
        switch(vehicleType) {
            case "Bike": return new BMWBike();
            case "Bus": return null;
            case "Car": return new BMWCar();
            default: return new BMWBike();
        }
    }
}
