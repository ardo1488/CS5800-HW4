package org.example.DecoratorStructuralDesignPattern;

public class Driver {
    public static void main(String[] args) {

        LoyaltyDiscount loyaltyDiscount1 = new MediumLoyaltyDiscount();
        CustomerOrder order1 = new CustomerOrder(loyaltyDiscount1);

        order1.addFoodItem(new KetchupDecorator(new CheeseDecorator(new Burger())));
        order1.addFoodItem(new MustardDecorator(new ChiliDecorator(new PicklesDecorator(new HotDog()))));


        order1.printOrder();

        LoyaltyDiscount loyaltyDiscount2 = new BigLoyaltyDiscount();
        CustomerOrder order2 = new CustomerOrder(loyaltyDiscount2);

        order2.addFoodItem(new BaconDecorator(new MayoDecorator(new ChickenSandwich())));
        order2.addFoodItem(new ChiliDecorator(new Fries()));
        order2.addFoodItem(new TomatoDecorator(new OnionDecorator(new LettuceDecorator(new MayoDecorator(new Burger())))));

        order2.printOrder();

        LoyaltyDiscount loyaltyDiscount3 = new NoLoyaltyDiscount();
        CustomerOrder order3 = new CustomerOrder(loyaltyDiscount3);

        order3.addFoodItem(new KetchupDecorator(new ChickenStrips()));
        order3.addFoodItem(new KetchupDecorator(new Fries()));

        order3.printOrder();
    }
}
