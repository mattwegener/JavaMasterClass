package com.company;

public class Main {

    public static void main(String[] args) {
        /*
        Player player = new Player();
        player.name =" Matt";
        player.health = 20;
        player.weapon = "sword";

        int damage = 10;

        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());

        damage=11;

        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());
        */

        EnhancedPlayer player =new EnhancedPlayer("Matt","Sword",200);
        System.out.println("Remaining health = " + player.getHealth());
    }
}
