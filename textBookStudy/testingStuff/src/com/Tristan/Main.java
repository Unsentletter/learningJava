package com.Tristan;

public class Main {

    int noOfWatts;
    boolean indicator;
    String location;

    public Main(int noOfWatts, boolean indicator, String site) {
        String Location;

        this.noOfWatts = noOfWatts;
        this.indicator = indicator;
        location = site;
        this.superfluous();
        superfluous();
    }

    public void superfluous() {
        System.out.printf("Current Object: %s%n", this);
    }

    public static void main(String[] args) {
        Main main = new Main(100, true, "loft");
        System.out.println("No. of watts: " + main.noOfWatts);
        System.out.println("Indicator: " + main.indicator);
        System.out.println("Location: " + main.location);
    }
}
