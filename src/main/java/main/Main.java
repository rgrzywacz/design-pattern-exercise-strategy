package main;

import product.Product;
import product.ProductService;
import product.strategy.ChristmasDiscountStrategy;
import product.strategy.DiscountService;
import product.strategy.DiscountStrategyType;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("== RTV/AGD Store ==");
        Product productOne = new Product("Samsung TV 55",
                                         "Samsung TV with a screen size of 55 inches",
                                         2400.00);

        Product productTwo = new Product("Bosch Fridge",
                                         "No frost fridge",1400.00);

        Product productThree = new Product("Electrolux Washing Machine",
                                           "Very quiet washing machine",2200.0);

        Product productFour = new Product("Iron",
                                          "Easy to handle!",150.00);

        List<Product> products =
                Arrays.asList(productOne,productTwo,productThree,productFour);



        System.out.println("Christmas time ...");
        products.forEach(p->p.setDiscount(DiscountService.calculateDiscount(DiscountStrategyType.CHRISTMAS, p.getCost())));
        products.forEach(p->p.showProductInfo());


        System.out.println("\n\nNew Yer time ...");
        products.forEach(p->p.setDiscount(DiscountService.calculateDiscount(DiscountStrategyType.NEW_YEAR, p.getCost())));
        products.forEach(p->p.showProductInfo());


        System.out.println("\n\nEaster time ...");
        products.forEach(p->p.setDiscount(DiscountService.calculateDiscount(DiscountStrategyType.EASTER, p.getCost())));
        products.forEach(p->p.showProductInfo());

    }
}