package org.example.DecoratorStructuralDesignPattern;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;



class CustomerOrderTest {

    @Test
    void addFoodItemTest() {
        LoyaltyDiscount loyaltyDiscount = new NoLoyaltyDiscount();
        CustomerOrder order = new CustomerOrder(loyaltyDiscount);

        FoodItem item = new Burger();
        order.addFoodItem(item);

        assertEquals(item.getPrice(), order.calculateTotal());
    }

    @Test
    void calculateTotalTest() {
        LoyaltyDiscount loyaltyDiscount = new NoLoyaltyDiscount();
        CustomerOrder order = new CustomerOrder(loyaltyDiscount);

        order.addFoodItem(new Burger());
        order.addFoodItem(new Fries());
        order.addFoodItem(new KetchupDecorator(new HotDog()));

        assertEquals((5.00 + 2.50 + 3.25), order.calculateTotal());
    }

    @Test
    void printOrderTest() {
        LoyaltyDiscount loyaltyDiscount = new MediumLoyaltyDiscount();
        CustomerOrder order = new CustomerOrder(loyaltyDiscount);


        FoodItem burgerWithCheese = new CheeseDecorator(new Burger());
        FoodItem fries = new Fries();
        order.addFoodItem(burgerWithCheese);
        order.addFoodItem(fries);

        double subtotal = 5.75 + 2.50;
        double expectedTotal = loyaltyDiscount.applyDiscount(subtotal);


        ByteArrayOutputStream console = new ByteArrayOutputStream();
        PrintStream original = System.out;
        System.setOut(new PrintStream(console));

        try {
            order.printOrder();
        } finally {
            System.setOut(original);
        }

        String out = console.toString();


        assertTrue(out.contains("Burger: $5.0"));
        assertTrue(out.contains("Cheese: $0.75"));
        assertTrue(out.contains("Fries: $2.5"));


        assertTrue(out.contains(String.format("Subtotal: $%.2f", subtotal)));


        assertTrue(out.contains("Loyalty Discount Applied: 10%"));
        assertTrue(out.contains(String.format("Total: $%.2f", expectedTotal)));
    }
}
