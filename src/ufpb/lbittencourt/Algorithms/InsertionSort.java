package ufpb.lbittencourt.Algorithms;

public class InsertionSort implements Sort {
    /***
     * Esse algoritmo de Insertion Sort pode ser encontrado no livro
     * Algoritmos: Teoria e Prática, 3 ed., pg. 18, CORMEN et al.
     */
    public void sort(int[] vetor) {
        for (int j = 1; j < vetor.length; j++) {
            int chave = vetor[j];
            // Inserir vetor[j] na sequência ordenada vetor[1 ... j-1].
            int i = j;
            while ((i > 0) && (vetor[i - 1] > chave)) {
                vetor[i] = vetor[i - 1];
                i -= 1;
            }
            vetor[i] = chave;
        }
    }
}
