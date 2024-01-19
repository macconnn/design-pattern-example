package factory;

import java.util.HashMap;

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






}
