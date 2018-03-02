package ufpb.lbittencourt;

import ufpb.lbittencourt.Algorithms.InsertionSort;
import ufpb.lbittencourt.Algorithms.SelectionSort;

import java.util.Random;

public class Main {

    private static int ENTRADAS = 100;

    public static void main(String[] args) {
        // Para criação dos Arrays.
        Random rn = new Random();

        /***
         * ORDENAÇÃO POR INSERTION SORT.
         */
        System.out.println("INSERTION SORT");

	    // Array desordenado para o Insertion Sort.
        int[] array = new int[ENTRADAS];
        for (int i = 0; i < ENTRADAS; i++) {
            array[i] = rn.nextInt() % 100;
            if (array[i] < 0)
                array[i] *= -1;
        }

        // Estado do Array.
        System.out.println("ARRAY NÃO-ORDENADO:");
        for (int i = 0; i < ENTRADAS; i++)
            System.out.print(array[i] + " ");
        System.out.println();

        // Ordenação por Insertion Sort.
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.sort(array);

        // Estado do Array.
        System.out.println("ARRAY ORDENADO:");
        for (int i = 0; i < ENTRADAS; i++)
            System.out.print(array[i] + " ");

        /***
         * ORDENAÇÃO POR SELECTION SORT.
         */
        System.out.println("\n\nSELECTION SORT");

        // Array desordenado para o Selection Sort.
        for (int i = 0; i < ENTRADAS; i++) {
            array[i] = rn.nextInt() % 100;
            if (array[i] < 0)
                array[i] *= -1;
        }

        // Estado do Array.
        System.out.println("ARRAY NÃO-ORDENADO:");
        for (int i = 0; i < ENTRADAS; i++)
            System.out.print(array[i] + " ");
        System.out.println();

        // Ordenação por Insertion Sort.
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sort(array);

        // Estado do Array.
        System.out.println("ARRAY ORDENADO:");
        for (int i = 0; i < ENTRADAS; i++)
            System.out.print(array[i] + " ");
    }
}
