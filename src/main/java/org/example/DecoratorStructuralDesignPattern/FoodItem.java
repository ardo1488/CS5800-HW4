package org.example.DecoratorStructuralDesignPattern;

interface FoodItem {

    double getPrice();
    String getDescription();
}

class Burger implements FoodItem {
    @Override
    public double getPrice() {
        return 5.00;
    }

    @Override
    public String getDescription() {
        return "\nBurger: $" + getPrice();
    }
}

class Fries implements FoodItem {
    @Override
    public double getPrice() {
        return 2.50;
    }

    @Override
    public String getDescription() {
        return "\nFries: $" + getPrice();
    }
}

class HotDog implements FoodItem {
    @Override
    public double getPrice() {
        return 3.00;
    }

    @Override
    public String getDescription() {
        return "\nHot Dog: $" + getPrice();
    }
}

class ChickenSandwich implements FoodItem {
    @Override
    public double getPrice() {
        return 5.00;
    }

    @Override
    public String getDescription() {
        return "\nChicken Sandwich: $" + getPrice();
    }
}

class ChickenStrips implements FoodItem {
    @Override
    public double getPrice() {
        return 4.00;
    }

    @Override
    public String getDescription() {
        return "\nChicken Strips: $" + getPrice();
    }
}



