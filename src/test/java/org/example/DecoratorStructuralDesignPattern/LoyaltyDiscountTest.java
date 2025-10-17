package org.example.DecoratorStructuralDesignPattern;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class LoyaltyDiscountTest {
    @Test
    void BigLoyaltyDiscountApplyDiscountTest() {
        LoyaltyDiscount loyaltyDiscount = new BigLoyaltyDiscount();
        assertEquals(80.0, loyaltyDiscount.applyDiscount(100.0));
    }

    @Test
    void BigLoyaltyDiscountGetDiscountTest() {
        assertEquals(20, new BigLoyaltyDiscount().getDiscount());
    }

    @Test
    void NoLoyaltyDiscountApplyDiscountTest() {
        LoyaltyDiscount loyaltyDiscount = new NoLoyaltyDiscount();
        assertEquals(100, loyaltyDiscount.applyDiscount(100));
    }

    @Test
    void NoLoyaltyDiscountGetDiscountTest() {
        assertEquals(0, new NoLoyaltyDiscount().getDiscount());
    }

    @Test
    void MediumLoyaltyDiscountApplyDiscountTest() {
        LoyaltyDiscount loyaltyDiscount = new MediumLoyaltyDiscount();
        assertEquals(90.0, loyaltyDiscount.applyDiscount(100.0));
    }

    @Test
    void MediumLoyaltyDiscountGetDiscountTest() {
        assertEquals(10, new MediumLoyaltyDiscount().getDiscount());
    }
}