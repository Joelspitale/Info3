package Unidad5;

public class PilaEnlazada {
    private Nodo tope;

    public PilaEnlazada() {
        tope = null;
    }

    void push(char d) {
        Nodo aux = new Nodo(d, tope);
        tope = aux;
        // tope = new Nodo(d, tope);
    }

    char pop() throws Exception {
        if (tope == null)
            throw new Exception("stack vacio");
        char res = tope.getDato();
        tope = tope.getNext();
        return res;
    }
    char top() throws Exception {
        if (tope == null)
            throw new Exception("stack vacio");
        return tope.getDato();
    }

    boolean esVacia() {
        return tope == null;
    }

    void vaciar() {
        tope = null;
    }
}