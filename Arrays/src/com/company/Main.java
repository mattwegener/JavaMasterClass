package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();
    public static void main(String[] args) {
        /*array things
        System.out.println("Enter number of input ints: ");
        int count = scanner.nextInt();
        //scan in ints
        int[] myArray= getIntegers(count);

        //find min
        System.out.println("The min value is: " + findMin(myArray) +"\n");

        //sort array
        int[] sorted = sortArray(myArray);
        printArray(sorted);

        //reverse array
        reverse(sorted);
        printArray(sorted);
        */
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while(!quit){
            System.out.println("Enter your choice");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;

            }
        }
    }

    public static void printInstructions(){
        System.out.println("\nPress ");
        System.out.println("\t0 - Print Options");
        System.out.println("\t1 - Print List");
        System.out.println("\t2 - Add item");
        System.out.println("\t3 - Modify item");
        System.out.println("\t4 - Remove Item");
        System.out.println("\t5 - Search for item");
        System.out.println("\t6 - Quit");
    }

    public static void addItem(){
        System.out.print("Please enter grocery item");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem(){
        System.out.print("Enter Item number ");
        int itemPos = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Replacement: ");
        groceryList.modifyGroceryItem(itemPos-1, scanner.nextLine());
    }

    public static void removeItem(){
        System.out.print("Enter Item Number to Remove: ");
        int item = scanner.nextInt();
        scanner.nextLine();
        groceryList.removeGroceryItem(item-1);
    }

    public static void searchForItem(){
        System.out.print("Enter item to search for: ");
        String search = scanner.nextLine();
        if(groceryList.findItem(search) != null) System.out.println("Found " + search + " in our list");
        else System.out.println(search + " not in our shoppping list");
    }


    public static int[] getIntegers(int number) {
        System.out.printf("Enter " + number + " int vals \n");
        int[] vals = new int[number];

        for(int i = 0; i<vals.length ; i++){
            vals[i] = scanner.nextInt();
        }
        return vals;
    }

    public static void printArray(int[] myArray){
        System.out.println("Printing Array");
        for(int i = 0; i<myArray.length ; i++){
            System.out.println("Element "+ i + " = "+ myArray[i]);
        }
        System.out.println("");
    }

    public static int[] sortArray(int[] in){
        int[] sortedArray = Arrays.copyOf(in,in.length);

        int temp;
        boolean flag = true;

        while(flag){
            flag = false;
            for(int i = 0; i<(sortedArray.length - 1) ; i++){
                if(sortedArray[i]<sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }

        return sortedArray;
    }

    public static int findMin(int[] in){
        int min = Integer.MAX_VALUE;
        for(int i =0; i<in.length; i++){
            if(in[i]<min) min = in[i];
        }
        return min;
    }

    public static void reverse(int[] in){
        int temp;
        for(int i = 0; i<(in.length)/2;i++){
            temp = in[i];
            in[i] = in[in.length-1 -i];
            in[in.length-1 -i] = temp;
        }
    }
}
