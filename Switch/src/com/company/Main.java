package com.company;

public class Main {

    public static void main(String[] args) {
        char test = 'A';

        switch (test) {
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
                System.out.println("found " + test);
                break;

            default:
                System.out.println(test + " is not a case");
        }
    }

}
