package com.company;

import java.util.LinkedList;

public class Enumeration {
   enum colours{
        red,
        yellow,
        blue;
    };

   private static LinkedList<String>;

    public static void colourSelector(colours input){
        switch (input){
            case red:
                System.out.println("RED input");
                break;
            case yellow:
                System.out.println("YELLOW input");
                break;
            case blue:
                System.out.println("BLUE input");
                break;
        }
    }
}

