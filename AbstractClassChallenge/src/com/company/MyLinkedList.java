package com.company;

import java.util.List;

public class MyLinkedList implements NodeList {
    private ListItem root = null;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if(root == null){
            this.root = newItem;
            return true;
        }
        ListItem currentItem = this.root;
        while(currentItem != null){
            int comp = currentItem.compareTo(newItem);

            //greater than current item
            if(comp < 0){
                //not end of the list
                if(currentItem.getNext() != null){
                    currentItem = currentItem.getNext();
                } else { //at end of list
                    currentItem.setNext(newItem);
                    newItem.setPrev(currentItem);
                    return true;
                }
            } else if(comp > 0){
                if(currentItem.getPrev() != null){//check to see if not at start
                    currentItem.getPrev().setNext(newItem);
                    newItem.setPrev(currentItem.getPrev());
                    newItem.setNext(currentItem);
                    currentItem.setPrev(newItem);
                } else { //at start of list

                    newItem.setNext(this.root);
                    this.root.setPrev(newItem);
                    this.root = newItem;
                }
                return false;
            }
            else{
                System.out.println(newItem.getValue() + " already in the list");
                return false;
            }
        }
        return false;
    }


    @Override
    public boolean removeItem(ListItem item) {
        if(item != null){
            System.out.println("Deleting " + item.getValue());
        }

        for(ListItem iter = this.root; iter != null; iter = iter.getNext()){
            int comp = iter.compareTo(item);
            if(comp == 0) {
                if(iter == this.root){
                    this.root = iter.getNext();
                }else{
                    iter.getPrev().setNext(iter.getNext());
                    if(iter.getNext() != null){
                        iter.getNext().setPrev(iter.getPrev());
                    }
                }
                return true;
            } else if ( comp > 0){
                return false;
            }
        }

        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if(root == null) System.out.println("list is empty");
        else{
            for(ListItem iter = root; iter !=null; iter = iter.getNext()){
                System.out.println(iter.getValue());
            }
        }
            }
}
