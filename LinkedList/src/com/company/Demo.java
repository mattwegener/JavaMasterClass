package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();
        addInOrder(placesToVisit,"Sydney");addInOrder(placesToVisit,"Melbourne");
        addInOrder(placesToVisit,"Brisbane");addInOrder(placesToVisit,"Perth");
        addInOrder(placesToVisit,"Canberra");addInOrder(placesToVisit,"Adelaide");
        addInOrder(placesToVisit,"Darwin");
        printList(placesToVisit);

        addInOrder(placesToVisit,"Alice Springs");
        addInOrder(placesToVisit,"Darwin");
        printList(placesToVisit);
        /*
        placesToVisit.add("Sydney");placesToVisit.add("Melbourne");
        placesToVisit.add("Brisbane");placesToVisit.add("Perth");
        placesToVisit.add("Canberra");placesToVisit.add("Adelaide");
        placesToVisit.add("Darwin");
        printList(placesToVisit);
        placesToVisit.add(1,"Alice Springs");
        printList(placesToVisit);
        placesToVisit.remove(4);
        printList(placesToVisit);
        */

    }

    private static void printList(LinkedList<String> linkedList){
        Iterator<String> i = linkedList.iterator();
        while(i.hasNext()){
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("=============================\n");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity){
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while (stringListIterator.hasNext()){
            int comp = stringListIterator.next().compareTo(newCity);
            if(comp == 0){
                //do not add
                System.out.println(newCity + " Is already a destination");
                return false;
            } else if (comp > 0){
                //new city should be before this one
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            } else if(comp < 0){
                //move onto next city
            }
        }
        stringListIterator.add(newCity);
        return true;
    }


}
