package com.project.circularbuffer;

public class CircularBuffer<T> {

    private Knot<T> head;
    private Knot<T> tail;
    private int listSize;

    public boolean isEmpty() {
        return this.listSize == 0 ? true : false;
    }

    public int size() {
        return this.listSize;
    }

}
