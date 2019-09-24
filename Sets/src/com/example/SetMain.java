package com.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetMain {
    public static void main(String[] args) {
        Set<Integer> squares = new HashSet<>();
        Set<Integer> cubes = new HashSet<>();

        for(int i=1 ; i <= 100; i++){
            squares.add(i*i);
            cubes.add(i*i*i);
        }
        Set<Integer> union = new HashSet<>(squares);
        union.addAll(cubes);
        System.out.println("Union contains " + union.size());

        Set<Integer> intersection = new HashSet<>(squares);
        intersection.retainAll(cubes);
        System.out.println("Intersection contains " + intersection.size());
        for(int i : intersection){
            System.out.println(i + " is square of " + Math.sqrt(i) + " and cube of " + Math.cbrt(i));
        }

        Set<String> words = new HashSet<>();
        String sentence = "one day in the year of the fox";
        String[] arrayWords = sentence.split(" ");
        words.addAll(Arrays.asList(arrayWords));

        for(String s : words){
            System.out.println(s);
        }

        Set<String> nature = new HashSet<>();
        Set<String> divine = new HashSet<>();
        String[] natureWords = {"all","nature", "is","but","art","unknown","to","thee"};
        nature.addAll(Arrays.asList(natureWords));
        String[] divineWords = {"to","err","is","human","to","forgive","divine"};
        divine.addAll(Arrays.asList(divineWords));
        System.out.println();

        System.out.println("nature - divine");
        Set<String> nTakeDivine = new HashSet<>(nature);
        nTakeDivine.removeAll(divine);
        printSet(nTakeDivine);
        System.out.println();

        System.out.println("divine - nature");
        Set<String> dTakeNature = new HashSet<>(divine);
        dTakeNature.removeAll(nature);
        printSet(dTakeNature);

        Set<String> allNatDiv = new HashSet<>(nature);
        allNatDiv.addAll(divine);

        Set<String> intNatDiv = new HashSet<>(nature);
        intNatDiv.retainAll(divine);

        System.out.println("Symetric difference");
        Set<String> symDiff = new HashSet<>(allNatDiv);
        allNatDiv.removeAll(intNatDiv);
        printSet(symDiff);

    }

    public static void printSet(Set<String> set){
        for(String s : set){
            System.out.println(s);
        }
        System.out.println();
    }
}
