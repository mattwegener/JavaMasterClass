package com.company;

public class Node extends ListItem {
    public Node(Object value) {
        super(value);
    }

    @Override
    int compareTo(ListItem item) {
        if(item != null){
            return ((String)super.getValue()).compareTo((String)item.getValue());
        } else return -1;
    }

    @Override
    ListItem getPrev() {
        return this.prev;
    }

    @Override
    ListItem setPrev(ListItem item) {
        return (this.prev = item);
    }

    @Override
    ListItem getNext() {
        return this.next;
    }

    @Override
    ListItem setNext(ListItem item) {
        return (this.next = item);
    }

}
