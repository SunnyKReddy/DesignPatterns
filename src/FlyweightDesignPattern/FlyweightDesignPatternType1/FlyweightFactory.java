package FlyweightDesignPattern.FlyweightDesignPatternType1;

import java.util.HashMap;

public class FlyweightFactory {
    static HashMap<ShapeType, Shape> shapes = new HashMap<>();

    public static Shape getShape(ShapeType shapeType) {
        Shape shapeImpl = shapes.get(shapeType);
        if(shapeImpl == null) {
            if(shapeType.equals(ShapeType.LINE)) {
                shapeImpl = new Line();
            }else if (shapeType.equals(ShapeType.TRIANGLE_FILLED)) {
                shapeImpl = new Triangle("(0,0) (0,2) (3,0)", true);
            }else if (shapeType.equals(ShapeType.TRIANGLE_NONFILLED)) {
                shapeImpl = new Triangle("(0,0) (0,2) (3,0)", false);
            }else if (shapeType.equals(ShapeType.RECTANGLE_FILLED)) {
                shapeImpl = new Triangle("(0,0) (0,2) (3,0) (2,3)", true);
            }else if (shapeType.equals(ShapeType.RECTANGLE_NONFILLED)) {
                shapeImpl = new Triangle("(0,0) (0,2) (3,0) (2,3)", false);
            }else {
                shapeImpl = new Line();
            }
            shapes.put(shapeType, shapeImpl);
        }
        return shapeImpl;
    }
}
