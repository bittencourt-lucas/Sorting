package ufpb.lbittencourt.Algorithms;

import java.util.Arrays;

public class CountingSort implements Sort {
    /***
     * Esse algoritmo de Counting Sort foi retirado dos slides da aula. O algoritmo garante uma ordenação
     * estável e a complexidade do algoritmo é O(N + K).
     */
    public void sort(int[] vetor) {
        int k = vetor[0];
        for (int i = 1; i < vetor.length; i++)
            if (vetor[i] > k)
                k = vetor[i];

        int[] aux = new int[k + 1];
        Arrays.fill(aux,0);

        for (int j = 0; j < vetor.length; j++)
            aux[vetor[j]]++;

        for (int i = 1; i < k; i++)
            aux[i] += aux[i - 1];

        int[] saida = new int[vetor.length];
        for (int j = vetor.length - 1; j > 0; j--) {
            saida[aux[vetor[j]] - 1] = vetor[j];
            aux[vetor[j]]--;
        }
        System.arraycopy(saida, 0, vetor, 0, vetor.length);
    }
}
