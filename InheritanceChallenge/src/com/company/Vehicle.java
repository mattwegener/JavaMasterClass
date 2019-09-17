package com.company;

public class Vehicle {
    private int wheels;
    private int doors;
    private int engine;
    private int lights;

    public Vehicle(int wheels, int doors, int engine, int lights) {
        this.wheels = wheels;
        this.doors = doors;
        this.engine = engine;
        this.lights = lights;
    }

    public void moving(int speed){
        System.out.println("Vehicle is traveling " + speed);
    }

    public int getEngine() {
        return engine;
    }

    public int getLights() {
        return lights;
    }

    public int getWheels() {
        return wheels;
    }

    public int getDoors() {
        return doors;
    }


}
