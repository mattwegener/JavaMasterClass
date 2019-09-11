package com.company;

public class Main {

    public static void main(String[] args) {

        int myValue = 1000;

        int myMinInt = Integer.MIN_VALUE;
        int myMaxInt = Integer.MAX_VALUE;
        System.out.println("Int Min Val = " + myMinInt);
        System.out.println("Int Max Val = " + myMaxInt);
        System.out.println("Busted Max Val = " + (myMaxInt + 1)); //Overflows
        System.out.println("Busted Min Val = " + (myMinInt - 1)); //Underflows

        int myMaxIntTest = 2_147_483_647;

        byte myMinByte = Byte.MIN_VALUE;
        byte myMaxByte = Byte.MAX_VALUE;
        System.out.println("Byte Min Val = " + myMinByte);
        System.out.println("Byte Max Val = " + myMaxByte);

        short myMinShort = Short.MIN_VALUE;
        short myMaxShort = Short.MAX_VALUE;
        System.out.println("Short Min Val = " + myMinShort);
        System.out.println("Short Max Val = " + myMaxShort);

        long myLongValue = 100L;

        long myMinLong = Long.MIN_VALUE;
        long myMaxLong = Long.MAX_VALUE;
        System.out.println("Long Min Val = " + myMinLong);
        System.out.println("Long Max Val = " + myMaxLong);
        long bigLongLit = 2_147_483_647_234L;
        System.out.println(bigLongLit);

        short bigShortLit = 32767;
        int myTotal = (myMinInt / 2);
        byte myNewByte = (byte)(myMinByte / 2);
        short myNewShort = (short)(myMinShort / 2);

        //Challenge video 27
        byte cByte = 10;
        short cShort = 20;
        int cInt = 50;
        long total = (50000L + 10L*(cByte + cInt + cShort));
        System.out.println(total);

    }
}
