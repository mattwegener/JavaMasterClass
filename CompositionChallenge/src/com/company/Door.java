package com.company;

public class Door {
    private int height;
    private int width;

    public Door(int height, int width) {
        this.height = height;
        this.width = width;
    }

    private int area(){
        return height*width;
    }

    public void size(){
        System.out.println("The door is " + area() + " sq meters.");
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
}
