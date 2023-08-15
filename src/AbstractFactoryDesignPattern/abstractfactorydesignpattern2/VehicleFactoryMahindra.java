package AbstractFactoryDesignPattern.abstractfactorydesignpattern2;

public class VehicleFactoryMahindra implements VehicleFactoryInterface{
    @Override
    public void assembleEngine() {
        System.out.println("Assemble Mahindra Engines");
    }

    @Override
    public void testEngine() {
        System.out.println("Test Mahindra Engines");
    }

    @Override
    public void displayFactoryInfo() {
        System.out.println("Mahindra Factory");
    }

    public Vehicle getVehicle(String vehicleType){
        switch(vehicleType) {
            case "Bike": return new MahindraBike();
            case "Bus": return new MahindraBus();
            case "Car": return new MahindraCar();
            default: return new MahindraCar();
        }
    }

}
