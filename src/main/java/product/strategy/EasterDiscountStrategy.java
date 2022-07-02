package product.strategy;

public class EasterDiscountStrategy implements DiscountStrategy {
    @Override
    public double discount(double cost) {
        return 0.10 * cost;
    }
}
