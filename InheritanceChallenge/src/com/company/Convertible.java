package com.company;

public class Convertible extends Car {
    private int maxGears;
    private int currentGear;
    private String model;
    private int speedMod = 30;

    public Convertible( String manufacturer, int maxGears, String model) {
        super(2, manufacturer, "manual", 4, 1, "Convertible", 2);
        this.maxGears = maxGears;
        this.currentGear = 0;
        this.model = model;
    }

    public void shiftUp(){
        if(currentGear < maxGears) currentGear++;
        else System.out.println("Already at max gear");
    }

    public void shiftDown(){
        if(currentGear > 0) currentGear--;
        else System.out.println("Car is not in gear");
    }

    public int calcSpeed(){
        return speedMod*currentGear;
    }

    @Override
    public void moving(int speed){
        super.moving(speed);
        if(speed != 0) System.out.println("Vrooom Vrooom");
    }

    public int getMaxGears() {
        return maxGears;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public String getModel() {
        return model;
    }
}
