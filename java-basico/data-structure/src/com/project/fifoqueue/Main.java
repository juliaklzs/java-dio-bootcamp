package com.project.fifoqueue;

public class Main {
    public static void main(String[] args) {
        Queue<String> myQueue = new Queue<>();

        myQueue.enqueue("primeiro");
        myQueue.enqueue("segundo");
        myQueue.enqueue("terceiro");
        myQueue.enqueue("quarto");

        System.out.println(myQueue);
        System.out.println(myQueue.dequeue());

        myQueue.enqueue("ultimo");

        System.out.println(myQueue.first());
        System.out.println(myQueue);
    }
}
