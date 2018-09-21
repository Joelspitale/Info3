package Unidad5;

public class Nodo {
    private char dato;
    private Nodo next;

    Nodo() {
        next = null;
    }

    Nodo(char d) {
        next = null;
        dato = d;
    }

    Nodo(char d, Nodo n) {
        next = n;
        dato = d;
    }

    public char getDato() {
        return dato;
    }

    public void setDato(char dato) {
        this.dato = dato;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }
}