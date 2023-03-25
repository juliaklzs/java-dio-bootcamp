package com.project.fifoqueue;

public class Knot<T> {

    private T object;
    private Knot<T> refKnot;

    public Knot() {
    }

    public Knot(T object) {
        this.refKnot = null;
        this.object = object;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public Knot getRefKnot() {
        return refKnot;
    }

    public void setRefKnot(Knot refKnot) {
        this.refKnot = refKnot;
    }

    @Override
    public String toString() {
        return "Knot{" +
                "object=" + object +
                '}';
    }
}
