package tad.pilha;

import tad.ListaLigada;
import tad.Node;

public class PilhaListaLigada extends ListaLigada implements Pilha {
    int top;

    public PilhaListaLigada() {
        super();
        top = -1;
    }
    public void push(int n) throws Exception {
        top++;
        addFirst(new Node(n));
    }
    public void pop() throws Exception {
        remove(0);
        top--;
    }
    public int top() throws Exception {
        return first().getNumero();
    }
}
