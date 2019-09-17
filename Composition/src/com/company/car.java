package com.company;

public class car extends Vehicle {
    private int doors;
    private int engineSize;

    public car(String name, int doors, int engineSize) {
        super(name);
        this.doors = doors;
        this.engineSize = engineSize;
    }
}
