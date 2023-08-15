package FactoryDesignPattern.factorydesignpattern1;

public class Client {
    public static void main(String[] args) {
        //General creation of objects for subclass of Vehicle type
        //Vehicle vehicle = new Bike();
        //vehicle.displayFeatures();
        //vehicle.drive();

        //Using factory Design Pattern for Object creation
        VehicleFactory vehicleFactory = new VehicleFactory();
        Vehicle vehicle = vehicleFactory.getVehicle("BIKE");
        //System.out.println(vehicle);
        vehicle.displayFeatures();
        vehicle.drive();
        vehicle = vehicleFactory.getVehicle("Car");
        vehicle.drive();
    }
}
