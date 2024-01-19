package factory;

import java.util.HashMap;

public class ShapeFactory{
    public static Shape getShapeInstance(String type){
        HashMap<String, Shape> shapeMap = new HashMap<String, Shape>();
        shapeMap.put("Circle", new Circle());
        shapeMap.put("Square", new Square());
        shapeMap.put("Triangle", new Triangle());
        return shapeMap.get(type);
    }
}
