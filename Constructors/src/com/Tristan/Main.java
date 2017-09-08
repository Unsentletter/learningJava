package com.Tristan;

public class Main {

    public static void main(String[] args) {
        Account tritAccount = new Account("12345", 0.00, "Tritan", "mail@email.com", "0421961525");

        System.out.println(tritAccount.getCustomerName());
        tritAccount.deposit(100.0);
        tritAccount.withdrawal(20);

        Account newAccount = new Account("new", "email", "wewe");
        System.out.println(newAccount.getNumber() + " " + newAccount.getCustomerName());

        VipCustomer importantTrit = new VipCustomer();
        System.out.println("importantTrit " + importantTrit.getName());
        System.out.println("importantTrit " + importantTrit.getEmail());
        System.out.println("importantTrit " + importantTrit.getCreditLimit());

        VipCustomer sortOfTrit = new VipCustomer("SimonSays", 555.0, "emailllll");
        System.out.println("sortOfTrit " + sortOfTrit.getName());
        System.out.println("sortOfTrit " + sortOfTrit.getEmail());
        System.out.println("sortOfTrit " + sortOfTrit.getCreditLimit());

        VipCustomer defaultTrit = new VipCustomer("trit", 5000.00);
        System.out.println("Default Trit " + defaultTrit.getName());
        System.out.println("Default Trit " + defaultTrit.getCreditLimit());
        System.out.println("Default Trit " + defaultTrit.getEmail());
    }

}
