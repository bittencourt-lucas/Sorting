package ufpb.lbittencourt.Algorithms;

public class HeapSort implements Sort {
    /***
     * Esse algoritmo de Heap Sort utilizando Max Heap pode ser encontrado no link
     * https://courses.csail.mit.edu/6.006/fall10/handouts/recitation10-8.pdf
     */

    public void sort(int[] vetor) {
        buildMaxHeap(vetor);
        for (int i = vetor.length - 1; i >= 0; i--) {
            int tmp = vetor[0];
            vetor[0] = vetor[i];
            vetor[i] = tmp;
            maxHeapify(vetor, i, 0);
        }
    }

    private int left(int[] vetor, int node) {
        // Retorna o filho da esquerda de um nó, se houver.
        return 2 * node + 1;
    }

    private int right(int[] vetor, int node) {
        // Retorna o filho da direita de um nó, se houver.
        return 2 * node + 2;
    }

    private void maxHeapify(int[] vetor, int heapSize, int node) {
        int l, r, largest;
        largest = node;
        l = left(vetor, node);
        r = right(vetor, node);
        if (l < heapSize && vetor[l] > vetor[largest])
            largest = l;
        if (r < heapSize && vetor[r] > vetor[largest])
            largest = r;
        if (largest != node) {
            int tmp = vetor[node];
            vetor[node] = vetor[largest];
            vetor[largest] = tmp;
            maxHeapify(vetor, heapSize, largest);
        }
    }

    private void buildMaxHeap(int[] vetor) {
        // Constrói a Max Heap
        for (int i = vetor.length / 2 - 1; i >= 0; i--)
            maxHeapify(vetor, vetor.length, i);
    }

}
