package AbstractFactoryDesignPattern.abstractfactorydesignpattern1;

public class TataVehicleFactory {
    public TataVehicleFactory(){}
    public Vehicle getTataVehicle(String vehicleType){
        Vehicle vehicle;
        switch (vehicleType.toUpperCase()){
            case "BIKE" : vehicle = new TataVehicleBike(); break;
            case "CAR" : vehicle = new TataVehicleCar(); break;
            case "BUS" : vehicle = new TataVehicleBus(); break;
            default: vehicle = new TataVehicleBike();
        }
        return vehicle;
    }
}
