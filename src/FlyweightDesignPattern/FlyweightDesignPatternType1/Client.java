package FlyweightDesignPattern.FlyweightDesignPatternType1;

public class Client {
    public static void main(String[] args) {
        Shape shapeimpl = FlyweightFactory.getShape(ShapeType.LINE);
        shapeimpl.drawShape();
        shapeimpl = FlyweightFactory.getShape(ShapeType.TRIANGLE_FILLED);
        shapeimpl.drawShape();
        shapeimpl = FlyweightFactory.getShape(ShapeType.TRIANGLE_NONFILLED);
        shapeimpl.drawShape();
        shapeimpl = FlyweightFactory.getShape(ShapeType.RECTANGLE_FILLED);
        shapeimpl.drawShape();
        shapeimpl = FlyweightFactory.getShape(ShapeType.RECTANGLE_NONFILLED);
        shapeimpl.drawShape();
        shapeimpl = FlyweightFactory.getShape(ShapeType.LINE);
        shapeimpl.drawShape();
        shapeimpl = FlyweightFactory.getShape(ShapeType.TRIANGLE_FILLED);
        shapeimpl.drawShape();
        shapeimpl = FlyweightFactory.getShape(ShapeType.TRIANGLE_NONFILLED);
        shapeimpl.drawShape();
        shapeimpl = FlyweightFactory.getShape(ShapeType.RECTANGLE_FILLED);
        shapeimpl.drawShape();
        shapeimpl = FlyweightFactory.getShape(ShapeType.RECTANGLE_NONFILLED);
        shapeimpl.drawShape();

    }
}
