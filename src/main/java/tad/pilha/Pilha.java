package tad.pilha;

public interface Pilha {
    void push(int n) throws Exception;

    void pop() throws Exception;

    int top() throws Exception;

    boolean isEmpty();

    void mostraLista();
}
