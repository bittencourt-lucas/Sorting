package ufpb.lbittencourt.Algorithms;

public class SelectionSort implements Sort {
    /***
     * Esse algoritmo de Selection Sort pode ser encontrado no link:
     * https://pt.wikipedia.org/wiki/Selection_sort
     */
    public void sort(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            int menor = i;
            for (int proximo = (i + 1); proximo < vetor.length; proximo++) {
                if (vetor[proximo] < vetor[menor])
                    menor = proximo;
            }
            int tmp = vetor[i];
            vetor[i] = vetor[menor];
            vetor[menor] = tmp;
        }
    }
}
