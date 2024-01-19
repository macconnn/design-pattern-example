package factory;

import java.util.HashMap;
import java.util.Map;

public class FactoryPattern {

    public static void main(String[] args){
        Shape shape = ShapeFactory.getShapeInstance("Triangle");
        shape.draw();
        System.out.println("=====================");
        shape = ShapeFactory.getShapeInstance("Circle");
        shape.draw();
        System.out.println("=====================");
        shape = ShapeFactory.getShapeInstance("Square");
        shape.draw();
    }

    public static interface Shape{
        void draw();
    }
    public static class Triangle implements Shape{
        @Override
        public void draw() {
            System.out.println("Draw a triangle");
        }
    }
    public static class Circle implements Shape{
        @Override
        public void draw() {
            System.out.println("Draw a circle");
        }
    }
    public static class Square implements Shape{
        @Override
        public void draw() {
            System.out.println("Draw a Square");
        }
    }
    public static class ShapeFactory{
        public static Shape getShapeInstance(String type){
            HashMap<String, Shape> shapeMap = new HashMap<String, Shape>();
            shapeMap.put("Circle", new Circle());
            shapeMap.put("Square", new Square());
            shapeMap.put("Triangle", new Triangle());
            return shapeMap.get(type);
        }
    }
}
