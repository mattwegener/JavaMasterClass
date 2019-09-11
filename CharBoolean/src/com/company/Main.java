package com.company;

public class Main {

    public static void main(String[] args) {
        char myChar = 'D';
        /* \ u needed to use unicode characters*/
        char myUnicode ='\u0044';
        System.out.println(myChar);
        System.out.println(myUnicode);
        char myCopyright = '\u00A9';
        System.out.println(myCopyright);

        boolean myTrue = true;
        boolean myFalse = false;
        boolean is21 = true;

        String arr = "Grrr";
        System.out.println(arr.charAt(3));
    }
}
