package decorator;

public abstract class BeverageDecorator extends Beverage {
    Beverage beverage;
    public abstract String getDescription();
    public abstract double getPrice();
}