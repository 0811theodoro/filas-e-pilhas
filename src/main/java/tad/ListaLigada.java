package tad;

public class ListaLigada {
    private Node header;
    private Node trailer;
    private int size;

    public ListaLigada() {
        header = null;
        trailer = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public Node first() {
        return header;
    }

    public void addFirst(Node novo) {
        if (isEmpty()) {
            header = novo;
            trailer = novo;
        } else {
            novo.next = header;
            header = novo;
        }
        size++;
    }

    public Node last() {
        return trailer;
    }

    public void addLast(Node novo) {
        if (isEmpty()) {
            header = novo;
            trailer = novo;
        } else {
            trailer.next = novo;
            trailer = novo;
        }
        size++;
    }

    public void mostraLista() {
        Node aux = header;
        System.out.println(aux.numero);
        while (aux.next != null) {
            aux = aux.next;
            System.out.println(aux.numero);

        }
        System.out.println("Fim da Lista");
    }
    public void remove(int indice) throws Exception {
        if (isEmpty()) {
            throw new Exception("Lista vazia!");
        } else if (indice >= size) {
            throw new Exception("Indice fora da lista");
        } else {
            if (indice==0){
                header=header.next;
            }else{
                Node aux = header, ant = null;
                for (int i = 0; i <= indice; i++) {
                    ant=aux;
                    aux=aux.next;
                }
                ant.next=aux.next;
            }
            size--;
        }
    }
}
