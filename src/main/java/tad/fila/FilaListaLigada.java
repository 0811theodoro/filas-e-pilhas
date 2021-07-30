package tad.fila;

import tad.ListaLigada;
import tad.Node;

public class FilaListaLigada extends ListaLigada implements Fila {
    public FilaListaLigada() {
        super();
    }

    @Override
    public void enqueue(int n) throws Exception {
        this.addLast(new Node(n));
    }

    @Override
    public void dequeue() throws Exception {
        this.remove(0);
    }

    @Override
    public int front() throws Exception {
        return first().getNumero();
    }
}
