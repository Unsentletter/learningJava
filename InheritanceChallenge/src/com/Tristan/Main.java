package com.Tristan;

import com.sun.tools.javadoc.Start;

public class Main {

    public static void main(String[] args) {
        Outlander outlander = new Outlander(36);
        outlander.steer(45);
        outlander.accelerate(30);
        outlander.accelerate(20);
        outlander.accelerate(-42);

    }
}


//Start with a base class of a vehicle, then create a Car class that inherits from this base class.
//Finally, create another class, a specific type of Car that inherits from the Car class.
//You should be able to hand steering, changing gears, and moving (speed).
//You will want to decide where to put the appropriate state and behaviours (fields & methods).
//As mentioned above, changing gears, increading/decreasing speed should be included.
//For your specific type of vehicle you will want to add something specific for that type of car.