package org.example.DecoratorStructuralDesignPattern;

public abstract class FoodItemDecorator implements FoodItem {
    protected FoodItem foodItem;

    public FoodItemDecorator(FoodItem foodItem) {
        this.foodItem = foodItem;
    }

    @Override
    public double getPrice() {
        return foodItem.getPrice();
    }

    @Override
    public String getDescription() {
        return foodItem.getDescription();
    }
}

class KetchupDecorator extends FoodItemDecorator {
    private final double price =  0.25;

    public KetchupDecorator(FoodItem foodItem) {
        super(foodItem);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + price;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "\nKetchup: $" + price;
    }
}

class CheeseDecorator extends FoodItemDecorator {
    private final double price =  0.75;

    public CheeseDecorator(FoodItem foodItem) {
        super(foodItem);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + price;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "\nCheese: $" + price;
    }
}
class OnionDecorator extends FoodItemDecorator {
    private final double price = 0.30;

    public OnionDecorator(FoodItem foodItem) {
        super(foodItem);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + price;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "\nOnion: $" + price;
    }
}

class LettuceDecorator extends FoodItemDecorator {
    private final double price = 0.40;

    public LettuceDecorator(FoodItem foodItem) {
        super(foodItem);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + price;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "\nLettuce: $" + price;
    }
}

class TomatoDecorator extends FoodItemDecorator {
    private final double price = 0.35;

    public TomatoDecorator(FoodItem foodItem) {
        super(foodItem);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + price;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "\nTomato: $" + price;
    }
}

class MayoDecorator extends FoodItemDecorator {
    private final double price = 0.20;

    public MayoDecorator(FoodItem foodItem) {
        super(foodItem);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + price;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "\nMayo: $" + price;
    }
}

class MustardDecorator extends FoodItemDecorator {
    private final double price = 0.20;

    public MustardDecorator(FoodItem foodItem) {
        super(foodItem);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + price;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "\nMustard: $" + price;
    }
}

class PicklesDecorator extends FoodItemDecorator {
    private final double price = 0.30;

    public PicklesDecorator(FoodItem foodItem) {
        super(foodItem);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + price;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "\nPickles: $" + price;
    }
}

class BaconDecorator extends FoodItemDecorator {
    private final double price = 1.00;

    public BaconDecorator(FoodItem foodItem) {
        super(foodItem);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + price;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "\nBacon: $" + price;
    }
}

class ChiliDecorator extends FoodItemDecorator {
    private final double price = 1.50;

    public ChiliDecorator(FoodItem foodItem) {
        super(foodItem);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + price;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "\nChili: $" + price;
    }
}