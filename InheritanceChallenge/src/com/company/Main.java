package com.company;

public class Main {

    public static void main(String[] args) {
        Convertible myCar = new Convertible("Mercedes",5,"300SL");

        myCar.moving(myCar.calcSpeed());
        myCar.shiftUp();
        myCar.shiftUp();
        System.out.println("Current Gear is " + myCar.getCurrentGear());
        myCar.moving(myCar.calcSpeed());
    }
}
