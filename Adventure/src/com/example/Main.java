package com.example;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static Map<Integer,Location> locations = new HashMap<Integer, Location>();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> tempExit = new HashMap<String, Integer>();
        locations.put(0, new Location(0, "You are sitting in front of a computer learning Java",tempExit));

        tempExit = new HashMap<String, Integer>();
        tempExit.put("W",2);
        tempExit.put("E",3);
        tempExit.put("S",4);
        tempExit.put("N",5);
        locations.put(1, new Location(1, "You are standing at the end of a road before a small brick building",tempExit));

        tempExit = new HashMap<String, Integer>();
        tempExit.put("N",5);
        locations.put(2, new Location(2, "You are at the top of a hill",tempExit));

        tempExit = new HashMap<String, Integer>();
        tempExit.put("W",1);
        locations.put(3, new Location(3, "You are inside a building, a well house for a small spring",tempExit));

        tempExit = new HashMap<String, Integer>();
        tempExit.put("W",2);
        tempExit.put("N",1);
        locations.put(4, new Location(4, "You are in a valley beside a stream",tempExit));

        tempExit = new HashMap<String, Integer>();
        tempExit.put("W",2);
        tempExit.put("S",1);
        locations.put(5, new Location(5, "You are in the forest",tempExit));


        int loc = 1;
        while(true){
            System.out.println(locations.get(loc).getDescription());
            if(loc == 0){
                break;
            }

            Map<String,Integer> exits = locations.get(loc).getExits();
            System.out.print("Available exits are ");
            for(String exit: exits.keySet()){
                System.out.print(exit + ",");
            }
            System.out.println();

            String dir = dirProcess(scanner.nextLine().toUpperCase());

            if(exits.containsKey(dir)){
                loc = exits.get(dir);
            } else {
                System.out.println("You cannot go that direction");
            }
        }

    }

    public static String dirProcess(String input){
        if(input.equals("Q") || input.equals("W") || input.equals("E") || input.equals("S") || input.equals("N")){
            return input;
        }

        String[] parse = input.split(" ");
        for(String word : parse){
            if(word.toUpperCase().equals("QUIT") ||word.toUpperCase().equals("EAST") || word.toUpperCase().equals("NORTH") || word.toUpperCase().equals("SOUTH") || word.toUpperCase().equals("WEST")) {
                return word.toUpperCase().substring(0, 1);
            }
        }
        return "Z";
    }
}
