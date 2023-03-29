package com.project.circularbuffer;

public class Main {
    public static void main(String[] args) {
        CircularBuffer<String> myCircularBuffer = new CircularBuffer<>();

        myCircularBuffer.add("c0");
        System.out.println(myCircularBuffer);

        myCircularBuffer.remove(0);
        System.out.println(myCircularBuffer);

        myCircularBuffer.add("c1");
        System.out.println(myCircularBuffer);

        myCircularBuffer.add("c2");
        myCircularBuffer.add("c3");
        System.out.println(myCircularBuffer);

        System.out.println(myCircularBuffer.get(0));
        System.out.println(myCircularBuffer.get(1));
        System.out.println(myCircularBuffer.get(2));
        System.out.println(myCircularBuffer.get(3));
    }
}
