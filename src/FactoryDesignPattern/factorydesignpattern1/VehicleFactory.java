package FactoryDesignPattern.factorydesignpattern1;

public class VehicleFactory {
    public VehicleFactory(){}
    public Vehicle getVehicle(String vehicleType){
        Vehicle vehicle;
        switch (vehicleType.toUpperCase()){
            case "BUS": vehicle = new Bus();break;
            case "CAR": vehicle = new Car();break;
            case "BIKE": vehicle = new Bike();break;
            default: vehicle = new Bike();break;
        }
        return vehicle;
    }
}
