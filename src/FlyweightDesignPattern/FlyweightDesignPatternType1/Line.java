package FlyweightDesignPattern.FlyweightDesignPatternType1;

public class Line implements Shape {
    public Line() {
        try{
            System.out.println("Creating a new Line Object");
            Thread.sleep(4000);
        }catch(InterruptedException e) {
            System.out.println("Interruption " + e);
        }
        System.out.println("Line created Successfully!");
    }
    @Override
    public void drawShape() {
        System.out.println("Drawing Line with the provided data");
        System.out.println("Line Drawn successfully!");
    }
}
