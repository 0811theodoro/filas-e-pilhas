package tad;

public class Node {
    int numero;
    Node next;

    public Node(int numero) {
        this.numero = numero;
        next= null;
    }

    public int getNumero() {
        return this.numero;
    }
}
