package strategy;

public class Vendor{
    private Beverage beverage;

    public void chooseFlavor(Beverage beverage){
        this.beverage = beverage;
    }

    public void getBeverage(){
        beverage.flavor();
    }
}