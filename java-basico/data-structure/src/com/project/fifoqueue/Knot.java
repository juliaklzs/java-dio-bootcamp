package com.project.fifoqueue;

public class Knot {

    private Object object;
    private Knot refKnot;

    public Knot() {

    }

    public Knot(Object object) {
        this.refKnot = null;
        this.object = object;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
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
