package com.company;

public abstract class ListItem {
    protected ListItem prev;
    protected ListItem next;
    protected Object value;

    public ListItem(Object value) {
        this.prev = null;
        this.next = null;
        this.value = value;
    }

    abstract int compareTo(ListItem item);

    abstract ListItem getPrev();
    abstract ListItem setPrev(ListItem item);
    abstract ListItem getNext();
    abstract ListItem setNext(ListItem item);

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
