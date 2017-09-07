package com.Tristan;

public class Main {

    public static void main(String[] args) {

    int switchValue = 4;

    switch(switchValue) {
        case 1:
            System.out.println("Value was 1");
            break;
        case 2:
            System.out.println("Value was 2");
            break;
        case 3: case 4: case 5:
            System.out.println("Value was 3, 4 or 5");
            break;
        default:
            System.out.println("antyhing else");
            break;
    }

    char switchChar = 'd';

    switch(switchChar) {
        case 'a':
            System.out.println("a");
            break;
        case 'b':
            System.out.println('b');
            break;
        case 'c':
            System.out.println('c');
            break;
        case 'd':
            System.out.println('d');
            break;
        default:
            System.out.println("default!!!!!");
            break;
    }

    String month = "January";

    switch(month.toLowerCase()) {
        case "january":
            System.out.println("Jan");
            break;
        case "february":
            System.out.println("Feb");
            break;
        default:
            System.out.println("DEFAULT!!!!");
    }

    }
}
