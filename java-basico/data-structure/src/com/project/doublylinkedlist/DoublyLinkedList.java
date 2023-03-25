package com.project.doublylinkedlist;

public class DoublyLinkedList<T> {

    private DoubleKnot<T> firstKnot;
    private DoubleKnot<T> lastKnot;

    private int listSize = 0;

    public DoublyLinkedList() {
        this.listSize = 0;
        this.firstKnot = null;
        this.lastKnot = null;
    }

    public T get(int index) {
        return this.getKnot(index).getContent();
    }

    public void add(T element) {
        DoubleKnot<T> newKnot = new DoubleKnot<>(element);
        newKnot.setNextKnot(null);
        newKnot.setPreviousKnot(lastKnot);
        if(firstKnot == null) {
            firstKnot = newKnot;
        }
        if (lastKnot != null) {
            lastKnot.setNextKnot(newKnot);
        }
        lastKnot = newKnot;
        listSize++;
    }
    
    private DoubleKnot<T> getKnot(int index) {
        DoubleKnot<T> auxKnot = firstKnot;

        for (int i = 0; (i < index) && (auxKnot != null); i++) {
            auxKnot = auxKnot.getNextKnot();
        }
        return auxKnot;
    }

    public int size() {
        return this.listSize;
    }

}
