package com.Tristan;

public class Main {

    public static void main(String[] args) {
	    Bank bank = new Bank("CBA");

	    bank.addBranch("Sydney");

	    bank.addCustomer("Sydney", "Trit", 100.00);
	    bank.addCustomer("Sydney", "Dave Madman", 50.05);
	    bank.addCustomer("Sydney", "Dave Madman", 0.05);

	    bank.addBranch("Manly");

	    bank.addCustomer("Manly", "Daves Brother", 155.50);
        bank.addCustomer("Manly", "Daves Madman", 15.50);
        bank.addCustomer("Manly", "Daves Brother", 15.00);

        bank.listCustomers("Sydney", true);
        bank.listCustomers("Manly", true);

        if(!bank.addCustomer("Melbourne", "Brian", 5.53)) {
			System.out.println("Error. Melbourne branch does not exist");
		}
    }
}
