package FlyweightDesignPattern.FlyweightDesignPatternType1;

public class Triangle implements Shape {
    private String coordinates;
    private boolean filled;

    public String getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(String coordinates) {
        this.coordinates = coordinates;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Triangle(String coordinates, boolean filled) {
        this.coordinates = coordinates;
        this.filled = filled;
        try{
            System.out.println("Creating a new Triangle Object");
            Thread.sleep(4000);
        }catch(InterruptedException e) {
            System.out.println("Interruption " + e);
        }
        System.out.println("Triangle created Successfully!");
    }
    @Override
    public void drawShape() {
        System.out.println("Drawing Triangle with the provided coordinates" + this.coordinates);
        System.out.println("Triangle Drawn successfully!");
    }
}
