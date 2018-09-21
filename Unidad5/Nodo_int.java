package Unidad5;

public class Nodo_int {
	 private int dato;
	 private Nodo_int next;

	 Nodo_int() {
	        next = null;
	    }

	 Nodo_int(int d) {
	        next = null;
	        dato = d;
	    }

	 Nodo_int(int d, Nodo_int n) {
	        next = n;
	        dato = d;
	    }

	    public int getDato() {
	        return dato;
	    }

	    public void setDato(int dato) {
	        this.dato = dato;
	    }

	    public Nodo_int getNext() {
	        return next;
	    }

	    public void setNext(Nodo_int next) {
	        this.next = next;
	    }

}
