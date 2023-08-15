package AbstractFactoryDesignPattern.abstractfactorydesignpattern2;

public class VehicleFactoryFactory {
    VehicleFactoryInterface vehicleFactoryInterface;
    public VehicleFactoryFactory(){

    }
    public VehicleFactoryInterface getVehicleFactoryInstance(String factoryName){
        switch(factoryName) {
            case "Tata": this.vehicleFactoryInterface = new VehicleFactoryTata(); break;
            case "BMW": this.vehicleFactoryInterface = new VehicleFactoryBMW(); break;
            case "Mahindra": this.vehicleFactoryInterface = new VehicleFactoryMahindra(); break;
            default: this.vehicleFactoryInterface = new VehicleFactoryTata(); break;
        }
        return vehicleFactoryInterface;
    }
}
