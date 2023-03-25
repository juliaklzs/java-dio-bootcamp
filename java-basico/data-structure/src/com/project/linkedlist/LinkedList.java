package com.project.linkedlist;

public class LinkedList<T> {

    Knot<T> refEntry;

    public LinkedList() {
        this.refEntry = null;
    }

    public void add(T content) {
        Knot<T> newKnot = new Knot<>(content);
        if (this.isEmpty()) {
            refEntry = newKnot;
            return;
        }

        Knot<T> auxKnot = refEntry;
        for (int i = 0; i < this.size()-1; i++) {
            auxKnot = auxKnot.getNextKnot();
        }
        auxKnot.setNextKnot(newKnot);
    }

    public T get(int index) {
        return getKnot(index).getContent();
    }

    private Knot<T> getKnot(int index) {
        validationIndex(index);
        Knot<T> auxKnot = refEntry;
        Knot<T> returnKnot = null;
        for (int i = 0; i <= index; i++) {
            returnKnot = auxKnot;
            auxKnot = auxKnot.getNextKnot();
        }
        return returnKnot;
    }

    public T remove(int index) {
        Knot<T> pivotKnot = this.getKnot(index);
        if(index == 0) {
            refEntry = pivotKnot.getNextKnot();
            return pivotKnot.getContent();
        }

        Knot<T> previousKnot = getKnot(index - 1);
        previousKnot.setNextKnot(pivotKnot.getNextKnot());
        return pivotKnot.getContent();
    }

    public int size() {
        int listSize = 0;
        Knot<T> refAux = refEntry;
        while (true) {
            if(refAux != null) {
                listSize ++;
                if (refAux.getNextKnot() != null) {
                    refAux = refAux.getNextKnot();
                } else break;
            } else break;
        }

        return listSize;
    }

    private void validationIndex(int index) {
        if(index >= size()) {
            int lastIndex = size()-1;
            throw new IndexOutOfBoundsException("Não existe conteúdo no índice " + index + " desta lista. Esta lista só vai até o índice " + lastIndex + ".");
        }
    }

    public boolean isEmpty() {
        return refEntry == null ? true : false;
    }

    @Override
    public String toString() {
        String strReturn = "";
        Knot<T> auxKnot = refEntry;
        for (int i = 0; i < this.size(); i++) {
            strReturn += "[Knot{content=" + auxKnot.getContent() + "}]-->";
            auxKnot = auxKnot.getNextKnot();
        }
        strReturn += "null";
        return strReturn;
    }
}
