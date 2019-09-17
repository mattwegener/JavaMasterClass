package com.company;

public class Player {
    public String fullName;
    public String weapon;
    public int health;

    public void loseHealth(int damage){
        this.health -= damage;
        if(this.health <= 0){
            System.out.println("Player knocked out");
            //lose life
        }
    }

    public int healthRemaining(){
        return this.health;
    }

}
