package com.Tristan;

public class Hamburger {
    private String name;
    private String breadrollType;
    private String meat;
    private double price;

    private String additionalName1;
    private double additionalPrice1;

    private String additionalName2;
    private double additionalPrice2;

    private String additionalName3;
    private double additionalPrice3;

    private String additionalName4;
    private double additionalPrice4;


    public Hamburger(String name, String meat, double price, String breadrollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadrollType = breadrollType;
    }

    public void addHamburgerAddition1(String name, double price) {
        this.additionalName1 = name;
        this.additionalPrice1 = price;
    }

    public void addHamburgerAddition2(String name, double price) {
        this.additionalName2 = name;
        this.additionalPrice2 = price;
    }

    public void addHamburgerAddition3(String name, double price) {
        this.additionalName3 = name;
        this.additionalPrice3 = price;
    }

    public void addHamburgerAddition4(String name, double price) {
        this.additionalName4 = name;
        this.additionalPrice4 = price;
    }

    public double itemizeHamburger() {
        double hamburgerPrice = this.price;
        System.out.println(this.name + " hamburger on a " + this.breadrollType + " roll with " + this.meat + " is $" + this.price);

        if(this.additionalName1 != null) {
            hamburgerPrice += this.additionalPrice1;
            System.out.println("Added " + this.additionalName1 + " for an extra " + this.additionalPrice1);
        }

        if(this.additionalName2 != null) {
            hamburgerPrice += this.additionalPrice2;
            System.out.println("Added " + this.additionalName2 + " for an extra " + this.additionalPrice2);
        }

        if(this.additionalName3 != null) {
            hamburgerPrice += this.additionalPrice3;
            System.out.println("Added " + this.additionalName3 + " for an extra " + this.additionalPrice3);
        }

        if(this.additionalName4 != null) {
            hamburgerPrice += this.additionalPrice4;
            System.out.println("Added " + this.additionalName4 + " for an extra " + this.additionalPrice4);
        }

        return hamburgerPrice;
    }
}
