package edu.julia.loopsandarrays;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número no qual você deseja ver a tabuada: ");
        int multiplication = scan.nextInt();

        while (multiplication < 0 || multiplication > 10) {
            System.out.println("Número inválido! Digite um número entre 1 e 10: ");
            multiplication = scan.nextInt();
        }

        for (int i = 1; i <= 10; i++) {
            System.out.println(multiplication+ "x" + i +"="+ (multiplication*i));
        }
    }
}
