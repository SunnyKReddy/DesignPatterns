package AbstractFactoryDesignPattern.abstractfactorydesignpattern2;

public class VehicleFactoryTata implements VehicleFactoryInterface{
    @Override
    public void assembleEngine() {
        System.out.println("Assemble Tata Engines");
    }

    @Override
    public void testEngine() {
        System.out.println("Test Tata Engines");
    }

    @Override
    public void displayFactoryInfo() {
        System.out.println("Tata Factory");
    }

    public Vehicle getVehicle(String vehicleType) {
        switch(vehicleType) {
            case "Bike": return null;
            case "Bus": return new TataBus();
            case "Car": return new TataCar();
            default: return new TataBus();
        }
    }

}
