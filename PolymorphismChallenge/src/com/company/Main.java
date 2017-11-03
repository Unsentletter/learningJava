package com.company;

class Car {
    private String name;
    private int cylinders;
    private int wheels;
    private boolean engine;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.engine = true;
    }

    public 

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public boolean isEngine() {
        return engine;
    }
}

class BroomCar extends Car {
    public BroomCar() {
        super("BroomCar", 3);
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}
