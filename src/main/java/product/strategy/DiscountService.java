package product.strategy;

public class DiscountService {

    private static DiscountStrategy christmasDiscountStrategy = new ChristmasDiscountStrategy();
    private static DiscountStrategy newYearDiscountStrategy = new NewYearDiscountStrategy();
    private static DiscountStrategy easterDiscountStrategy = new EasterDiscountStrategy();

    public static double calculateDiscount(DiscountStrategyType discountStrategyType, double cost) {
        if (DiscountStrategyType.CHRISTMAS.equals(discountStrategyType)) {
            return christmasDiscountStrategy.discount(cost);
        } else if (DiscountStrategyType.NEW_YEAR.equals(discountStrategyType)) {
            return newYearDiscountStrategy.discount(cost);
        } else if (DiscountStrategyType.EASTER.equals(discountStrategyType)) {
            return easterDiscountStrategy.discount(cost);
        }
        return 0;
    }

}
