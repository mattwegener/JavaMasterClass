package com.company;


public class Room {
    private int windows;
    private Door door;
    private Couch couch;

    public Room(int windows, Door door, Couch couch) {
        this.windows = windows;
        this.door = door;
        this.couch = couch;
    }

    public void roomDescription(){
        System.out.println("The room has " + windows + " window(s) with a door and a couch.");
        door.size();
        System.out.println("There are " + couch.getCushions() + " cushion(s) on the couch.");
    }

    public Couch getCouch() {
        return couch;
    }
}
