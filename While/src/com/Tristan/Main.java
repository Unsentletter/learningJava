package com.Tristan;

public class Main {

    public static void main(String[] args) {

        int count = 1;
        int even = 0;
//
//        while(count !=5) {
//            System.out.println("Count is: " + count);
//            count ++;
//        }
//
//        do {
//            System.out.println("Count value: " + count);
//            count++;
//        } while(count != 6);

        while(count != 100) {
            if(isEvenNumber(count)) {
                System.out.println(count);
                even++;
            }
            if(even == 5) {
                break;
            }
            count++;
        }

    }

    public static boolean isEvenNumber(int n) {
        if(n % 2 != 0) {
            return false;
        }

        return true;
    }
}
