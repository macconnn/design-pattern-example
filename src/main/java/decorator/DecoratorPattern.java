package decorator;

import decorator.Additional.*;

public class DecoratorPattern {

    public static void main(String[] args){
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription());
        System.out.println(beverage.getPrice());

        System.out.println("================================");

        beverage = new Milk(beverage);
        System.out.println(beverage.getDescription());
        System.out.println(beverage.getPrice());

        System.out.println("================================");

        beverage = new Mocha(beverage);
        System.out.println(beverage.getDescription());
        System.out.println(beverage.getPrice());
    }

}
