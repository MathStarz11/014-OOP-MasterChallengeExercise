package com.christodd;

public class Main {

    public static void main(String[] args) {
		Hamburger burger = new Hamburger("white");
		burger.addAdditionalItem("tomatoes");
		burger.addAdditionalItem("lettuce");
		burger.addAdditionalItem("onion");
		burger.priceOfBurger();

		HealthyHamburger healthBurger = new HealthyHamburger();
		healthBurger.addAdditionalItem("tomatoes");
		healthBurger.addAdditionalItem("lettuce");
		healthBurger.addAdditionalItem("onion");
		healthBurger.addAdditionalItem("carrot");
		healthBurger.addAdditionalItem("salsa");
		healthBurger.priceOfBurger();

		DeluxeHamburger dburger = new DeluxeHamburger("white");
		dburger.addAdditionalItem("tomatoes");
		dburger.addAdditionalItem("lettuce");
		dburger.addAdditionalItem("onion");
		dburger.priceOfBurger();

	}
}
