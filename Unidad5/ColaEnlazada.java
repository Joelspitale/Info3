package Unidad5;
public class ColaEnlazada {
    private Nodo entrada;
    private Nodo salida;	

    public ColaEnlazada() {
        entrada = null;
        salida = null;
    }

    void encolar(char d) {
        Nodo aux = new Nodo(d);
        if (entrada != null)
            entrada.setNext(aux);
        entrada = aux;
        if (salida == null)
            salida = entrada;
    }

    char desencolar() throws Exception {
        if (salida == null)
            throw new Exception("Cola vacia");

        char res = salida.getDato();
        salida = salida.getNext();
        if (salida == null)
            entrada = null;
        return res;
    }

    boolean esVacia() {
        return salida == null;
    }

    void vaciar() {
        entrada = null;
        salida = null;
    }
}