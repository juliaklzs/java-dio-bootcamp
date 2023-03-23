package com.project.lifostack;
public class Knot {
    private int data;
    private Knot refKnot = null;

    public Knot() {
    }

    public Knot(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
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
                "data=" + data +
                '}';
    }
}
