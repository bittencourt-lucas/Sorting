package ufpb.lbittencourt;

import ufpb.lbittencourt.Algorithms.*;

import java.util.Random;
import java.util.Scanner;

public class Main {

    private static int ENTRADAS = 1000;

    public static void main(String[] args) {
        // Para criação do Array.
        Random rn = new Random();

        // Array desordenado.
        int[] array = new int[ENTRADAS];
        for (int i = 0; i < ENTRADAS; i++) {
            array[i] = rn.nextInt() % 10000;
            if (array[i] < 0)
                array[i] *= -1;
        }

        // Estado do Array.
        System.out.println("ARRAY NÃO-ORDENADO:");
        for (int i = 0; i < ENTRADAS; i++)
            System.out.print(array[i] + " ");
        System.out.println();

        // Escolha do tipo de ordenação.
        System.out.println("ALGORITMOS DE ORDENAÇÃO");
        System.out.println("1 - INSERTION SORT");
        System.out.println("2 - SELECTION SORT");
        System.out.println("3 - MERGE SORT");
        System.out.println("4 - QUICKSORT");
        System.out.println("5 - HEAP SORT (MAX HEAP)");
        System.out.println("6 - COUNTING SORT");
        System.out.println("7 - RADIX SORT");
        Scanner reader = new Scanner(System.in);
        System.out.print("ESCOLHA: ");
        int escolha = reader.nextInt();
        reader.close();

        Sort sorter;
        long startTime = 0;
        long endTime = 0;
        long duration;
        switch(escolha) {
            case 1:
                sorter = new InsertionSort();
                startTime = System.nanoTime();
                sorter.sort(array);
                endTime = System.nanoTime();
                break;
            case 2:
                sorter = new SelectionSort();
                startTime = System.nanoTime();
                sorter.sort(array);
                endTime = System.nanoTime();
                break;
            case 3:
                sorter = new MergeSort();
                startTime = System.nanoTime();
                sorter.sort(array);
                endTime = System.nanoTime();
                break;
            case 4:
                sorter = new QuickSort();
                startTime = System.nanoTime();
                sorter.sort(array);
                endTime = System.nanoTime();
                break;
            case 5:
                sorter = new HeapSort();
                startTime = System.nanoTime();
                sorter.sort(array);
                endTime = System.nanoTime();
                break;
            case 6:
                sorter = new CountingSort();
                startTime = System.nanoTime();
                sorter.sort(array);
                endTime = System.nanoTime();
                break;
            case 7:
                sorter = new RadixSort();
                startTime = System.nanoTime();
                sorter.sort(array);
                endTime = System.nanoTime();
                break;
            default:
                System.out.println("ESCOLHA INVÁLIDA");
        }

        duration = (endTime - startTime);

        // Estado do Array.
        System.out.println("TEMPO DE EXECUÇÃO: " + (duration / 1000000.0) + "ms");
        System.out.println("ARRAY ORDENADO:");
        for (int i = 0; i < ENTRADAS; i++)
            System.out.print(array[i] + " ");

    }
}
