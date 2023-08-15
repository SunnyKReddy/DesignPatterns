package AbstractFactoryDesignPattern.abstractfactorydesignpattern2;

public interface VehicleFactoryInterface {
    public void assembleEngine();
    public void testEngine();
    public void displayFactoryInfo();
    public Vehicle getVehicle(String vehicleType);
}
