package edu.julia.loopsandarrays;
import java.util.Random;

public class MultidimensionalArray {
    public static void main(String[] args) {
        Random random = new Random();

        int arr[][] = new int[4][4];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(9);
            }
        }

        System.out.println("Matriz: ");
        for (int[] line : arr  ) {
            System.out.print("[");
            for (int column : line ) {
                System.out.print(column + " ");
            }
            System.out.println("]");
        }
    }
}
