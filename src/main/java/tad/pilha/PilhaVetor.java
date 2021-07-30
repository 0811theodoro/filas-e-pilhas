package tad.pilha;

import tad.Vetor;

public class PilhaVetor extends Vetor implements Pilha {
    int top;

    public PilhaVetor(int capacity) {
        super(capacity);
        top = -1;
    }

    @Override
    public void push(int n) throws Exception {
        top++;
        add(top, n);
    }

    @Override
    public void pop() throws Exception {
        remove(top);
        top--;
    }

    @Override
    public int top() throws Exception {
        return get(top);
    }
}
