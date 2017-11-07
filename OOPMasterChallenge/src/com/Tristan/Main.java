package com.Tristan;

public class Main {

    public static void main(String[] args) {
	    Hamburger hamburger = new Hamburger("Basic", "sausage", 2.56, "Milk bun");
        double price = hamburger.itemizeHamburger();
//        hamburger.addHamburgerAddition1("Tomato", 0.3);
//        hamburger.addHamburgerAddition2("lettuce", 0.8);
//        hamburger.addHamburgerAddition3("Onion", 0.1);
//        hamburger.addHamburgerAddition4("sauce", 0.56);
//        System.out.println("Total burger price is $" + hamburger.itemizeHamburger());

        System.out.println("   ");

        HealthyBurger healthyBurger = new HealthyBurger("bacon", 5.89);
        healthyBurger.addHamburgerAddition1("egg", 500);
        healthyBurger.addHealthyAddition2("Pineapple", 20.98);
        System.out.println("Total burger price is $" + healthyBurger.itemizeHamburger());

        DeluxeBurger db = new DeluxeBurger();
        db.addHamburgerAddition1("something", 2);
        db.itemizeHamburger();


        System.out.println();
    }
}
