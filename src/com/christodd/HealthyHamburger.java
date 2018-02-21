package com.christodd;

public class HealthyHamburger extends Hamburger {
    public HealthyHamburger() {
        super("Brown Rye");
    }

    public String addAdditionalItem(String addition) {
        if(addItems < 6) {
            addItems++;
            addItemsPrice += 0.50;
            this.addItemsNames = this.addItemsNames + " " + addition;
        } else {
            System.out.println("Additional items reached");
        }

        return this.addItemsNames;
    }
}
