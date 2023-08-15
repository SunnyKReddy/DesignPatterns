package AbstractFactoryDesignPattern.abstractfactorydesignpattern2;

public class Client {
    public static void main(String[] args) {
        VehicleFactoryFactory vehicleFactory = new VehicleFactoryFactory();
        VehicleFactoryInterface vehicleFactoryInterface = vehicleFactory.getVehicleFactoryInstance("Mahindra");
        vehicleFactoryInterface.displayFactoryInfo();
        vehicleFactoryInterface.assembleEngine();
        vehicleFactoryInterface.testEngine();
        Vehicle vehicle = vehicleFactoryInterface.getVehicle("Car");
        vehicle.startVehicle();
        vehicle.displayVehicleSpecifications();
    }
}
