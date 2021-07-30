package tad.fila;

import tad.Vetor;

public class FilaVetor extends Vetor implements Fila {
    public FilaVetor(int capacity) {
        super(capacity);
    }

    public void enqueue(int n) throws Exception {
        add(size(), n);
    }

    public void dequeue() throws Exception {
        remove(0);
    }

    public int front() throws Exception {
        return get(0);
    }
}

