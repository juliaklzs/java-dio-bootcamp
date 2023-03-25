package com.project.doublylinkedlist;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList<String> myLinkedList = new DoublyLinkedList<>();

        myLinkedList.add("c1");
        myLinkedList.add("c2");
        myLinkedList.add("c3");
        myLinkedList.add("c4");
        myLinkedList.add("c5");
        myLinkedList.add("c6");
        myLinkedList.add("c7");

        System.out.println(myLinkedList);

        myLinkedList.remove(3);
        myLinkedList.add(3, "99");

        System.out.println(myLinkedList);
        System.out.println(myLinkedList.get(3));
    }
}
