package tad;

import tad.fila.Fila;
import tad.fila.FilaListaLigada;
import tad.fila.FilaVetor;
import tad.pilha.Pilha;
import tad.pilha.PilhaListaLigada;
import tad.pilha.PilhaVetor;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Testa pilha vetor");
        testaPilha(new PilhaVetor(10));

        System.out.println();
        System.out.println("Testa pilha lista ligada");
        testaPilha(new PilhaListaLigada());

        System.out.println();
        System.out.println("Testa fila vetor");
        testaFila(new FilaVetor(10));

        System.out.println();
        System.out.println("Testa fila lista ligada");
        testaFila(new FilaListaLigada());

    }

    private static void testaPilha(Pilha pilha) throws Exception {
        pilha.push(5);
        pilha.push(3);
        pilha.push(7);
        pilha.pop();
        pilha.push(9);
        pilha.pop();
        System.out.println("Topo: "+pilha.top());
        pilha.pop();
        pilha.pop();
        if (pilha.isEmpty()){
            System.out.println("Pilha Vazia");
        }
        else {
            pilha.mostraLista();
        }
    }

    public static void testaFila(Fila fila) throws Exception {
        fila.enqueue(10);
        fila.enqueue(3);
        fila.enqueue(7);
        fila.dequeue();
        fila.enqueue(18);
        fila.dequeue();
        System.out.println("Frente: " + fila.front()); // 7

        if (fila.isEmpty()){
            System.out.println("Fila Vazia");
        }
        else {
            fila.mostraLista();
        }

    }
}
