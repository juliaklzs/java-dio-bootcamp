package com.project.attributionreference;

public class Main {
    public static void main(String[] args) {
        Knot<String> knot1 = new Knot<>("conteúdo nó 1");
        Knot<String> knot2 = new Knot<>("conteúdo nó 2");

        knot1.setNextKnot(knot2);

        Knot<String> knot3 = new Knot<>("conteúdo nó 3");

        knot2.setNextKnot(knot3);

        Knot<String> knot4 = new Knot<>("conteúdo nó 4");

        knot3.setNextKnot(knot4);

        System.out.println(knot1);
        System.out.println(knot1.getNextKnot());

        System.out.println("============================");

        System.out.println(knot1);
        System.out.println(knot1.getNextKnot());
        System.out.println(knot1.getNextKnot().getNextKnot());
        System.out.println(knot1.getNextKnot().getNextKnot().getNextKnot());
        System.out.println(knot1.getNextKnot().getNextKnot().getNextKnot().getNextKnot());
    }
}
