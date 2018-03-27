package ufpb.lbittencourt.Algorithms;

public class CountingSort implements Sort {
    /***
     * Esse algoritmo de Counting Sort foi retirado dos slides da aula.
     */
    public void sort(int[] vetor) {
        // Descobre, linearmente, qual é o valor de K
        int k = vetor[0];
        for (int i = 1; i < vetor.length; i++)
            if (vetor[i] > k)
                k = vetor[i];

        int[] aux = new int[k];

        for (int i = 0; i < aux.length; i++)
            aux[i] = 0;

        for (int j = 1; j < vetor.length; j++)
            aux[vetor[j] - 1] = aux[vetor[j] - 1] + 1;

        for (int i = 2; i < k; i++)
            aux[i] = aux[i] + aux[i - 1];

        int[] saida = new int[k];
        for (int j = vetor.length - 1; j > 0; j--) {
            saida[aux[vetor[j] - 1]] = vetor[j];
            aux[vetor[j] - 1] = aux[vetor[j] - 1] - 1;
        }

        System.arraycopy(saida, 0, vetor, 0, vetor.length);
    }
}
