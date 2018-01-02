package com.Tristan;

public class Main {

    public static void main(String[] args) {
        ITelephone tritsPhone;

        tritsPhone = new DeskPhone(123456);
        tritsPhone.powerOn();
        tritsPhone.callPhone(123456);
        tritsPhone.answer();

        System.out.println("     ");

        tritsPhone = new MobilePhone(987654);
        tritsPhone.powerOn();
        tritsPhone.callPhone(987654);
        tritsPhone.answer();
    }
}
