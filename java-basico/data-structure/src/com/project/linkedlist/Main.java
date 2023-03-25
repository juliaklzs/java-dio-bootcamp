package com.project.linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> myLinkedList = new LinkedList<>();

        myLinkedList.add("teste1");
        myLinkedList.add("teste2");
        myLinkedList.add("teste3");
        myLinkedList.add("teste4");

        System.out.println(myLinkedList.get(0));
        System.out.println(myLinkedList.get(1));
        System.out.println(myLinkedList.get(2));
        System.out.println(myLinkedList.get(3));

        System.out.println(myLinkedList.toString());

        System.out.println(myLinkedList.remove(3));
        System.out.println(myLinkedList.toString());

    }
}
