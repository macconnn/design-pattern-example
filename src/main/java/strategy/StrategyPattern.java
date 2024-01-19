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

    public interface Beverage{
        void flavor();
    }

    public static class Cola implements Beverage{
        @Override
        public void flavor() {
            System.out.println("This is Cola flavor");
        }
    }
    public static class Sprite implements Beverage{
        @Override
        public void flavor() {
            System.out.println("This is Sprite flavor");
        }
    }

    public static class Vendor{
        private Beverage beverage;

        public void chooseFlavor(Beverage beverage){
            this.beverage = beverage;
        }

        public void getBeverage(){
            beverage.flavor();
        }
    }


}
