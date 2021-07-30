package tad;

public class Vetor {
    private int[] A;
    private int capacity;
    private int size;

    public Vetor(int capacity) {
        A = new int[capacity];
        this.size = 0;
        this.capacity = capacity;
    }
    public boolean isEmpty() {
        if (size == 0)
            return true;
        else
            return false;
    }

    public int size() {
        return size;
    }

    public int get(int i) throws Exception {
        if (i < 0 || i >= size)
            throw new Exception("Posição Inválida");
        return A[i];
    }

    public void set(int i, int n) throws Exception {
        if (isEmpty()) throw new Exception("Lista Vazia");
        if (i >= size()) throw new Exception("Posição Inexistente");
        A[i] = n;

    }

    public void add(int i, int n) throws Exception {
        if (size == A.length)
            size--;

        for (int j = size - 1; j >= i; j--)
            A[j + 1] = A[j];
        A[i] = n;
        size++;
    }

    public void remove(int i) throws Exception {
        if (isEmpty()) throw new Exception("Lista Vazia");
        if (i >= size) throw new Exception("Posição inválida");
        for (int j = i; j < size - 1; j++)
            A[j] = A[j + 1];
        size--;

        for(int j = size; j < A.length; j++) {
            A[j] = 0;
        }
    }

    public int search(int n) {
        for (int i = 0; i < A.length; i++)
            if (A[i] == n)
                return i;
        return -1;

    }

    public void mostraLista() {
        for (int i = 0; i < size; i++) {
            System.out.println(A[i]);
        }

        System.out.println("Fim da Lista");
    }


}
