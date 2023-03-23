package com.project.lifostack;

public class Stack {
    private Knot refKnotEntryStack;

    public Stack() {
        this.refKnotEntryStack = null;
    }

    public void push(Knot newKnot) {
        Knot refAux = refKnotEntryStack;
        refKnotEntryStack = newKnot;
        refKnotEntryStack.setRefKnot(refAux);
    }

    public Knot pop() {
        if (!this.isEmpty()) {
            Knot knotPopped = refKnotEntryStack;
            refKnotEntryStack = refKnotEntryStack.getRefKnot();
        }
        return null;
    }

    public Knot top() {
        return refKnotEntryStack;
    }

    public boolean isEmpty() {
        return refKnotEntryStack == null ? true : false;
    }

    @Override
    public String toString() {
        String stringReturn = "-------------------\n";
        stringReturn += " Pilha\n";
        stringReturn += "-------------------\n";

        Knot knotAux = refKnotEntryStack;

        while (true) {
            if (knotAux != null) {
                stringReturn += "[ nó {dado=" + knotAux.getData() + "}]\n";
                knotAux = knotAux.getRefKnot();
            } else break;
        }
        stringReturn += "===================";
        return stringReturn;
    }
}
