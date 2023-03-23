package edu.julia.loopsandarrays;

public class InvertedOrder {
    public static void main(String[] args) {
        int arr[] = {6, 5, 4, 3, 2, 1};

        System.out.print("Vetor: [ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("]");

        System.out.print("Vetor invertido: [ ");
        for (int i = (arr.length - 1); i >= 0; i--) {
            System.out.print(arr[i]+" ");
        }
        System.out.print("]");
    }
}
