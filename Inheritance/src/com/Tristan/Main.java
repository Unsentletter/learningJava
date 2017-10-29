package com.Tristan;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal("animal1", 1, 1, 5, 5);
        Dog dog = new Dog("Huskie", 8, 20, 2, 4, 1, 20, "Selfish");

        dog.eat();
//        dog.walk();
        dog.run();
    }
}
