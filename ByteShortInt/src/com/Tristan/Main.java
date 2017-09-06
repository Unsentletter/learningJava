package com.Tristan;

public class Main {

    public static void main(String[] args) {

        // int has width of 32
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;
        int myIntTotal = (myMinValue/2);

        // byte has a width of 8
        byte minByteValue = -128;
        byte maxByteValue = 127;
        // Java converts expressions to ints
        byte myNewByteValue = (byte)(maxByteValue/2);

        // short has a width of 16
        short maxShort = 32_767;
        short minShort = -32_768;
        short totalShort = (short)(maxShort/2);

        // long needs an 'L' at the end of it
        // It has a width of 64
        long minLongValue = -9_223_372_036_854_775_808L;
        long maxLongValue = 9_223_372_036_854_775_807L;

        System.out.println("int = " + myIntTotal);
        System.out.println("byte = " + myNewByteValue);
        System.out.println("short = " + totalShort);

        byte newByte = 10;
        short newShort = 20;
        int newInt = 30;
        long newLong = 50000L + 10L * (newByte + newShort + newInt);

        System.out.println("testAnswer = " + newLong);

    }
}
