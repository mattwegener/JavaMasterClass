package com.company;

public class Car extends Vehicle {
    private String manufacturer;
    private String transmission;
    private int engineSize;
    private int steering;
    private String type;
    private int seats;

    public Car(int doors, String manufacturer, String transmission, int engineSize, int steering, String type, int seats) {
        super(4, doors, 1, 4);
        this.manufacturer = manufacturer;
        this.transmission = transmission;
        this.engineSize = engineSize;
        this.steering = steering;
        this.type = type;
        this.seats = seats;
    }

    @Override
    public void moving(int speed){
        System.out.println("The car is traveling " + speed + " kph");
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getTransmission() {
        return transmission;
    }

    public int getEngineSize() {
        return engineSize;
    }

    public int getSteering() {
        return steering;
    }

    public String getType() {
        return type;
    }

    public int getSeats() {
        return seats;
    }
}
