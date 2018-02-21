package com.christodd;

public class DeluxeHamburger extends Hamburger {
    public DeluxeHamburger(String bread) {
        super(bread);
    }

    public void priceOfBurger() {
        super.price = 4.00 + (addItemsPrice + 1);
        System.out.println("Your burger contains a " + super.bread + " roll with these toppings: "
                + addItemsNames + "\nThe price of the additional items is $" + (addItemsPrice + 1) + " and " +
                "the grand total for the hamburger with fries and a drink is: $" + super.price);
    }
}
