package ufpb.lbittencourt.Algorithms;

import java.util.Arrays;

public class RadixSort implements Sort {
    /***
     * Esse algoritmo de Radix Sort está disponível em:
     * <https://www.geeksforgeeks.org/radix-sort/>
     */
    public void sort(int[] vetor) {
        int k = vetor[0];
        for (int i = 1; i < vetor.length; i++)
            if (vetor[i] > k)
                k = vetor[i];
        k++;

        for (int exp = 1; k / exp > 0; exp *= 10)
            countingSort(vetor, exp);
    }

    // Implementando o Counting Sort para realizar o Radix Sort.
    private void countingSort(int[] vetor, int exp) {
        int[] aux = new int[10];

        Arrays.fill(aux, 0);

        for (int aVetor : vetor) aux[((aVetor / exp) % 10)]++;

        for (int j = 1; j < 10; j++)
            aux[j] += aux[j - 1];

        int[] saida = new int[vetor.length];
        for (int j = vetor.length - 1; j >= 0; j--) {
            saida[aux[((vetor[j]) / exp) % 10] - 1] = vetor[j];
            aux[((vetor[j]) / exp) % 10]--;
        }

        System.arraycopy(saida, 0, vetor, 0, vetor.length);
    }
}
