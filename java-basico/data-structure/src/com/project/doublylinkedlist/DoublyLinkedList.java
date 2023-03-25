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

    public void add(int index, T element) {
        DoubleKnot<T> auxKnot = getKnot(index);
        DoubleKnot<T> newKnot = new DoubleKnot<>(element);
        newKnot.setNextKnot(auxKnot);

        if(newKnot.getNextKnot() != null) {
            newKnot.setPreviousKnot(auxKnot.getPreviousKnot());
            newKnot.getNextKnot().setPreviousKnot(newKnot);
        } else {
            newKnot.setPreviousKnot(lastKnot);
            lastKnot = newKnot;
        }

        if(index == 0) {
            firstKnot = newKnot;
        } else {
            newKnot.getPreviousKnot().setPreviousKnot(newKnot);
        }
        listSize++;
    }

    public void remove(int index) {
        if(index == 0) {
            firstKnot = firstKnot.getNextKnot();
            if (firstKnot != null) {
                firstKnot.setPreviousKnot(null);
            }
        } else {
            DoubleKnot<T> auxKnot = getKnot(index);
            auxKnot.getPreviousKnot().setNextKnot(auxKnot.getNextKnot());
            if (auxKnot != lastKnot) {
                auxKnot.getNextKnot().setPreviousKnot(auxKnot.getPreviousKnot());
            } else {
                lastKnot = auxKnot;
            }
        }
        this.listSize--;
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

    @Override
    public String toString() {
        String strReturn = "";

        DoubleKnot<T> auxKnot = firstKnot;
        for (int i = 0; i < size(); i++) {
            strReturn += "[Knot{content=" + auxKnot.getContent() + "}]--->";
            auxKnot = auxKnot.getNextKnot();
        }
        strReturn += "null";
        return strReturn;
    }
}
