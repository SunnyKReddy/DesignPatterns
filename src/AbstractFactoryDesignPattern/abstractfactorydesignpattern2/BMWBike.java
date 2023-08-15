package AbstractFactoryDesignPattern.abstractfactorydesignpattern2;

public class BMWBike implements Vehicle{
    @Override
    public void startVehicle() {
        System.out.println("Start BMW Bike Engine, more powerful bike to ride.");
    }

    @Override
    public void displayVehicleSpecifications() {
        System.out.println("BMW Bike engine designed and developed by BMW Motors, 350cc");
    }
}
