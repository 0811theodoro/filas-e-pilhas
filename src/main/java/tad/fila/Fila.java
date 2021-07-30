package tad.fila;

public interface Fila {
    void enqueue(int n) throws Exception;

    void dequeue() throws Exception;

    int front() throws Exception;

    boolean isEmpty();

    void mostraLista();
}
