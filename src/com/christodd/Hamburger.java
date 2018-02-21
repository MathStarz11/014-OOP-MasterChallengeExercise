package com.christodd;

import java.text.DecimalFormat;

public class Hamburger {
    protected String bread;
    private boolean meat;
    protected String addItemsNames;
    protected int addItems;
    protected double addItemsPrice;
    protected double price;


    public Hamburger(String bread) {
        this.bread = bread;
        this.meat = true;
        this.price = 0.00;
        this.addItems = 0;
        this.addItemsPrice = 0.00;
        this.addItemsNames = "";
    }

    public String addAdditionalItem(String addition) {
        if(addItems < 4) {
            addItems++;
            addItemsPrice += 0.50;
            this.addItemsNames = this.addItemsNames + " " + addition;
        } else {
            System.out.println("Additional items reached");
        }

        return this.addItemsNames;
    }

    public void priceOfBurger() {
        price = 4.00 + addItemsPrice;
        System.out.println("Your burger contains a " + bread + " roll with these toppings: "
        + addItemsNames + "\nThe price of the additional items is $" + addItemsPrice + " and " +
                "the grand total for the hamburger is: $" + price);
    }

    public String getBread() {
        return bread;
    }

    public int getAddItems() {
        return addItems;
    }

    public double getAddItemsPrice() {
        return addItemsPrice;
    }

    public double getPrice() {
        return price;
    }

}
