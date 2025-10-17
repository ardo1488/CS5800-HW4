package org.example.DecoratorStructuralDesignPattern;

import java.util.ArrayList;

public class CustomerOrder {
    private ArrayList<FoodItem> foodItems;
    private LoyaltyDiscount loyaltyDiscount;


    public CustomerOrder(LoyaltyDiscount loyalty) {
        this.foodItems = new ArrayList<>();
        this.loyaltyDiscount = loyalty;
    }

    public void addFoodItem(FoodItem item) {
        foodItems.add(item);
    }

    public double calculateTotal() {
        double total = 0.0;
        for (FoodItem item : foodItems) {
            total += item.getPrice();
        }
        return total;
    }


    public void printOrder() {
        for (FoodItem item : foodItems) {
            System.out.println(item.getDescription() + " : $" + item.getPrice());
        }
        double total = calculateTotal();
        System.out.printf("\nSubtotal: $%.2f%n", total);
        System.out.println("\nLoyalty Discount Applied: " + loyaltyDiscount.getDiscount() + "%");
        System.out.printf("\nTotal: $%.2f%n", loyaltyDiscount.applyDiscount(total));
    }
}
