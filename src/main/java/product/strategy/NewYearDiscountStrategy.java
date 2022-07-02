package product.strategy;

public class NewYearDiscountStrategy implements DiscountStrategy {
    @Override
    public double discount(double cost) {
        return 0.2 * cost;
    }
}
