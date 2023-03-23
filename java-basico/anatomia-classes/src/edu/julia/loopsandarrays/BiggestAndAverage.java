package edu.julia.loopsandarrays;

import java.util.Scanner;

public class BiggestAndAverage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number;
        int total = 0;
        int biggest = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o número " + i +": ");
            number = scan.nextInt();
            total = total + number;
            if (number > biggest) biggest = number;
        }
        System.out.println("O maior número digitado é " + biggest);
        System.out.println("A média dos números é " + total/5);
    }
}
