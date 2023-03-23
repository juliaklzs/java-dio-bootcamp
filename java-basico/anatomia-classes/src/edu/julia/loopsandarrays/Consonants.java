package edu.julia.loopsandarrays;
import java.util.Scanner;

public class Consonants {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] consonants = new String[6];
        int countConsonants = 0;

        int i = 0;
        do {
            System.out.println("Letra: ");
            String letter = scan.next();
            if (! (letter.equalsIgnoreCase("a") ||
                   letter.equalsIgnoreCase("e") ||
                   letter.equalsIgnoreCase("i") ||
                   letter.equalsIgnoreCase("o") ||
                   letter.equalsIgnoreCase("u")) ) {
                consonants[i] = letter;
                countConsonants ++;
            }
            i++;
        } while (i < consonants.length);

        System.out.print("Consoantes: ");
        for ( String consonant  :  consonants ) {
            if ( consonant != null)
                System.out.print(consonant + " ");
        }
        System.out.println("Quantidade de consoantes: " + countConsonants);
        System.out.println(consonants.length);
    }
}
