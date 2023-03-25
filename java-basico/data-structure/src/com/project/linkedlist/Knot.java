package com.project.linkedlist;

public class Knot<T> {

    private T content;
    private Knot nextKnot;

    public Knot() {
        this.nextKnot = null;
    }

    public Knot(T content) {
        this.nextKnot = null;
        this.content = content;
    }

    public Knot(T content, Knot nextKnot) {
        this.content = content;
        this.nextKnot = nextKnot;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public Knot getNextKnot() {
        return nextKnot;
    }

    public void setNextKnot(Knot nextKnot) {
        this.nextKnot = nextKnot;
    }

    @Override
    public String toString() {
        return "Knot{" +
                "content=" + content +
                '}';
    }

    public String linkedToString() {
        String str = "Knot{" +
                "content=" + content +
                '}';

        if(nextKnot != null) {
            str += "->" + nextKnot.toString();
        } else {
            str += "->null";
        }
        return str;
    }

}
