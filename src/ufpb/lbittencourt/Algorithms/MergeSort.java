package ufpb.lbittencourt.Algorithms;

public class MergeSort implements Sort {
    /***
     * Esse algoritmo de Merge Sort pode ser encontrado no livro
     * Algoritmos: Teoria e Prática, 3 ed., pg. 22, 24, CORMEN et al.
     */
    public void sort(int[] vetor) {
        sort(vetor, 0, vetor.length - 1);
    }

    private void sort(int[] vetor, int inicio, int fim) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;
            sort(vetor, inicio, meio);
            sort(vetor, meio + 1, fim);
            merge(vetor, inicio, meio, fim);
        }
    }

    private static void merge(int[] vetor, int inicio, int meio, int fim) {
        int n1 = meio - inicio + 1;
        int n2 = fim - meio;

        int listaEsquerda[] = new int[n1];
        int listaDireita[] = new int[n2];

        System.arraycopy(vetor, inicio, listaEsquerda, 0, n1);
        for (int j = 0; j < n2; ++j)
            listaDireita[j] = vetor[meio + 1 + j];

        int i = 0;
        int j = 0;
        int k = inicio;

        while (i < n1 && j < n2) {
            if (listaEsquerda[i] <= listaDireita[j]) {
                vetor[k] = listaEsquerda[i];
                i++;
            } else {
                vetor[k] = listaDireita[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            vetor[k] = listaEsquerda[i];
            i++;
            k++;
        }

        while (j < n2) {
            vetor[k] = listaDireita[j];
            j++;
            k++;
        }
    }
}
