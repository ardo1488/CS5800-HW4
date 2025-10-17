package org.example.DecoratorStructuralDesignPattern;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class FoodItemTest {

    @Test
    void BurgerGetPriceTest() {
        FoodItem foodItem = new Burger();
        double price = foodItem.getPrice();
        assertEquals(5.0, price);
    }

    @Test
    void BurgerGetDescription() {
        FoodItem foodItem = new Burger();
        String description = foodItem.getDescription();
        assertEquals("\nBurger: $5.0", description);
    }

    @Test
    void FriesGetPriceTest() {
        FoodItem foodItem = new Fries();
        double price = foodItem.getPrice();
        assertEquals(2.5, price);
    }

    @Test
    void FriesGetDescription() {
        FoodItem foodItem = new Fries();
        String description = foodItem.getDescription();
        assertEquals("\nFries: $2.5", description);
    }

    @Test
    void HotDogGetPriceTest() {
        FoodItem foodItem = new HotDog();
        double price = foodItem.getPrice();
        assertEquals(3.0, price);
    }

    @Test
    void HotDogGetDescription() {
        FoodItem foodItem = new HotDog();
        String description = foodItem.getDescription();
        assertEquals("\nHot Dog: $3.0", description);
    }

    @Test
    void ChickenSandwichGetPriceTest() {
        FoodItem foodItem = new ChickenSandwich();
        double price = foodItem.getPrice();
        assertEquals(5.0, price);
    }

    @Test
    void ChickenSandwichGetDescription() {
        FoodItem foodItem = new ChickenSandwich();
        String description = foodItem.getDescription();
        assertEquals("\nChicken Sandwich: $5.0", description);
    }

    @Test
    void ChickenStripsGetPriceTest() {
        FoodItem foodItem = new ChickenStrips();
        double price = foodItem.getPrice();
        assertEquals(4.0, price);
    }

    @Test
    void ChickenStripsGetDescription() {
        FoodItem foodItem = new ChickenStrips();
        String description = foodItem.getDescription();
        assertEquals("\nChicken Strips: $4.0", description);
    }
}