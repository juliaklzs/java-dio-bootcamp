package com.project.binarytree;

public class BinaryKnot<T extends Comparable<T>> {

    private T content;
    private BinaryKnot<T> leftKnot;
    private BinaryKnot<T> rightKnot;

    public BinaryKnot(T content) {
        this.content = content;
        leftKnot = null;
        rightKnot = null;
    }

    public BinaryKnot() {
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public BinaryKnot<T> getLeftKnot() {
        return leftKnot;
    }

    public void setLeftKnot(BinaryKnot<T> leftKnot) {
        this.leftKnot = leftKnot;
    }

    public BinaryKnot<T> getRightKnot() {
        return rightKnot;
    }

    public void setRightKnot(BinaryKnot<T> rightKnot) {
        this.rightKnot = rightKnot;
    }

    @Override
    public String toString() {
        return "BinaryKnot{" +
                "content=" + content +
                '}';
    }
}
