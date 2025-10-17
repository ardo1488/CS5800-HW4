package org.example.DecoratorStructuralDesignPattern;

public abstract class LoyaltyDiscount {

    double applyDiscount(double price) {
        return price;
    }

    int getDiscount() {
        return 0;
    }

}

class BigLoyaltyDiscount extends LoyaltyDiscount {
    @Override
    double applyDiscount(double price) {
        return price * 0.8;
    }

    @Override
    int getDiscount() {
        return 20;
    }
}

class NoLoyaltyDiscount extends LoyaltyDiscount {
    @Override
    double applyDiscount(double price) {
        return price;
    }

    @Override
    int getDiscount() {
        return 0;
    }
}

class MediumLoyaltyDiscount extends LoyaltyDiscount {
    @Override
    double applyDiscount(double price) {
        return price * 0.9;
    }

    @Override
    int getDiscount() {
        return 10;
    }
}
