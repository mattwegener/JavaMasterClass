package com.example;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {

    enum delta{
        Four,
        three;
    };
    void hello(){
        System.out.println("hello");
    }

    public static void main(String[] args) {
        Map<String,String> languages = new HashMap<>();
        languages.put("Java","High level, O-O, platform independent");
        languages.put("Python","Interrupted, O-O, dynamic semantics");
        languages.put("Algol","Algo lang");
        languages.put("BASIC","Beginner all purpose symbolic instruction code");
        languages.put("Lisp","Therein lies madness");

        System.out.println(languages.get("Java"));
        System.out.println("=============================================================");


        //languages.remove("Lisp");

        if(languages.remove("Algol","Algo lang")){
            System.out.println("Algo removed");
        } else {
            System.out.println("Algo not removed, K-V pair not found");
        }

        System.out.println(languages.replace("Lisp", "a functional programing language"));
        System.out.println(languages.replace("Scala","Will not be added"));

        for(String key: languages.keySet()){
            System.out.println(key + " : " + languages.get(key));
        }



    }
}
