package decorator;

import java.util.Map;

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

    public static abstract class Beverage {
        public String description;
        abstract public String getDescription();
        abstract public double getPrice();
    }

    public static class Espresso extends Beverage {
        public Espresso() {
            this.description = "Espresso";
        }

        @Override
        public double getPrice() {
            return 100.00;
        }

        @Override
        public String getDescription() {
            return this.description;
        }
    }

    public static abstract class BeverageDecorator extends Beverage{
        Beverage beverage;
        public abstract String getDescription();
        public abstract double getPrice();
    }

    public static class Milk extends BeverageDecorator{
        public Milk(Beverage beverage) {
            this.beverage = beverage;
        }

        @Override
        public String getDescription() {
            return beverage.getDescription() + " plus Milk";
        }

        @Override
        public double getPrice() {
            return .99 + beverage.getPrice();
        }
    }
    public static class Mocha extends BeverageDecorator{
        public Mocha(Beverage beverage){
            this.beverage = beverage;
        }

        @Override
        public String getDescription(){
            return beverage.getDescription() + " plus Mocha";
        }

        @Override
        public double getPrice(){
            return .39 + beverage.getPrice();
        }

    }

}
