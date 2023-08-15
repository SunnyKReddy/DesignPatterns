package AbstractFactoryDesignPattern.abstractfactorydesignpattern1;

public class VehicleManufactureFactory {
    public VehicleManufactureFactory(){}

    public VehicleManufacture getVehicleFactory(String factoryType){
        VehicleManufacture vehicleFactoryFactory;
        switch (factoryType){
            case "TATA" : vehicleFactoryFactory = new TataVehicle(); break;
            case "BMW" : vehicleFactoryFactory = new BMWVehicle();break;
            case "HONDA" : vehicleFactoryFactory = new HondaVehicle();break;
            default: vehicleFactoryFactory = new TataVehicle(); break;
        }
        return vehicleFactoryFactory;
    }
}
