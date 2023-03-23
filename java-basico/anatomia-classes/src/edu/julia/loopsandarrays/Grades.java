package edu.julia.loopsandarrays;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int grade;

        System.out.print("Digite a nota: ");
        grade = scan.nextInt();

        while (grade < 0 || grade > 10) {
            System.out.println("Nota inválida! Digite novamente: ");
            grade = scan.nextInt();
        }

        System.out.println("Nota válida. A nota é " + grade);
    }
}
