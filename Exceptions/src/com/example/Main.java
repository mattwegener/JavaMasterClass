package com.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        int x = 98;
//        int y=  0;
//        System.out.println(divideLBYL(x,y));
//        System.out.println(divideEAFP(x,y));
//        System.out.println(divide(x,y));

        int x = getIntLBYL();
        System.out.println(x);
    }

    private static int getInt(){
        Scanner s = new Scanner(System.in);
        return s.nextInt();
    }

    private static int getIntLBYL(){
        Scanner s = new Scanner(System.in);
        boolean isValid = true;
        String in = s.next();
        for(int i = 0; i<in.length();i++){
            if(!Character.isDigit(in.charAt(i))){
                isValid = false;
                break;
            }
        }
        if(isValid) {
            return Integer.parseInt(in);
        }
        return 0;
    }

    private static int getIntEAFP(){
        Scanner s = new Scanner(System.in);
        try{
            return s.nextInt();
        }
       catch(InputMismatchException e){
            return 0;
       }
    }

    private static int divideLBYL(int x, int y){
        if(y !=0 ){
            return x/y;
        }
        else {
            return 0;
        }
    }

    private static int divideEAFP(int x, int y){
        try{
            return x/y;
        }
        catch (ArithmeticException e){
            return 0;
        }
    }
    private static int divide(int x, int y){
        return x/y;
    }
}
