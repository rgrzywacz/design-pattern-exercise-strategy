package product.strategy;

public class ChristmasDiscountStrategy implements DiscountStrategy {
    @Override
    public double discount(double cost) {
        return 0.15 * cost;
    }
}
