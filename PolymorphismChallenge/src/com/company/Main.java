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

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String startEngine() {
        return "Car -> Start engine";
    }

    public String accelerate() {
        return "Car -> Accelerate";
    }

    public String brake() {
        return "Car -> Brake!!!!";
    }
}

class BroomCar extends Car {
    public BroomCar(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " -> Start engine";
    }

    @Override
    public String accelerate() {
        return "BroomCar -> Accelerate";
    }

    @Override
    public String brake() {
        return "BroomCar -> Brake!!!!";
    }
}

class Car2 extends Car {
    public Car2(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Car2 -> Start engine";
    }

    @Override
    public String accelerate() {
        return "Car2 -> Accelerate";
    }

    @Override
    public String brake() {
        return "Car2 -> Brake!!!!";
    }
}

class Car3 extends Car {
    public Car3(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Car3 -> Start engine";
    }

    @Override
    public String accelerate() {
        return "Car3 -> Accelerate";
    }

    @Override
    public String brake() {
        return "Car3 -> Brake!!!!";
    }
}

public class Main {

    public static void main(String[] args) {
        Car car = new Car("CARRRY CAR", 6);
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        BroomCar broomCar = new BroomCar("another car", 4);
        System.out.println(broomCar.startEngine());
        System.out.println(broomCar.accelerate());
        System.out.println(broomCar.brake());

        Car2 car2 = new Car2("car2", 4);
        System.out.println(car2.startEngine());
        System.out.println(car2.accelerate());
        System.out.println(car2.brake());

        Car3 car3 = new Car3("car3", 4);
        System.out.println(car3.startEngine());
        System.out.println(car3.accelerate());
        System.out.println(car3.brake());
    }
}
