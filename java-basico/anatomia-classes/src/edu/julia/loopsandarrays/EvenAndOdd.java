package edu.julia.loopsandarrays;

import java.util.Scanner;

public class EvenAndOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int even = 0, odd = 0, scanNumber;
        System.out.print("Quantidade de números que deseja analisar: ");
        int count = scan.nextInt();

        while (count < 0 || count > 10) {
            System.out.println("Quantidade inválida! Digite novamente: ");
            count = scan.nextInt();
        }

        for (int i = 0; i < count; i ++) {
            System.out.print("\nNúmero: ");
            scanNumber = scan.nextInt();
            if (scanNumber % 2 == 0) even++;
                else odd++;
        }

        System.out.println("Dentre os "+ count +" números, foram encontrados "+ odd +" números ímpares e "+ even +" números pares.");
    }
}
