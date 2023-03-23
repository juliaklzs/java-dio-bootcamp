package edu.julia.loopsandarrays;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int multiplication = 1;

        System.out.println("Fatorial: ");
        int factorial = scan.nextInt();
        while (factorial < 0 ) {
            System.out.println("Número inválido! Digite um número maior que 0: ");
            factorial = scan.nextInt();
        }
        System.out.print(factorial +"! = ");
        for (int i = factorial; i >= 1; i--) {
            multiplication  = multiplication * i;
        }
        System.out.println(multiplication);
    }
}
