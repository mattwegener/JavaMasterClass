package com.company;

public class EnhancedPlayer {
    private String name;
    private String weapon;
    private int hitPoints = 100;

    public EnhancedPlayer(String name, String weapon, int health) {
        this.name = name;
        this.weapon = weapon;
        if(health > 0 && health <=100) {
            this.hitPoints = health;
        }
    }

    public void loseHealth(int damage){
        this.hitPoints -= damage;
        if(this.hitPoints <= 0){
            System.out.println("Player knocked out");
            //lose life
        }
    }

    public int getHealth() {
        return hitPoints;
    }
}
