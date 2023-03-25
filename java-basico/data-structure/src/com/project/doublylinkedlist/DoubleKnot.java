package com.project.doublylinkedlist;

public class DoubleKnot<T> {

    private T content;
    private DoubleKnot<T> nextKnot;
    private DoubleKnot<T> previousKnot;

    public DoubleKnot(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public DoubleKnot<T> getNextKnot() {
        return nextKnot;
    }

    public void setNextKnot(DoubleKnot<T> nextKnot) {
        this.nextKnot = nextKnot;
    }

    public DoubleKnot<T> getPreviousKnot() {
        return previousKnot;
    }

    public void setPreviousKnot(DoubleKnot<T> previousKnot) {
        this.previousKnot = previousKnot;
    }

    @Override
    public String toString() {
        return "DoubleKnot{" +
                "content=" + content +
                '}';
    }
}
