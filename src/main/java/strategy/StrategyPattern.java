package strategy;

public class StrategyPattern {

    public static void main(String[] args){
        Vendor vendor = new Vendor();

        vendor.chooseFlavor(new Cola());
        vendor.getBeverage();
        System.out.println("===================================");
        vendor.chooseFlavor(new Sprite());
        vendor.getBeverage();
    }
}
