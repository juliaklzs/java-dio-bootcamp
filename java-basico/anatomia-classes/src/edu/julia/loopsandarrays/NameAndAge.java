package edu.julia.loopsandarrays;

import java.util.Scanner;

public class NameAndAge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name;
        int age;

        while (true) {
            System.out.println("Digite seu nome: ");
            name = scan.next();
            if (name.equals("0")) break;

            System.out.println("Digite sua idade: ");
            age = scan.nextInt();
        }

        System.out.println("Você parou de executar o programa");
    }
}
