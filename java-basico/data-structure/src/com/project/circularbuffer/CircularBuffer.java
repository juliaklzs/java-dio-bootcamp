package com.project.circularbuffer;

public class CircularBuffer<T> {
    private Knot<T> head;
    private Knot<T> tail;
    private int listSize;

    public CircularBuffer() {
        this.tail = null;
        this.head = null;
        this.listSize = 0;
    }

    public void add(T content) {
        Knot<T> newKnot = new Knot<>(content);
        if(this.listSize == 0) {
            this.head = newKnot;
            this.tail = this.head;
            this.head.setNextKnot(tail);
        } else {
            newKnot.setNextKnot(this.tail);
            this.head.setNextKnot(newKnot);
            this.tail = newKnot;
        }
        this.listSize++;
    }

    public void remove(int index) {
        if (index >= this.listSize)
            throw new IndexOutOfBoundsException("O indice é maior que o tamanho da lista");

        Knot<T> auxKnot = this.tail;
        if(index == 0) {
            this.tail = this.tail.getNextKnot();
            this.head.setNextKnot(this.tail);
        } else if(index == 1) {
            this.tail.setNextKnot(this.tail.getNextKnot().getNextKnot());
        } else {
            for (int i = 0; i < index-1; i++) {
                auxKnot = auxKnot.getNextKnot();
            }
            auxKnot.setNextKnot(auxKnot.getNextKnot().getNextKnot());
        }
        this.listSize--;
    }

    public T get(int index) {
        return this.getKnot(index).getContent();
    }

    private Knot<T> getKnot(int index) {
        if (this.isEmpty())
            throw new IndexOutOfBoundsException("A lista está vazia");

        if (index == 0) {
            return this.tail;
        }
        
        Knot<T> auxKnot = this.tail;
        for (int i = 0; (i < index) && (auxKnot != null); i++) {
            auxKnot = auxKnot.getNextKnot();
        }
        return auxKnot;
    }

    public boolean isEmpty() {
        return this.listSize == 0 ? true : false;
    }

    public int size() {
        return this.listSize;
    }

    @Override
    public String toString() {
        String strReturn = "";

        Knot<T> auxKnot = this.tail;
        for (int i = 0; i < this.size(); i++) {
            strReturn += "{Nó[conteúdo=" +
                     auxKnot.getContent() +
                    "]}--->";
            auxKnot = auxKnot.getNextKnot();
        }

        strReturn += this.size() != 0 ? "(Retorna ao início)" : "[ ]";

        return strReturn;
    }
}
