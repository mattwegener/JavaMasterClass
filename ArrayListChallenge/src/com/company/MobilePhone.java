package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Contact> contactList = new ArrayList<Contact>();
    private static boolean quit;

    public MobilePhone() {
        this.quit = false;
    }

    private static void addContact(){
        System.out.println("Enter Contact Name:");
        String name = scanner.nextLine();
        int pos = contactPosition(name);
        if(pos < 0){
            System.out.println("Enter Contact Phone Number: ");
            String number = scanner.nextLine();
            contactList.add(new Contact(name,number));
            System.out.println("Added " + name + " to contact list");
        } else {
            System.out.println("Contact already exists");
        }
    }

    private static int contactPosition(String name){
        for(int i = 0; i < contactList.size();i++){
            System.out.println("Item name: " + contactList.get(i).getName()+", search name: " + name);

            if(contactList.get(i).getName().equals(name)){
                return i;
            }
        }
        return -1;
    }

    private static void printContacts(){
        System.out.println("Contacts list:");
        for(int i = 0; i<contactList.size();i++){
            System.out.println((i+1) + ". " + contactList.get(i).getName() + " " + contactList.get(i).getNumber());
        }
    }

    private static void removeContact(){
        System.out.println("Enter contact to remove:");
        String name = scanner.nextLine();
        int pos = contactPosition(name);

        if(pos >= 0){
            contactList.remove(pos);
            System.out.println(name + " has been removed from the contact list");
        }else{
            System.out.println("Contact doesn't exist");
        }
    }

    private static void updateContact(){
        System.out.println("Enter contact to modify:");
        String name = scanner.nextLine();
        int pos = contactPosition(name);
        if(pos >= 0){
            System.out.println("Enter new name:");
            String newName = scanner.nextLine();
            System.out.println("Enter new number:");
            String newNumber = scanner.nextLine();
            contactList.get(pos).setName(newName);
            contactList.get(pos).setNumber(newNumber);
        }else{
            System.out.println("Contact doesn't exist");
        }
    }

    private static void menu(){
        System.out.println("1. Print Contacts");
        System.out.println("2. Add Contact");
        System.out.println("3. Remove Contact");
        System.out.println("4. Modify Contact");
        System.out.println("5. Menu");
        System.out.println("6. Quit");
    }

    public static void os(){
        quit = false;
        menu();
        while(!quit){
            System.out.println("Enter Menu Item:");
            int item = scanner.nextInt();
            scanner.nextLine();
            switch (item){
                case 1:
                    printContacts();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    removeContact();
                    break;
                case 4:
                    updateContact();
                    break;
                case 5:
                    menu();
                    break;
                case 6:
                    quit = true;
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }

        }
    }
}
