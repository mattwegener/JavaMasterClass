package com.company;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();
    private int[] myNumbers;

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " itmes in your grocery list");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + ". " + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(String newItem) {
        int pos = findItem(newItem);
        if (pos >= 0) {
            modifyGroceryItem(pos, newItem);
        }
    }

    public int findItem (String searchItem){
        return groceryList.indexOf(searchItem);

    }

    private void modifyGroceryItem(int pos, String newItem) {
        groceryList.set(pos, newItem);
        System.out.println("Groc Item " + (pos + 1) + " has been modified");
    }

    public void removeGroceryItem(String newItem) {
        int pos = findItem(newItem);
        if (pos >= 0) {
            removeGroceryItem(pos);
        }
    }

    private void removeGroceryItem ( int pos){
        String theItem = groceryList.get(pos);
        groceryList.remove(pos);
        System.out.println(theItem + " has been removed");
    }
}
