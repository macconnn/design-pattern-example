package decorator;

public class Additional {
    public static class Milk extends BeverageDecorator {
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

    public static class Mocha extends BeverageDecorator {
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
