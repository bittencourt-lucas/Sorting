package ufpb.lbittencourt.Algorithms;

public class QuickSort implements Sort {
    /***
     * Esse algoritmo de Quicksort pode ser encontrado no livro
     * Algoritmos: Teoria e Prática, 3 ed., pg. 123, 124, CORMEN et al.
     */
    public void sort(int[] vetor) {
        sort(vetor, 0, vetor.length - 1);
    }

    private void sort(int[] vetor, int inicio, int fim) {
        if (inicio < fim) {
            int meio = partition(vetor, inicio, fim);
            sort(vetor, inicio, meio - 1);
            sort(vetor, meio + 1, fim);
        }
    }

    private int partition(int[] vetor, int inicio, int fim) {
        int pivot = vetor[fim];
        int i = inicio - 1;
        for (int j = inicio; j <= fim - 1; j++) {
            if (vetor[j] <= pivot) {
                i++;
                int tmp = vetor[i];
                vetor[i] = vetor[j];
                vetor[j] = tmp;
            }
        }
        int tmp = vetor[fim];
        vetor[fim] = vetor[i + 1];
        vetor[i + 1] = tmp;
        return (i + 1);
    }

}
