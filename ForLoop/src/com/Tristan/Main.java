package com.Tristan;

public class Main {

    public static void main(String[] args) {
//        System.out.println(("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0)));
//
//        for(int i=2; i < 9; i++) {
//            System.out.println("interest at " + i + "% = " + String.format("%.2f",calculateInterest(10000.0, i)));
//        }
//
//        System.out.println("*************************");
//
//        for(int i=8; i >= 2; i--) {
//            System.out.println("interest at " + i + "% = " + String.format("%.2f",calculateInterest(10000.0, i)));
//        }

        int primeCount = 0;

        for(int i=5000; i < 10000; i++) {

            if(isPrime(i)) {
                primeCount++;
                System.out.println(i);
                if(primeCount == 3) {
                    System.out.println("exiting loop");
                    break;
                }
            }

        }
    }

    public static boolean isPrime(int n) {
         if(n == 1) {
             return false;
         }

         for(int i=2; i <= n/2; i++) {
             if(n % i == 0) {
                 return false;
             }
         }

         return true;
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}
