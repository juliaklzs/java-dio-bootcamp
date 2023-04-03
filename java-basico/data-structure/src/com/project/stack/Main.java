package com.project.stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Car> carStack = new Stack<>();

        carStack.push(new Car("Ford"));
        carStack.push(new Car("Citroen"));
        carStack.push(new Car("Fiat"));

        System.out.println(carStack);

        carStack.pop();

        System.out.println(carStack);

        System.out.println(carStack.peek());
        System.out.println(carStack);

        System.out.println(carStack.empty());
    }
}
