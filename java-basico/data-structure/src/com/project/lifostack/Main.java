package com.project.lifostack;

public class Main {
    public static void main(String[] args) {
        Stack myStack = new Stack();

        myStack.push(new Knot(1));
        myStack.push(new Knot(2));
        myStack.push(new Knot(3));
        myStack.push(new Knot(4));
        myStack.push(new Knot(5));
        myStack.push(new Knot(6));

        System.out.println(myStack);
        System.out.println(myStack.pop());
        System.out.println(myStack);
    }
}
