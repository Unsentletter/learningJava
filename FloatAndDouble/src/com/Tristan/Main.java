package com.Tristan;

public class Main {

    public static void main(String[] args) {

        // width of int = 32 (4 bytes)
        int myIntValue = 5 / 2;
        // width of float = 32 (4 bytes)
        float myFloatValue = 5f / 2f;
        // width of double = 64 (8 bytes)
        double myDoubleValue = 5d / 2d;

        // float has 7 decimal points
        // double has 16 decimal points

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        double pounds = 200d;
        double conversion = 0.45359237d;
        double kilograms = pounds * conversion;

        System.out.println("Kilograms: " + kilograms);

    }
}
