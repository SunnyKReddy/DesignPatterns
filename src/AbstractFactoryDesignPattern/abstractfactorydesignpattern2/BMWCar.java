package AbstractFactoryDesignPattern.abstractfactorydesignpattern2;

public class BMWCar implements Vehicle{
    @Override
    public void startVehicle() {
        System.out.println("Start BMW Car Engine");
    }

    @Override
    public void displayVehicleSpecifications() {
        System.out.println("Most Luxurious vehicles in the segment with suprior safety");
    }
}
