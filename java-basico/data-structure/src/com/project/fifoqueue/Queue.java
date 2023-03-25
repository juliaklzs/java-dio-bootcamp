package com.project.fifoqueue;

public class Queue<T> {
    private Knot<T> refKnotEntryQueue;

    public Queue() {
        this.refKnotEntryQueue = null;
    }

    public void enqueue(T object) {
        Knot newKnot = new Knot(object);
        newKnot.setRefKnot(refKnotEntryQueue);
        refKnotEntryQueue = newKnot;
    }

    public T first() {
        if(!this.isEmpty()) {
            Knot firstKnot = refKnotEntryQueue;
            while (true) {
                if(firstKnot.getRefKnot() != null) {
                    firstKnot = firstKnot.getRefKnot();
                } else {
                    break;
                }
            }
            return (T) firstKnot.getObject();
        }
        return null;
    }

    public T dequeue() {
        if(!this.isEmpty()) {
            Knot firstKnot = refKnotEntryQueue;
            Knot auxKnot = refKnotEntryQueue;
            while (true) {
                if(firstKnot.getRefKnot() != null) {
                    auxKnot = firstKnot;
                    firstKnot = firstKnot.getRefKnot();
                } else {
                    auxKnot.setRefKnot(null);
                    break;
                }
            }
            return (T) firstKnot.getObject();
        }
        return null;
    }

    public boolean isEmpty() {
        return refKnotEntryQueue == null ? true : false;
    }

    @Override
    public String toString() {
        String returnString = "";
        Knot auxKnot = refKnotEntryQueue;

        if(refKnotEntryQueue != null) {
            while (true) {
                returnString += "Knot{object=" + auxKnot.getObject() + "}]--->";
                if(auxKnot.getRefKnot() != null) {
                    auxKnot = auxKnot.getRefKnot();
                } else {
                    returnString += "null";
                    break;
                }
            }
        } else {
            returnString = "null";
        }

        return returnString;
    }
}
