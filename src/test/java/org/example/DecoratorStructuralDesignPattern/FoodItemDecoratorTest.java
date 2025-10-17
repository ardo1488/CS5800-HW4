package org.example.DecoratorStructuralDesignPattern;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class FoodItemDecoratorTest {

    @Test
    void KetchupDecoratorGetPriceTest(){
        FoodItem foodItem = new KetchupDecorator(new Burger());
        assertEquals(5.25, foodItem.getPrice());
    }

    @Test
    void KetchupDecoratorGetDescriptionTest(){
        FoodItem foodItem = new KetchupDecorator(new Burger());
        assertEquals("\nBurger: $5.0\nKetchup: $0.25", foodItem.getDescription());
    }

    @Test
    void CheeseDecoratorGetPriceTest(){
        FoodItem foodItem = new CheeseDecorator(new Burger());
        assertEquals(5.75, foodItem.getPrice());
    }

    @Test
    void CheeseDecoratorGetDescriptionTest(){
        FoodItem foodItem = new CheeseDecorator(new Burger());
        assertEquals("\nBurger: $5.0\nCheese: $0.75", foodItem.getDescription());
    }

    @Test
    void OnionDecoratorGetPriceTest(){
        FoodItem foodItem = new CheeseDecorator(new Burger());
        assertEquals(5.75, foodItem.getPrice());
    }

    @Test
    void OnionDecoratorGetDescriptionTest(){
        FoodItem foodItem = new OnionDecorator(new Burger());
        assertEquals("\nBurger: $5.0\nOnion: $0.3", foodItem.getDescription());
    }

    @Test
    void LettuceDecoratorGetPriceTest(){
        FoodItem foodItem = new LettuceDecorator(new Burger());
        assertEquals(5.4, foodItem.getPrice());
    }

    @Test
    void LettuceDecoratorGetDescriptionTest(){
        FoodItem foodItem = new LettuceDecorator(new Burger());
        assertEquals("\nBurger: $5.0\nLettuce: $0.4", foodItem.getDescription());
    }

    @Test
    void TomatoDecoratorGetPriceTest(){
        FoodItem foodItem = new TomatoDecorator(new Burger());
        assertEquals(5.35, foodItem.getPrice());
    }

    @Test
    void TomatoDecoratorGetDescriptionTest(){
        FoodItem foodItem = new TomatoDecorator(new Burger());
        assertEquals("\nBurger: $5.0\nTomato: $0.35", foodItem.getDescription());
    }

    @Test
    void MayoDecoratorGetPriceTest(){
        FoodItem foodItem = new MayoDecorator(new Burger());
        assertEquals(5.2, foodItem.getPrice());
    }

    @Test
    void MayoDecoratorGetDescriptionTest(){
        FoodItem foodItem = new MayoDecorator(new Burger());
        assertEquals("\nBurger: $5.0\nMayo: $0.2", foodItem.getDescription());
    }

    @Test
    void MustardDecoratorGetPriceTest(){
        FoodItem foodItem = new MustardDecorator(new Burger());
        assertEquals(5.2, foodItem.getPrice());
    }

    @Test
    void MustardDecoratorGetDescriptionTest(){
        FoodItem foodItem = new MustardDecorator(new Burger());
        assertEquals("\nBurger: $5.0\nMustard: $0.2", foodItem.getDescription());
    }

    @Test
    void PicklesDecoratorGetPriceTest(){
        FoodItem foodItem = new PicklesDecorator(new Burger());
        assertEquals(5.3, foodItem.getPrice());
    }

    @Test
    void PicklesDecoratorGetDescriptionTest(){
        FoodItem foodItem = new PicklesDecorator(new Burger());
        assertEquals("\nBurger: $5.0\nPickles: $0.3", foodItem.getDescription());
    }

    @Test
    void BaconDecoratorGetPriceTest(){
        FoodItem foodItem = new BaconDecorator(new Burger());
        assertEquals(6.0, foodItem.getPrice());
    }

    @Test
    void BaconDecoratorGetDescriptionTest(){
        FoodItem foodItem = new BaconDecorator(new Burger());
        assertEquals("\nBurger: $5.0\nBacon: $1.0", foodItem.getDescription());
    }

    @Test
    void ChiliDecoratorGetPriceTest(){
        FoodItem foodItem = new ChiliDecorator(new Burger());
        assertEquals(6.5, foodItem.getPrice());
    }

    @Test
    void ChiliDecoratorGetDescriptionTest(){
        FoodItem foodItem = new ChiliDecorator(new Burger());
        assertEquals("\nBurger: $5.0\nChili: $1.5", foodItem.getDescription());
    }
}