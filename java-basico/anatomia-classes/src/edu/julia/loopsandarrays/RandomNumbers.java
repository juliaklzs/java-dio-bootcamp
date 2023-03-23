package edu.julia.loopsandarrays;
import java.util.Random;
public class RandomNumbers {
    public static void main(String[] args) {
        Random random = new Random();

        int[] randomNumbers = new int[20];

        for (int i = 0; i < randomNumbers.length; i++) {
            int number = random.nextInt(100);
            randomNumbers[i] = number;
        }

        System.out.print("Números aleatórios: [ ");
        for (int i = (randomNumbers.length - 1); i >= 0; i--) {
            System.out.print(randomNumbers[i]+" ");
        }
        System.out.println("]");

        System.out.print("Sucessores dos números: [ ");
        for (int number : randomNumbers) {
            System.out.print((number+1) + " ");
        }
        System.out.println("]");
    }
}
