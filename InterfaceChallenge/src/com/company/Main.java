package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Player matt = new Player("Matt","Staff");
        System.out.println(matt);
        ArrayList saveFile = matt.save();
        System.out.println(saveFile.toString());
        Player player2 = new Player("def","nothing");
        System.out.println(player2);
        player2.load(saveFile);
        System.out.println(player2);
    }
}
