package com.company;

public class Main {

    public static void main(String[] args) {
        Room den = new Room(2,new Door(3,1),new Couch(3,5));

        den.roomDescription();
        System.out.println("The couch is " + den.getCouch().getWidth() + "m wide");
    }
}
