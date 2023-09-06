package FlyweightDesignPattern.FlyweightDesignPatternType1;

public class Rectangle implements Shape {
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

    public Rectangle(String coordinates, boolean filled) {
        this.coordinates = coordinates;
        this.filled = filled;
        try{
            System.out.println("Creating a new Rectangle Object");
            Thread.sleep(4000);
        }catch(InterruptedException e) {
            System.out.println("Interruption " + e);
        }
        System.out.println("Rectangle created Successfully!");
    }
    @Override
    public void drawShape() {
        System.out.println("Drawing Rectangle with the provided coordinates" + this.coordinates);
        System.out.println("Rectangle Drawn successfully!");
    }
}
